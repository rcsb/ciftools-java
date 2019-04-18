package org.rcsb.cif.model.pdbxstructassemblygen;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.schema.Schema")
public class AssemblyId extends StrColumn {
    public AssemblyId(String name, int rowCount, String[] data) {
        super(name, rowCount, data);
    }

    public AssemblyId(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public AssemblyId(String name) {
        super(name);
    }
}
