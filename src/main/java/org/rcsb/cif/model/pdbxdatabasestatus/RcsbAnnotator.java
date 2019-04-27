package org.rcsb.cif.model.pdbxdatabasestatus;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class RcsbAnnotator extends SingleRowStrColumn {
    public RcsbAnnotator(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public RcsbAnnotator(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public RcsbAnnotator(String name) {
        super(name);
    }
}
