package org.rcsb.cif.model.generated.structsheetrange;

import org.rcsb.cif.model.*;

import java.util.Map;

public class EndAuthSeqId extends IntColumn {
    public EndAuthSeqId(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public EndAuthSeqId(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public EndAuthSeqId(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
