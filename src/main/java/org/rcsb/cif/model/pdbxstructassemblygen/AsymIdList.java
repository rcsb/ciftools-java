package org.rcsb.cif.model.pdbxstructassemblygen;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.schema.Schema")
public class AsymIdList extends ListColumn {
    public AsymIdList(String name, int rowCount, String[] data) {
        super(name, rowCount, data);
    }

    public AsymIdList(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public AsymIdList(String name) {
        super(name);
    }
}
