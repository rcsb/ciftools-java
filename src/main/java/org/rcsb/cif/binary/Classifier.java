package org.rcsb.cif.binary;

import org.rcsb.cif.EncodingStrategyHint;
import org.rcsb.cif.binary.data.ByteArray;
import org.rcsb.cif.binary.data.Float64Array;
import org.rcsb.cif.binary.data.FloatArray;
import org.rcsb.cif.binary.data.Int32Array;
import org.rcsb.cif.binary.encoding.FixedPointEncoding;


/**
 * Classifies {@link Int32Array} and {@link Float64Array} instances, i.e. for the given information find the most
 * efficient encoding strategy which results in the most compact storage of the data.
 */
public class Classifier {
    private Classifier() {
        // nothing here
    }

    /**
     * Auto-encodes this {@link Int32Array} by the encoding strategy with the minimal size.
     * @param data the data to encode
     * @return the {@link EncodingStrategyHint} instance which provides all information needed to encode/decode it
     */
    public static EncodingStrategyHint classify(Int32Array data) {
        EncodingStrategyHint hint = new EncodingStrategyHint();
        int[] d = data.getData();
        if (d.length < 2) {
            hint.setEncoding("byte");
            return hint;
        }

        EncodingSize size = getSize(d);
        hint.setEncoding(size.kind);
        return hint;
    }

    /** ceil((value + 1) / (value >= 0 ? upperLimit : -upperLimit - 1)) in integer arithmetic; -1 counts as 0 */
    private static int packSize(int value, int upperLimit) {
        if (value >= 0) {
            return value < upperLimit ? 1 : (int) ((value + (long) upperLimit) / upperLimit);
        }
        long a = -(value + 1L);
        return (int) ((a + upperLimit) / (upperLimit + 1L));
    }

    /**
     * Encode an {@link Int32Array} using the given encoding strategy.
     * @param column the data to encode
     * @param encoding how to encode
     * @return encoded data
     */
    public static ByteArray encode(Int32Array column, String encoding) {
        // in one pass instead of an array per step: e.g. "delta-rle" is Delta, RunLength, IntegerPacking, ByteArray
        return IntChainEncoder.encode(column.getData(), encoding, column.getEncoding());
    }

    static class SizeInfo {
        // long: for millions of values the packed lengths exceed an int
        long pack8;
        long pack16;
        long count;
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
        final long length;
        final int elem;

        ByteSize(long length, int elem) {
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
                    "kind='" + kind + "', " +
                    "length=" + length +
                    '}';
        }
    }

    private static IntColumnInfo getInfo(int[] data) {
        boolean signed = false;
        // can't rely on NumberArray#isSigned here as storage type doesn't necessarily reflect actual data
        for (int d : data) {
            if (d < 0) {
                signed = true;
                break;
            }
        }
        return signed ? IntColumnInfo.SIGNED_INFO : IntColumnInfo.UNSIGNED_INFO;
    }

    static class IntColumnInfo {
        static final IntColumnInfo SIGNED_INFO = new IntColumnInfo(true, 0x7F, 0x7FFF);
        static final IntColumnInfo UNSIGNED_INFO = new IntColumnInfo(false, 0xFF, 0xFFFF);

        final boolean signed;
        final int limit8;
        final int limit16;

        IntColumnInfo(boolean signed, int limit8, int limit16) {
            this.signed = signed;
            this.limit8 = limit8;
            this.limit16 = limit16;
        }
    }

    private static EncodingSize getSize(int[] data) {
        return getSize(data, getInfo(data));
    }

    private static EncodingSize getSize(int[] data, IntColumnInfo info) {
        // the sizes of all four encodings in one pass
        SizeInfo pack = new SizeInfo();
        SizeInfo rle = new SizeInfo();
        SizeInfo delta = new SizeInfo();
        SizeInfo deltaRle = new SizeInfo();
        int n = data.length;
        if (n > 0) {
            incSize(info, pack, data[0]);
            int run = 1;
            // delta-rle takes the first difference from 0 (as Mol*), not from the first value
            int deltaBase = 0;
            int deltaValue = 0;
            int deltaRun = 1;
            for (int i = 1; i < n; i++) {
                int value = data[i];
                int previous = data[i - 1];
                incSize(info, pack, value);

                if (previous != value) {
                    incSize(info, rle, previous);
                    incSize(info, rle, run);
                    run = 1;
                } else {
                    run++;
                }

                incSizeSigned(delta, value - previous);

                int d = value - deltaBase;
                if (deltaValue != d) {
                    incSizeSigned(deltaRle, deltaValue);
                    incSizeSigned(deltaRle, deltaRun);
                    deltaRun = 1;
                } else {
                    deltaRun++;
                }
                deltaValue = d;
                deltaBase = value;
            }
            incSize(info, rle, data[n - 1]);
            incSize(info, rle, run);
            incSizeSigned(deltaRle, deltaValue);
            incSizeSigned(deltaRle, deltaRun);
        }

        // the first of equal sizes wins
        EncodingSize min = new EncodingSize(byteSize(pack), "pack");
        for (EncodingSize size : new EncodingSize[] {
                new EncodingSize(byteSize(rle), "rle"),
                new EncodingSize(byteSize(delta), "delta"),
                new EncodingSize(byteSize(deltaRle), "delta-rle") }) {
            if (size.length < min.length) {
                min = size;
            }
        }
        return min;
    }

