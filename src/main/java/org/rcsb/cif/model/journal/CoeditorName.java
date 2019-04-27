package org.rcsb.cif.model.journal;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class CoeditorName extends SingleRowStrColumn {
    public CoeditorName(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public CoeditorName(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public CoeditorName(String name) {
        super(name);
    }
}
