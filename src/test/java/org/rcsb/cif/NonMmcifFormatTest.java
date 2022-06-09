package org.rcsb.cif;

import org.junit.jupiter.api.Test;
import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.model.FloatColumn;
import org.rcsb.cif.schema.StandardSchemata;
import org.rcsb.cif.schema.core.Cell;
import org.rcsb.cif.schema.core.CifCoreBlock;
import org.rcsb.cif.schema.mm.ChemComp;
import org.rcsb.cif.schema.mm.ChemCompAtom;
import org.rcsb.cif.schema.mm.MmCifBlock;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class NonMmcifFormatTest {
    @Test
    void shouldHandleLigandCif() throws IOException {
        // read CIF describing ligand
        CifFile cifFile = CifIO.readFromInputStream(TestHelper.getInputStream("non-mmcif/atp.cif"));
        MmCifBlock firstBlock = cifFile.as(StandardSchemata.MMCIF).getFirstBlock();

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
    void shouldHandleCcdcFile() throws IOException {
        // read CIF describing ligand
        CifFile cifFile = CifIO.readFromInputStream(TestHelper.getInputStream("non-mmcif/867861-core.cif"));
        CifCoreBlock firstBlock = cifFile.as(StandardSchemata.CIF_CORE).getFirstBlock();

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
        assertEquals(2012, firstBlock.getCitation().getYear().get(0));

        // a 'number'
        assertEquals("11.0829(8)", firstBlock.getColumn("cell_length_a").getStringData(0));
        // the interesting case: a column defined with import.get - should be float
        assertEquals(11.0829, firstBlock.getCell().getLengthA().get(0));
        assertEquals("1", firstBlock.getColumn("cell_formula_units_Z").getStringData(0));
        assertEquals(1, firstBlock.getCell().getFormulaUnitsZ().get(0));

        // tests for trivial category functions (rowCount, column map etc)
        assertEquals(12, firstBlock.getCell().getColumns().size());
        assertEquals(1, firstBlock.getCell().getRowCount());
        assertTrue(firstBlock.getCell().isDefined());
        // not present
        assertTrue(firstBlock.getAuditAuthor().getColumns().isEmpty());
        assertEquals(0, firstBlock.getAuditAuthor().getRowCount());
        assertFalse(firstBlock.getAuditAuthor().isDefined());
    }

    @Test
    void shouldSupportCifCoreAliases() throws IOException {
        // read CIF describing ligand
        CifFile cifFile = CifIO.readFromInputStream(TestHelper.getInputStream("non-mmcif/CBMZPN01.cif"));
        CifCoreBlock firstBlock = cifFile.as(StandardSchemata.CIF_CORE).getFirstBlock();

        assertAliases(firstBlock);

        CifCoreBlock secondBlock = CifBuilder.enterFile(StandardSchemata.CIF_CORE)
                .enterBlock("test")
                .enterSymmetry()
                .enterCellSetting()
                .add("monoclinic")
                .leaveColumn()
                .leaveCategory()
                .enterSymmetry()
                .enterSpaceGroupNameH_M()
                .add("P 21/c")
                .leaveColumn()
                .enterIntTablesNumber()
                .add(14)
                .leaveColumn()
                .leaveCategory()
                .leaveBlock()
                .leaveFile()
                .getFirstBlock();
        assertAliases(secondBlock);

        // ensure that aliased builder methods exist
        CifBuilder.enterFile(StandardSchemata.CIF_CORE)
                .enterBlock("")
                .enterSpaceGroup()
                .enterNameH_mFull()
                .leaveColumn()
                .enterItNumber()
                .leaveColumn()
                .leaveCategory()
                .leaveBlock()
                .leaveFile();
    }

    @Test
    void shouldRetrieveCellParamters() throws IOException {
        CifFile cifFile = CifIO.readFromInputStream(TestHelper.getInputStream("non-mmcif/CBMZPN01.cif"));
        CifCoreBlock firstBlock = cifFile.as(StandardSchemata.CIF_CORE).getFirstBlock();

        firstBlock.getCategories()
                .entrySet()
                .stream()
                .map(entry -> entry.getKey() + " " + entry.getValue().getRowCount())
                .forEach(System.out::println);

        Cell cell = firstBlock.getCell();
        assertEquals(cell.getLengthA().get(0), toDouble(firstBlock.getColumn("cell_length_a").getStringData(0)));
        assertEquals(cell.getLengthB().get(0), toDouble(firstBlock.getColumn("cell_length_b").getStringData(0)));
        assertEquals(cell.getLengthC().get(0), toDouble(firstBlock.getColumn("cell_length_c").getStringData(0)));
        assertEquals(cell.getAngleAlpha().get(0), toDouble(firstBlock.getColumn("cell_angle_alpha").getStringData(0)));
        assertEquals(cell.getAngleBeta().get(0), toDouble(firstBlock.getColumn("cell_angle_beta").getStringData(0)));
        assertEquals(cell.getAngleGamma().get(0), toDouble(firstBlock.getColumn("cell_angle_gamma").getStringData(0)));
    }

    private static double toDouble(String raw) {
        return FloatColumn.parseFloat(raw);
    }

    private void assertAliases(CifCoreBlock firstBlock) {
        /*
        _symmetry_cell_setting           monoclinic
        _symmetry_space_group_name_H-M   'P 21/c'
        _symmetry_Int_Tables_number      14
         */
        assertEquals("monoclinic", firstBlock.getSymmetry().getCellSetting().get(0));
        assertEquals("monoclinic", firstBlock.getSymmetry().getColumn("cell_setting").getStringData(0));

        assertEquals("P 21/c", firstBlock.getSpaceGroup().getNameH_mFull().get(0));
        assertEquals("P 21/c", firstBlock.getSymmetry().getSpaceGroupNameH_M().get(0));
        assertEquals("P 21/c", firstBlock.getSymmetry().getColumn("space_group_name_H-M").getStringData(0));

        assertEquals(14, firstBlock.getSpaceGroup().getItNumber().get(0));
        assertEquals(14, firstBlock.getSymmetry().getIntTablesNumber().get(0));
        assertEquals("14", firstBlock.getSymmetry().getColumn("Int_Tables_number").getStringData(0));
    }
}
