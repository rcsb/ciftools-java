package org.rcsb.cif.binary.codec;

import org.rcsb.cif.binary.data.EncodedDataFactory;
import org.rcsb.cif.binary.data.FloatArray;
import org.rcsb.cif.binary.data.Int32Array;
import org.rcsb.cif.binary.encoding.Encoding;
import org.rcsb.cif.binary.encoding.FixedPointEncoding;

import java.util.Arrays;

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
public class FixedPointCodec {
    public Int32Array encode(FloatArray data, FixedPointEncoding encoding) {
        int srcType = data.getType();
        int factor = encoding.getFactor();

        double[] floatData = data.getData();
        int[] outputArray = new int[floatData.length];
        for (int i = 0; i < floatData.length; i++) {
            outputArray[i] = (int) Math.round(floatData[i] * factor);
        }

        Encoding[] dataEncoding = data.getEncoding();
        Encoding[] enc = Arrays.copyOf(dataEncoding, dataEncoding.length + 1);
        encoding.setSrcType(srcType);
        enc[dataEncoding.length] = encoding;

        return EncodedDataFactory.int32Array(outputArray, enc);
    }

    public FloatArray decode(Int32Array data, FixedPointEncoding encoding) {
        int srcType = encoding.getSrcType();
        double f = 1.0 / encoding.getFactor();

        int[] intData = data.getData();
        double[] outputArray = new double[intData.length];
        for (int i = 0; i < intData.length; i++) {
            outputArray[i] = intData[i] * f;
        }

        return srcType == 32 ? EncodedDataFactory.float32Array(outputArray, data.getEncoding()) :
                EncodedDataFactory.float64Array(outputArray, data.getEncoding());
    }
}
