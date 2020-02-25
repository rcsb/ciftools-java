package org.rcsb.cif.binary.data;

import org.rcsb.cif.binary.encoding.IntegerPackingEncoding;
import org.rcsb.cif.binary.encoding.RunLengthEncoding;

/**
 * An array of integer numbers.
 */
public interface IntArray extends NumberArray<int[]> {
    int[] getData();

    default int length() {
        return getData().length;
    }

    boolean isSigned();

    default Int32Array encode(RunLengthEncoding encoding) {
        return encoding.encode(this);
    }

    default Int32Array decode(IntegerPackingEncoding encoding) {
        return encoding.decode(this);
    }
}

