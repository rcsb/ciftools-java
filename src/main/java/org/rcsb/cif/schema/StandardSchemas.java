package org.rcsb.cif.schema;

import org.rcsb.cif.schema.core.CifCoreFileBuilder;
import org.rcsb.cif.schema.core.CifCoreFile;
import org.rcsb.cif.schema.mm.MmCifFileBuilder;
import org.rcsb.cif.schema.mm.MmCifFile;

public class StandardSchemas {
//    BIRD(),
//    CCD(),
    public static final SchemaProvider<CifCoreFile, CifCoreFileBuilder> CIF_CORE = new CifCoreSchemaProvider();
    public static final SchemaProvider<MmCifFile, MmCifFileBuilder> MMCIF = new MmCifSchemaProvider();
}
