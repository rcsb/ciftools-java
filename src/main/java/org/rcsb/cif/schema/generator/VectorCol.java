package org.rcsb.cif.schema.generator;

class VectorCol extends Col {
    private final int length;

    VectorCol(int length, String description) {
        super("vector", description);
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}
