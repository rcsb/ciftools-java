package org.rcsb.cif.model.pdbxrefinetlsgroup;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class EndLabelSeqId extends IntColumn {
    public EndLabelSeqId(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public EndLabelSeqId(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public EndLabelSeqId(String name) {
        super(name);
    }
}
