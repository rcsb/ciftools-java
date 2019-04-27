package org.rcsb.cif.model.software;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ContactAuthor extends StrColumn {
    public ContactAuthor(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public ContactAuthor(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public ContactAuthor(String name) {
        super(name);
    }
}
