package org.rcsb.cif.model.generated.emvirusentity;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Enveloped extends StrColumn {
    public Enveloped(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Enveloped(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Enveloped(String name) {
        super(name);
    }
}
