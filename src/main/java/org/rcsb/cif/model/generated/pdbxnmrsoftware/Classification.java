package org.rcsb.cif.model.generated.pdbxnmrsoftware;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Classification extends StrColumn {
    public Classification(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Classification(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Classification(String name) {
        super(name);
    }
}
