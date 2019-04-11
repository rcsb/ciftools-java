package org.rcsb.cif.model.generated.structsite;

import org.rcsb.cif.model.*;

import java.util.Map;

public class PdbxNumResidues extends IntColumn {
    public PdbxNumResidues(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public PdbxNumResidues(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public PdbxNumResidues(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
