package org.rcsb.cif.model.computing;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class DataReduction extends SingleRowStrColumn {
    public DataReduction(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public DataReduction(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public DataReduction(String name) {
        super(name);
    }
}
