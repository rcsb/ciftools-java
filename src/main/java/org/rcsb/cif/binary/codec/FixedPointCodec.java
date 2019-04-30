package org.rcsb.cif.binary.codec;

import org.rcsb.cif.binary.data.*;
import org.rcsb.cif.binary.encoding.Encoding;
import org.rcsb.cif.binary.encoding.FixedPointEncoding;

import java.util.LinkedList;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

/**
 * Converts an array of floating point numbers to an array of 32-bit integers multiplied by a given factor.
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
public class FixedPointCodec {
    public Int32Array encode(FloatArray data, FixedPointEncoding encoding) {
        int srcType = data.getType();
        int factor = encoding.getFactor();

        int[] outputArray = DoubleStream.of(data.getData())
                .mapToInt(d -> (int) Math.round(d * factor))
                .toArray();

        LinkedList<Encoding> enc = new LinkedList<>(data.getEncoding());
        encoding.setSrcType(srcType);
        enc.add(encoding);

        return EncodedDataFactory.int32Array(outputArray, enc);
    }

    public FloatArray decode(Int32Array data, FixedPointEncoding encoding) {
        int[] input = data.getData();
        int srcType = encoding.getSrcType();

        double f = 1.0 / encoding.getFactor();

        double[] outputArray = IntStream.of(input)
                .mapToDouble(i -> f * i)
                .toArray();

        return srcType == 32 ? EncodedDataFactory.float32Array(outputArray, data.getEncoding()) :
                EncodedDataFactory.float64Array(outputArray, data.getEncoding());
    }
}
