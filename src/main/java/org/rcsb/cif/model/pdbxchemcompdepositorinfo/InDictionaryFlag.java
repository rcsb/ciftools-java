package org.rcsb.cif.model.pdbxchemcompdepositorinfo;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class InDictionaryFlag extends StrColumn {
    public InDictionaryFlag(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public InDictionaryFlag(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public InDictionaryFlag(String name) {
        super(name);
    }
}
