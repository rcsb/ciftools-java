package org.rcsb.cif.model.pdbxsolnscattermodel;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class SoftwareList extends StrColumn {
    public SoftwareList(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public SoftwareList(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public SoftwareList(String name) {
        super(name);
    }
}
