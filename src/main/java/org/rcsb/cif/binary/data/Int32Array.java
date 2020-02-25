package org.rcsb.cif.binary.data;

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
public class Int32Array extends AbstractEncodedData<int[]> implements SignedIntArray {
    private static final int NUMBER_OF_BYTES = 4;
    static final int TYPE = 3;

    public Int32Array(int[] data) {
        this(data, new ArrayDeque<>());
    }

    public Int32Array(int[] data, Deque<Encoding<?, ?>> encoding) {
        super(data, encoding);
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
    public Int32Array encode(DeltaEncoding encoding) {
        return (Int32Array) encoding.encode(this);
    }

    @Override
    public Int32Array decode(DeltaEncoding encoding) {
        return (Int32Array) encoding.decode(this);
    }

    public FloatArray decode(FixedPointEncoding encoding) {
        return encoding.decode(this);
    }

    public IntArray decode(RunLengthEncoding encoding) {
        return encoding.decode(this);
    }
}