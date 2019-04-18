package org.rcsb.cif.model.struct;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.schema.Schema")
public class Title extends SingleRowStrColumn {
    public Title(String name, int rowCount, String[] data) {
        super(name, rowCount, data);
    }

    public Title(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Title(String name) {
        super(name);
    }
}
