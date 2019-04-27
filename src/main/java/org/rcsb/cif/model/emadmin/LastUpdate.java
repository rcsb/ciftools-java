package org.rcsb.cif.model.emadmin;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class LastUpdate extends SingleRowStrColumn {
    public LastUpdate(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public LastUpdate(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public LastUpdate(String name) {
        super(name);
    }
}
