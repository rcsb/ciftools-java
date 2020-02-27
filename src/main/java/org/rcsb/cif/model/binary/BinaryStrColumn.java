package org.rcsb.cif.model.binary;

import org.rcsb.cif.model.StrColumn;

import java.util.Arrays;
import java.util.stream.Stream;

public class BinaryStrColumn extends BinaryColumn<String[]> implements StrColumn {
    private final String[] data;

    public BinaryStrColumn(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, mask);
        this.data = (String[]) data;
    }

    @Override
    public String get(int row) {
        return honorValueKind(data[row]);
    }

    @Override
    public Stream<String> values() {
        // we override here for some potential performance gains
        return Arrays.stream(data);
    }

    @Override
    public String getStringData(int row) {
        return honorValueKind(data[row]);
    }

    private String honorValueKind(String value) {
        return (".".equals(value) || "?".equals(value)) ? "" : value;
    }

    @Override
    public String[] getBinaryDataUnsafe() {
        return data;
    }
}
