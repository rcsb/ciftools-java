package org.rcsb.cif.binary.array;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.stream.DoubleStream;

public class Float64Array implements FloatArray {
    private static final int NUMBER_OF_BYTES = 8;
    private static final int TYPE = 33;
    private final double[] array;

    public Float64Array(double... array) {
        this.array = array;
    }

    public Float64Array(byte... bytes) {
        this.array = new double[bytes.length / NUMBER_OF_BYTES];
        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN);
        for (int i = 0; i < array.length; i++) {
            array[i] = byteBuffer.getDouble();
        }
    }

    @Override
    public double[] getArray() {
        return array;
    }

    @Override
    public byte[] toByteArray() {
        ByteBuffer buffer = ByteBuffer.allocate(array.length * NUMBER_OF_BYTES);
        buffer.order(ByteOrder.LITTLE_ENDIAN);
        DoubleStream.of(array).forEach(buffer::putDouble);
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
        return getClass().getSimpleName() + ": " + Arrays.toString(array);
    }
}
