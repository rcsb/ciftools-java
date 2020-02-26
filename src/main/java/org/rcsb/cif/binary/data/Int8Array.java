package org.rcsb.cif.binary.data;

import org.rcsb.cif.binary.encoding.ByteArrayEncoding;
import org.rcsb.cif.binary.encoding.DeltaEncoding;
import org.rcsb.cif.binary.encoding.Encoding;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * An array of (signed) integer numbers using 8 bit to store each value.
 */
public class Int8Array extends AbstractEncodedData<int[]> implements SignedIntArray<Int8Array> {
    private static final int NUMBER_OF_BYTES = 1;
    static final int TYPE = 1;

    public Int8Array(int[] data) {
        this(data, new ArrayDeque<>());
    }

    public Int8Array(int[] data, Deque<Encoding<?, ?>> encoding) {
        super(data, encoding);
    }

    public Int8Array(ByteArray array) {
        super(formArray(array.getData()), array.getEncoding());
    }

    private static int[] formArray(byte[] array) {
        int[] ints = new int[array.length];
        ByteBuffer byteBuffer = ByteBuffer.wrap(array);
        for (int i = 0; i < ints.length; i++) {
            ints[i] = byteBuffer.get();
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
        return int8ToByteArray(getData());
    }

    static byte[] int8ToByteArray(int[] data) {
        ByteBuffer buffer = ByteBuffer.allocate(data.length);
        for (int i : data) {
            buffer.put((byte) i);
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
    public Int8Array encode(DeltaEncoding<Int8Array> encoding) {
        return encoding.encode(this);
    }

    @Override
    public ByteArray encode() {
        return ByteArrayEncoding.INT8.encode(this);
    }

    @Override
    public Int8Array decode(DeltaEncoding<Int8Array> encoding) {
        return encoding.decode(this);
    }
}
