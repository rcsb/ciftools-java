package org.rcsb.cif.model.exptlcrystal;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ColourPrimary extends SingleRowStrColumn {
    public ColourPrimary(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public ColourPrimary(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public ColourPrimary(String name) {
        super(name);
    }
}
