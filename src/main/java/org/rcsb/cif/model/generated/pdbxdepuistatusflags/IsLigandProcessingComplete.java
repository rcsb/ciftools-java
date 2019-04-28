package org.rcsb.cif.model.generated.pdbxdepuistatusflags;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class IsLigandProcessingComplete extends SingleRowStrColumn {
    public IsLigandProcessingComplete(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public IsLigandProcessingComplete(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public IsLigandProcessingComplete(String name) {
        super(name);
    }
}
