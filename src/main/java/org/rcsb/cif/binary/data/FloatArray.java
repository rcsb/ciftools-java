package org.rcsb.cif.binary.data;

import org.rcsb.cif.binary.encoding.FixedPointEncoding;

/**
 * An array of floating point numbers.
 */
public interface FloatArray extends NumberArray<double[]> {
    double[] getData();

    default int length() {
        return getData().length;
    }

    default Int32Array encode(FixedPointEncoding encoding) {
        return encoding.encode(this);
    }
}
