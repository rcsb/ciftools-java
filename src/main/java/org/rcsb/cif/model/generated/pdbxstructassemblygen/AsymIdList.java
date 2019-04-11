package org.rcsb.cif.model.generated.pdbxstructassemblygen;

import org.rcsb.cif.model.*;

import java.util.Map;

public class AsymIdList extends ListColumn {
    public AsymIdList(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public AsymIdList(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public AsymIdList(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
