package org.rcsb.cif.model.entity;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.schema.Schema")
public class PdbxDescription extends ListColumn {
    public PdbxDescription(String name, int rowCount, String[] data) {
        super(name, rowCount, data);
    }

    public PdbxDescription(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }
}
