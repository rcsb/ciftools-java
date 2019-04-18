package org.rcsb.cif.model.pdbxstructassembly;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.schema.Schema")
public class OligomericCount extends IntColumn {
    public OligomericCount(String name, int rowCount, String[] data) {
        super(name, rowCount, data);
    }

    public OligomericCount(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }
}
