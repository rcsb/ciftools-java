package org.rcsb.cif.binary.data;

import org.rcsb.cif.binary.codec.Codec;
import org.rcsb.cif.binary.encoding.FixedPointEncoding;

public interface FloatArray extends NumberArray<double[]> {
    double[] getData();

    default int length() {
        return getData().length;
    }

    default Int32Array encode(FixedPointEncoding encoding) {
        return Codec.FIXED_POINT_CODEC.encode(this, encoding);
    }
}
