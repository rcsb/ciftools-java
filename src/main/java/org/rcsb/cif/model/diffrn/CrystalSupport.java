package org.rcsb.cif.model.diffrn;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class CrystalSupport extends SingleRowStrColumn {
    public CrystalSupport(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public CrystalSupport(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public CrystalSupport(String name) {
        super(name);
    }
}
