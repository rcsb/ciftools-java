package org.rcsb.cif.model.pdbxstructassembly;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.schema.Schema")
public class OligomericDetails extends StrColumn {
    public OligomericDetails(String name, int rowCount, String[] data) {
        super(name, rowCount, data);
    }

    public OligomericDetails(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public OligomericDetails(String name) {
        super(name);
    }
}
