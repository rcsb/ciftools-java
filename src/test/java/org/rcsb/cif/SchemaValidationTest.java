package org.rcsb.cif;

import org.junit.jupiter.api.Test;
import org.rcsb.cif.schema.StandardSchemata;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class SchemaValidationTest {
    @Test
    public void shouldPassForMmCifFileWithMmCifSchema() throws IOException {
        CifIO.readFromInputStream(TestHelper.getInputStream("cif/1acj.cif"))
                .as(StandardSchemata.MMCIF)
                .getFirstBlock()
                .getCell()
                .getLengthA()
                .get(0);
    }

    @Test
    public void shouldPassForCifCoreFileWithCifCoreSchema() throws IOException {
        CifIO.readFromInputStream(TestHelper.getInputStream("non-mmcif/867861-core.cif"))
                .as(StandardSchemata.CIF_CORE)
                .getFirstBlock()
                .getCell()
                .getLengthA()
                .get(0);
    }

    @Test
    public void shouldFailForMmCifFileWithCifCoreSchema() {
        assertThrows(SchemaMismatchException.class, () -> {
            try {
                CifIO.readFromInputStream(TestHelper.getInputStream("cif/1acj.cif"))
                        .as(StandardSchemata.CIF_CORE)
                        .getFirstBlock()
                        .getCell()
                        .getLengthA()
                        .get(0);
            } catch (SchemaMismatchException e) {
                System.out.println("observed exception as expected: " + e);
                throw e;
            }
        });
    }

    @Test
    public void shouldFailForCifCoreFileWithMmCifSchema() {
        assertThrows(SchemaMismatchException.class, () -> {
            try {
                CifIO.readFromInputStream(TestHelper.getInputStream("non-mmcif/867861-core.cif"))
                        .as(StandardSchemata.MMCIF)
                        .getFirstBlock()
                        .getCell()
                        .getLengthA()
                        .get(0);
            } catch (SchemaMismatchException e) {
                System.out.println("observed exception as expected: " + e);
                throw e;
            }
        });
    }

    @Test
    public void shouldFailForMmCifFileWithCifCoreSchemaWithoutValidationWhenEmptyColumnIsAccessed() {
        assertThrows(EmptyColumnException.class, () -> {
            try {
                CifIO.readFromInputStream(TestHelper.getInputStream("cif/1acj.cif"))
                        .asButWithoutValidation(StandardSchemata.CIF_CORE)
                        .getFirstBlock()
                        .getCell()
                        .getLengthA()
                        .get(0);
            } catch (EmptyColumnException e) {
                System.out.println("observed exception as expected: " + e);
                throw e;
            }
        });
    }

    @Test
    public void shouldFailForCifCoreFileWithMmCifSchemaWithoutValidationWhenEmptyColumnIsAccessed() {
        assertThrows(EmptyColumnException.class, () -> {
            try {
                CifIO.readFromInputStream(TestHelper.getInputStream("non-mmcif/867861-core.cif"))
                        .asButWithoutValidation(StandardSchemata.MMCIF)
                        .getFirstBlock()
                        .getCell()
                        .getLengthA()
                        .get(0);
            } catch (EmptyColumnException e) {
                System.out.println("observed exception as expected: " + e);
                throw e;
            }
        });
    }
}
