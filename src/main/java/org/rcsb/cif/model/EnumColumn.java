package org.rcsb.cif.model;

public class EnumColumn extends StrColumn {
    public EnumColumn(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public EnumColumn(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public EnumColumn(String name) {
        super(name);
    }
}
