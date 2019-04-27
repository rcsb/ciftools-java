package org.rcsb.cif.model.chemcomp;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class MonNstdClass extends StrColumn {
    public MonNstdClass(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public MonNstdClass(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public MonNstdClass(String name) {
        super(name);
    }
}
