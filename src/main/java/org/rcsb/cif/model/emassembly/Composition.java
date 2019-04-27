package org.rcsb.cif.model.emassembly;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Composition extends SingleRowStrColumn {
    public Composition(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Composition(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Composition(String name) {
        super(name);
    }
}
