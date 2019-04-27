package org.rcsb.cif.model.pdbxstructbiolfunc;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Function extends StrColumn {
    public Function(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Function(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Function(String name) {
        super(name);
    }
}
