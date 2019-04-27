package org.rcsb.cif.model.chemcompatom;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxStereoConfig extends StrColumn {
    public PdbxStereoConfig(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public PdbxStereoConfig(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public PdbxStereoConfig(String name) {
        super(name);
    }
}
