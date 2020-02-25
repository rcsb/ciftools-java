package org.rcsb.cif.binary.encoding;

import org.rcsb.cif.binary.data.Float32Array;
import org.rcsb.cif.binary.data.Float64Array;
import org.rcsb.cif.binary.data.FloatArray;
import org.rcsb.cif.binary.data.Int32Array;

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

    @Override
    public FloatArray decode(Int32Array data) {
        double f = 1.0 / factor;

        int[] intData = data.getData();
        double[] outputArray = new double[intData.length];
        for (int i = 0; i < intData.length; i++) {
            outputArray[i] = intData[i] * f;
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
            outputArray[i] = (int) Math.round(floatData[i] * factor);
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
