package org.rcsb.cif.model.phasingmirder;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class NativeSetId extends StrColumn {
    public NativeSetId(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public NativeSetId(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public NativeSetId(String name) {
        super(name);
    }
}
