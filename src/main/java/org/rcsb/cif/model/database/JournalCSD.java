package org.rcsb.cif.model.database;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class JournalCSD extends StrColumn {
    public JournalCSD(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public JournalCSD(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public JournalCSD(String name) {
        super(name);
    }
}