    private static final double DELTA = 1e-6;

    /**
     * Auto-encodes this {@link FloatArray} by the encoding strategy with the minimal size. All {@link Float64Array}
     * instances are encoded as {@link Int32Array} after finding a reasonable {@link FixedPointEncoding}.
     * @param data the data to encode
     * @return the {@link EncodingStrategyHint} providing all information needed to encode/decode it
     */
    public static EncodingStrategyHint classify(Float64Array data) {
        EncodingStrategyHint hint = classifyPrecision(data);
        if ("byte".equals(hint.getEncoding())) {
            return hint;
        }

        Int32Array fixedPoint = data.encode(new FixedPointEncoding(getMultiplier(hint.getPrecision())));
        hint.setEncoding(classifyFixedPoint(fixedPoint));
        return hint;
    }

    /**
     * The encoding of minimal size for the fixed point values of a float column. Unlike {@link #classify(Int32Array)},
     * also for fewer than 2 values.
     * @param fixedPoint the values times the factor
     * @return how to encode them
     */
    static String classifyFixedPoint(Int32Array fixedPoint) {
        return getSize(fixedPoint.getData()).kind;
    }

    /**
     * Determines the precision needed to encode this column in a lossless fashion.
     * @param data the data to handle
     * @return an {@link EncodingStrategyHint} instance with the determined precision stored in the precision field
     */
    public static EncodingStrategyHint classifyPrecision(Float64Array data) {
        EncodingStrategyHint hint = new EncodingStrategyHint();

        int[] arrayDigitCount = getArrayDigitCount(data.getData(), MAX_DIGITS);
        int mantissaDigits = arrayDigitCount[0];
        int integerDigits = arrayDigitCount[1];

        if (mantissaDigits < 0 || mantissaDigits + integerDigits > 10 || !fitsInt(data.getData(), getMultiplier(mantissaDigits))) {
            hint.setEncoding("byte");
            return hint;
        }
        if (mantissaDigits == 0) {
            throw new UnsupportedOperationException("cannot handle yet, impl me");
        }

        hint.setPrecision(mantissaDigits);
        return hint;
    }

    /**
     * Fixed point is tried with up to 10^(MAX_DIGITS - 1), i.e. 6 decimal places (anisotropic displacements and
     * fractional matrices carry 4 to 6); values that need more are stored as they are.
     */
    private static final int MAX_DIGITS = 7;

    /** Whether every value times the multiplier rounds to an int. */
    private static boolean fitsInt(double[] values, int multiplier) {
        for (double v : values) {
            double scaled = v * multiplier;
            if (!(scaled >= Integer.MIN_VALUE && scaled <= Integer.MAX_VALUE)) {
                return false;
            }
        }
        return true;
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
        double maxAbs = 0;
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
            if (abs > maxAbs) {
                maxAbs = abs;
            }
        }
        // floor(log10(x)) + 1 grows with x (Math.log10 is semi-monotonic): its maximum is that of the largest value
        int integerDigits = 0;
        if (maxAbs > DELTA) {
            integerDigits = Math.max(0, (int) (Math.floor(Math.log10(maxAbs)) + 1));
        }
        return new int[] { mantissaDigits, integerDigits };
    }

    /**
     * Determine the number of digits in a floating point number
     * Find a number M such that round(M * v) - M * v <= delta.
     * If no such M exists, return -1.
     */
    private static int getMantissaMultiplier(double v, int maxDigits) {
        int m = 1;
        for (int i = 0; i < maxDigits; i++) {
            double mv = m * v;
            if (Math.abs(Math.round(mv) - mv) <= DELTA) {
                return i;
            }
            m *= 10;
        }
        return -1;
    }
}
