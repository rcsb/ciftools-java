package org.rcsb.cif.model.generated.structconn;

import org.rcsb.cif.model.*;

import java.util.Map;

public class Ptnr2LabelSeqId extends IntColumn {
    public Ptnr2LabelSeqId(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public Ptnr2LabelSeqId(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public Ptnr2LabelSeqId(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
