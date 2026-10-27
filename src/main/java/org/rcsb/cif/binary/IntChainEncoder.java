package org.rcsb.cif.binary;

import org.rcsb.cif.EncodingException;
import org.rcsb.cif.binary.data.ByteArray;
import org.rcsb.cif.binary.data.Int32Array;
import org.rcsb.cif.binary.encoding.ByteArrayEncoding;
import org.rcsb.cif.binary.encoding.DeltaEncoding;
import org.rcsb.cif.binary.encoding.Encoding;
import org.rcsb.cif.binary.encoding.IntegerPackingEncoding;
import org.rcsb.cif.binary.encoding.RunLengthEncoding;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Encodes ints by one of the chains of the {@link Classifier} ("byte", "pack", "rle", "delta", "delta-rle") straight
 * into the bytes of the last step. Encoding step by step creates an array per step (Delta, RunLength, IntegerPacking
 * and the bytes); here the values that enter IntegerPacking are produced on the fly, once to size the packing and once
 * to write it. Bytes and encoding parameters are those of the steps.
 */
final class IntChainEncoder {
    /** The type of {@link Int32Array}, the source type of Delta and RunLength. */
    private static final int INT32 = 3;

    private IntChainEncoder() {
        // nothing here
    }

    /**
     * Encode ints.
     * @param data the values
     * @param kind the chain
     * @param encoding the steps that produced the values (e.g. FixedPoint), followed by the steps of the chain
     * @return the bytes and all steps
     */
    static ByteArray encode(int[] data, String kind, Deque<Encoding<?, ?>> encoding) {
        Deque<Encoding<?, ?>> enc = new ArrayDeque<>(encoding);
        switch (kind) {
            case "byte":
                enc.add(ByteArrayEncoding.INT32);
                return new ByteArray(new Int32Array(data).toByteArray(), enc);
            case "pack":
                return pack(data, false, false, enc);
            case "rle":
                return pack(data, false, true, enc);
            case "delta":
                return pack(data, true, false, enc);
            case "delta-rle":
                return pack(data, true, true, enc);
            default:
                throw new IllegalArgumentException("Determined encoding type is unknown. " + kind);
        }
    }

    private static ByteArray pack(int[] data, boolean delta, boolean runLength, Deque<Encoding<?, ?>> enc) {
        if (delta) {
            enc.add(new DeltaEncoding<Int32Array>(data.length > 0 ? data[0] : 0, INT32));
        }
        if (runLength) {
            enc.add(new RunLengthEncoding(INT32, data.length));
        }

        PackingSize size = new PackingSize();
        forEachPackingInput(data, delta, runLength, size);

        // as IntegerPacking: 4 bytes (no packing) if they are smaller than 2-byte packing, else the smaller packing
        long size8 = size.signed ? size.signed8 : size.unsigned8;
        long size16 = size.signed ? size.signed16 : size.unsigned16;
        int byteCount;
        long length;
        if (size.count * 4L < size16 * 2) {
            byteCount = 4;
            length = size.count;
        } else if (size16 * 2 < size8) {
            byteCount = 2;
            length = size16;
        } else {
            byteCount = 1;
            length = size8;
        }
        if (length * byteCount > Integer.MAX_VALUE) {
            throw new EncodingException("too much data - cannot allocate array large enough to encode " + size.count + " elements");
        }

        PackedWriter writer = new PackedWriter((int) length * byteCount, byteCount, size.signed);
        forEachPackingInput(data, delta, runLength, writer);

        if (byteCount == 4) {
            enc.add(ByteArrayEncoding.INT32);
        } else {
            enc.add(new IntegerPackingEncoding(byteCount, !size.signed, size.count));
            if (size.signed) {
                enc.add(byteCount == 1 ? ByteArrayEncoding.INT8 : ByteArrayEncoding.INT16);
            } else {
                enc.add(byteCount == 1 ? ByteArrayEncoding.UINT8 : ByteArrayEncoding.UINT16);
            }
        }
        return new ByteArray(writer.bytes, enc);
    }

    private interface IntSink {
        void accept(int value);
    }

    /**
     * The values that IntegerPacking receives: the data, its consecutive differences (Delta: the first is 0) or the
     * runs of either (RunLength: value and length of each run).
     */
    private static void forEachPackingInput(int[] data, boolean delta, boolean runLength, IntSink sink) {
        int n = data.length;
        if (n == 0) {
            return;
        }

        if (!runLength) {
            if (delta) {
                sink.accept(0);
                for (int i = 1; i < n; i++) {
                    sink.accept(data[i] - data[i - 1]);
                }
            } else {
                for (int value : data) {
                    sink.accept(value);
                }
            }
            return;
        }

        int value = delta ? 0 : data[0];
        int run = 1;
        for (int i = 1; i < n; i++) {
            int next = delta ? data[i] - data[i - 1] : data[i];
            if (next != value) {
                sink.accept(value);
                sink.accept(run);
                value = next;
                run = 1;
            } else {
                run++;
            }
        }
        sink.accept(value);
        sink.accept(run);
    }

    /** The number of values and the packed lengths for signed and unsigned 1- and 2-byte packing. */
    private static final class PackingSize implements IntSink {
        int count;
        boolean signed;
        long signed8;
        long signed16;
        long unsigned8;
        long unsigned16;

        @Override
        public void accept(int value) {
            // a value takes one element per full limit it contains plus one for the rest
            count++;
            if (value >= 0) {
                signed8 += value < 0x7F ? 1 : value / 0x7F + 1;
                signed16 += value < 0x7FFF ? 1 : value / 0x7FFF + 1;
                unsigned8 += value < 0xFF ? 1 : value / 0xFF + 1;
                unsigned16 += value < 0xFFFF ? 1 : value / 0xFFFF + 1;
            } else {
                signed = true;
                signed8 += value > -0x80 ? 1 : value / -0x80 + 1;
                signed16 += value > -0x8000 ? 1 : value / -0x8000 + 1;
            }
        }
    }

    /** Writes the values little-endian, split into limit-sized elements when packed into 1 or 2 bytes. */
    private static final class PackedWriter implements IntSink {
        final byte[] bytes;
        private final int byteCount;
        private final int upperLimit;
        private final int lowerLimit;
        private int offset;

        PackedWriter(int length, int byteCount, boolean signed) {
            this.bytes = new byte[length];
            this.byteCount = byteCount;
            if (signed) {
                this.upperLimit = byteCount == 1 ? 0x7F : 0x7FFF;
            } else {
                this.upperLimit = byteCount == 1 ? 0xFF : 0xFFFF;
            }
            this.lowerLimit = -upperLimit - 1;
        }

        @Override
        public void accept(int value) {
            if (byteCount < 4) {
                if (value >= 0) {
                    while (value >= upperLimit) {
                        put(upperLimit);
                        value -= upperLimit;
                    }
                } else {
                    while (value <= lowerLimit) {
                        put(lowerLimit);
                        value -= lowerLimit;
                    }
                }
            }
            put(value);
        }

        private void put(int value) {
            bytes[offset++] = (byte) value;
            if (byteCount > 1) {
                bytes[offset++] = (byte) (value >> 8);
                if (byteCount > 2) {
                    bytes[offset++] = (byte) (value >> 16);
                    bytes[offset++] = (byte) (value >> 24);
                }
            }
        }
    }
}
