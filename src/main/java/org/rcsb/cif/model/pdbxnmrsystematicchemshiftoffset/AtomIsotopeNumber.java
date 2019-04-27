package org.rcsb.cif.model.pdbxnmrsystematicchemshiftoffset;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class AtomIsotopeNumber extends IntColumn {
    public AtomIsotopeNumber(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public AtomIsotopeNumber(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public AtomIsotopeNumber(String name) {
        super(name);
    }
}
