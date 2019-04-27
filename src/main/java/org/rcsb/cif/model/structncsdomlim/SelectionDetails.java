package org.rcsb.cif.model.structncsdomlim;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class SelectionDetails extends StrColumn {
    public SelectionDetails(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public SelectionDetails(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public SelectionDetails(String name) {
        super(name);
    }
}
