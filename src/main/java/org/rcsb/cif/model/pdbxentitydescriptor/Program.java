package org.rcsb.cif.model.pdbxentitydescriptor;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.schema.Schema")
public class Program extends StrColumn {
    public Program(String name, int rowCount, String[] data) {
        super(name, rowCount, data);
    }

    public Program(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Program(String name) {
        super(name);
    }
}
