package org.rcsb.cif;

import org.junit.Test;
import org.rcsb.cif.model.Block;
import org.rcsb.cif.model.CifFile;

import java.io.IOException;

public class NonMmcifFormatTest {
    @Test
    public void shouldHandleLigandCif() throws IOException {
        // read CIF describing ligand
        CifFile cifFile = CifIO.readFromInputStream(TestHelper.getInputStream("non-mmcif/atp.cif"));
        Block firstBlock = cifFile.getFirstBlock();

        // TODO update
//        ChemComp chemComp = firstBlock.getChemComp();
//        assertEquals("ADENOSINE-5'-TRIPHOSPHATE", chemComp.getName().get(0));
//        assertEquals(507.181, chemComp.getFormulaWeight().get(0), TestHelper.ERROR_MARGIN);
//
//        ChemCompAtom chemCompAtom = firstBlock.getChemCompAtom();
//        assertEquals("PG", chemCompAtom.getAtomId().get(0));
//        assertEquals(46.107, chemCompAtom.getModelCartnX().get(0));
//        assertEquals(45.182, chemCompAtom.getModelCartnY().get(0));
//        assertEquals(56.950, chemCompAtom.getModelCartnZ().get(0));
    }

    @Test
    public void shouldHandleCcdcFile() throws IOException {
        // read CIF describing ligand
        CifFile cifFile = CifIO.readFromInputStream(TestHelper.getInputStream("non-mmcif/867861-core.cif"));
        Block firstBlock = cifFile.getFirstBlock();

        // TODO update
        // single
//        assertEquals("10.5517/ccy42jn", firstBlock.getColumn("audit_block_doi").getStringData(0));
////        assertEquals("10.5517/ccy42jn", firstBlock.getAudit().getColumn("block_doi").getStringData(0));
//        assertEquals("CCDC 867861", firstBlock.getColumn("database_code_depnum_ccdc_archive").getStringData(0));
////        assertEquals("CCDC 867861", firstBlock.getDatabase().getCodeDepnumCcdcArchive().get(0));
//
//        // loop
//        assertEquals("1", firstBlock.getColumn("citation_id").getStringData(0));
////        assertEquals("1", firstBlock.getCitation().getId().get(0));
//        assertEquals("10.1002/chem.201202070", firstBlock.getColumn("citation_doi").getStringData(0));
////        assertEquals("10.1002/chem.201202070", firstBlock.getCitation().getColumn("doi").getStringData(0));
//        assertEquals("2012", firstBlock.getColumn("citation_year").getStringData(0));
////        assertEquals(2012, firstBlock.getCitation().getYear().get(0));
//
//        // a 'number'
//        assertEquals("11.0829(8)", firstBlock.getColumn("cell_length_a").getStringData(0));
////        assertEquals(11.0829, firstBlock.getCell().getLengthA().get(0));
    }
}
