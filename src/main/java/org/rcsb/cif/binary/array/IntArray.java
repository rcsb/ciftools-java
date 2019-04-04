package org.rcsb.cif.binary.array;

public interface IntArray extends NumberArray<int[]> {
    int[] getArray();

    static IntArray get(int srcType, int length) {
        switch (srcType) {
            case 1:
                return new Int8Array(new int[length]);
            case 2:
                return new Int16Array(new int[length]);
            case 3:
                return new Int32Array(new int[length]);
            case 4:
                return new Uint8Array(new int[length]);
            case 5:
                return new Uint16Array(new int[length]);
            case 6:
                return new Uint32Array(new int[length]);
            default:
                throw new IllegalArgumentException("Unknown array type " + srcType);
        }
    }
}
