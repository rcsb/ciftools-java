package org.rcsb.cif.model.atomsitesaltgen;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class AltId extends StrColumn {
    public AltId(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public AltId(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public AltId(String name) {
        super(name);
    }
}
