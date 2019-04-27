package org.rcsb.cif.model.pdbxentitysrcgenproteolysis;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Protease extends StrColumn {
    public Protease(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Protease(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Protease(String name) {
        super(name);
    }
}
