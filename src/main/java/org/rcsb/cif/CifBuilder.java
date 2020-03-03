package org.rcsb.cif;

import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.model.CifFileBuilder;
import org.rcsb.cif.model.builder.CifFileBuilderImpl;
import org.rcsb.cif.schema.SchemaProvider;

public class CifBuilder {
    public static CifFileBuilder enterFile() {
        return new CifFileBuilderImpl();
    }

    public static <F extends CifFile, B extends CifFileBuilder> B enterFile(SchemaProvider<F, B> schemaProvider) {
        return schemaProvider.handle();
    }
}
