package org.rcsb.cif;

import org.rcsb.cif.model.CifFileBuilder;
import org.rcsb.cif.model.builder.CifFileBuilderImpl;

public class CifBuilder {
    public static CifFileBuilder enterFile() {
        return new CifFileBuilderImpl();
    }
}
