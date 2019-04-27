package org.rcsb.cif.model.entitykeywords;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Text extends StrColumn {
    public Text(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Text(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Text(String name) {
        super(name);
    }
}
