package org.rcsb.cif.model.pdbxentitysrcgenexpress;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class HarvestingDetails extends StrColumn {
    public HarvestingDetails(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public HarvestingDetails(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public HarvestingDetails(String name) {
        super(name);
    }
}
