package org.rcsb.cif.binary.data;

import org.rcsb.cif.binary.encoding.Encoding;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.stream.DoubleStream;

public class Float32Array extends AbstractEncodedData<double[]> implements FloatArray {
    private static final int NUMBER_OF_BYTES = 4;
    private static final int TYPE = 32;

    Float32Array(double[] data) {
        this(data, Encoding.EMPTY_ENCODING_ARRAY);
    }

    Float32Array(double[] data, Encoding[] encoding) {
        super(data, encoding);
    }

    @Override
    public double[] getData() {
        return (double[]) data;
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
