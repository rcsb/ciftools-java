package org.rcsb.cif.model.generated.refine;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxRFreeSelectionDetails extends SingleRowStrColumn {
    public PdbxRFreeSelectionDetails(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public PdbxRFreeSelectionDetails(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public PdbxRFreeSelectionDetails(String name) {
        super(name);
    }
}
