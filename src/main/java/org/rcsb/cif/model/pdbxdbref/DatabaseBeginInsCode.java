package org.rcsb.cif.model.pdbxdbref;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class DatabaseBeginInsCode extends StrColumn {
    public DatabaseBeginInsCode(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public DatabaseBeginInsCode(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public DatabaseBeginInsCode(String name) {
        super(name);
    }
}
