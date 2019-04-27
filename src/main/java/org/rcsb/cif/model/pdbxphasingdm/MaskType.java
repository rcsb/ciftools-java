package org.rcsb.cif.model.pdbxphasingdm;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class MaskType extends SingleRowStrColumn {
    public MaskType(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public MaskType(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public MaskType(String name) {
        super(name);
    }
}
