package org.rcsb.cif.model.pdbxunobsorzerooccresidues;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PolymerFlag extends StrColumn {
    public PolymerFlag(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public PolymerFlag(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public PolymerFlag(String name) {
        super(name);
    }
}
