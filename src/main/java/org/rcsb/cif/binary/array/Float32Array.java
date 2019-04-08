package org.rcsb.cif.binary.array;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.stream.DoubleStream;

public class Float32Array implements FloatArray {
    private static final int NUMBER_OF_BYTES = 4;
    public static final int TYPE = 32;
    private final double[] data;

    Float32Array(double[] data) {
        this.data = data;
    }

    Float32Array(byte[] bytes) {
        this.data = new double[bytes.length / NUMBER_OF_BYTES];
        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN);
        for (int i = 0; i < data.length; i++) {
            data[i] = byteBuffer.getFloat();
        }
    }

    @Override
    public double[] getData() {
        return data;
    }

    @Override
    public byte[] toByteArray() {
        ByteBuffer buffer = ByteBuffer.allocate(data.length * NUMBER_OF_BYTES);
        buffer.order(ByteOrder.LITTLE_ENDIAN);
        DoubleStream.of(data).forEach(f -> buffer.putFloat((float) f));
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
