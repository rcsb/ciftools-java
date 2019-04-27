package org.rcsb.cif.model.pdbxdepuientrydetails;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class RelatedDatabaseName extends SingleRowStrColumn {
    public RelatedDatabaseName(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public RelatedDatabaseName(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public RelatedDatabaseName(String name) {
        super(name);
    }
}
