package org.rcsb.cif.binary.old.codec.primitive;

import org.rcsb.cif.binary.old.codec.Codec;
import org.rcsb.cif.binary.old.codec.CodecData;

import java.nio.ByteOrder;

public class IntegerCodec extends ByteCodec<int[]> {
    @Override
    public CodecData<byte[], ByteParameters> encode(int[] input) {
        ArrayType type = Codec.determineArrayType(input);
        switch (type) {
            case INT_8:
                return new CodecData<>(writeInt8(input), new ByteParameters(type, ByteOrder.LITTLE_ENDIAN));
            case INT_16:
                return new CodecData<>(writeInt16(input), new ByteParameters(type, ByteOrder.LITTLE_ENDIAN));
            case INT_32:
                return new CodecData<>(writeInt32(input), new ByteParameters(type, ByteOrder.LITTLE_ENDIAN));
            case UINT_8:
                return new CodecData<>(writeUint8(input), new ByteParameters(type, ByteOrder.LITTLE_ENDIAN));
            case UINT_16:
                return new CodecData<>(writeUint16(input), new ByteParameters(type, ByteOrder.LITTLE_ENDIAN));
            case UINT_32:
                return new CodecData<>(writeUint32(input), new ByteParameters(type, ByteOrder.LITTLE_ENDIAN));
            default:
                throw new IllegalArgumentException("Unsupported type for integer encoding: " + type);
        }
    }

    @Override
    public int[] decode(CodecData<byte[], ByteParameters> input) {
        ArrayType type = input.getParameters().getType();
        ByteOrder byteOrder = input.getParameters().getByteOrder();
        switch (type) {
            case INT_8:
                return readInt8(input.getData(), byteOrder);
            case INT_16:
                return readInt16(input.getData(), byteOrder);
            case INT_32:
                return readInt32(input.getData(), byteOrder);
            case UINT_8:
                return readUint8(input.getData(), byteOrder);
            case UINT_16:
                return readUint16(input.getData(), byteOrder);
            case UINT_32:
                return readUint32(input.getData(), byteOrder);
            default:
                throw new IllegalArgumentException("Unsupported type for integer encoding: " + type);
        }
    }
}
