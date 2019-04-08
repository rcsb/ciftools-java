package org.rcsb.cif.binary.array;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Int32Array implements SignedIntArray {
    private static final int NUMBER_OF_BYTES = 4;
    public static final int TYPE = 3;
    private final int[] data;

    Int32Array(int[] data) {
        this.data = data;
    }

    Int32Array(byte[] bytes) {
        this.data = new int[bytes.length / NUMBER_OF_BYTES];
        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN);
        for (int i = 0; i < data.length; i++) {
            data[i] = byteBuffer.getInt();
        }
    }

    @Override
    public int[] getData() {
        return data;
    }

    @Override
    public byte[] toByteArray() {
        return int32ToByteArray(data);
    }

    static byte[] int32ToByteArray(int[] data) {
        ByteBuffer buffer = ByteBuffer.allocate(data.length * NUMBER_OF_BYTES);
        buffer.order(ByteOrder.LITTLE_ENDIAN);
        IntStream.of(data).forEach(buffer::putInt);
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
        return getClass().getSimpleName() + ": " + Arrays.toString(data);
    }
}