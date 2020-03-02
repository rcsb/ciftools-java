package org.rcsb.cif.schema;

import org.rcsb.cif.schema.generated.core.CifCoreBuilder;
import org.rcsb.cif.schema.generated.core.CifCoreFile;
import org.rcsb.cif.schema.generated.mm.MmCifBuilder;
import org.rcsb.cif.schema.generated.mm.MmCifFile;

public class StandardSchemas {
//    BIRD(),
//    CCD(),
    public static final SchemaProvider<CifCoreFile, CifCoreBuilder> CIF_CORE = new CifCoreSchemaProvider();
    public static final SchemaProvider<MmCifFile, MmCifBuilder> MMCIF = new MmCifSchemaProvider();
}
