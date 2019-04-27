package org.rcsb.cif.model.pdbxrobotsystem;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Manufacturer extends StrColumn {
    public Manufacturer(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Manufacturer(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Manufacturer(String name) {
        super(name);
    }
}
