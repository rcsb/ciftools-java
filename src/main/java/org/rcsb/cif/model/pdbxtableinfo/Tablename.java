package org.rcsb.cif.model.pdbxtableinfo;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Tablename extends StrColumn {
    public Tablename(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Tablename(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Tablename(String name) {
        super(name);
    }
}
