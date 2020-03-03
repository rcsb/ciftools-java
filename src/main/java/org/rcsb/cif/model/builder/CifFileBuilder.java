package org.rcsb.cif.model.builder;

import org.rcsb.cif.model.Block;
import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.model.text.TextBlock;
import org.rcsb.cif.model.text.TextFile;
import org.rcsb.cif.schema.SchemaProvider;

import java.util.ArrayList;
import java.util.List;

public class CifFileBuilder {
    private final CifFile cifFile;
    private final List<Block> blocks;

    public CifFileBuilder() {
        this.blocks = new ArrayList<>();
        this.cifFile = new TextFile(blocks);
    }

    public BlockBuilder<CifFileBuilder> enterBlock(String blockHeader) {
        return new BlockBuilder<>(blockHeader, this);
    }

    @SuppressWarnings("unchecked")
    public <B extends CifFileBuilder> B digest(BlockBuilder<B> blockBuilder) {
        Block block = new TextBlock(blockBuilder.getCategories(), blockBuilder.getBlockHeader());
        blocks.add(block);
        return (B) this;
    }

    public CifFile leaveFile() {
        return build();
    }

    public CifFile build() {
        return cifFile;
    }

    public CifFileBuilder addBlock(Block block) {
        blocks.add(block);
        return this;
    }

    /**
     * Convenience method to access this file wrapped by a given schema.
     * @param schemaProvider the schema provider to enforce on this file
     * @param <F> the file type
     * @return this file, honoring a given schema
     */
    public <F extends CifFile, B extends CifFileBuilder> B with(SchemaProvider<F, B> schemaProvider) {
        return schemaProvider.handle(this);
    }
}
