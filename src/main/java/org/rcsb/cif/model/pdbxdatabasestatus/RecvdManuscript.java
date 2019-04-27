package org.rcsb.cif.model.pdbxdatabasestatus;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class RecvdManuscript extends SingleRowStrColumn {
    public RecvdManuscript(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public RecvdManuscript(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public RecvdManuscript(String name) {
        super(name);
    }
}
