package org.rcsb.cif.model.ementityassembly;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class EbiOrganismScientific extends SingleRowStrColumn {
    public EbiOrganismScientific(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public EbiOrganismScientific(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public EbiOrganismScientific(String name) {
        super(name);
    }
}
