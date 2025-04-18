package org.rcsb.cif.debugging;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.rcsb.cif.CifIO;
import org.rcsb.cif.model.Category;
import org.rcsb.cif.schema.StandardSchemata;
import org.rcsb.cif.schema.mm.MmCifBlock;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.fail;

class VerifyEncodingTest {
    @Test
    @Disabled("These tests are intended to be run manually on problematic files")
    void whenReadingFile_thenAllColumnsAccessible() throws IOException {
        Path path = Paths.get("/Users/sebastian/Downloads/py-bcif-converted/3j3q.bcif.gz");

        MmCifBlock block = CifIO.readFromPath(path).as(StandardSchemata.MMCIF).getFirstBlock();
        for (Category category : block.getCategories().values()) {
            for (String columnName : category.getColumnNames()) {
                String key = category.getCategoryName() + "." + columnName;

                try {
                    // touching any property of this column triggers decoding and verifies that all data is accessible
                    category.getColumn(columnName);
                } catch (ClassCastException e) {
                    fail("Decoding of '" + key + "' failed as the observed encoding violates the BinaryCIF definition", e);
                }
            }
        }
    }
}
