package org.rcsb.cif;

import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.model.CifFileBuilder;
import org.rcsb.cif.model.builder.CifFileBuilderImpl;
import org.rcsb.cif.schema.SchemaProvider;
import org.rcsb.cif.schema.StandardSchemata;

/**
 * The entry point to create {@link CifFile} instances programmatically.
 */
public class CifBuilder {
    private CifBuilder() {
        // nothing here
    }

    /**
     * Start a new file without providing any schema.
     * @return a generic builder instance
     */
    public static CifFileBuilder enterFile() {
        return new CifFileBuilderImpl();
    }

    /**
     * Start a new file with a specified schema.
     * @param schemaProvider a provider of the desired schema - see {@link StandardSchemata}
     * @param <F> the type of the file being created
     * @param <B> the type of the builder being used
     * @return a schema-aware builder instance
     */
    public static <F extends CifFile, B extends CifFileBuilder> B enterFile(SchemaProvider<F, B> schemaProvider) {
        return schemaProvider.createTypedBuilder();
    }
}
