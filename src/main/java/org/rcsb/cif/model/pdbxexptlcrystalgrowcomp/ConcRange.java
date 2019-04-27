package org.rcsb.cif.model.pdbxexptlcrystalgrowcomp;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ConcRange extends StrColumn {
    public ConcRange(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public ConcRange(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public ConcRange(String name) {
        super(name);
    }
}
