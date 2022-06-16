package org.rcsb.cif.schema;

import org.rcsb.cif.schema.core.CifCoreFileBuilder;
import org.rcsb.cif.schema.core.CifCoreFile;
import org.rcsb.cif.schema.mm.MmCifFileBuilder;
import org.rcsb.cif.schema.mm.MmCifFile;

/**
 * A collection of commonly used schemata (and their corresponding {@link SchemaProvider}).
 */
public class StandardSchemata {
    public static final SchemaProvider<CifCoreFile, CifCoreFileBuilder> CIF_CORE = new CifCoreSchemaProvider();
    public static final SchemaProvider<MmCifFile, MmCifFileBuilder> MMCIF = new MmCifSchemaProvider();

    private StandardSchemata() {
        // nothing here
    }
}
