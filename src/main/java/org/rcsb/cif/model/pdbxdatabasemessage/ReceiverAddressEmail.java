package org.rcsb.cif.model.pdbxdatabasemessage;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ReceiverAddressEmail extends StrColumn {
    public ReceiverAddressEmail(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public ReceiverAddressEmail(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public ReceiverAddressEmail(String name) {
        super(name);
    }
}
