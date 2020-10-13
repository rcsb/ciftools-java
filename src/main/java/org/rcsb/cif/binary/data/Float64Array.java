package org.rcsb.cif.binary.data;

import org.rcsb.cif.binary.encoding.ByteArrayEncoding;
import org.rcsb.cif.binary.encoding.Encoding;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * An array of floating point numbers using 64 bit to store each value.
 */
public class Float64Array extends AbstractEncodedData<double[]> implements FloatArray {
    private static final int NUMBER_OF_BYTES = 8;
    private static final int TYPE = 33;

    public Float64Array(double[] data) {
        this(data, new ArrayDeque<>());
    }

    public Float64Array(double[] data, Deque<Encoding<?, ?>> encoding) {
        super(data, encoding);
    }

    public Float64Array(ByteArray array) {
        super(formArray(array.getData()), array.getEncoding());
    }

    private static double[] formArray(byte[] array) {
        double[] doubles = new double[array.length / NUMBER_OF_BYTES];
        ByteBuffer byteBuffer = ByteBuffer.wrap(array).order(ByteOrder.LITTLE_ENDIAN);
        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = byteBuffer.getDouble();
        }
        return doubles;
    }

    @Override
    public double[] getData() {
        return (double[]) data;
    }

    @Override
    public byte[] toByteArray() {
        ByteBuffer buffer = ByteBuffer.allocate(length() * NUMBER_OF_BYTES);
        buffer.order(ByteOrder.LITTLE_ENDIAN);
        for (double d : getData()) {
            buffer.putDouble(d);
        }
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
    public ByteArray encode() {
        return ByteArrayEncoding.FLOAT64.encode(this);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + Arrays.toString(getData());
    }
}
