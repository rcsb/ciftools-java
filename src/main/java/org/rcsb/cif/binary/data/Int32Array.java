package org.rcsb.cif.binary.data;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Int32Array extends DataArray implements SignedIntArray {
    private static final int NUMBER_OF_BYTES = 4;
    public static final int TYPE = 3;

    Int32Array(int[] data) {
        super(data);
    }

    Int32Array(byte[] bytes) {
        super(new int[bytes.length / NUMBER_OF_BYTES]);
        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN);
        int[] data = getData();
        for (int i = 0; i < length(); i++) {
            data[i] = byteBuffer.getInt();
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
        return int32ToByteArray(getData());
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
        return getClass().getSimpleName() + ": " + Arrays.toString(getData());
    }
}