package org.rcsb.cif.model.pdbxdatabasepdbomit;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class RecordName extends StrColumn {
    public RecordName(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public RecordName(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public RecordName(String name) {
        super(name);
    }
}
