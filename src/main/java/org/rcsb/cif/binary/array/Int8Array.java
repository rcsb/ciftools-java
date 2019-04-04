package org.rcsb.cif.binary.array;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Int8Array implements IntArray {
    private static final int NUMBER_OF_BYTES = 1;
    public static final int TYPE = 1;
    protected final int[] array;

    public Int8Array(int... array) {
        this.array = array;
    }

    public Int8Array(byte... bytes) {
        this.array = new int[bytes.length];
        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);
        for (int i = 0; i < array.length; i++) {
            array[i] = byteBuffer.get();
        }
    }

    @Override
    public int[] getArray() {
        return array;
    }

    @Override
    public byte[] toByteArray() {
        ByteBuffer buffer = ByteBuffer.allocate(array.length);
        IntStream.of(array).forEach(i -> buffer.put((byte) i));
        return buffer.array();
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
        return getClass().getSimpleName() + ": " + Arrays.toString(array);
    }
}
