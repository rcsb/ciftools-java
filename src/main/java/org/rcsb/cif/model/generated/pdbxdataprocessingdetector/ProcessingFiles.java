package org.rcsb.cif.model.generated.pdbxdataprocessingdetector;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ProcessingFiles extends StrColumn {
    public ProcessingFiles(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public ProcessingFiles(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public ProcessingFiles(String name) {
        super(name);
    }
}
