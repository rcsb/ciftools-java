package org.rcsb.cif.schema;

import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.schema.generated.mm.MmCifFile;

public class MmCifSchemaProvider implements SchemaProvider<MmCifFile> {
    @Override
    public MmCifFile handle(CifFile cifFile) {
        return new MmCifFile(cifFile);
    }
}
