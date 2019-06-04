package org.rcsb.cif.binary.data;

import org.rcsb.cif.EncodingStrategyHint;
import org.rcsb.cif.binary.codec.Classifier;
import org.rcsb.cif.binary.encoding.Encoding;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.DoubleStream;

public class Float64Array extends AbstractEncodedData<double[]> implements FloatArray {
    private static final int NUMBER_OF_BYTES = 8;
    private static final int TYPE = 33;

    Float64Array(double[] data) {
        this(data, new LinkedList<>());
    }

    Float64Array(double[] data, LinkedList<Encoding> encoding) {
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

    public EncodingStrategyHint classify() {
        return Classifier.classify(this);
    }
}
