package org.rcsb.cif.binary.data;

import org.rcsb.cif.binary.codec.Codec;
import org.rcsb.cif.binary.encoding.DeltaEncoding;
import org.rcsb.cif.binary.encoding.Encoding;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.IntStream;

public class Int8Array extends AbstractEncodedData<int[]> implements SignedIntArray {
    private static final int NUMBER_OF_BYTES = 1;
    static final int TYPE = 1;

    Int8Array(int[] data) {
        this(data, new LinkedList<>());
    }

    Int8Array(int[] data, LinkedList<Encoding> encoding) {
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
        IntStream.of(data).forEach(i -> buffer.put((byte) i));
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
        return Codec.DELTA_CODEC.encode(this, encoding);
    }

    @Override
    public Int8Array decode(DeltaEncoding encoding) {
        return Codec.DELTA_CODEC.decode(this, encoding);
    }
}
