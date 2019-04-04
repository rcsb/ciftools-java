package org.rcsb.cif.binary.array;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Int32Array implements IntArray {
    private static final int NUMBER_OF_BYTES = 4;
    private static final int TYPE = 3;
    protected final int[] array;

    public Int32Array(int... array) {
        this.array = array;
    }

    public Int32Array(byte... bytes) {
        this.array = new int[bytes.length / NUMBER_OF_BYTES];
        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN);
        for (int i = 0; i < array.length; i++) {
            array[i] = byteBuffer.getInt();
        }
    }

    @Override
    public int[] getArray() {
        return array;
    }

    @Override
    public byte[] toByteArray() {
        ByteBuffer buffer = ByteBuffer.allocate(array.length * NUMBER_OF_BYTES);
        buffer.order(ByteOrder.LITTLE_ENDIAN);
        IntStream.of(array).forEach(buffer::putInt);
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