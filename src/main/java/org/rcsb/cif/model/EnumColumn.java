package org.rcsb.cif.model;

public class EnumColumn extends StrColumn {
    public EnumColumn(String name, int rowCount, String[] data) {
        super(name, rowCount, data);
    }

    public EnumColumn(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }
}
