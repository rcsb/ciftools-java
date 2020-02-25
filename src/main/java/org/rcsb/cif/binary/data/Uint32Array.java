package org.rcsb.cif.binary.data;

import org.rcsb.cif.binary.encoding.Encoding;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * An array of unsigned integer numbers using 32 bit to store each value.
 */
public class Uint32Array extends AbstractEncodedData<int[]> implements UnsignedIntArray {
    private static final int NUMBER_OF_BYTES = 4;
    static final int TYPE = 6;

    Uint32Array(int[] data) {
        this(data, new ArrayDeque<>());
    }

    Uint32Array(int[] data, Deque<Encoding<?, ?>> encoding) {
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
        return Int32Array.int32ToByteArray(getData());
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