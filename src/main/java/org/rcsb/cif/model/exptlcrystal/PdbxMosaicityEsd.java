package org.rcsb.cif.model.exptlcrystal;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxMosaicityEsd extends SingleRowFloatColumn {
    public PdbxMosaicityEsd(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public PdbxMosaicityEsd(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public PdbxMosaicityEsd(String name) {
        super(name);
    }
}
