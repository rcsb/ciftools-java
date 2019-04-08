package org.rcsb.cif.binary.array;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

public class Uint16Array implements UnsignedIntArray {
    private static final int NUMBER_OF_BYTES = 2;
    public static final int TYPE = 5;
    private final int[] data;

    Uint16Array(int[] data) {
        this.data = data;
    }

    Uint16Array(byte[] bytes) {
        this.data = new int[bytes.length / NUMBER_OF_BYTES];
        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN);
        for (int i = 0; i < data.length; i++) {
            data[i] = byteBuffer.getShort() & 0xFFFF;
        }
    }

    @Override
    public int[] getData() {
        return data;
    }

    @Override
    public byte[] toByteArray() {
        return Int16Array.int16ToByteArray(data);
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