package org.rcsb.cif.model.emsupportfilm;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class SampleSupportId extends SingleRowStrColumn {
    public SampleSupportId(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public SampleSupportId(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public SampleSupportId(String name) {
        super(name);
    }
}
