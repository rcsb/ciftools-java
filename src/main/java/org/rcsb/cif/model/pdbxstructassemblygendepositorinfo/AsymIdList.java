package org.rcsb.cif.model.pdbxstructassemblygendepositorinfo;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class AsymIdList extends StrColumn {
    public AsymIdList(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public AsymIdList(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public AsymIdList(String name) {
        super(name);
    }
}
