package org.rcsb.cif.schema;

import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.model.CifFileBuilder;
import org.rcsb.cif.schema.generated.core.CifCoreFile;
import org.rcsb.cif.schema.generated.core.CifCoreFileBuilder;

public class CifCoreSchemaProvider implements SchemaProvider<CifCoreFile, CifCoreFileBuilder> {
    @Override
    public CifCoreFile handle(CifFile cifFile) {
        return new CifCoreFile(cifFile);
    }

    @Override
    public CifCoreFileBuilder handle(CifFileBuilder cifBuilder) {
        return new CifCoreFileBuilder(cifBuilder);
    }
}
