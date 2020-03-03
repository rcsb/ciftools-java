package org.rcsb.cif.schema;

import org.rcsb.cif.schema.generated.core.CifCoreFileBuilder;
import org.rcsb.cif.schema.generated.core.CifCoreFile;
import org.rcsb.cif.schema.generated.mm.MmCifFileBuilder;
import org.rcsb.cif.schema.generated.mm.MmCifFile;

public class StandardSchemas {
//    BIRD(),
//    CCD(),
    public static final SchemaProvider<CifCoreFile, CifCoreFileBuilder> CIF_CORE = new CifCoreSchemaProvider();
    public static final SchemaProvider<MmCifFile, MmCifFileBuilder> MMCIF = new MmCifSchemaProvider();
}
