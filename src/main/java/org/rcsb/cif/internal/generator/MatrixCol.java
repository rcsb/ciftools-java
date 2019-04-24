package org.rcsb.cif.internal.generator;

class MatrixCol extends Col {
    private final int columns;
    private final int rows;

    MatrixCol(int columns, int rows, String description) {
        super("matrix", description);
        this.columns = columns;
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public int getRows() {
        return rows;
    }
}
