package org.rcsb.cif.model.emdbreference;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class DbName extends StrColumn {
    public DbName(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public DbName(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public DbName(String name) {
        super(name);
    }
}
