package org.rcsb.cif.schema;

import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.schema.generated.mm.MmCifFile;
import org.rcsb.cif.schema.generated.mm.MmCifFileBuilder;

public class MmCifSchemaProvider implements SchemaProvider<MmCifFile, MmCifFileBuilder> {
    @Override
    public MmCifFile handle(CifFile cifFile) {
        return new MmCifFile(cifFile);
    }

    @Override
    public MmCifFileBuilder handle() {
        return new MmCifFileBuilder();
    }
}
