package org.rcsb.cif.model;

import org.rcsb.cif.schema.SchemaProvider;
import org.rcsb.cif.schema.StandardSchemas;

import java.util.List;
import java.util.stream.Stream;

/**
 * <p>The instance of a parsed CifFile. No difference between binary and text files is exposed. This class does not
 * represent a parsed data model. Rather all source data is neatly wrapped into a type-safe hierarchy of {@link Block},
 * {@link Category}, and {@link Column} entities. Parsing (for text data) or decoding (for binary data) is only done,
 * when the content of particular categories or columns is requested. Otherwise the goal is to keep interaction with the
 * source data to a bare minimum: just enough to provide this view of the data model.</p>
 *
 * <p>CifFiles have the following hierarchy:</p>
 * <ul>
 *  <li>1 CifFile contains 1...n Blocks</li>
 *  <li>1 Block contains 1...n Categories</li>
 *  <li>1 Category contains 1...n Columns</li>
 *  <li>1 Column contains 1...n rows of raw values (int, double, or String)</li>
 * </ul>
 *
 * <p>Missing categories and columns will still be accessible, though the report being undefined and have a row count of
 * 0. Most values in the data structure will be available, but some are missing or unknown. This property of individual
 * values is reported by the {@link ValueKind} property of a {@link Column}.</p>
 */
public interface CifFile {
    /**
     * Access to all blocks of this file.
     * @return a list of present blocks
     */
    List<Block> getBlocks();

    @Deprecated
    default Block getFirstBlock() {
        return getBlocks().get(0);
    }

    /**
     * Convenience method to access the first block wrapped in a given schema.
     * @param schemaProvider the schema provider to enforce on this block
     * @param <B> the block type
     * @return the first block of this file, honoring a given schema
     */
    default <B extends Block> B getFirstBlock(SchemaProvider<B> schemaProvider) {
        return schemaProvider.handle(getBlocks().get(0));
    }

    /**
     * Convenience method to access the first block wrapped in a given schema.
     * @param schema the schema to enforce on this block
     * @param <B> the block type
     * @return the first block of this file, honoring a given schema
     */
    @SuppressWarnings("unchecked")
    default <B extends Block> B getFirstBlock(StandardSchemas schema) {
        return (B) getFirstBlock(schema.getSchemaProvider());
    }

    /**
     * Convenience method to access all blocks as Stream.
     * @return a Stream of all blocks
     */
    default Stream<Block> blocks() {
        return getBlocks().stream();
    }
}
