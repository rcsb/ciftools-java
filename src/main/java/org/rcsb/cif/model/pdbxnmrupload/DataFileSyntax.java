package org.rcsb.cif.model.pdbxnmrupload;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class DataFileSyntax extends StrColumn {
    public DataFileSyntax(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public DataFileSyntax(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public DataFileSyntax(String name) {
        super(name);
    }
}
