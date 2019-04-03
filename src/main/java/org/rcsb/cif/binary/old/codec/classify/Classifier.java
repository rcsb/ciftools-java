package org.rcsb.cif.binary.old.codec.classify;

import org.rcsb.cif.binary.old.codec.Codec;
import org.rcsb.cif.binary.old.codec.CodecLibrary;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Classifier {
    // TODO need generics? some encodings may not return int[]
    public static Function<int[], int[]> classifyArray(int[] data) {
        if (data.length < 2) {
            return CodecLibrary.BYTE_ARRAY.getEncodingFunction();
        }

        List<EncodingSize> sizes = getSize(data);
        EncodingSize size = sizes.get(0);

        switch (size.kind) {
            case "pack":
                return CodecLibrary.INTEGER_PACKING.getEncodingFunction();
            case "rle":
                return CodecLibrary.RUN_LENGTH.getEncodingFunction()
                        .andThen(CodecLibrary.INTEGER_PACKING.getEncodingFunction());
            case "delta":
                return CodecLibrary.DELTA.getEncodingFunction()
                        .andThen(CodecLibrary.INTEGER_PACKING.getEncodingFunction());
            case "delta-rle":
                return CodecLibrary.DELTA.getEncodingFunction()
                        .andThen(CodecLibrary.RUN_LENGTH.getEncodingFunction())
                        .andThen(CodecLibrary.INTEGER_PACKING.getEncodingFunction());
            default:
                throw new IllegalArgumentException("Determined encoding type is unknown. " + size.kind);
        }
    }

    private static int packSize(int value, int upperLimit) {
        return (int) Math.ceil((value + 1) / (double) (value >= 0 ? upperLimit : -upperLimit - 1));
    }

    private static IntColumnInfo getInfo(int[] data) {
        boolean signed = IntStream.of(data).anyMatch(i -> i < 0);
        return signed ? new IntColumnInfo(signed, 0x7F, 0x7FFF) : new IntColumnInfo(signed, 0xFF, 0xFFFF);
    }

    static class IntColumnInfo {
        boolean signed;
        int limit8;
        int limit16;

        IntColumnInfo(boolean signed, int limit8, int limit16) {
            this.signed = signed;
            this.limit8 = limit8;
            this.limit16 = limit16;
        }
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
        int length;
        int elem;

        ByteSize(int length, int elem) {
            this.length = length;
            this.elem = elem;
        }
    }

    // TODO encodings should report their respective size
    private static ByteSize byteSize(SizeInfo sizeInfo) {
        if (sizeInfo.count * 4 < sizeInfo.pack16 * 2) {
            return new ByteSize(sizeInfo.count * 4, 4);
        } else if (sizeInfo.count * 2 < sizeInfo.pack8) {
            return new ByteSize(sizeInfo.pack16 * 2, 2);
        } else {
            return new ByteSize(sizeInfo.pack8, 1);
        }
    }

    static class EncodingSize extends ByteSize {
        String kind;

        EncodingSize(ByteSize byteSize, String kind) {
            super(byteSize.length, byteSize.elem);
            this.kind = kind;
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
            if (prev != v) {
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

    public static List<EncodingSize> getSize(int[] data) {
        IntColumnInfo info = getInfo(data);
        List<EncodingSize> sizes = new ArrayList<>();
        sizes.add(packingSize(data, info));
        sizes.add(rleSize(data, info));
        sizes.add(deltaSize(data));
        sizes.add(deltaRleSize(data));
        sizes.sort(Comparator.comparingInt(e -> e.length));
        return sizes;
    }

    private static final double delta = 1e-6;

    // TODO generics
    public static Function<double[], Object> classifyArray(double[] data) {
        int maxDigits = 4;

        int[] arrayDigitCount = getArrayDigitCount(data, maxDigits, delta);
        int mantissaDigits = arrayDigitCount[0];
        int integerDigits = arrayDigitCount[1];

        // TODO: better check for overflows here?
        if (mantissaDigits < 0 || mantissaDigits + integerDigits > 10) {
            // TODO encode by byte array
            return null;
        }
        // TODO: this needs a conversion to Int?Array?
        if (mantissaDigits == 0) {
            // TODO impl
//            return classifyArray(DoubleStream.of(data).mapToInt(d -> (int) d).toArray());
        }

        int multiplier = getMultiplier(mantissaDigits);
        int[] intArray = DoubleStream.of(data)
                .mapToInt(d -> (int) Math.round(multiplier * d))
                .toArray();

        List<EncodingSize> sizes = getSize(intArray);
        EncodingSize size = sizes.get(0);

        // TODO set multiplier
        Function<double[], int[]> fp = CodecLibrary.FIXED_POINT.getEncodingFunction(); // TODO CodecLibrary.FIXED_POINT.factor(multiplier).encodingFunction();
        switch (size.kind) {
            case "pack":
                return fp.andThen(CodecLibrary.INTEGER_PACKING.getEncodingFunction());
            case "rle":
                return fp.andThen(CodecLibrary.RUN_LENGTH.getEncodingFunction())
                        .andThen(CodecLibrary.INTEGER_PACKING.getEncodingFunction());
            case "delta":
                return fp.andThen(CodecLibrary.DELTA.getEncodingFunction())
                        .andThen(CodecLibrary.INTEGER_PACKING.getEncodingFunction());
            case "delta-rle":
                return fp.andThen(CodecLibrary.DELTA.getEncodingFunction())
                        .andThen(Codec.RUN_LENGTH.getEncodingFunction())
                        .andThen(Codec.INTEGER_PACKING.getEncodingFunction());
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
     * Determine the maximum number of digits in a floating point array.
     * Find a number M such that round(M * v) - M * v <= delta.
     * If no such M exists, return -1.
     */
    private static int[] getArrayDigitCount(double[] xs, int maxDigits, double delta) {
        int mantissaDigits = 1;
        int integerDigits = 0;
        for (double x : xs) {
            if (mantissaDigits >= 0) {
                final int t = getMantissaMultiplier(x, maxDigits, delta);
                if (t < 0) {
                    mantissaDigits = -1;
                } else if (t > mantissaDigits) {
                    mantissaDigits = t;
                }
            }
            double abs = Math.abs(x);
            if (abs > delta) {
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
    private static int getMantissaMultiplier(double v, int maxDigits, double delta) {
        int m = 1, i;
        for (i = 0; i < maxDigits; i++) {
            double mv = m * v;
            if (Math.abs(Math.round(mv) - mv) <= delta) {
                return i;
            }
            m *= 10;
        }
        return -1;
    }
}
