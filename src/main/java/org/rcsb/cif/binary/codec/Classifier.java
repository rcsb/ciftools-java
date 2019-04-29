package org.rcsb.cif.binary.codec;

import org.rcsb.cif.binary.data.*;
import org.rcsb.cif.binary.encoding.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.DoubleStream;

/**
 * Classifies Int32Array and Float64Array instances, i.e. for the given information find the most efficient encoding
 * strategy which results in the most compact storage of the data.
 */
public class Classifier {
    /**
     * Auto-encodes this Int32Array by the encoding strategy with the minimal size.
     * @param data the data to encode
     * @return the EncodedData instance which wraps a primitive byte[] and provides all information needed to decode it
     */
    public static ByteArray classify(Int32Array data) {
        if (data.getData().length < 2) {
            return data.encode(new ByteArrayEncoding());
        }

        EncodingSize size = getSize(data);

        switch (size.kind) {
            case "pack":
                return data.encode(new IntegerPackingEncoding())
                        .encode(new ByteArrayEncoding());
            case "rle":
                return data.encode(new RunLengthEncoding())
                        .encode(new IntegerPackingEncoding())
                        .encode(new ByteArrayEncoding());
            case "delta":
                return data.encode(new DeltaEncoding())
                        .encode(new IntegerPackingEncoding())
                        .encode(new ByteArrayEncoding());
            case "delta-rle":
                return ((SignedIntArray) data).encode(new DeltaEncoding())
                        .encode(new RunLengthEncoding())
                        .encode(new IntegerPackingEncoding())
                        .encode(new ByteArrayEncoding());
            default:
                throw new IllegalArgumentException("Determined encoding type is unknown. " + size.kind);
        }
    }

    private static int packSize(int value, int upperLimit) {
        return (int) Math.ceil((value + 1) / (double) (value >= 0 ? upperLimit : -upperLimit - 1));
    }

    static class SizeInfo {
        int pack8;
        int pack16;
        int count;
    }

    private static void incSize(IntColumnInfo intColumnInfo, SizeInfo sizeInfo, int value) {
        sizeInfo.pack8 += packSize(value, intColumnInfo.limit8);
        sizeInfo.pack16 += packSize(value, intColumnInfo.limit16);
        sizeInfo.count += 1;
    }

    private static void incSizeSigned(SizeInfo sizeInfo, int value) {
        sizeInfo.pack8 += packSize(value, 0x7F);
        sizeInfo.pack16 += packSize(value, 0x7FFF);
        sizeInfo.count += 1;
    }

    static class ByteSize {
        final int length;
        final int elem;

        ByteSize(int length, int elem) {
            this.length = length;
            this.elem = elem;
        }
    }

    private static ByteSize byteSize(SizeInfo sizeInfo) {
        if (sizeInfo.count * 4 < sizeInfo.pack16 * 2) {
            return new ByteSize(sizeInfo.count * 4, 4);
        } else if (sizeInfo.pack16 * 2 < sizeInfo.pack8) {
            return new ByteSize(sizeInfo.pack16 * 2, 2);
        } else {
            return new ByteSize(sizeInfo.pack8, 1);
        }
    }

    static class EncodingSize extends ByteSize {
        final String kind;

        EncodingSize(ByteSize byteSize, String kind) {
            super(byteSize.length, byteSize.elem);
            this.kind = kind;
        }

        @Override
        public String toString() {
            return "{" +
                    "kind='" + kind + "\', " +
                    "length=" + length +
                    '}';
        }
    }

    private static EncodingSize packingSize(int[] data, IntColumnInfo info) {
        SizeInfo size = new SizeInfo();
        for (int datum : data) {
            incSize(info, size, datum);
        }
        return new EncodingSize(byteSize(size), "pack");
    }

    private static EncodingSize deltaSize(int[] data) {
        SizeInfo size = new SizeInfo();
        int prev = data[0];
        for (int i = 1; i < data.length; i++) {
            incSizeSigned(size, data[i] - prev);
            prev = data[i];
        }
        return new EncodingSize(byteSize(size), "delta");
    }

    private static EncodingSize rleSize(int[] data, IntColumnInfo info) {
        SizeInfo size = new SizeInfo();
        int run = 1;
        for (int i = 1; i < data.length; i++) {
            if (data[i - 1] != data[i]) {
                incSize(info, size, data[i - 1]);
                incSize(info, size, run);
                run = 1;
            } else {
                run++;
            }
        }
        incSize(info, size, data[data.length - 1]);
        incSize(info, size, run);

        return new EncodingSize(byteSize(size), "rle");
    }

    private static EncodingSize deltaRleSize(int[] data) {
        SizeInfo size = new SizeInfo();
        int run = 1;
        int prev = 0;
        int prevValue = 0;
        for (int i = 1; i < data.length; i++) {
            int v = data[i] - prev;
            if (prevValue != v) {
                incSizeSigned(size, prevValue);
                incSizeSigned(size, run);
                run = 1;
            } else {
                run++;
            }
            prevValue = v;
            prev = data[i];
        }
        incSizeSigned(size, prevValue);
        incSizeSigned(size, run);

        return new EncodingSize(byteSize(size), "delta-rle");
    }

