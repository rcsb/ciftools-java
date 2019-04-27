package org.rcsb.cif.model.pdbxentitysrcgenpure;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ProteinPurity extends FloatColumn {
    public ProteinPurity(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public ProteinPurity(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public ProteinPurity(String name) {
        super(name);
    }
}
