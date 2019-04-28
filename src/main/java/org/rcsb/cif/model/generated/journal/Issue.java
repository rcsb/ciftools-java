package org.rcsb.cif.model.generated.journal;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Issue extends SingleRowStrColumn {
    public Issue(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Issue(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Issue(String name) {
        super(name);
    }
}
