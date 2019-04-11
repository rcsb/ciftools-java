package org.rcsb.cif.model.generated.structsitegen;

import org.rcsb.cif.model.*;

import java.util.Map;

public class AuthSeqId extends StrColumn {
    public AuthSeqId(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public AuthSeqId(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public AuthSeqId(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
