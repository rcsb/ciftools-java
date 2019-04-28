package org.rcsb.cif.model.generated.emsamplesupport;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class GridMaterial extends SingleRowStrColumn {
    public GridMaterial(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public GridMaterial(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public GridMaterial(String name) {
        super(name);
    }
}
