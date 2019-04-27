package org.rcsb.cif.model.emstructurefactors;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class File extends SingleRowStrColumn {
    public File(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public File(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public File(String name) {
        super(name);
    }
}
