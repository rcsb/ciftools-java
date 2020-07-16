package org.rcsb.cif.schema;

import org.rcsb.cif.SchemaMismatchException;
import org.rcsb.cif.model.Category;
import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.schema.core.CifCoreFile;
import org.rcsb.cif.schema.core.CifCoreFileBuilder;

/**
 * Provides schema support for cif-core files.
 */
public class CifCoreSchemaProvider implements SchemaProvider<CifCoreFile, CifCoreFileBuilder> {
    @Override
    public CifCoreFile createTypedFile(CifFile cifFile) {
        return new CifCoreFile(cifFile);
    }

    @Override
    public CifCoreFileBuilder createTypedBuilder() {
        return new CifCoreFileBuilder();
    }

    @Override
    public void validate(CifFile cifFile) throws SchemaMismatchException {
        // cif_core should contain columns with flat names
        boolean flatColumns = cifFile.getBlocks()
                .get(0)
                .getCategories()
                .values()
                .stream()
                .map(Category::getColumnNames)
                .allMatch(list -> list.size() == 1 && list.contains(""));
        if (!flatColumns) {
            throw new SchemaMismatchException("CIF_CORE schema should contain exclusively flat column names - format: category_name_column_name");
        }
    }
}
