package org.rcsb.cif.model.generated.pdbxdepuivalidationstatusflags;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class SolventOutliers extends SingleRowIntColumn {
    public SolventOutliers(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public SolventOutliers(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public SolventOutliers(String name) {
        super(name);
    }
}
