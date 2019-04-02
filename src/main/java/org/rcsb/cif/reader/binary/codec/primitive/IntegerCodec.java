package org.rcsb.cif.reader.binary.codec.primitive;

import java.util.stream.IntStream;

public class IntegerCodec extends ByteCodec<int[]> {
    public IntegerCodec(ByteParameters parameters) {
        super(parameters);
    }

    @Override
    public byte[] encode(int[] input) {
        switch (getParameters().getType()) {
            case INT_8:
                return writeInt8(input);
            case INT_16:
                return writeInt16(input);
            case INT_32:
                return writeInt32(input);
            case UINT_8:
                return writeUint8(input);
            case UINT_16:
                return writeUint16(input);
            case UINT_32:
                return writeUint32(input);
            default:
                throw new IllegalArgumentException("Unsupported type for integer encoding: " + getParameters().getType());
        }
    }

    @Override
    public int[] decode(byte[] input) {
        switch (getParameters().getType()) {
            case INT_8:
                return readInt8(input);
            case INT_16:
                return readInt16(input);
            case INT_32:
                return readInt32(input);
            case UINT_8:
                return readUint8(input);
            case UINT_16:
                return readUint16(input);
            case UINT_32:
                return readUint32(input);
            default:
                throw new IllegalArgumentException("Unsupported type for integer encoding: " + getParameters().getType());
        }
    }

    private boolean isSignedIntArray(int[] data) {
        return IntStream.of(data).anyMatch(i -> i < 0);
    }
}
