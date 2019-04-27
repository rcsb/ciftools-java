package org.rcsb.cif.model.citation;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class AbstractIdCAS extends StrColumn {
    public AbstractIdCAS(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public AbstractIdCAS(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public AbstractIdCAS(String name) {
        super(name);
    }
}
