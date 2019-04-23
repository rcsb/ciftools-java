package org.rcsb.cif.model.structconn;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Ptnr2AuthSeqId extends IntColumn {
    public Ptnr2AuthSeqId(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Ptnr2AuthSeqId(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Ptnr2AuthSeqId(String name) {
        super(name);
    }
}
