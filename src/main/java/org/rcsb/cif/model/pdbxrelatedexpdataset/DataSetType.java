package org.rcsb.cif.model.pdbxrelatedexpdataset;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class DataSetType extends StrColumn {
    public DataSetType(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public DataSetType(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public DataSetType(String name) {
        super(name);
    }
}
