package org.rcsb.cif.model.pdbxsolnscatter;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class SourceBeamline extends StrColumn {
    public SourceBeamline(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public SourceBeamline(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public SourceBeamline(String name) {
        super(name);
    }
}
