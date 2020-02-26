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
 * <p>Converts an array of floating point numbers to a {@link Int32Array} where the values are quantized within a
 * given interval into specified number of discrete steps. Values lower than the minimum value or greater than the
 * maximum are represented by the respective boundary values.</p>
 *
 * <pre>
 * FixedPoint {
 *     kind = "IntervalQuantization"
 *     min: number,
 *     max: number,
 *     numSteps: number,
 *     srcType: Float32 | Float64
 * }
 * Example
 * [0.5, 1, 1.5, 2, 3, 1.345 ]
 * ---IntervalQuantization---&gt;
 * { min = 1, max = 2, numSteps = 3 } [0, 0, 1, 2, 2, 1]
 * </pre>
 */
public class IntervalQuantizationEncoding implements Encoding<FloatArray, Int32Array> {
    private int min;
    private int max;
    private int numSteps;
    private int srcType;

    public IntervalQuantizationEncoding() {
        // need to constructor for future support
    }

    public IntervalQuantizationEncoding(int min, int max, int numSteps, int srcType) {
        this.min = min;
        this.max = max;
        this.numSteps = numSteps;
        this.srcType = srcType;
    }

    @Override
    public Map<String, Object> getMapRepresentation() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("kind", "IntervalQuantization");
        map.put("min", min);
        map.put("max", max);
        map.put("numSteps", numSteps);
        map.put("srcType", srcType);
        return map;
    }

    @Override
    public FloatArray decode(Int32Array data) {
        double delta = (max - min) / (numSteps - 1.0);

        int[] intData = data.getData();
        double[] output = new double[intData.length];
        for (int i = 0; i < intData.length; i++) {
            output[i] = min + delta * intData[i];
        }

        return srcType == 32 ? new Float32Array(output, data.getEncoding()) :
                new Float64Array(output, data.getEncoding());
    }

    @Override
    public Int32Array encode(FloatArray data) {
        double[] input = data.getData();
        this.srcType = data.getType();

        if (input.length == 0) {
            Deque<Encoding<?, ?>> enc = new ArrayDeque<>(data.getEncoding());
            this.srcType = 3;
            enc.add(this);
            return new Int32Array(new int[0], enc);
        }

        if (max < min) {
            int t = min;
            min = max;
            max = t;
        }

        double delta = (max - min) / (numSteps - 1.0);

        int[] output = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            double v = input[i];
            if (v <= min) {
                output[i] = 0;
            } else if (v >= max) {
                output[i] = numSteps - 1;
            } else {
                output[i] = delta == 0 ? 0 : (int) Math.round((v - min) / delta);
            }
        }

        Deque<Encoding<?, ?>> enc = new ArrayDeque<>(data.getEncoding());
        enc.add(this);

        return new Int32Array(output, enc);
    }

    @Override
    public String toString() {
        return "IntervalQuantizationEncoding{" +
                "min=" + min +
                ", max=" + max +
                ", numSteps=" + numSteps +
                ", srcType=" + srcType +
                '}';
    }
}