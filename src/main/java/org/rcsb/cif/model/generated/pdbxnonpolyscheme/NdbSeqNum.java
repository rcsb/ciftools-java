package org.rcsb.cif.model.generated.pdbxnonpolyscheme;

import org.rcsb.cif.model.*;

import java.util.Map;

public class NdbSeqNum extends StrColumn {
    public NdbSeqNum(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public NdbSeqNum(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public NdbSeqNum(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
