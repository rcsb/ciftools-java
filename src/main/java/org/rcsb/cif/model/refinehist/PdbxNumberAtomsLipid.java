package org.rcsb.cif.model.refinehist;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxNumberAtomsLipid extends SingleRowIntColumn {
    public PdbxNumberAtomsLipid(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public PdbxNumberAtomsLipid(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public PdbxNumberAtomsLipid(String name) {
        super(name);
    }
}
