package org.rcsb.cif.model.generated.pdbxnmrrepresentative;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class SelectionCriteria extends SingleRowStrColumn {
    public SelectionCriteria(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public SelectionCriteria(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public SelectionCriteria(String name) {
        super(name);
    }
}
