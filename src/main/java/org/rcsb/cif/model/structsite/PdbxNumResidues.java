package org.rcsb.cif.model.structsite;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.schema.Schema")
public class PdbxNumResidues extends IntColumn {
    public PdbxNumResidues(String name, int rowCount, String[] data) {
        super(name, rowCount, data);
    }

    public PdbxNumResidues(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public PdbxNumResidues(String name) {
        super(name);
    }
}
