package org.rcsb.cif.model.generated.emmaskdepositorinfo;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ContourLevel extends SingleRowFloatColumn {
    public ContourLevel(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public ContourLevel(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public ContourLevel(String name) {
        super(name);
    }
}
