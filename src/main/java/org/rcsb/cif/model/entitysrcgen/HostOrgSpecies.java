package org.rcsb.cif.model.entitysrcgen;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class HostOrgSpecies extends StrColumn {
    public HostOrgSpecies(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public HostOrgSpecies(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public HostOrgSpecies(String name) {
        super(name);
    }
}
