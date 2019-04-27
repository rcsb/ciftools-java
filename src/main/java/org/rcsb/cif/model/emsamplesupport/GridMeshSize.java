package org.rcsb.cif.model.emsamplesupport;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class GridMeshSize extends SingleRowIntColumn {
    public GridMeshSize(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public GridMeshSize(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public GridMeshSize(String name) {
        super(name);
    }
}
