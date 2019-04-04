package org.rcsb.cif.binary.array;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Int16Array implements IntArray {
    private static final int NUMBER_OF_BYTES = 2;
    public static final int TYPE = 2;
    protected final int[] array;

    public Int16Array(int... array) {
        this.array = array;
    }

    public Int16Array(byte... bytes) {
        this.array = new int[bytes.length / NUMBER_OF_BYTES];
        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN);
        for (int i = 0; i < array.length; i++) {
            array[i] = byteBuffer.getShort();
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
        IntStream.of(array).forEach(i -> buffer.putShort((short) i));
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