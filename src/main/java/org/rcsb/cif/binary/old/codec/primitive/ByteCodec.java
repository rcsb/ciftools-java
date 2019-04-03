package org.rcsb.cif.binary.old.codec.primitive;

import org.rcsb.cif.binary.old.codec.Codec;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.function.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public abstract class ByteCodec<P> implements Codec<P, byte[], ByteParameters> {
    private static final boolean IS_NATIVE_LITTLE_ENDIAN = ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN);

    private byte[] flipByteOrder(byte[] data, int bytes) {
        byte[] buffer = new byte[data.length];
        for (int i = 0, n = data.length; i < n; i += bytes) {
            for (int j = 0; j < bytes; j++) {
                buffer[i + bytes - j - 1] = data[i + j];
            }
        }
        return buffer;
    }

    protected byte[] ensureOrder(byte[] bytes, int numberOfBytes, ByteOrder byteOrder) {
        if (!IS_NATIVE_LITTLE_ENDIAN && byteOrder == ByteOrder.LITTLE_ENDIAN ||
            IS_NATIVE_LITTLE_ENDIAN && byteOrder == ByteOrder.BIG_ENDIAN) {
            bytes = flipByteOrder(bytes, numberOfBytes);
        }
        return bytes;
    }

    private int[] toIntArray(byte[] bytes, ToIntFunction<ByteBuffer> function, int numberOfBytes, ByteOrder byteOrder) {
        bytes = ensureOrder(bytes, numberOfBytes, byteOrder);
        int[] out = new int[bytes.length / numberOfBytes];
        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes).order(byteOrder);
        for (int i = 0; i < out.length; i++) {
            out[i] = function.applyAsInt(byteBuffer);
        }
        return out;
    }

    protected int[] readInt8(byte[] bytes, ByteOrder byteOrder) {
        return toIntArray(bytes, ByteBuffer::get, 1, byteOrder);
    }

    protected int[] readInt16(byte[] bytes, ByteOrder byteOrder) {
        return toIntArray(bytes, ByteBuffer::getShort, 2, byteOrder);
    }

    protected int[] readInt32(byte[] bytes, ByteOrder byteOrder) {
        return toIntArray(bytes, ByteBuffer::getInt, 4, byteOrder);
    }

    protected int[] readUint8(byte[] bytes, ByteOrder byteOrder) {
        return toIntArray(bytes, byteBuffer -> byteBuffer.get() & 0xFF, 1, byteOrder);
    }

    protected int[] readUint16(byte[] bytes, ByteOrder byteOrder) {
        return toIntArray(bytes, byteBuffer -> byteBuffer.getShort() & 0xFFFF, 2, byteOrder);
    }

    protected int[] readUint32(byte[] bytes, ByteOrder byteOrder) {
        return toIntArray(bytes, byteBuffer -> (int) (byteBuffer.getInt() & 0xFFFFFFFFL), 4, byteOrder);
    }

    private double[] toDoubleArray(byte[] bytes, ToDoubleFunction<ByteBuffer> function, int numberOfBytes, ByteOrder byteOrder) {
        bytes = ensureOrder(bytes, numberOfBytes, byteOrder);
        double[] out = new double[bytes.length / numberOfBytes];
        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes).order(byteOrder);
        for (int i = 0; i < out.length; i++) {
            out[i] = function.applyAsDouble(byteBuffer);
        }
        return out;
    }

    protected double[] readFloat(byte[] bytes, ByteOrder byteOrder) {
        return toDoubleArray(bytes, ByteBuffer::getFloat, 4, byteOrder);
    }

    protected double[] readDouble(byte[] bytes, ByteOrder byteOrder) {
        return toDoubleArray(bytes, ByteBuffer::getDouble, 8, byteOrder);
    }

    protected byte[] writeInt8(int[] data) {
        ByteBuffer buffer = ByteBuffer.allocate(data.length);
        IntStream.of(data).forEach(c -> buffer.putChar((char) c));
        return buffer.array();
    }

    protected byte[] writeInt16(int[] data) {
        ByteBuffer buffer = ByteBuffer.allocate(data.length * 2);
        IntStream.of(data).forEach(s -> buffer.putShort((short) s));
        return buffer.array();
    }

    protected byte[] writeInt32(int[] data) {
        ByteBuffer buffer = ByteBuffer.allocate(data.length * 4);
        IntStream.of(data).forEach(buffer::putInt);
        return buffer.array();
    }

    protected byte[] writeUint8(int[] data) {
        // TODO impl
        ByteBuffer buffer = ByteBuffer.allocate(data.length);
//        IntStream.of(data).forEach(buffer::putInt);
        return buffer.array();
    }

    protected byte[] writeUint16(int[] data) {
        // TODO impl
        ByteBuffer buffer = ByteBuffer.allocate(data.length * 2);
//        IntStream.of(data).forEach(buffer::putInt);
        return buffer.array();
    }

    protected byte[] writeUint32(int[] data) {
        // TODO impl
        ByteBuffer buffer = ByteBuffer.allocate(data.length * 4);
//        IntStream.of(data).forEach(buffer::putInt);
        return buffer.array();
    }

    protected byte[] writeFloat(double[] data) {
        ByteBuffer buffer = ByteBuffer.allocate(data.length * 4);
        DoubleStream.of(data).forEach(f -> buffer.putFloat((float) f));
        return buffer.array();
    }

    protected byte[] writeDouble(double[] data) {
        ByteBuffer buffer = ByteBuffer.allocate(data.length * 8);
        DoubleStream.of(data).forEach(buffer::putDouble);
        return buffer.array();
    }
}
