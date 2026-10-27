package org.rcsb.cif.binary.encoding;

import org.rcsb.cif.binary.data.Float32Array;
import org.rcsb.cif.binary.data.Float64Array;
import org.rcsb.cif.binary.data.FloatArray;
import org.rcsb.cif.binary.data.Int32Array;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <p>Converts an array of floating point numbers to a {@link Int32Array} multiplied by a given factor.</p>
 *
 * <pre>
 * FixedPoint {
 *     kind = "FixedPoint"
 *     factor: number
 *     srcType: Float32 | Float64
 * }
 * Example
 * [1.2, 1.23, 0.123]
 * ---FixedPoint---&gt;
 * { factor = 100 } [120, 123, 12]
 * </pre>
 */
public class FixedPointEncoding implements Encoding<FloatArray, Int32Array> {
    private final int factor;
    private int srcType;

    public FixedPointEncoding(int factor) {
        this.factor = factor;
    }

    public FixedPointEncoding(int factor, int srcType) {
        this.factor = factor;
        this.srcType = srcType;
    }

    @Override
    public Map<String, Object> getMapRepresentation() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("kind", "FixedPoint");
        map.put("factor", factor);
        map.put("srcType", srcType);
        return map;
    }

    /**
     * The value times the factor, rounded half-even like text output rounds (e.g. "0.000"). Near a tie the product
     * can be rounded across it (26.5325 * 1000 is 26532.5, while 26.5325 is stored as 26.53249999...), so the exact
     * value decides there.
     */
    static int round(double value, int factor) {
        double scaled = value * factor;
        double fraction = scaled - Math.floor(scaled);
        if (Math.abs(fraction - 0.5) > 1e-6) {
            return (int) Math.round(scaled);
        }
        return new BigDecimal(value)
                .multiply(BigDecimal.valueOf(factor))
                .setScale(0, RoundingMode.HALF_EVEN)
                .intValue();
    }

    @Override
    public FloatArray decode(Int32Array data) {
        // divide, not multiply by 1 / factor: the quotient of two exact numbers is the double nearest to the decimal
        // value (as parsed from text), while the product with the rounded reciprocal is one ulp off for many values
        int[] intData = data.getData();
        double[] outputArray = new double[intData.length];
        for (int i = 0; i < intData.length; i++) {
            outputArray[i] = intData[i] / (double) factor;
        }

        return srcType == 32 ? new Float32Array(outputArray, data.getEncoding()) :
                new Float64Array(outputArray, data.getEncoding());
    }

    @Override
    public Int32Array encode(FloatArray data) {
        this.srcType = data.getType();

        double[] floatData = data.getData();
        int[] outputArray = new int[floatData.length];
        for (int i = 0; i < floatData.length; i++) {
            outputArray[i] = round(floatData[i], factor);
        }

        Deque<Encoding<?, ?>> enc = new ArrayDeque<>(data.getEncoding());
        enc.add(this);

        return new Int32Array(outputArray, enc);
    }

    @Override
    public String toString() {
        return "FixedPointEncoding{" +
                "factor=" + factor +
                ", srcType=" + srcType +
                '}';
    }
}
