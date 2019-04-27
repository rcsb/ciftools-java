package org.rcsb.cif.model.phasingmirder;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ReflnsAnomalous extends IntColumn {
    public ReflnsAnomalous(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public ReflnsAnomalous(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public ReflnsAnomalous(String name) {
        super(name);
    }
}
