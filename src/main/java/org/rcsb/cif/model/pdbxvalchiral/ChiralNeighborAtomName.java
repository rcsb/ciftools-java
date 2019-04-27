package org.rcsb.cif.model.pdbxvalchiral;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ChiralNeighborAtomName extends StrColumn {
    public ChiralNeighborAtomName(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public ChiralNeighborAtomName(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public ChiralNeighborAtomName(String name) {
        super(name);
    }
}
