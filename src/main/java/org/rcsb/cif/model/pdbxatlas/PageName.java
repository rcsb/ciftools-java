package org.rcsb.cif.model.pdbxatlas;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PageName extends StrColumn {
    public PageName(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public PageName(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public PageName(String name) {
        super(name);
    }
}
