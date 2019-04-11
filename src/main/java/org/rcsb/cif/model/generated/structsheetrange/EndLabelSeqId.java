package org.rcsb.cif.model.generated.structsheetrange;

import org.rcsb.cif.model.*;

import java.util.Map;

public class EndLabelSeqId extends IntColumn {
    public EndLabelSeqId(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public EndLabelSeqId(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public EndLabelSeqId(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
