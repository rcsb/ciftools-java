package org.rcsb.cif.model.structref;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class SeqAlign extends StrColumn {
    public SeqAlign(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public SeqAlign(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public SeqAlign(String name) {
        super(name);
    }
}
