package org.rcsb.cif;

import org.junit.Test;
import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.schema.StandardSchemas;
import org.rcsb.cif.schema.generated.core.CifCoreBlock;
import org.rcsb.cif.schema.generated.mm.ChemComp;
import org.rcsb.cif.schema.generated.mm.ChemCompAtom;
import org.rcsb.cif.schema.generated.mm.MmCifBlock;

import java.io.IOException;

import static junit.framework.TestCase.*;

public class NonMmcifFormatTest {
    @Test
    public void shouldHandleLigandCif() throws IOException {
        // read CIF describing ligand
        CifFile cifFile = CifIO.readFromInputStream(TestHelper.getInputStream("non-mmcif/atp.cif"));
        MmCifBlock firstBlock = cifFile.with(StandardSchemas.MMCIF).getFirstBlock();

        ChemComp chemComp = firstBlock.getChemComp();
        assertEquals("ADENOSINE-5'-TRIPHOSPHATE", chemComp.getName().get(0));
        assertEquals(507.181, chemComp.getFormulaWeight().get(0), TestHelper.ERROR_MARGIN);

        ChemCompAtom chemCompAtom = firstBlock.getChemCompAtom();
        assertEquals("PG", chemCompAtom.getAtomId().get(0));
        assertEquals(46.107, chemCompAtom.getModelCartnX().get(0));
        assertEquals(45.182, chemCompAtom.getModelCartnY().get(0));
        assertEquals(56.950, chemCompAtom.getModelCartnZ().get(0));
    }

    @Test
    public void shouldHandleCcdcFile() throws IOException {
        // read CIF describing ligand
        CifFile cifFile = CifIO.readFromInputStream(TestHelper.getInputStream("non-mmcif/867861-core.cif"));
        CifCoreBlock firstBlock = cifFile.with(StandardSchemas.CIF_CORE).getFirstBlock();

        // single
        assertEquals("10.5517/ccy42jn", firstBlock.getColumn("audit_block_doi").getStringData(0));
        assertEquals("10.5517/ccy42jn", firstBlock.getAudit().getBlockDoi().get(0));
        assertEquals("CCDC 867861", firstBlock.getColumn("database_code_depnum_ccdc_archive").getStringData(0));
        assertEquals("CCDC 867861", firstBlock.getDatabaseCode().getDepnumCcdcArchive().get(0));

        // loop
        assertEquals("1", firstBlock.getColumn("citation_id").getStringData(0));
        assertEquals("1", firstBlock.getCitation().getId().get(0));
        assertEquals("10.1002/chem.201202070", firstBlock.getColumn("citation_doi").getStringData(0));
        assertEquals("10.1002/chem.201202070", firstBlock.getCitation().getDoi().get(0));
        assertEquals("2012", firstBlock.getColumn("citation_year").getStringData(0));
        assertEquals("2012", firstBlock.getCitation().getYear().get(0));

        // a 'number'
        assertEquals("11.0829(8)", firstBlock.getColumn("cell_length_a").getStringData(0));
        assertEquals("11.0829(8)", firstBlock.getCell().getLengthA().get(0));
        assertEquals("1", firstBlock.getColumn("cell_formula_units_Z").getStringData(0));
        assertEquals("1", firstBlock.getCell().getFormulaUnitsZ().get(0));

        // tests for trivial category functions (rowCount, column map etc)
        assertEquals(12, firstBlock.getCell().getColumns().size());
        assertEquals(1, firstBlock.getCell().getRowCount());
        assertTrue(firstBlock.getCell().isDefined());
        // not present
        assertTrue(firstBlock.getAuditAuthor().getColumns().isEmpty());
        assertEquals(0, firstBlock.getAuditAuthor().getRowCount());
        assertFalse(firstBlock.getAuditAuthor().isDefined());
    }
}
