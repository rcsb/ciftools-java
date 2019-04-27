package org.rcsb.cif.model.pdbxnmrensemble;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class AverageConstraintViolationsPerResidue extends IntColumn {
    public AverageConstraintViolationsPerResidue(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public AverageConstraintViolationsPerResidue(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public AverageConstraintViolationsPerResidue(String name) {
        super(name);
    }
}
