package org.rcsb.cif.schema;

import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.model.CifFileBuilder;

/**
 * A SchemaProvides wraps {@link CifFile} and {@link CifFileBuilder} instances in their schema-aware subclass.
 * @param <F> the type of files returned
 * @param <B> the type of builder instances returned
 */
public interface SchemaProvider<F extends CifFile, B extends CifFileBuilder> {
    /**
     * Wrap a {@link CifFile} in a schema-supporting implementation of the data model.
     * @param cifFile the generic file
     * @return a schema-aware cif file instance
     */
    F createTypedFile(CifFile cifFile);

    /**
     * Create an instance of a schema-supporting builder.
     * @return a schema-aware builder instance
     */
    B createTypedBuilder();
}
