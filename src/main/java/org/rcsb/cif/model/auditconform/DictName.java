package org.rcsb.cif.model.auditconform;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class DictName extends SingleRowStrColumn {
    public DictName(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public DictName(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public DictName(String name) {
        super(name);
    }
}
