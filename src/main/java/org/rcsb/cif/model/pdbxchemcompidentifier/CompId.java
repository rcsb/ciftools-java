package org.rcsb.cif.model.pdbxchemcompidentifier;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.schema.Schema")
public class CompId extends StrColumn {
    public CompId(String name, int rowCount, String[] data) {
        super(name, rowCount, data);
    }

    public CompId(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }
}