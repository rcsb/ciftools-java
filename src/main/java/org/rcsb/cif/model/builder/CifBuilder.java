package org.rcsb.cif.model.builder;

import org.rcsb.cif.model.Block;
import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.model.Column;
import org.rcsb.cif.model.text.TextBlock;
import org.rcsb.cif.model.text.TextFile;

import java.util.ArrayList;
import java.util.List;

/**
 * Allows the creation of CifFile instances which were not read from some InputStream.
 *
 * The builder follows a stepwise approach (i.e. the builder does not always return itself, but rather several
 * subclasses provide builder-functions relevant in a specific context). The implementation represents the hierarchy of
 * a CifFile (file - block - category - column - data) by a D3-like approach: <code>enter</code> is used to move to a
 * more fine-grained level of information (e.g. file to block), while leave does the opposite.
 *
 * By following this approach, all elements are aware of their parent and all parents can process information from their
 * children appropriately. It is also possible to create builder instances for categories or columns directly, however
 * they need to be added explicitly by functions like {@link CategoryBuilder#addColumn(Column)}.
 *
 * As for many parts of this library, absolutely no checks are performed - e.g. the number of rows in columns connected
 * by a category can be different which will cause all sorts of issues. However, it is up to the user to ensure data
 * integrity.
 */
public class CifBuilder {
    private final CifFile cifFile;
    private final List<Block> blocks;

    /**
     * Create a new builder instance.
     */
    public CifBuilder() {
        this.blocks = new ArrayList<>();
        this.cifFile = new TextFile(blocks);
    }

    /**
     * Dive into a block captured by this builder.
     * @param blockName the name of this block - usually the pdbId for protein structures
     * @return the BlockBuilder instance
     */
    public BlockBuilder enterBlock(String blockName) {
        return new BlockBuilder(blockName, this);
    }

    /**
     * Package-private function to add information of child builders.
     * @param blockBuilder the child builder to process
     * @return this CifBuilder instance
     */
    CifBuilder digest(BlockBuilder blockBuilder) {
        Block block = new TextBlock(blockBuilder.getCategories(), blockBuilder.getBlockName());
        blocks.add(block);
        return this;
    }

    /**
     * Process all stored information and release a {@link CifFile} instance. Equal to {@link CifBuilder#build()} for
     * this builder class.
     * @return the created CifFile
     */
    public CifFile leaveFile() {
        return build();
    }

    /**
     * Process all stored information and release a {@link CifFile} instance. Equal to {@link CifBuilder#leaveFile()}
     * for this builder class.
     * @return the created CifFile
     */
    public CifFile build() {
        return cifFile;
    }

    /**
     * Add an arbitrary block and make this builder aware of it.
     * @param block the block to add
     * @return this CifBuilder instance
     */
    public CifBuilder addBlock(Block block) {
        blocks.add(block);
        return this;
    }
}
