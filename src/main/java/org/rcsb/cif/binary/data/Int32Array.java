package org.rcsb.cif.binary.data;

import org.rcsb.cif.binary.encoding.ByteArrayEncoding;
import org.rcsb.cif.binary.encoding.DeltaEncoding;
import org.rcsb.cif.binary.encoding.Encoding;
import org.rcsb.cif.binary.encoding.FixedPointEncoding;
import org.rcsb.cif.binary.encoding.IntegerPackingEncoding;
import org.rcsb.cif.binary.encoding.RunLengthEncoding;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * An array of (signed) integer numbers using 32 bit to store each value.
 */
public class Int32Array extends AbstractEncodedData<int[]> implements SignedIntArray<Int32Array> {
    private static final int NUMBER_OF_BYTES = 4;
    static final int TYPE = 3;

    public Int32Array(int[] data) {
        this(data, new ArrayDeque<>());
    }

    public Int32Array(int[] data, Deque<Encoding<?, ?>> encoding) {
        super(data, encoding);
    }

    public Int32Array(ByteArray array) {
        super(formArray(array.getData()), array.getEncoding());
    }

    private static int[] formArray(byte[] array) {
        int[] ints = new int[array.length / NUMBER_OF_BYTES];
        ByteBuffer byteBuffer = ByteBuffer.wrap(array).order(ByteOrder.LITTLE_ENDIAN);
        for (int i = 0; i < ints.length; i++) {
            ints[i] = byteBuffer.getInt();
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
        return int32ToByteArray(getData());
    }

    static byte[] int32ToByteArray(int[] data) {
        ByteBuffer buffer = ByteBuffer.allocate(data.length * NUMBER_OF_BYTES);
        buffer.order(ByteOrder.LITTLE_ENDIAN);
        for (int i : data) {
            buffer.putInt(i);
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

    public IntArray encode(IntegerPackingEncoding encoding) {
        return encoding.encode(this);
    }

    @Override
    public Int32Array encode(DeltaEncoding<Int32Array> encoding) {
        return encoding.encode(this);
    }

    @Override
    public ByteArray encode() {
        return ByteArrayEncoding.INT32.encode(this);
    }

    @Override
    public Int32Array decode(DeltaEncoding<Int32Array> encoding) {
        return encoding.decode(this);
    }

    public FloatArray decode(FixedPointEncoding encoding) {
        return encoding.decode(this);
    }

    public IntArray decode(RunLengthEncoding encoding) {
        return encoding.decode(this);
    }
}