package org.rcsb.cif.binary.array;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

public class Uint32Array implements UnsignedIntArray {
    private static final int NUMBER_OF_BYTES = 4;
    public static final int TYPE = 6;
    private final int[] data;

    Uint32Array(int[] data) {
        this.data = data;
    }

    Uint32Array(byte[] bytes) {
        this.data = new int[bytes.length / NUMBER_OF_BYTES];
        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN);
        for (int i = 0; i < data.length; i++) {
            data[i] = (int) (byteBuffer.getInt() & 0xFFFFFFFFL);
        }
    }

    @Override
    public int[] getData() {
        return data;
    }

    @Override
    public byte[] toByteArray() {
        return Int32Array.int32ToByteArray(data);
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