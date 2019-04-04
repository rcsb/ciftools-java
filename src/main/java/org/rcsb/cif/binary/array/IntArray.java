package org.rcsb.cif.binary.array;

public interface IntArray extends NumberArray<int[]> {
    int[] getArray();

    static IntArray get(int srcType, int length) {
        switch (srcType) {
            case Int8Array.TYPE:
                return new Int8Array(new int[length]);
            case Int16Array.TYPE:
                return new Int16Array(new int[length]);
            case Int32Array.TYPE:
                return new Int32Array(new int[length]);
            case Uint8Array.TYPE:
                return new Uint8Array(new int[length]);
            case Uint16Array.TYPE:
                return new Uint16Array(new int[length]);
            case Uint32Array.TYPE:
                return new Uint32Array(new int[length]);
            default:
                throw new IllegalArgumentException("Unknown array type " + srcType);
        }
    }
}
