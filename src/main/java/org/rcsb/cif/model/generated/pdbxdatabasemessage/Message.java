package org.rcsb.cif.model.generated.pdbxdatabasemessage;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Message extends StrColumn {
    public Message(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Message(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Message(String name) {
        super(name);
    }
}
