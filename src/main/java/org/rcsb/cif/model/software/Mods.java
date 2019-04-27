package org.rcsb.cif.model.software;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Mods extends StrColumn {
    public Mods(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Mods(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Mods(String name) {
        super(name);
    }
}
