package org.rcsb.cif.model.generated.pdbxentitysrcgenprodotherparameter;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Parameter extends StrColumn {
    public Parameter(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Parameter(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Parameter(String name) {
        super(name);
    }
}
