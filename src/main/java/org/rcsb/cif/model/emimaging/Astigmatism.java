package org.rcsb.cif.model.emimaging;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Astigmatism extends SingleRowStrColumn {
    public Astigmatism(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Astigmatism(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Astigmatism(String name) {
        super(name);
    }
}
