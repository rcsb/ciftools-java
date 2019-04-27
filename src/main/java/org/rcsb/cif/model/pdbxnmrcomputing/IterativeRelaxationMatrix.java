package org.rcsb.cif.model.pdbxnmrcomputing;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class IterativeRelaxationMatrix extends SingleRowStrColumn {
    public IterativeRelaxationMatrix(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public IterativeRelaxationMatrix(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public IterativeRelaxationMatrix(String name) {
        super(name);
    }
}
