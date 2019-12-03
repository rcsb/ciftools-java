package org.rcsb.cif;

import org.junit.Test;
import org.rcsb.cif.model.Block;
import org.rcsb.cif.model.Category;
import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.model.Column;
import org.rcsb.cif.model.FloatColumn;
import org.rcsb.cif.model.builder.CifBuilder;
import org.rcsb.cif.model.generated.AtomSite;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import static junit.framework.TestCase.assertEquals;

/**
 * CIF specification states that case does not matter. This test defines the behavior of the implementation: case should
 * not matter during category/column retrieval but it should be honored during file writing.
 */
public class CaseSensitivityTest {
    @Test
    public void shouldIgnoreReadCaseForBinaryFiles() throws IOException {
        InputStream inputStream = TestHelper.getInputStream("bcif/1acj.bcif");
        CifFile cifFile = CifIO.readFromInputStream(inputStream);

        assertRetrievalBehavior(cifFile);
    }

    @Test
    public void shouldIgnoreReadCaseForTextFiles() throws IOException {
        InputStream inputStream = TestHelper.getInputStream("bcif/1acj.bcif");
        CifFile cifFile = CifIO.readFromInputStream(inputStream);

        assertRetrievalBehavior(cifFile);
    }

    private void assertRetrievalBehavior(CifFile cifFile) {
        Block firstBlock = cifFile.getFirstBlock();

        AtomSite originalAtomSite = firstBlock.getAtomSite();
        Category atom_site = firstBlock.getCategory("atom_site");
        assertEquals("good luck if these do not match", originalAtomSite, atom_site);
        Category atom_Site = firstBlock.getCategory("atom_Site");
        assertEquals("case insensitivity not honored for categories", originalAtomSite, atom_Site);
        Category ATOM_SITE = firstBlock.getCategory("ATOM_SITE");
        assertEquals("case insensitivity not honored for categories", originalAtomSite, ATOM_SITE);

        FloatColumn originalCartnX = originalAtomSite.getCartnX();
        Column Cartn_x = atom_site.getColumn("Cartn_x");
        assertEquals("good luck if these do not match", originalCartnX, Cartn_x);
        Column cartn_x = atom_site.getColumn("cartn_x");
        assertEquals("case insensitivity not honored for categories", originalCartnX, cartn_x);
        Column CARTN_X = ATOM_SITE.getColumn("CARTN_X");
        assertEquals("case insensitivity not honored for categories", originalCartnX, CARTN_X);
    }

    @Test
    public void shouldPropagateCaseForBinaryFiles() throws IOException {
        CifFile cifFile = new CifBuilder()
                .enterBlock("TEST")
                .enterCategory("ATOM_SITE")
                .enterFloatColumn("cartn_x")
                .add(1, 2, 3, 4)
                .leaveColumn()
                .leaveCategory()
                .leaveBlock()
                .leaveFile();

        byte[] bytes = CifIO.writeBinary(cifFile);
        InputStream inputStream = new ByteArrayInputStream(bytes);

        CifFile readCifFile = CifIO.readFromInputStream(inputStream);
        assertRetrievalBehavior(readCifFile);
    }

    @Test
    public void shouldPropagateCaseForTextFiles() throws IOException {
        CifFile cifFile = new CifBuilder()
                .enterBlock("TEST")
                .enterCategory("ATOM_SITE")
                .enterFloatColumn("cartn_x")
                .add(1, 2, 3, 4)
                .leaveColumn()
                .leaveCategory()
                .leaveBlock()
                .leaveFile();

        byte[] bytes = CifIO.writeText(cifFile);
        InputStream inputStream = new ByteArrayInputStream(bytes);

        CifFile readCifFile = CifIO.readFromInputStream(inputStream);
        assertRetrievalBehavior(readCifFile);
    }

    @Test
    public void shouldReadTamperedFileCaseInsensitively() throws IOException {
        InputStream inputStream = TestHelper.getInputStream("cif/1acj-cases.cif");
        CifFile cifFile = CifIO.readFromInputStream(inputStream);

        assertRetrievalBehavior(cifFile);
    }
}
