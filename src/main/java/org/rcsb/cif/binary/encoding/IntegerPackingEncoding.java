package org.rcsb.cif.binary.encoding;

import org.rcsb.cif.binary.data.EncodedDataFactory;
import org.rcsb.cif.binary.data.Int32Array;
import org.rcsb.cif.binary.data.IntArray;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * <p>Stores a {@link Int32Array} using 8- or 16-bit values. Includes the size of the input array for easier decoding.
 * The encoding is more effective when only unsigned values are provided.</p>
 *
 * <pre>
 * IntegerPacking {
 *     kind = "IntegerPacking"
 *     byteCount: number
 *     srcSize: number
 *     isUnsigned: boolean
 * }
 * Example
 * [1, 2, -3, 128]
 * ---IntegerPacking---&gt;
 * { byteCount = 1, srcSize = 4, isUnsigned = false } [1, 2, -3, 127, 1]
 * </pre>
 */
public class IntegerPackingEncoding implements Encoding<IntArray> {
    private static final String kind = "IntegerPacking";
    private int byteCount;
    private boolean isUnsigned;
    private int srcSize;

    public IntegerPackingEncoding() {
    }

    public IntegerPackingEncoding(int byteCount, boolean isUnsigned, int srcSize) {
        this.byteCount = byteCount;
        this.isUnsigned = isUnsigned;
        this.srcSize = srcSize;
    }

    public IntegerPackingEncoding(Map<String, Object> encoding) {
        this((int) encoding.get("byteCount"), (boolean) encoding.get("isUnsigned"), (int) encoding.get("srcSize"));
    }

    public int getByteCount() {
        return byteCount;
    }

    public boolean isUnsigned() {
        return isUnsigned;
    }

    public int getSrcSize() {
        return srcSize;
    }

    public void setByteCount(int byteCount) {
        this.byteCount = byteCount;
    }

    public void setUnsigned(boolean unsigned) {
        this.isUnsigned = unsigned;
    }

    public void setSrcSize(int srcSize) {
        this.srcSize = srcSize;
    }

    @Override
    public String getKind() {
        return kind;
    }

    @Override
    public Int32Array decode(IntArray data) {
        int[] input = data.getData();
        boolean unsigned = isUnsigned();

        if (input.length == srcSize && byteCount == 4) {
            Int32Array output = EncodedDataFactory.int32Array(input, data.getEncoding());
            output.setEncoding(data.getEncoding());
            return output;
        }

        int upperLimit;
        int lowerLimit = 0;
        if (unsigned) {
            upperLimit = byteCount == 1 ? 0xFF : 0xFFFF;
        } else {
            upperLimit = byteCount == 1 ? 0x7F : 0x7FFF;
            lowerLimit = -upperLimit - 1;
        }

        int n = input.length;
        int[] output = new int[srcSize];
        int i = 0;
        int j = 0;
        while (i < n) {
            int value = 0;
            int t = input[i];
            while (unsigned ? t == upperLimit : t == upperLimit || t == lowerLimit) {
                value += t;
                i++;
                t = input[i];
            }
            value += t;
            output[j] = value;
            i++;
            j++;
        }

        return EncodedDataFactory.int32Array(output, data.getEncoding());
    }

    public IntArray encode(Int32Array data) {
        int[] input = data.getData();

        Packing packing = determinePacking(input);
        if (packing.bytesPerElement == 4) {
            Deque<Encoding<?>> enc = new ArrayDeque<>(data.getEncoding());
            this.byteCount = 4;
            this.isUnsigned = false;
            this.srcSize = input.length;
            enc.add(this);
            return EncodedDataFactory.int32Array(input, enc);
        }

        int upperLimit = packing.signed ? packing.bytesPerElement == 1 ? 0x7F : 0x7FFF :
                packing.bytesPerElement == 1 ? 0xFF : 0xFFFF;

        int lowerLimit = -upperLimit - 1;
        int[] outputArray = new int[packing.size];
        int j = 0;

        for (int i1 : input) {
            int value = i1;
            if (value >= 0) {
                while (value >= upperLimit) {
                    outputArray[j] = upperLimit;
                    ++j;
                    value -= upperLimit;
                }
            } else {
                while (value <= lowerLimit) {
                    outputArray[j] = lowerLimit;
                    ++j;
                    value -= lowerLimit;
                }
            }
            outputArray[j] = value;
            ++j;
        }

        IntArray output;
        if (packing.signed) {
            if (packing.bytesPerElement == 1) {
                output = EncodedDataFactory.int8Array(outputArray);
            } else {
                output = EncodedDataFactory.int16Array(outputArray);
            }
        } else {
            if (packing.bytesPerElement == 1) {
                output = EncodedDataFactory.uint8Array(outputArray);
            } else {
                output = EncodedDataFactory.uint16Array(outputArray);
            }
        }

        Deque<Encoding<?>> enc = new ArrayDeque<>(data.getEncoding());
        this.byteCount = packing.bytesPerElement;
        this.isUnsigned = !packing.signed;
        this.srcSize = data.length();
        enc.add(this);
        output.setEncoding(enc);

        return output;
    }

    static class Packing {
        final boolean signed;
        final int size;
        final int bytesPerElement;

        Packing(boolean signed, int size, int bytesPerElement) {
            this.signed = signed;
            this.size = size;
            this.bytesPerElement = bytesPerElement;
        }
    }

    private Packing determinePacking(int[] input) {
        boolean signed = IntStream.of(input).anyMatch(i -> i < 0);
        int size8 = packingSize(input, signed ? 0x7F : 0xFF);
        int size16 = packingSize(input, signed ? 0x7FFF : 0xFFFF);

        if (input.length * 4 < size16 * 2) {
            // 4 byte packing is the most effective
            return new Packing(signed, input.length, 4);
        } else if (size16 * 2 < size8) {
            // 2 byte packing is the most effective
            return new Packing(signed, size16, 2);
        } else {
            return new Packing(signed, size8, 1);
        }
    }

    private int packingSize(int[] input, int upperLimit) {
        int lowerLimit = -upperLimit - 1;
        int size = 0;
        for (int value : input) {
            if (value == 0) {
                size += 1;
            } else if (value > 0) {
                size += Math.ceil(value / (double) upperLimit);
                if (value % upperLimit == 0) {
                    size += 1;
                }
            } else {
                size += Math.ceil(value / (double) lowerLimit);
                if (value % lowerLimit == 0) {
                    size += 1;
                }
            }
        }
        return size;
    }

    @Override
    public String toString() {
        return "IntegerPackingEncoding{" +
                "byteCount=" + byteCount +
                ", isUnsigned=" + isUnsigned +
                ", srcSize=" + srcSize +
                '}';
    }
}
