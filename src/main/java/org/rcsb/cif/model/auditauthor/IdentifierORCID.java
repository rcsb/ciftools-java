package org.rcsb.cif.model.auditauthor;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class IdentifierORCID extends StrColumn {
    public IdentifierORCID(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public IdentifierORCID(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public IdentifierORCID(String name) {
        super(name);
    }
}