    private static IntColumnInfo getInfo(IntArray data) {
        boolean signed = data.isSigned();
        return signed ? IntColumnInfo.SIGNED_INFO : IntColumnInfo.UNSIGNED_INFO;
    }

    static class IntColumnInfo {
        final static IntColumnInfo SIGNED_INFO = new IntColumnInfo(true, 0x7F, 0x7FFF);
        final static IntColumnInfo UNSIGNED_INFO = new IntColumnInfo(false, 0xFF, 0xFFFF);

        final boolean signed;
        final int limit8;
        final int limit16;

        IntColumnInfo(boolean signed, int limit8, int limit16) {
            this.signed = signed;
            this.limit8 = limit8;
            this.limit16 = limit16;
        }
    }

    private static EncodingSize getSize(IntArray data) {
        return getSize(data.getData(), getInfo(data));
    }

    private static EncodingSize getSize(int[] array, IntColumnInfo info) {
        List<EncodingSize> sizes = new ArrayList<>();
        sizes.add(packingSize(array, info));
        sizes.add(rleSize(array, info));
        sizes.add(deltaSize(array));
        sizes.add(deltaRleSize(array));
        sizes.sort(Comparator.comparingInt(encodingSize -> encodingSize.length));
        return sizes.get(0);
    }

    private static final double DELTA = 1e-6;

    /**
     * Auto-encodes this FloatArray by the encoding strategy with the minimal size. All Float64Array instances are
     * encoded as Int32Array after finding a reasonable FixedPointEncoding.
     * @param data the data to encode
     * @return the EncodedData instance which wraps a primitive byte[] and provides all information needed to decode it
     */
    public static ByteArray classify(Float64Array data) {
        int maxDigits = 4;

        int[] arrayDigitCount = getArrayDigitCount(data.getData(), maxDigits);
        int mantissaDigits = arrayDigitCount[0];
        int integerDigits = arrayDigitCount[1];

        if (mantissaDigits < 0 || mantissaDigits + integerDigits > 10) {
            return data.encode(new ByteArrayEncoding(data.getType()));
        }

        if (mantissaDigits == 0) {
            throw new UnsupportedOperationException("cannot handle yet, impl me");
        }

        int multiplier = getMultiplier(mantissaDigits);
        int[] intArray = DoubleStream.of(data.getData())
                .mapToInt(d -> (int) Math.round(multiplier * d))
                .toArray();

        EncodingSize size = getSize(intArray, IntColumnInfo.SIGNED_INFO);

        Int32Array fixedPoint = data.encode(new FixedPointEncoding(multiplier));
        switch (size.kind) {
            case "pack":
                return fixedPoint.encode(new IntegerPackingEncoding())
                        .encode(new ByteArrayEncoding());
            case "rle":
                return fixedPoint.encode(new RunLengthEncoding())
                        .encode(new IntegerPackingEncoding())
                        .encode(new ByteArrayEncoding());
            case "delta":
                return fixedPoint.encode(new DeltaEncoding())
                        .encode(new IntegerPackingEncoding())
                        .encode(new ByteArrayEncoding());
            case "delta-rle":
                return fixedPoint.encode(new DeltaEncoding())
                        .encode(new RunLengthEncoding())
                        .encode(new IntegerPackingEncoding())
                        .encode(new ByteArrayEncoding());
            default:
                throw new IllegalArgumentException("Determined encoding type is unknown. " + size.kind);
        }
    }

    private static int getMultiplier(int mantissaDigits) {
        int m = 1;
        for (int i = 0; i < mantissaDigits; i++) {
            m *= 10;
        }
        return m;
    }

    /**
     * Determine the maximum number of digits in a floating point data.
     * Find a number M such that round(M * v) - M * v <= delta.
     * If no such M exists, return -1.
     */
    private static int[] getArrayDigitCount(double[] xs, int maxDigits) {
        int mantissaDigits = 1;
        int integerDigits = 0;
        for (double x : xs) {
            if (mantissaDigits >= 0) {
                final int t = getMantissaMultiplier(x, maxDigits);
                if (t < 0) {
                    mantissaDigits = -1;
                } else if (t > mantissaDigits) {
                    mantissaDigits = t;
                }
            }
            double abs = Math.abs(x);
            if (abs > DELTA) {
                int d = (int) (Math.floor(Math.log10(Math.abs(abs))) + 1);
                if (d > integerDigits) {
                    integerDigits = d;
                }
            }
        }
        return new int[] { mantissaDigits, integerDigits };
    }

    /**
     * Determine the number of digits in a floating point number
     * Find a number M such that round(M * v) - M * v <= delta.
     * If no such M exists, return -1.
     */
    private static int getMantissaMultiplier(double v, int maxDigits) {
        int m = 1, i;
        for (i = 0; i < maxDigits; i++) {
            double mv = m * v;
            if (Math.abs(Math.round(mv) - mv) <= DELTA) {
                return i;
            }
            m *= 10;
        }
        return -1;
    }
}
