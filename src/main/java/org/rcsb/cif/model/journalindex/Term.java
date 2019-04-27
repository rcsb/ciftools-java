package org.rcsb.cif.model.journalindex;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Term extends StrColumn {
    public Term(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Term(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Term(String name) {
        super(name);
    }
}
