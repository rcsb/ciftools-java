package org.rcsb.cif.schema;

import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.model.builder.CifBuilder;
import org.rcsb.cif.schema.generated.mm.MmCifBuilder;
import org.rcsb.cif.schema.generated.mm.MmCifFile;

public class MmCifSchemaProvider implements SchemaProvider<MmCifFile, MmCifBuilder> {
    @Override
    public MmCifFile handle(CifFile cifFile) {
        return new MmCifFile(cifFile);
    }

    @Override
    public MmCifBuilder handle(CifBuilder cifBuilder) {
        return new MmCifBuilder(cifBuilder);
    }
}
