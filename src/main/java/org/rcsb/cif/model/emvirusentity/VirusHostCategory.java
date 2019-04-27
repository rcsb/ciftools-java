package org.rcsb.cif.model.emvirusentity;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class VirusHostCategory extends StrColumn {
    public VirusHostCategory(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public VirusHostCategory(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public VirusHostCategory(String name) {
        super(name);
    }
}
