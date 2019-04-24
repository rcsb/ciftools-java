package org.rcsb.cif.model.structconntype;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Reference extends StrColumn {
    public Reference(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Reference(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Reference(String name) {
        super(name);
    }
}
