package org.rcsb.cif;

import org.junit.Test;
import org.rcsb.cif.model.Block;
import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.model.generated.ChemComp;
import org.rcsb.cif.model.generated.ChemCompAtom;

import java.io.IOException;

import static junit.framework.TestCase.assertEquals;

public class NonMmcifFormatTest {
    @Test
    public void shouldHandleLigandCif() throws IOException {
        // read CIF describing ligand
        CifFile cifFile = CifIO.readFromInputStream(TestHelper.getInputStream("non-mmcif/atp.cif"));
        Block firstBlock = cifFile.getFirstBlock();

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
        Block firstBlock = cifFile.getFirstBlock();

        assertEquals("11.0829(8)", firstBlock.getColumn("cell_length_a").getStringData(0));
        assertEquals("11.0829(8)", firstBlock.getCell().getLengthA().get(0));
    }
}
