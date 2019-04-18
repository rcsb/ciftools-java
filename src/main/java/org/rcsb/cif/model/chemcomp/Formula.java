package org.rcsb.cif.model.chemcomp;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.schema.Schema")
public class Formula extends StrColumn {
    public Formula(String name, int rowCount, String[] data) {
        super(name, rowCount, data);
    }

    public Formula(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Formula(String name) {
        super(name);
    }
}
