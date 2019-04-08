package org.rcsb.cif.binary.array;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Int8Array implements SignedIntArray {
    private static final int NUMBER_OF_BYTES = 1;
    public static final int TYPE = 1;
    private final int[] data;

    Int8Array(int[] data) {
        this.data = data;
    }

    Int8Array(byte[] bytes) {
        this.data = new int[bytes.length];
        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);
        for (int i = 0; i < data.length; i++) {
            data[i] = byteBuffer.get();
        }
    }

    @Override
    public int[] getData() {
        return data;
    }

    @Override
    public byte[] toByteArray() {
        return int8ToByteArray(data);
    }

    static byte[] int8ToByteArray(int[] data) {
        ByteBuffer buffer = ByteBuffer.allocate(data.length);
        IntStream.of(data).forEach(i -> buffer.put((byte) i));
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
