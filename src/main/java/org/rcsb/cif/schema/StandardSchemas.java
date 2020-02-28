package org.rcsb.cif.schema;

import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.schema.generated.mm.MmCifFile;

public class StandardSchemas<T extends CifFile> {
//    BIRD(),
//    CCD(),
//    CIF_CORE(),
    public static final SchemaProvider<MmCifFile> MMCIF = new MmCifSchemaProvider();
}
