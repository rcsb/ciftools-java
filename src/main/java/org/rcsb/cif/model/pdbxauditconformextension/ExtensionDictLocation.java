package org.rcsb.cif.model.pdbxauditconformextension;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ExtensionDictLocation extends SingleRowStrColumn {
    public ExtensionDictLocation(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public ExtensionDictLocation(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public ExtensionDictLocation(String name) {
        super(name);
    }
}
