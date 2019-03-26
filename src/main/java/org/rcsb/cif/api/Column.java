package org.rcsb.cif.api;

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
        public ValuePresence getValuePresence(int row) {
            return ValuePresence.NOT_SPECIFIED;
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

    ValuePresence getValuePresence(int row);

    boolean areEqualByValue(int rowA, int rowB);

    boolean isEqualToString(int row, String value);
}
