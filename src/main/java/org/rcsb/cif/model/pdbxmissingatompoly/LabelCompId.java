package org.rcsb.cif.model.pdbxmissingatompoly;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class LabelCompId extends StrColumn {
    public LabelCompId(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public LabelCompId(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public LabelCompId(String name) {
        super(name);
    }
}
