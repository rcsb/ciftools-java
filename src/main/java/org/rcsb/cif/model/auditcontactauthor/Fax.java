package org.rcsb.cif.model.auditcontactauthor;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Fax extends SingleRowStrColumn {
    public Fax(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Fax(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Fax(String name) {
        super(name);
    }
}
