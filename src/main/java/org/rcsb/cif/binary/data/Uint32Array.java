package org.rcsb.cif.binary.data;

import org.rcsb.cif.binary.encoding.ByteArrayEncoding;
import org.rcsb.cif.binary.encoding.Encoding;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * An array of unsigned integer numbers using 32 bit to store each value.
 */
public class Uint32Array extends AbstractEncodedData<int[]> implements UnsignedIntArray {
    private static final int NUMBER_OF_BYTES = 4;
    static final int TYPE = 6;

    public Uint32Array(int[] data) {
        this(data, new ArrayDeque<>());
    }

    public Uint32Array(int[] data, Deque<Encoding<?, ?>> encoding) {
        super(data, encoding);
    }

    public Uint32Array(ByteArray array) {
        super(formArray(array.getData()), array.getEncoding());
    }

    private static int[] formArray(byte[] array) {
        int[] ints = new int[array.length / NUMBER_OF_BYTES];
        ByteBuffer byteBuffer = ByteBuffer.wrap(array).order(ByteOrder.LITTLE_ENDIAN);
        for (int i = 0; i < ints.length; i++) {
            ints[i] = (int) (byteBuffer.getInt() & 0xFFFFFFFFL);
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
        return Int32Array.int32ToByteArray(getData());
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
        return ByteArrayEncoding.UINT32.encode(this);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + Arrays.toString(getData());
    }
}