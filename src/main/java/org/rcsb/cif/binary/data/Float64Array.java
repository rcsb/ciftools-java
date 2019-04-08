package org.rcsb.cif.binary.data;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.stream.DoubleStream;

public class Float64Array extends DataArray implements FloatArray {
    private static final int NUMBER_OF_BYTES = 8;
    public static final int TYPE = 33;

    Float64Array(double[] data) {
        super(data);
    }

    Float64Array(byte[] bytes) {
        super(new double[bytes.length / NUMBER_OF_BYTES]);
        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN);
        double[] data = getData();
        for (int i = 0; i < length(); i++) {
            data[i] = byteBuffer.getDouble();
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
        DoubleStream.of(getData()).forEach(buffer::putDouble);
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
