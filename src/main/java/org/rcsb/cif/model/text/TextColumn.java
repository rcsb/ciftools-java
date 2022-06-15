package org.rcsb.cif.model.text;

import org.rcsb.cif.model.StrColumn;
import org.rcsb.cif.model.ValueKind;

import java.util.stream.IntStream;

public class TextColumn implements StrColumn {
    private final String name;
    private final int rowCount;
    private final String textData;
    private final int[] startToken;
    private final int[] endToken;

    public TextColumn(String name, int rowCount, String textData, int[] startToken, int[] endToken) {
        this.name = name;
        this.rowCount = rowCount;
        this.textData = textData;
        this.startToken = startToken;
        this.endToken = endToken;
    }

    @Override
    public String getColumnName() {
        return name;
    }

    @Override
    public int getRowCount() {
        return rowCount;
    }

    @Override
    public String getStringData(int row) {
        return honorValueKind(textData.substring(startToken[row], endToken[row]));
    }

    private String honorValueKind(String value) {
        return (".".equals(value) || "?".equals(value)) ? "" : value;
    }

    @Override
    public ValueKind getValueKind(int row) {
        String value = textData.substring(startToken[row], endToken[row]);
        if (value.isEmpty() || ".".equals(value)) {
            return ValueKind.NOT_PRESENT;
        } else if ("?".equals(value)) {
            return ValueKind.UNKNOWN;
        } else {
            return ValueKind.PRESENT;
        }
    }

    /**
     * Explicitly creates this array by parsing all data in this text column. Don't use this function for text data -
     * returned array is not cached
     * @return the requested array
     */
    @Override
    public String[] getArray() {
        return IntStream.range(0, rowCount)
                .mapToObj(this::get)
                .toArray(String[]::new);
    }

    @Override
    public String get(int row) {
        return getStringData(row);
    }
}
