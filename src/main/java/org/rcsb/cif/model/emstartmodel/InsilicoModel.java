package org.rcsb.cif.model.emstartmodel;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class InsilicoModel extends SingleRowStrColumn {
    public InsilicoModel(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public InsilicoModel(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public InsilicoModel(String name) {
        super(name);
    }
}
