package org.rcsb.cif.binary.data;

import org.rcsb.cif.binary.encoding.DeltaEncoding;
import org.rcsb.cif.binary.encoding.Encoding;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * An array of (signed) integer numbers using 8 bit to store each value.
 */
public class Int8Array extends AbstractEncodedData<int[]> implements SignedIntArray {
    private static final int NUMBER_OF_BYTES = 1;
    static final int TYPE = 1;

    Int8Array(int[] data) {
        this(data, new ArrayDeque<>());
    }

    Int8Array(int[] data, Deque<Encoding<?, ?>> encoding) {
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
    public Int8Array encode(DeltaEncoding encoding) {
        return (Int8Array) encoding.encode(this);
    }

    @Override
    public Int8Array decode(DeltaEncoding encoding) {
        return (Int8Array) encoding.decode(this);
    }
}
