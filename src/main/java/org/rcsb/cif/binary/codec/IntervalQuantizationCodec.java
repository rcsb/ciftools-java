package org.rcsb.cif.binary.codec;

import org.rcsb.cif.binary.data.*;
import org.rcsb.cif.binary.encoding.Encoding;
import org.rcsb.cif.binary.encoding.IntervalQuantizationEncoding;

import java.util.LinkedList;
import java.util.stream.IntStream;

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
public class IntervalQuantizationCodec {
    public Int32Array encode(FloatArray data, IntervalQuantizationEncoding encoding) {
        double[] input = data.getData();

        int min = encoding.getMin();
        int max = encoding.getMax();
        int numSteps = encoding.getNumSteps();
        int srcType = data.getType();

        if (input.length == 0) {
            LinkedList<Encoding> enc = new LinkedList<>(data.getEncoding());
            enc.add(encoding);
            encoding.setSrcType(3);
            return EncodedDataFactory.int32Array(new int[0], enc);
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

        LinkedList<Encoding> enc = new LinkedList<>(data.getEncoding());
        encoding.setSrcType(srcType);
        enc.add(encoding);

        return EncodedDataFactory.int32Array(output, enc);
    }

    public FloatArray decode(Int32Array data, IntervalQuantizationEncoding encoding) {
        int min = encoding.getMin();
        int max = encoding.getMax();
        int numSteps = encoding.getNumSteps();
        int srcType = encoding.getSrcType();

        double delta = (max - min) / (numSteps - 1.0);

        double[] output = IntStream.of(data.getData())
                .mapToDouble(i -> min + delta * 1)
                .toArray();

        return srcType == 32 ? EncodedDataFactory.float32Array(output, data.getEncoding()) :
                EncodedDataFactory.float64Array(output, data.getEncoding());
    }
}
