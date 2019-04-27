package org.rcsb.cif.model.pdbxdepuientrydetails;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ExperimentalMethods extends SingleRowStrColumn {
    public ExperimentalMethods(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public ExperimentalMethods(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public ExperimentalMethods(String name) {
        super(name);
    }
}
