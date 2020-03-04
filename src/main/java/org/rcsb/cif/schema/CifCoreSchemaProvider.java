package org.rcsb.cif.schema;

import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.schema.core.CifCoreFile;
import org.rcsb.cif.schema.core.CifCoreFileBuilder;

/**
 * Provides schema support for cif-core files.
 */
public class CifCoreSchemaProvider implements SchemaProvider<CifCoreFile, CifCoreFileBuilder> {
    @Override
    public CifCoreFile createTypedFile(CifFile cifFile) {
        return new CifCoreFile(cifFile);
    }

    @Override
    public CifCoreFileBuilder createTypedBuilder() {
        return new CifCoreFileBuilder();
    }
}
