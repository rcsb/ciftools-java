package org.rcsb.cif.model.diffrnattenuator;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Code extends SingleRowStrColumn {
    public Code(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Code(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Code(String name) {
        super(name);
    }
}
