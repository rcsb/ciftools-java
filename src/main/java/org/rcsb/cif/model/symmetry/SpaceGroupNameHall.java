package org.rcsb.cif.model.symmetry;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.schema.Schema")
public class SpaceGroupNameHall extends SingleRowStrColumn {
    public SpaceGroupNameHall(String name, int rowCount, String[] data) {
        super(name, rowCount, data);
    }

    public SpaceGroupNameHall(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public SpaceGroupNameHall(String name) {
        super(name);
    }
}
