package org.rcsb.cif.schema;

import org.rcsb.cif.schema.mm.MmCifBlock;
import org.rcsb.cif.schema.mm.MmCifSchemaProvider;

public enum StandardSchemas {
//    BIRD(),
//    CCD(),
//    CIF_CORE(),
    MMCIF(new MmCifSchemaProvider());

    private final SchemaProvider<? extends MmCifBlock> schemaProvider;

    StandardSchemas(SchemaProvider<MmCifBlock> schemaProvider) {
        this.schemaProvider = schemaProvider;
    }

    public SchemaProvider<? extends MmCifBlock> getSchemaProvider() {
        return schemaProvider;
    }
}
