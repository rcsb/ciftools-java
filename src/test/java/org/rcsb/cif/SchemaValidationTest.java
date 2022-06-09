package org.rcsb.cif;

import org.junit.jupiter.api.Test;
import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.model.FloatColumn;
import org.rcsb.cif.schema.StandardSchemata;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertThrows;

class SchemaValidationTest {
    @Test
    void shouldPassForMmCifFileWithMmCifSchema() throws IOException {
        CifIO.readFromInputStream(TestHelper.getInputStream("cif/1acj.cif"))
                .as(StandardSchemata.MMCIF)
                .getFirstBlock()
                .getCell()
                .getLengthA()
                .get(0);
    }

    @Test
    void shouldPassForCifCoreFileWithCifCoreSchema() throws IOException {
        CifIO.readFromInputStream(TestHelper.getInputStream("non-mmcif/867861-core.cif"))
                .as(StandardSchemata.CIF_CORE)
                .getFirstBlock()
                .getCell()
                .getLengthA()
                .get(0);
    }

    @Test
    void shouldFailForMmCifFileWithCifCoreSchema() throws IOException {
        CifFile cifFile = CifIO.readFromInputStream(TestHelper.getInputStream("cif/1acj.cif"));
        assertThrows(SchemaMismatchException.class, () -> {
            try {
                cifFile.as(StandardSchemata.CIF_CORE);
            } catch (SchemaMismatchException e) {
                System.out.println("observed exception as expected: " + e);
                throw e;
            }
        });
    }

    @Test
    void shouldFailForCifCoreFileWithMmCifSchema() throws IOException {
        CifFile cifFile = CifIO.readFromInputStream(TestHelper.getInputStream("non-mmcif/867861-core.cif"));
        assertThrows(SchemaMismatchException.class, () -> {
            try {
                cifFile.as(StandardSchemata.MMCIF);
            } catch (SchemaMismatchException e) {
                System.out.println("observed exception as expected: " + e);
                throw e;
            }
        });
    }

    @Test
    void shouldFailForMmCifFileWithCifCoreSchemaWithoutValidationWhenEmptyColumnIsAccessed() throws IOException {
        FloatColumn lengthA =  CifIO.readFromInputStream(TestHelper.getInputStream("cif/1acj.cif"))
                .asButWithoutValidation(StandardSchemata.CIF_CORE)
                .getFirstBlock()
                .getCell()
                .getLengthA();
        assertThrows(EmptyColumnException.class, () -> {
            try {
               lengthA.get(0);
            } catch (EmptyColumnException e) {
                System.out.println("observed exception as expected: " + e);
                throw e;
            }
        });
    }

    @Test
    void shouldFailForCifCoreFileWithMmCifSchemaWithoutValidationWhenEmptyColumnIsAccessed() throws IOException {
        FloatColumn lengthA = CifIO.readFromInputStream(TestHelper.getInputStream("non-mmcif/867861-core.cif"))
                .asButWithoutValidation(StandardSchemata.MMCIF)
                .getFirstBlock()
                .getCell()
                .getLengthA();
        assertThrows(EmptyColumnException.class, () -> {
            try {
                lengthA.get(0);
            } catch (EmptyColumnException e) {
                System.out.println("observed exception as expected: " + e);
                throw e;
            }
        });
    }
}
