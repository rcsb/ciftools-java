package org.rcsb.cif.model.journal;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class TecheditorAddress extends SingleRowStrColumn {
    public TecheditorAddress(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public TecheditorAddress(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public TecheditorAddress(String name) {
        super(name);
    }
}
