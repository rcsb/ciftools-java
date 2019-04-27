package org.rcsb.cif.model.software;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class CompilerVersion extends StrColumn {
    public CompilerVersion(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public CompilerVersion(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public CompilerVersion(String name) {
        super(name);
    }
}
