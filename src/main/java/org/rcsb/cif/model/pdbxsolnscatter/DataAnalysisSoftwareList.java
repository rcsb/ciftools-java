package org.rcsb.cif.model.pdbxsolnscatter;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class DataAnalysisSoftwareList extends StrColumn {
    public DataAnalysisSoftwareList(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public DataAnalysisSoftwareList(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public DataAnalysisSoftwareList(String name) {
        super(name);
    }
}
