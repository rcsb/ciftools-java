package org.rcsb.cif.schema;

import org.rcsb.cif.schema.generated.mm.MmCifBuilder;
import org.rcsb.cif.schema.generated.mm.MmCifFile;

public class StandardSchemas {
//    BIRD(),
//    CCD(),
//    CIF_CORE(),
    public static final SchemaProvider<MmCifFile, MmCifBuilder> MMCIF = new MmCifSchemaProvider();
}
