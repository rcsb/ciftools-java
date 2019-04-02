package org.rcsb.cif.reader.binary.codec.primitive;

import org.rcsb.cif.reader.binary.codec.AbstractCodec;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.function.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public abstract class ByteCodec<P> extends AbstractCodec<P, byte[], ByteParameters> {
    private static final boolean IS_NATIVE_LITTLE_ENDIAN = ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN);

    public ByteCodec(ByteParameters parameters) {
        super(parameters);
    }

    private byte[] flipByteOrder(byte[] data, int bytes) {
        byte[] buffer = new byte[data.length];
        for (int i = 0, n = data.length; i < n; i += bytes) {
            for (int j = 0; j < bytes; j++) {
                buffer[i + bytes - j - 1] = data[i + j];
            }
        }
        return buffer;
    }

    public byte[] ensureOrder(byte[] bytes) {
        if (!IS_NATIVE_LITTLE_ENDIAN && getParameters().requiresLittleEndian()) {
            bytes = flipByteOrder(bytes, getParameters().getType().getNumberOfBytes());
        }
        return bytes;
    }

    private int[] toIntArray(byte[] bytes, ToIntFunction<ByteBuffer> function) {
        bytes = ensureOrder(bytes);
        int[] out = new int[bytes.length / getParameters().getType().getNumberOfBytes()];
        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes).order(getParameters().getByteOrder());
        for (int i = 0; i < out.length; i++) {
            out[i] = function.applyAsInt(byteBuffer);
        }
        return out;
    }

    protected int[] readInt8(byte[] bytes) {
        return toIntArray(bytes, ByteBuffer::get);
    }

    protected int[] readInt16(byte[] bytes) {
        return toIntArray(bytes, ByteBuffer::getShort);
    }

    protected int[] readInt32(byte[] bytes) {
        return toIntArray(bytes, ByteBuffer::getInt);
    }

    protected int[] readUint8(byte[] bytes) {
        return toIntArray(bytes, byteBuffer -> byteBuffer.get() & 0xFF);
    }

    protected int[] readUint16(byte[] bytes) {
        return toIntArray(bytes, byteBuffer -> byteBuffer.getShort() & 0xFFFF);
    }

    protected int[] readUint32(byte[] bytes) {
        return toIntArray(bytes, byteBuffer -> (int) (byteBuffer.getInt() & 0xFFFFFFFFL));
    }

    private double[] toDoubleArray(byte[] bytes, ToDoubleFunction<ByteBuffer> function) {
        bytes = ensureOrder(bytes);
        double[] out = new double[bytes.length / getParameters().getType().getNumberOfBytes()];
        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes).order(getParameters().getByteOrder());
        for (int i = 0; i < out.length; i++) {
            out[i] = function.applyAsDouble(byteBuffer);
        }
        return out;
    }

    protected double[] readFloat(byte[] bytes) {
        return toDoubleArray(bytes, ByteBuffer::getFloat);
    }

    protected double[] readDouble(byte[] bytes) {
        return toDoubleArray(bytes, ByteBuffer::getDouble);
    }

    protected byte[] writeInt8(int[] data){
        ByteBuffer buffer = ByteBuffer.allocate(data.length * getParameters().getType().getNumberOfBytes());
        IntStream.of(data).forEach(c -> buffer.putChar((char) c));
        return buffer.array();
    }

    protected byte[] writeInt16(int[] data){
        ByteBuffer buffer = ByteBuffer.allocate(data.length * getParameters().getType().getNumberOfBytes());
        IntStream.of(data).forEach(s -> buffer.putShort((short) s));
        return buffer.array();
    }

    protected byte[] writeInt32(int[] data){
        ByteBuffer buffer = ByteBuffer.allocate(data.length * getParameters().getType().getNumberOfBytes());
        IntStream.of(data).forEach(buffer::putInt);
        return buffer.array();
    }

    protected byte[] writeUint8(int[] data) {
        // TODO impl
        return new byte[0];
    }

    protected byte[] writeUint16(int[] data) {
        // TODO impl
        return new byte[0];
    }

    protected byte[] writeUint32(int[] data) {
        // TODO impl
        return new byte[0];
    }

    protected byte[] writeFloat(double[] data) {
        ByteBuffer buffer = ByteBuffer.allocate(data.length * getParameters().getType().getNumberOfBytes());
        DoubleStream.of(data).forEach(f -> buffer.putFloat((float) f));
        return buffer.array();
    }

    protected byte[] writeDouble(double[] data) {
        ByteBuffer buffer = ByteBuffer.allocate(data.length * getParameters().getType().getNumberOfBytes());
        DoubleStream.of(data).forEach(buffer::putDouble);
        return buffer.array();
    }
}
