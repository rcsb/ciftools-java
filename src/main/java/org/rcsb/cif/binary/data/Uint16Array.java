package org.rcsb.cif.binary.data;

import org.rcsb.cif.binary.encoding.ByteArrayEncoding;
import org.rcsb.cif.binary.encoding.Encoding;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * An array of unsigned integer numbers using 16 bit to store each value.
 */
public class Uint16Array extends AbstractEncodedData<int[]> implements UnsignedIntArray {
    private static final int NUMBER_OF_BYTES = 2;
    static final int TYPE = 5;

    public Uint16Array(int[] data) {
        this(data, new ArrayDeque<>());
    }

    public Uint16Array(int[] data, Deque<Encoding<?, ?>> encoding) {
        super(data, encoding);
    }

    public Uint16Array(ByteArray array) {
        super(formArray(array.getData()), array.getEncoding());
    }

    private static int[] formArray(byte[] array) {
        int[] ints = new int[array.length / NUMBER_OF_BYTES];
        ByteBuffer byteBuffer = ByteBuffer.wrap(array).order(ByteOrder.LITTLE_ENDIAN);
        for (int i = 0; i < ints.length; i++) {
            ints[i] = byteBuffer.getShort() & 0xFFFF;
        }
        return ints;
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
        return Int16Array.int16ToByteArray(getData());
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
        return ByteArrayEncoding.UINT16.encode(this);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + Arrays.toString(getData());
    }
}