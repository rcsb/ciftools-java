package org.rcsb.cif.model.ementityassembly;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Synonym extends SingleRowStrColumn {
    public Synonym(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Synonym(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Synonym(String name) {
        super(name);
    }
}
