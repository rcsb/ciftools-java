package org.rcsb.cif.model;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 * The instance of a parsed CifFile. No difference between binary and text files is exposed. This class does not
 * represent a parsed data model. Rather all source data is neatly wrapped into a type-safe hierarchy of Block,
 * Category, and Column entities. Parsing (for text data) or decoding (for binary data) is only done, when the content
 * of particular categories or columns is requested. Otherwise the goal is to keep interaction with the source data to a
 * bare minimum: just enough to provide this view of the data model.
 *
 * CifFiles have the following hierarchy:
 * <ul>
 *  <li>1 CifFile contains 1...n Blocks</li>
 *  <li>1 Block contains 1...n Categories</li>
 *  <li>1 Category contains 1...n Columns</li>
 *  <li>1 Column contains 1...n rows of raw values (int, double, or String)</li>
 * </ul>
 *
 * Prominent Categories and Columns are provided in a type-safe manner based on the mmCIF dictionary. Missing categories
 * and columns will still be accessible, though the report being undefined and have a row count of 0. Most values in the
 * data structure will be available, but some are missing or unknown. This property of individual values is reported by
 * the ValueKind property of a Column.
 */
public interface CifFile {
    /**
     * Access to all blocks of this file.
     * @return a list of present blocks
     */
    List<Block> getBlocks();

    /**
     * Convenience method to access the first block.
     * @return the first block of this file
     */
    default Block getFirstBlock() {
        return getBlocks().get(0);
    }

    /**
     * Convenience method to access all blocks as Stream.
     * @return a Stream of all blocks
     */
    default Stream<Block> blocks() {
        return getBlocks().stream();
    }

    // TODO add generated schema to builder

    /**
     * Acquire a builder to create new CifFile instances.
     * @return a step-wise builder
     */
    static CifFileBuilder enterFile() {
        return new CifFileBuilder();
    }

    class CifFileBuilder {
        private final CifFile cifFile;
        private final List<Block> blocks;

        CifFileBuilder() {
            this.blocks = new ArrayList<>();
            this.cifFile = new TextFile(blocks);
        }

        public Block.BlockBuilder enterBlock(String blockName) {
            Map<String, Category> categories = new LinkedHashMap<>();
            Block block = new BaseBlock(categories, blockName);
            blocks.add(block);
            return Block.enterBlock(categories, this);
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
    }
}
