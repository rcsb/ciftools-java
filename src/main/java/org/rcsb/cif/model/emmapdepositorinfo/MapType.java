package org.rcsb.cif.model.emmapdepositorinfo;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class MapType extends SingleRowStrColumn {
    public MapType(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public MapType(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public MapType(String name) {
        super(name);
    }
}
