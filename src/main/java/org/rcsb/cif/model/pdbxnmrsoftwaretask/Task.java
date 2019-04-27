package org.rcsb.cif.model.pdbxnmrsoftwaretask;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Task extends StrColumn {
    public Task(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Task(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Task(String name) {
        super(name);
    }
}
