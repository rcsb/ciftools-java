package org.rcsb.cif.model.generated.pdbxentityfuncbindmode;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ProteinBindsTo extends StrColumn {
    public ProteinBindsTo(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public ProteinBindsTo(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public ProteinBindsTo(String name) {
        super(name);
    }
}
