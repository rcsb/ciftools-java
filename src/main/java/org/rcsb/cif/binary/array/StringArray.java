package org.rcsb.cif.binary.array;

import java.util.Arrays;

public class StringArray implements DataArray {
    private final String[] data;

    StringArray(String[] data) {
        this.data = data;
    }

    @Override
    public String[] getData() {
        return data;
    }

    @Override
    public int length() {
        return data.length;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + Arrays.toString(data);
    }
}
