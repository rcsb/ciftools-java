package org.rcsb.cif.model.chemcomp;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxReleaseStatus extends StrColumn {
    public PdbxReleaseStatus(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public PdbxReleaseStatus(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public PdbxReleaseStatus(String name) {
        super(name);
    }
}
