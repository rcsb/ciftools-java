package org.rcsb.cif.model.journal;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class TecheditorNotes extends SingleRowStrColumn {
    public TecheditorNotes(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public TecheditorNotes(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public TecheditorNotes(String name) {
        super(name);
    }
}
