package org.rcsb.cif.schema;

import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.schema.mm.MmCifFile;
import org.rcsb.cif.schema.mm.MmCifFileBuilder;

/**
 * Provides schema support for mmCIF files.
 */
public class MmCifSchemaProvider implements SchemaProvider<MmCifFile, MmCifFileBuilder> {
    @Override
    public MmCifFile createTypedFile(CifFile cifFile) {
        return new MmCifFile(cifFile);
    }

    @Override
    public MmCifFileBuilder createTypedBuilder() {
        return new MmCifFileBuilder();
    }
}
