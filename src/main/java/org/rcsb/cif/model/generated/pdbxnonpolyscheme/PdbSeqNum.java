package org.rcsb.cif.model.generated.pdbxnonpolyscheme;

import org.rcsb.cif.model.*;

import java.util.Map;

public class PdbSeqNum extends StrColumn {
    public PdbSeqNum(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public PdbSeqNum(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public PdbSeqNum(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
