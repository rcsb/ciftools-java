package org.rcsb.cif.model.entitypolyseq;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.schema.Schema")
public class Num extends IntColumn {
    public Num(String name, int rowCount, String[] data) {
        super(name, rowCount, data);
    }

    public Num(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Num(String name) {
        super(name);
    }
}
