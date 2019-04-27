package org.rcsb.cif.model.pdbxvalchiral;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ChiralCenterAtomAltId extends StrColumn {
    public ChiralCenterAtomAltId(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public ChiralCenterAtomAltId(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public ChiralCenterAtomAltId(String name) {
        super(name);
    }
}
