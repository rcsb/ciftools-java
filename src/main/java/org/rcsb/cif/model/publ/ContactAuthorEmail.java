package org.rcsb.cif.model.publ;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ContactAuthorEmail extends SingleRowStrColumn {
    public ContactAuthorEmail(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public ContactAuthorEmail(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public ContactAuthorEmail(String name) {
        super(name);
    }
}
