package org.rcsb.cif.text;

import org.rcsb.cif.api.Column;
import org.rcsb.cif.api.ValuePresence;

public class TextColumn implements Column {
    private final int[] tokens;
    private final int columnCount;
    private final String data;
    private final String name;
    private final int index;

    public TextColumn(TextCategory category, String data, String name, int index) {
        this.tokens = category.getTokens();
        this.columnCount = category.getColumnCount();
        this.data = data;
        this.name = name;
        this.index = index;
    }


    @Override
    public boolean isDefined() {
        return true;
    }

    @Override
    public String getString(int row) {
        int i = (row * columnCount + index) * 2;
        String ret = data.substring(tokens[i], tokens[i + 1]);
        if (ret.equals(".") || ret.equals("?")) {
            return null;
        }
        return ret;
    }

    @Override
    public int getInteger(int row) {
        int i = (row * columnCount + index) * 2;
        return Integer.parseInt(data.substring(tokens[i], tokens[i + 1]));
    }

    @Override
    public float getFloat(int row) {
        int i = (row * columnCount + index) * 2;
        return Integer.parseInt(data.substring(tokens[i], tokens[i + 1]));
    }

    @Override
    public ValuePresence getValuePresence(int row) {
        int index = row * columnCount + this.index;
        int s = tokens[2 * index];
        if (tokens[2 * index + 1] - s != 1) {
            return ValuePresence.PRESENT;
        }
        int v = Character.codePointAt(data, s);
        if (v == 46 /* . */) {
            return ValuePresence.NOT_SPECIFIED;
        } else if (v == 63 /* ? */) {
            return ValuePresence.UNKNOWN;
        } else {
            return ValuePresence.PRESENT;
        }
    }

    @Override
    public boolean areEqualByValue(int rowA, int rowB) {
        int aIndex = (rowA * columnCount + index) * 2;
        int bIndex = (rowB * columnCount + index) * 2;
        int aS = tokens[aIndex];
        int bS = tokens[bIndex];
        int len = tokens[aIndex + 1] - aS;
        if (len != tokens[bIndex + 1] - bS) {
            return false;
        }
        for (int i = 0; i < len; i++) {
            if (Character.codePointAt(data, i + aS) != Character.codePointAt(data, i + bS)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isEqualToString(int row, String value) {
        int aIndex = (row * columnCount + index) * 2;
        int s = tokens[aIndex];
        int len = value.length();
        if (len != tokens[aIndex + 1] - s) {
            return false;
        }
        for (int i = 0; i < len; i++) {
            if (Character.codePointAt(data, i + s) != value.codePointAt(i)) {
                return false;
            }
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public int getIndex() {
        return index;
    }
}
