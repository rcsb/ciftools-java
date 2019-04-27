package org.rcsb.cif.model.pdbxnmrspectraldim;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class EncodedSourceDimensionId extends IntColumn {
    public EncodedSourceDimensionId(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public EncodedSourceDimensionId(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public EncodedSourceDimensionId(String name) {
        super(name);
    }
}
