package org.rcsb.cif.binary.array;

import java.nio.ByteBuffer;
import java.util.Arrays;

public class Uint8Array implements UnsignedIntArray {
    private static final int NUMBER_OF_BYTES = 1;
    public static final int TYPE = 4;
    private final int[] data;

    Uint8Array(int[] data) {
        this.data = data;
    }

    Uint8Array(byte[] bytes) {
        this.data = new int[bytes.length];
        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);
        for (int i = 0; i < data.length; i++) {
            data[i] = byteBuffer.get() & 0xFF;
        }
    }

    @Override
    public int[] getData() {
        return data;
    }

    @Override
    public byte[] toByteArray() {
        return Int8Array.int8ToByteArray(data);
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
