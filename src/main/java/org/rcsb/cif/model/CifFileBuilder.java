package org.rcsb.cif.model;

import org.rcsb.cif.schema.SchemaProvider;
import org.rcsb.cif.schema.StandardSchemata;

/**
 * The specification of a builder for generic {@link CifFile} instances.
 */
public interface CifFileBuilder {
    /**
     * Descend 1 level and enter a new Block.
     * @param blockHeader the name for this block (usually the structure ID)
     * @return a parent-aware builder instance at block level
     */
    BlockBuilder<? extends CifFileBuilder> enterBlock(String blockHeader);

    /**
     * Leave this builder instance. As this is the top-level and no parent exists, return the finished CifFile instance.
     * @return a CifFile instance
     */
    CifFile leaveFile();

    /**
     * Build the file described by this builder.
     * @return a CifFile instance
     */
    CifFile build();

    /**
     * Add a block to this builder.
     * @param block some block with data
     * @return this builder instance
     */
    CifFileBuilder addBlock(Block block);

    /**
     * A hook to make this instance aware of the data in all child nodes.
     * @param blockBuilder the child builder to digest
     */
    void digest(BlockBuilder<? extends CifFileBuilder> blockBuilder);

    /**
     * Specify a schema for this build operation.
     * @param schemaProvider the schema to use - see {@link StandardSchemata}
     * @param <F> the type of file that is being build
     * @param <B> the type of builder that does the work
     * @return a schema-aware builder instance
     */
    default <F extends CifFile, B extends CifFileBuilder> B as(SchemaProvider<F, B> schemaProvider) {
        return schemaProvider.createTypedBuilder();
    }
}
