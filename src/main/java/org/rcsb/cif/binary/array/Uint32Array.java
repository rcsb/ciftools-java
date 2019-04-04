package org.rcsb.cif.binary.array;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

public class Uint32Array extends Int32Array {
    private static final int NUMBER_OF_BYTES = 4;
    private static final int TYPE = 6;

    public Uint32Array(int... array) {
        super(array);
    }

    public Uint32Array(byte... bytes) {
        super(new int[bytes.length / NUMBER_OF_BYTES]);
        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN);
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (byteBuffer.getInt() & 0xFFFFFFFFL);
        }
    }

    @Override
    public int getType() {
        return TYPE;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + Arrays.toString(array);
    }
}