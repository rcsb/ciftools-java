package org.rcsb.cif.model.citation;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Abstract extends StrColumn {
    public Abstract(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Abstract(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Abstract(String name) {
        super(name);
    }
}
