package org.rcsb.cif.model.generated.pdbxentitysrcgenexpress;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class VectorType extends StrColumn {
    public VectorType(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public VectorType(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public VectorType(String name) {
        super(name);
    }
}
