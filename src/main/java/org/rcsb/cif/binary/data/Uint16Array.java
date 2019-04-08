package org.rcsb.cif.binary.data;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

public class Uint16Array extends DataArray implements UnsignedIntArray {
    private static final int NUMBER_OF_BYTES = 2;
    public static final int TYPE = 5;

    Uint16Array(int[] data) {
        super(data);
    }

    Uint16Array(byte[] bytes) {
        super(new int[bytes.length / NUMBER_OF_BYTES]);
        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN);
        int[] data = getData();
        for (int i = 0; i < length(); i++) {
            data[i] = byteBuffer.getShort() & 0xFFFF;
        }
    }

    @Override
    public int[] getData() {
        return (int[]) get("data");
    }

    @Override
    public int length() {
        return getData().length;
    }

    @Override
    public byte[] toByteArray() {
        return Int16Array.int16ToByteArray(getData());
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