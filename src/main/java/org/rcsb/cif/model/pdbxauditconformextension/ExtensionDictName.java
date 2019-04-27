package org.rcsb.cif.model.pdbxauditconformextension;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ExtensionDictName extends SingleRowStrColumn {
    public ExtensionDictName(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public ExtensionDictName(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public ExtensionDictName(String name) {
        super(name);
    }
}
