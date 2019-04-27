package org.rcsb.cif.model.auditlink;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class BlockDescription extends StrColumn {
    public BlockDescription(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public BlockDescription(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public BlockDescription(String name) {
        super(name);
    }
}
