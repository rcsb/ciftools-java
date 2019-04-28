package org.rcsb.cif.model.generated.pdbxstructchemcompfeature;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbStrandId extends SingleRowStrColumn {
    public PdbStrandId(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public PdbStrandId(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public PdbStrandId(String name) {
        super(name);
    }
}
