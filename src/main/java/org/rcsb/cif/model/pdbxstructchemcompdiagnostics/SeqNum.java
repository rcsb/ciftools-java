package org.rcsb.cif.model.pdbxstructchemcompdiagnostics;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class SeqNum extends SingleRowIntColumn {
    public SeqNum(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public SeqNum(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public SeqNum(String name) {
        super(name);
    }
}
