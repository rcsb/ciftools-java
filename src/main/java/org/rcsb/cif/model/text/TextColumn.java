package org.rcsb.cif.model.text;

import org.rcsb.cif.model.Column;
import org.rcsb.cif.model.ValueKind;

public class TextColumn implements Column {
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

    @Override
    public boolean isDefined() {
        return true;
    }
}
