package org.rcsb.cif.model.phasingset;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class DetectorSpecific extends SingleRowStrColumn {
    public DetectorSpecific(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public DetectorSpecific(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public DetectorSpecific(String name) {
        super(name);
    }
}
