package org.rcsb.cif.model.emadmin;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class CurrentStatus extends SingleRowStrColumn {
    public CurrentStatus(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public CurrentStatus(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public CurrentStatus(String name) {
        super(name);
    }
}
