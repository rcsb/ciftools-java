package org.rcsb.cif.model.diffrnradiation;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Monochromator extends SingleRowStrColumn {
    public Monochromator(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Monochromator(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Monochromator(String name) {
        super(name);
    }
}
