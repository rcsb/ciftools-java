package org.rcsb.cif.model;

import org.rcsb.cif.SchemaMismatchException;
import org.rcsb.cif.schema.SchemaProvider;

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
    List<? extends Block> getBlocks();

    /**
     * Convenience method to access all blocks as Stream.
     * @return a Stream of all blocks
     */
    default Stream<? extends Block> blocks() {
        return getBlocks().stream();
    }

    /**
     * Convenience method to access this file wrapped by a given schema.
     * @param schemaProvider the schema provider to enforce on this file
     * @param <F> the file type
     * @param <B> the builder type
     * @return this file, honoring a given schema
     * @throws SchemaMismatchException if schema is mismatching
     */
    default <F extends CifFile, B extends CifFileBuilder> F as(SchemaProvider<F, B> schemaProvider) throws SchemaMismatchException {
        schemaProvider.validate(this);
        return asButWithoutValidation(schemaProvider);
    }

    /**
     * Convenience method to access this file wrapped by a given schema. Don't perform any checks whether the
     * {@link SchemaProvider} is appropriate for this file.
     * @param schemaProvider the schema provider to enforce on this file
     * @param <F> the file type
     * @param <B> the builder type
     * @return this file, honoring a given schema
     */
    default <F extends CifFile, B extends CifFileBuilder> F asButWithoutValidation(SchemaProvider<F, B> schemaProvider) throws SchemaMismatchException {
        return schemaProvider.createTypedFile(this);
    }
}
