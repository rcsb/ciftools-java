package org.rcsb.cif.model.generated.publ;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class RequestedCoeditorName extends SingleRowStrColumn {
    public RequestedCoeditorName(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public RequestedCoeditorName(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public RequestedCoeditorName(String name) {
        super(name);
    }
}
