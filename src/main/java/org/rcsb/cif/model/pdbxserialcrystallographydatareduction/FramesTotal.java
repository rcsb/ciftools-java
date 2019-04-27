package org.rcsb.cif.model.pdbxserialcrystallographydatareduction;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class FramesTotal extends SingleRowIntColumn {
    public FramesTotal(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public FramesTotal(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public FramesTotal(String name) {
        super(name);
    }
}
