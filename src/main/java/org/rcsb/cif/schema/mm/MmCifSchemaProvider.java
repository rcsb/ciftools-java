package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.Block;
import org.rcsb.cif.schema.SchemaProvider;
import org.rcsb.cif.schema.mm.generated.MmCifBlock;

public class MmCifSchemaProvider implements SchemaProvider<MmCifBlock> {
    @Override
    public MmCifBlock handle(Block block) {
        return new MmCifBlock(block);
    }
}
