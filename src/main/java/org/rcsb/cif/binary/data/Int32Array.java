package org.rcsb.cif.binary.data;

import org.rcsb.cif.EncodingStrategyHint;
import org.rcsb.cif.binary.codec.Classifier;
import org.rcsb.cif.binary.codec.Codec;
import org.rcsb.cif.binary.encoding.DeltaEncoding;
import org.rcsb.cif.binary.encoding.Encoding;
import org.rcsb.cif.binary.encoding.FixedPointEncoding;
import org.rcsb.cif.binary.encoding.IntegerPackingEncoding;
import org.rcsb.cif.binary.encoding.RunLengthEncoding;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Int32Array extends AbstractEncodedData<int[]> implements SignedIntArray {
    private static final int NUMBER_OF_BYTES = 4;
    static final int TYPE = 3;

    Int32Array(int[] data) {
        this(data, Encoding.EMPTY_ENCODING_ARRAY);
    }

    Int32Array(int[] data, Encoding[] encoding) {
        super(data, encoding);
    }

    @Override
    public int[] getData() {
        return (int[]) data;
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

    public IntArray encode(IntegerPackingEncoding encoding) {
        return Codec.INTEGER_PACKING_CODEC.encode(this, encoding);
    }

    @Override
    public Int32Array encode(DeltaEncoding encoding) {
        return Codec.DELTA_CODEC.encode(this, encoding);
    }

    @Override
    public Int32Array decode(DeltaEncoding encoding) {
        return Codec.DELTA_CODEC.decode(this, encoding);
    }

    public FloatArray decode(FixedPointEncoding encoding) {
        return Codec.FIXED_POINT_CODEC.decode(this, encoding);
    }

    public IntArray decode(RunLengthEncoding encoding) {
        return Codec.RUN_LENGTH_CODEC.decode(this, encoding);
    }

    public EncodingStrategyHint classify() {
        return Classifier.classify(this);
    }
}