package org.rcsb.cif.schema;

import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.model.builder.CifBuilder;
import org.rcsb.cif.schema.generated.core.CifCoreBuilder;
import org.rcsb.cif.schema.generated.core.CifCoreFile;

public class CifCoreSchemaProvider implements SchemaProvider<CifCoreFile, CifCoreBuilder> {
    @Override
    public CifCoreFile handle(CifFile cifFile) {
        return new CifCoreFile(cifFile);
    }

    @Override
    public CifCoreBuilder handle(CifBuilder cifBuilder) {
        return new CifCoreBuilder(cifBuilder);
    }
}
