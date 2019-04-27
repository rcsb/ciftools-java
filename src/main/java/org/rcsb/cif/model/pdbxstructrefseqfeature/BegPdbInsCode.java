package org.rcsb.cif.model.pdbxstructrefseqfeature;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class BegPdbInsCode extends SingleRowStrColumn {
    public BegPdbInsCode(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public BegPdbInsCode(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public BegPdbInsCode(String name) {
        super(name);
    }
}
