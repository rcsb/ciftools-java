package org.rcsb.cif.binary.data;

import org.rcsb.cif.binary.encoding.ByteArrayEncoding;
import org.rcsb.cif.binary.encoding.DeltaEncoding;
import org.rcsb.cif.binary.encoding.Encoding;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * An array of (signed) integer numbers using 16 bit to store each value.
 */
public class Int16Array extends AbstractEncodedData<int[]> implements SignedIntArray<Int16Array> {
    private static final int NUMBER_OF_BYTES = 2;
    static final int TYPE = 2;

    public Int16Array(int[] data) {
        this(data, new ArrayDeque<>());
    }

    public Int16Array(int[] data, Deque<Encoding<?, ?>> encoding) {
        super(data, encoding);
    }

    public Int16Array(ByteArray array) {
        super(formArray(array.getData()), array.getEncoding());
    }

    private static int[] formArray(byte[] array) {
        int[] ints = new int[array.length / NUMBER_OF_BYTES];
        ByteBuffer byteBuffer = ByteBuffer.wrap(array).order(ByteOrder.LITTLE_ENDIAN);
        for (int i = 0; i < ints.length; i++) {
            ints[i] = byteBuffer.getShort();
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
        return int16ToByteArray(getData());
    }

    static byte[] int16ToByteArray(int[] data) {
        ByteBuffer buffer = ByteBuffer.allocate(data.length * NUMBER_OF_BYTES);
        buffer.order(ByteOrder.LITTLE_ENDIAN);
        for (int i : data) {
            buffer.putShort((short) i);
        }
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

    @Override
    public Int16Array encode(DeltaEncoding<Int16Array> encoding) {
        return encoding.encode(this);
    }

    @Override
    public ByteArray encode() {
        return ByteArrayEncoding.INT16.encode(this);
    }

    @Override
    public Int16Array decode(DeltaEncoding<Int16Array> encoding) {
        return encoding.decode(this);
    }
}