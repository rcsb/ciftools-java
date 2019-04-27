package org.rcsb.cif.model.diffrn;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class AmbientEnvironment extends SingleRowStrColumn {
    public AmbientEnvironment(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public AmbientEnvironment(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public AmbientEnvironment(String name) {
        super(name);
    }
}
