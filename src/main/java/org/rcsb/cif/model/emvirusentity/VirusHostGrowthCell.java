package org.rcsb.cif.model.emvirusentity;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class VirusHostGrowthCell extends StrColumn {
    public VirusHostGrowthCell(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public VirusHostGrowthCell(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public VirusHostGrowthCell(String name) {
        super(name);
    }
}
