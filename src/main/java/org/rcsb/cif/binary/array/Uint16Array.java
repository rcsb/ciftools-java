package org.rcsb.cif.binary.array;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

public class Uint16Array extends Int16Array {
    private static final int NUMBER_OF_BYTES = 2;
    private static final int TYPE = 5;

    public Uint16Array(int... array) {
        super(array);
    }

    public Uint16Array(byte... bytes) {
        super(new int[bytes.length / NUMBER_OF_BYTES]);
        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN);
        for (int i = 0; i < array.length; i++) {
            array[i] = byteBuffer.getShort() & 0xFFFF;
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