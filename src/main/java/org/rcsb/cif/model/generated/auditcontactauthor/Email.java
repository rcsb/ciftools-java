package org.rcsb.cif.model.generated.auditcontactauthor;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Email extends SingleRowStrColumn {
    public Email(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Email(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Email(String name) {
        super(name);
    }
}
