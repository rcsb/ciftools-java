package org.rcsb.cif.reader.binary.codec.primitive;

public class DoubleCodec extends ByteCodec<double[]> {
    public DoubleCodec(ByteParameters parameters) {
        super(parameters);
    }

    @Override
    public byte[] encode(double[] input) {
        switch (getParameters().getType()) {
            case FLOAT:
                return writeFloat(input);
            case DOUBLE:
                return writeDouble(input);
            default:
                throw new IllegalArgumentException("Unsupported type for double encoding: " + getParameters().getType());
        }
    }

    @Override
    public double[] decode(byte[] input) {
        switch (getParameters().getType()) {
            case FLOAT:
                return readFloat(input);
            case DOUBLE:
                return readDouble(input);
            default:
                throw new IllegalArgumentException("Unsupported type for double encoding: " + getParameters().getType());
        }
    }
}
