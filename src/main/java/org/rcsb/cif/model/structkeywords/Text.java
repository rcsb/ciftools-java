package org.rcsb.cif.model.structkeywords;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.schema.Schema")
public class Text extends ListColumn {
    public Text(String name, int rowCount, String[] data) {
        super(name, rowCount, data);
    }

    public Text(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Text(String name) {
        super(name);
    }
}
