package org.rcsb.cif.schema;

import org.rcsb.cif.model.Block;

public interface SchemaProvider<B extends Block> {
    B handle(Block block);
}
