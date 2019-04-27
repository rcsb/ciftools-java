package org.rcsb.cif.model.pdbxserialcrystallographydatareduction;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class FrameHits extends SingleRowIntColumn {
    public FrameHits(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public FrameHits(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public FrameHits(String name) {
        super(name);
    }
}
