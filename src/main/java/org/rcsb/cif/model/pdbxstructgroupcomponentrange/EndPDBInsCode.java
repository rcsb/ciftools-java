package org.rcsb.cif.model.pdbxstructgroupcomponentrange;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class EndPDBInsCode extends StrColumn {
    public EndPDBInsCode(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public EndPDBInsCode(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public EndPDBInsCode(String name) {
        super(name);
    }
}
