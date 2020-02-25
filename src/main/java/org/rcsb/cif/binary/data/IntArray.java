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

    static IntArray create(int type, int size) {
        int[] data = new int[size];
        switch (type) {
            case Int8Array.TYPE:
                return new Int8Array(data);
            case Int16Array.TYPE:
                return new Int16Array(data);
            case Int32Array.TYPE:
                return new Int32Array(data);
            case Uint8Array.TYPE:
                return new Uint8Array(data);
            case Uint16Array.TYPE:
                return new Uint16Array(data);
            case Uint32Array.TYPE:
                return new Uint32Array(data);
            default:
                throw new IllegalArgumentException("Unknown IntArray type " + type);
        }
    }
}

