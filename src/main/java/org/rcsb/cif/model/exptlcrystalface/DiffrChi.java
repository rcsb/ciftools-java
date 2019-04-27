package org.rcsb.cif.model.exptlcrystalface;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class DiffrChi extends SingleRowFloatColumn {
    public DiffrChi(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public DiffrChi(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public DiffrChi(String name) {
        super(name);
    }
}
