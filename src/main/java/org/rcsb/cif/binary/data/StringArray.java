package org.rcsb.cif.binary.data;

import java.util.Arrays;

public class StringArray extends DataArray {
    StringArray(String[] data) {
        super(data);
    }

    @Override
    public String[] getData() {
        return (String[]) get("data");
    }

    @Override
    public int length() {
        return getData().length;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + Arrays.toString(getData());
    }
}
