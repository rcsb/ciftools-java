package org.rcsb.cif.model.database;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class CodeCAS extends StrColumn {
    public CodeCAS(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public CodeCAS(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public CodeCAS(String name) {
        super(name);
    }
}
