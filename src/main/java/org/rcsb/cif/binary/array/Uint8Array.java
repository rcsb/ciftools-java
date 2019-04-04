package org.rcsb.cif.binary.array;

import java.nio.ByteBuffer;
import java.util.Arrays;

public class Uint8Array extends Int8Array {
    private static final int NUMBER_OF_BYTES = 1;
    public static final int TYPE = 4;

    public Uint8Array(int... array) {
        super(array);
    }

    public Uint8Array(byte... bytes) {
        super(new int[bytes.length]);
        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);
        for (int i = 0; i < array.length; i++) {
            array[i] = byteBuffer.get() & 0xFF;
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
