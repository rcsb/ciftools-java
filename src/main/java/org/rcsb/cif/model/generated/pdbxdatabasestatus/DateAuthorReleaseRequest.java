package org.rcsb.cif.model.generated.pdbxdatabasestatus;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class DateAuthorReleaseRequest extends SingleRowStrColumn {
    public DateAuthorReleaseRequest(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public DateAuthorReleaseRequest(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public DateAuthorReleaseRequest(String name) {
        super(name);
    }
}
