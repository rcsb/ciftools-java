package org.rcsb.cif.model.diffrnradiation;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Probe extends SingleRowStrColumn {
    public Probe(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Probe(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Probe(String name) {
        super(name);
    }
}
