package org.rcsb.cif.s;

import org.rcsb.cif.s.mm.MmCifBlock;
import org.rcsb.cif.s.mm.MmCifSchemaProvider;

public enum StandardSchemas {
//    BIRD(),
//    CCD(),
//    CIF_CORE(),
    MMCIF(new MmCifSchemaProvider());

    private final SchemaProvider<MmCifBlock> schemaProvider;

    StandardSchemas(SchemaProvider<MmCifBlock> schemaProvider) {
        this.schemaProvider = schemaProvider;
    }
}
