package org.rcsb.cif.model.generated.pdbxrefinetlsgroup;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Selection extends StrColumn {
    public Selection(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Selection(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Selection(String name) {
        super(name);
    }
}
