package org.rcsb.cif.model.pdbxsupportingexpdataset;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class DataVersionMajor extends IntColumn {
    public DataVersionMajor(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public DataVersionMajor(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public DataVersionMajor(String name) {
        super(name);
    }
}
