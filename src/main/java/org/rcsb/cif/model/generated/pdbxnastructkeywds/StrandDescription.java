package org.rcsb.cif.model.generated.pdbxnastructkeywds;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class StrandDescription extends SingleRowStrColumn {
    public StrandDescription(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public StrandDescription(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public StrandDescription(String name) {
        super(name);
    }
}
