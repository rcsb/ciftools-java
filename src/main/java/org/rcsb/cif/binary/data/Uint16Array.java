package org.rcsb.cif.binary.data;

import org.rcsb.cif.binary.encoding.Encoding;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Uint16Array extends AbstractEncodedData<int[]> implements UnsignedIntArray {
    private static final int NUMBER_OF_BYTES = 2;
    static final int TYPE = 5;

    Uint16Array(int[] data) {
        this(data, new ArrayDeque<>());
    }

    Uint16Array(int[] data, Deque<Encoding> encoding) {
        super(data, encoding);
    }

    @Override
    public int[] getData() {
        return (int[]) data;
    }

    @Override
    public int length() {
        return getData().length;
    }

    @Override
    public byte[] toByteArray() {
        return Int16Array.int16ToByteArray(getData());
    }

    @Override
    public int getNumberOfBytes() {
        return NUMBER_OF_BYTES;
    }

    @Override
    public int getType() {
        return TYPE;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + Arrays.toString(getData());
    }
}