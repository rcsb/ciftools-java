package org.rcsb.cif.model.pdbxdataprocessingstatus;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class TaskName extends StrColumn {
    public TaskName(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public TaskName(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public TaskName(String name) {
        super(name);
    }
}
