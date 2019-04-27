package org.rcsb.cif.model.pdbxentitysrcgenprodpcr;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PurificationDetails extends SingleRowStrColumn {
    public PurificationDetails(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public PurificationDetails(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public PurificationDetails(String name) {
        super(name);
    }
}
