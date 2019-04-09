package org.rcsb.cif.binary.data;

import org.rcsb.cif.binary.codec.Codec;
import org.rcsb.cif.binary.encoding.IntegerPackingEncoding;
import org.rcsb.cif.binary.encoding.RunLengthEncoding;

public interface IntArray extends NumberArray<int[]> {
    int[] getData();

    default int length() {
        return getData().length;
    }

    boolean isSigned();

    default Int32Array encode(RunLengthEncoding encoding) {
        return Codec.RUN_LENGTH_CODEC.encode(this, encoding);
    }

    default Int32Array decode(IntegerPackingEncoding encoding) {
        return Codec.INTEGER_PACKING_CODEC.decode(this, encoding);
    }
}

