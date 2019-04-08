package org.rcsb.cif.binary.data;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.stream.DoubleStream;

public class Float32Array extends DataArray implements FloatArray {
    private static final int NUMBER_OF_BYTES = 4;
    public static final int TYPE = 32;

    Float32Array(double[] data) {
        super(data);
    }

    Float32Array(byte[] bytes) {
        super(new double[bytes.length / NUMBER_OF_BYTES]);
        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN);
        double[] data = getData();
        for (int i = 0; i < length(); i++) {
            data[i] = byteBuffer.getFloat();
        }
    }

    @Override
    public double[] getData() {
        return (double[]) get("data");
    }

    @Override
    public int length() {
        return getData().length;
    }

    @Override
    public byte[] toByteArray() {
        ByteBuffer buffer = ByteBuffer.allocate(length() * NUMBER_OF_BYTES);
        buffer.order(ByteOrder.LITTLE_ENDIAN);
        DoubleStream.of(getData()).forEach(f -> buffer.putFloat((float) f));
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
