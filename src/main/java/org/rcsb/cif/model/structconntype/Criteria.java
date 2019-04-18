package org.rcsb.cif.model.structconntype;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.schema.Schema")
public class Criteria extends StrColumn {
    public Criteria(String name, int rowCount, String[] data) {
        super(name, rowCount, data);
    }

    public Criteria(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }
}
