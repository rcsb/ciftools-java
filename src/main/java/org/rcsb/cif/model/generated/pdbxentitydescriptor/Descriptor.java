package org.rcsb.cif.model.generated.pdbxentitydescriptor;

import org.rcsb.cif.model.*;

import java.util.Map;

public class Descriptor extends StrColumn {
    public Descriptor(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public Descriptor(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public Descriptor(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
