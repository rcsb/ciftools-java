package org.rcsb.cif.model.pdbxdepuientrydetails;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ValidatedContactEmail extends SingleRowStrColumn {
    public ValidatedContactEmail(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public ValidatedContactEmail(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public ValidatedContactEmail(String name) {
        super(name);
    }
}
