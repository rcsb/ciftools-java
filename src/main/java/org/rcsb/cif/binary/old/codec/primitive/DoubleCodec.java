package org.rcsb.cif.binary.old.codec.primitive;

import org.rcsb.cif.binary.old.codec.Codec;
import org.rcsb.cif.binary.old.codec.CodecData;

import java.nio.ByteOrder;

public class DoubleCodec extends ByteCodec<double[]> {
    @Override
    public CodecData<byte[], ByteParameters> encode(double[] input) {
        ArrayType type = Codec.determineArrayType(input);
        switch (type) {
            case FLOAT:
                return new CodecData<>(writeFloat(input), new ByteParameters(type, ByteOrder.LITTLE_ENDIAN));
            case DOUBLE:
                return new CodecData<>(writeDouble(input), new ByteParameters(type, ByteOrder.LITTLE_ENDIAN));
            default:
                throw new IllegalArgumentException("Unsupported type for double encoding: " + type);
        }
    }

    @Override
    public double[] decode(CodecData<byte[], ByteParameters> input) {
        ArrayType type = input.getParameters().getType();
        ByteOrder byteOrder = input.getParameters().getByteOrder();
        switch (type) {
            case FLOAT:
                return readFloat(input.getData(), byteOrder);
            case DOUBLE:
                return readDouble(input.getData(), byteOrder);
            default:
                throw new IllegalArgumentException("Unsupported type for double encoding: " + type);
        }
    }
}
