package org.rcsb.cif.model.emmapdepositorinfo;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ExperimentId extends SingleRowStrColumn {
    public ExperimentId(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public ExperimentId(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public ExperimentId(String name) {
        super(name);
    }
}
