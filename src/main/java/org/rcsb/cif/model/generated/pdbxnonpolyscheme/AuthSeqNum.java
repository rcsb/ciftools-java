package org.rcsb.cif.model.generated.pdbxnonpolyscheme;

import org.rcsb.cif.model.*;

import java.util.Map;

public class AuthSeqNum extends StrColumn {
    public AuthSeqNum(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public AuthSeqNum(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public AuthSeqNum(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
