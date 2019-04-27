package org.rcsb.cif.model.pdbxdbref;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class DatabaseName extends StrColumn {
    public DatabaseName(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public DatabaseName(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public DatabaseName(String name) {
        super(name);
    }
}
