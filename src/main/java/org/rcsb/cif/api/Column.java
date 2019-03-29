package org.rcsb.cif.api;

import org.rcsb.cif.model.ValueKind;

public interface Column {
    Column UNDEFINED_COLUMN = new Column() {
        @Override
        public boolean isDefined() {
            return false;
        }

        @Override
        public String getString(int row) {
            return null;
        }

        @Override
        public int getInteger(int row) {
            return 0;
        }

        @Override
        public float getFloat(int row) {
            return 0;
        }

        @Override
        public ValueKind getValuePresence(int row) {
            return ValueKind.NOT_PRESENT;
        }

        @Override
        public boolean areEqualByValue(int rowA, int rowB) {
            return true;
        }

        @Override
        public boolean isEqualToString(int row, String value) {
            return value == null;
        }
    };

    boolean isDefined();

    String getString(int row);

    int getInteger(int row);

    float getFloat(int row);

    ValueKind getValuePresence(int row);

    boolean areEqualByValue(int rowA, int rowB);

    boolean isEqualToString(int row, String value);
}
