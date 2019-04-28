package org.rcsb.cif.model.generated.exptlcrystal;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxCrystalImageFormat extends SingleRowStrColumn {
    public PdbxCrystalImageFormat(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public PdbxCrystalImageFormat(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public PdbxCrystalImageFormat(String name) {
        super(name);
    }
}
