package org.rcsb.cif.model.pdbxstructgroupcomponentrange;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class BegPDBInsCode extends StrColumn {
    public BegPDBInsCode(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public BegPDBInsCode(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public BegPDBInsCode(String name) {
        super(name);
    }
}
