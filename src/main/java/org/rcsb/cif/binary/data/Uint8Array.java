package org.rcsb.cif.binary.data;

import java.nio.ByteBuffer;
import java.util.Arrays;

public class Uint8Array extends DataArray implements UnsignedIntArray {
    private static final int NUMBER_OF_BYTES = 1;
    public static final int TYPE = 4;

    Uint8Array(int[] data) {
        super(data);
    }

    Uint8Array(byte[] bytes) {
        super(new int[bytes.length]);
        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);
        int[] data = getData();
        for (int i = 0; i < length(); i++) {
            data[i] = byteBuffer.get() & 0xFF;
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
