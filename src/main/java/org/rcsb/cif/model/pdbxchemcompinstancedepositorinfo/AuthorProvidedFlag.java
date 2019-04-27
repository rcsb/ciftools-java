package org.rcsb.cif.model.pdbxchemcompinstancedepositorinfo;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class AuthorProvidedFlag extends StrColumn {
    public AuthorProvidedFlag(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public AuthorProvidedFlag(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public AuthorProvidedFlag(String name) {
        super(name);
    }
}
