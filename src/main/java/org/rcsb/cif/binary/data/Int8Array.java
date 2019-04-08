package org.rcsb.cif.binary.data;

import org.omg.CORBA.BAD_QOS;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Int8Array extends DataArray implements SignedIntArray {
    private static final int NUMBER_OF_BYTES = 1;
    public static final int TYPE = 1;

    Int8Array(int[] data) {
        super(data);
    }

    Int8Array(byte[] bytes) {
        super(new int[bytes.length]);
        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);
        int[] data = getData();
        for (int i = 0; i < length(); i++) {
            data[i] = byteBuffer.get();
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
        return int8ToByteArray(getData());
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
        return getClass().getSimpleName() + ": " + Arrays.toString(getData());
    }
}
