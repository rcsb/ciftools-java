package org.rcsb.cif.schema;

import org.rcsb.cif.model.Block;
import org.rcsb.cif.schema.generated.mm.MmCifBlock;

public class MmCifSchemaProvider implements SchemaProvider<MmCifBlock> {
    @Override
    public MmCifBlock handle(Block block) {
        return new MmCifBlock(block);
    }
}
