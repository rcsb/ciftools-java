package org.rcsb.cif.model.software;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Language extends StrColumn {
    public Language(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Language(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Language(String name) {
        super(name);
    }
}
