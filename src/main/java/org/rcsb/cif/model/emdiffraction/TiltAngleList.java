package org.rcsb.cif.model.emdiffraction;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class TiltAngleList extends StrColumn {
    public TiltAngleList(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public TiltAngleList(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public TiltAngleList(String name) {
        super(name);
    }
}
