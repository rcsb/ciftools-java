package org.rcsb.cif.binary.data;

import org.rcsb.cif.binary.encoding.Encoding;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * An array of unsigned integer numbers using 8 bit to store each value.
 */
public class Uint8Array extends AbstractEncodedData<int[]> implements UnsignedIntArray {
    private static final int NUMBER_OF_BYTES = 1;
    static final int TYPE = 4;

    public Uint8Array(int[] data) {
        this(data, new ArrayDeque<>());
    }

    public Uint8Array(int[] data, Deque<Encoding<?, ?>> encoding) {
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
        return Int8Array.int8ToByteArray(getData());
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
