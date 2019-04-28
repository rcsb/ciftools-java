package org.rcsb.cif.model.generated.pdbxrefinecomponent;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Correlation extends SingleRowFloatColumn {
    public Correlation(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Correlation(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Correlation(String name) {
        super(name);
    }
}
