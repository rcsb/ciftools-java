package org.rcsb.cif.schema;

import org.rcsb.cif.SchemaMismatchException;
import org.rcsb.cif.model.Category;
import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.schema.mm.MmCifFile;
import org.rcsb.cif.schema.mm.MmCifFileBuilder;

/**
 * Provides schema support for mmCIF files.
 */
public class MmCifSchemaProvider implements SchemaProvider<MmCifFile, MmCifFileBuilder> {
    @Override
    public MmCifFile createTypedFile(CifFile cifFile) {
        return new MmCifFile(cifFile);
    }

    @Override
    public MmCifFileBuilder createTypedBuilder() {
        return new MmCifFileBuilder();
    }

    @Override
    public void validate(CifFile cifFile) throws SchemaMismatchException {
        // mmCIF should not contain any columns with flat names
        boolean flatColumns = cifFile.getBlocks()
                .get(0)
                .getCategories()
                .values()
                .stream()
                .map(Category::getColumnNames)
                .anyMatch(list -> list.size() == 1 && list.contains(""));
        if (flatColumns) {
            throw new SchemaMismatchException("MMCIF schema should not contain flat column names - format: category_name.column_name");
        }
    }
}
