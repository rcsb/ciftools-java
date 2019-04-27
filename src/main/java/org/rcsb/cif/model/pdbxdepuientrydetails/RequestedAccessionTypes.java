package org.rcsb.cif.model.pdbxdepuientrydetails;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class RequestedAccessionTypes extends SingleRowStrColumn {
    public RequestedAccessionTypes(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public RequestedAccessionTypes(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public RequestedAccessionTypes(String name) {
        super(name);
    }
}
