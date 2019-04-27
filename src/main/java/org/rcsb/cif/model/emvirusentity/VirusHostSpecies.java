package org.rcsb.cif.model.emvirusentity;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class VirusHostSpecies extends StrColumn {
    public VirusHostSpecies(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public VirusHostSpecies(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public VirusHostSpecies(String name) {
        super(name);
    }
}
