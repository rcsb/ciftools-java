package org.rcsb.cif;

import org.junit.Test;
import org.rcsb.cif.model.Category;
import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.model.Column;
import org.rcsb.cif.model.FloatColumn;
import org.rcsb.cif.model.StrColumn;
import org.rcsb.cif.model.ValueKind;
import org.rcsb.cif.schema.DelegatingCategory;
import org.rcsb.cif.schema.StandardSchemata;
import org.rcsb.cif.schema.mm.AtomSite;
import org.rcsb.cif.schema.mm.AtomSites;
import org.rcsb.cif.schema.mm.Cell;
import org.rcsb.cif.schema.mm.MmCifBlock;
import org.rcsb.cif.schema.mm.MmCifFile;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;
import static org.rcsb.cif.TestHelper.TEST_CASES;
import static org.rcsb.cif.TestHelper.assertEqualsIgnoringWhitespaces;

/**
 * More complex tests for interactions between various parts of the code. Especially round-trip are used to assess the
 * fidelity of the implementation. For a Cif file encoding and subsequent decoding should arrive at the original file
 * content. For Bcif decoding and encoding should do the same.
 */
public class IntegrationTest {
    @Test
    public void testBinaryDataAccessBehavior() throws IOException {
        // load binary data - access is basically directly to array
        MmCifFile binaryCifFile = CifIO.readFromInputStream(TestHelper.getInputStream("bcif/1acj.bcif")).as(StandardSchemata.MMCIF);
        AtomSite binaryAtomSite = binaryCifFile.getFirstBlock().getAtomSite();
        FloatColumn binaryCartnX = binaryAtomSite.getCartnX();
        assertNotNull(binaryCartnX.getArray());

        // test for text conversion
        MmCifFile textCifFile = CifIO.readFromInputStream(TestHelper.getInputStream("cif/1acj.cif")).as(StandardSchemata.MMCIF);
        AtomSite textAtomSite = textCifFile.getFirstBlock().getAtomSite();
        FloatColumn textCartnX = textAtomSite.getCartnX();
        assertNotNull(textCartnX.getArray());

        // test for empty categories
        double[] binaryEmptyFloatArray = binaryAtomSite.getAnisoB11Esd().getArray();
        assertNull(binaryEmptyFloatArray);
        double[] textEmptyFloatArray = textAtomSite.getAnisoB11Esd().getArray();
        assertNull(textEmptyFloatArray);

        int[] binaryEmptyIntArray = binaryAtomSite.getChemicalConnNumber().getArray();
        assertNull(binaryEmptyIntArray);
        int[] textEmptyIntArray = textAtomSite.getChemicalConnNumber().getArray();
        assertNull(textEmptyIntArray);

        String[] binaryEmptyStrArray = binaryAtomSite.getWyckoffSymbol().getArray();
        assertNull(binaryEmptyStrArray);
        String[] textEmptyStrArray = textAtomSite.getWyckoffSymbol().getArray();
        assertNull(textEmptyStrArray);

        // behavior should be the same for generic files
        CifFile binaryCifFileGeneric = CifIO.readFromInputStream(TestHelper.getInputStream("bcif/1acj.bcif"));
        Category binaryAtomSiteGeneric = binaryCifFileGeneric.getBlocks().get(0).getCategory("atom_site");
        Column<?> binaryCartnXGeneric = binaryAtomSiteGeneric.getColumn("Cartn_x");
        assertNotNull(binaryCartnXGeneric.getArray());
        assertTrue(Array.getLength(binaryCartnXGeneric.getArray()) > 0);

        // test for text conversion
        CifFile textCifFileGeneric = CifIO.readFromInputStream(TestHelper.getInputStream("cif/1acj.cif"));
        Category textAtomSiteGeneric = textCifFileGeneric.getBlocks().get(0).getCategory("atom_site");
        Column<?> textCartnXGeneric = textAtomSiteGeneric.getColumn("Cartn_x");
        assertNotNull(textCartnXGeneric.getArray());
        assertTrue(Array.getLength(textCartnXGeneric.getArray()) > 0);

        // test for empty categories
        Object binaryEmptyFloatArrayGeneric = binaryAtomSiteGeneric.getColumn("aniso_B[1][1]_esd").getArray();
        assertNull(binaryEmptyFloatArrayGeneric);
        Object textEmptyFloatArrayGeneric = textAtomSiteGeneric.getColumn("aniso_B[1][1]_esd").getArray();
        assertNull(textEmptyFloatArrayGeneric);

        Object binaryEmptyIntArrayGeneric = binaryAtomSiteGeneric.getColumn("chemical_conn_number").getArray();
        assertNull(binaryEmptyIntArrayGeneric);
        Object textEmptyIntArrayGeneric = textAtomSiteGeneric.getColumn("chemical_conn_number").getArray();
        assertNull(textEmptyIntArrayGeneric);

        Object binaryEmptyStrArrayGeneric = binaryAtomSiteGeneric.getColumn("Wyckoff_symbol").getArray();
        assertNull(binaryEmptyStrArrayGeneric);
        Object textEmptyStrArrayGeneric = textAtomSiteGeneric.getColumn("Wyckoff_symbol").getArray();
        assertNull(textEmptyStrArrayGeneric);
    }

    @Test
    public void testDelegationBehavior() throws IOException {
        // blocks and categories should report typed categories and columns respectively
        MmCifFile textCifFile = CifIO.readFromInputStream(TestHelper.getInputStream("cif/1acj.cif")).as(StandardSchemata.MMCIF);
        textCifFile.getFirstBlock()
                .categories()
                .forEach(category -> assertTrue("no delegation for text after schema was imposed for " + category.getCategoryName(), category instanceof DelegatingCategory));

        MmCifFile binaryCifFile = CifIO.readFromInputStream(TestHelper.getInputStream("bcif/1acj.bcif")).as(StandardSchemata.MMCIF);
        binaryCifFile.getFirstBlock()
                .categories()
                .forEach(category -> assertTrue("no delegation for binary after schema was imposed for " + category.getCategoryName(), category instanceof DelegatingCategory));
    }

    @Test
    public void testBehaviorForEmptyFiles() throws IOException {
        CifFile cifFile = CifBuilder.enterFile()
                .enterBlock("test")
                .enterCategory("atom_site")
                .leaveCategory()
                .leaveBlock()
                .leaveFile();
        byte[] bytes = CifIO.writeBinary(cifFile);
        CifFile read = CifIO.readFromInputStream(new ByteArrayInputStream(bytes));

        assertEquals(0, read.getBlocks().get(0).getCategories().size());
    }

    @Test
    public void testVectorAndMatrixBehavior() throws IOException {
        CifFile textCifFile = CifIO.readFromInputStream(TestHelper.getInputStream("cif/1acj.cif"));
        testVectorAndMatrixBehavior(textCifFile);

        CifFile binaryCifFile = CifIO.readFromInputStream(TestHelper.getInputStream("bcif/1acj.bcif"));
        testVectorAndMatrixBehavior(binaryCifFile);
    }

    private void testVectorAndMatrixBehavior(CifFile cifFile) {
        AtomSites atomSites = cifFile.as(StandardSchemata.MMCIF).getFirstBlock().getAtomSites();

        assertDefined(atomSites.getFractTransfMatrix11());
        assertEquals(0.008795, atomSites.getFractTransfMatrix11().get(0), TestHelper.ERROR_MARGIN);
        assertDefined(atomSites.getFractTransfMatrix12());
        assertEquals(0.005078, atomSites.getFractTransfMatrix12().get(0), TestHelper.ERROR_MARGIN);
        assertDefined(atomSites.getFractTransfMatrix13());
        assertEquals(0.0, atomSites.getFractTransfMatrix13().get(0), TestHelper.ERROR_MARGIN);
        assertDefined(atomSites.getFractTransfMatrix21());
        assertEquals(0.0, atomSites.getFractTransfMatrix21().get(0), TestHelper.ERROR_MARGIN);
        assertDefined(atomSites.getFractTransfMatrix22());
        assertEquals(0.010156, atomSites.getFractTransfMatrix22().get(0), TestHelper.ERROR_MARGIN);
        assertDefined(atomSites.getFractTransfMatrix23());
        assertEquals(0.0, atomSites.getFractTransfMatrix23().get(0), TestHelper.ERROR_MARGIN);
        assertDefined(atomSites.getFractTransfMatrix31());
        assertEquals(0.0, atomSites.getFractTransfMatrix31().get(0), TestHelper.ERROR_MARGIN);
        assertDefined(atomSites.getFractTransfMatrix32());
        assertEquals(0.0, atomSites.getFractTransfMatrix32().get(0), TestHelper.ERROR_MARGIN);
        assertDefined(atomSites.getFractTransfMatrix33());
        assertEquals(0.007241, atomSites.getFractTransfMatrix33().get(0), TestHelper.ERROR_MARGIN);

        assertDefined(atomSites.getFractTransfVector1());
        assertEquals(0.0, atomSites.getFractTransfVector1().get(0), TestHelper.ERROR_MARGIN);
        assertDefined(atomSites.getFractTransfVector2());
        assertEquals(0.0, atomSites.getFractTransfVector2().get(0), TestHelper.ERROR_MARGIN);
        assertDefined(atomSites.getFractTransfVector3());
        assertEquals(0.0, atomSites.getFractTransfVector3().get(0), TestHelper.ERROR_MARGIN);
    }

    private void assertDefined(Column<?> column) {
        assertNotNull(column);
        assertTrue(column.isDefined());
        assertTrue(column.getRowCount() > 0);
    }

    @Test
    public void testUndefinedColumnBehavior() throws IOException {
        CifFile textCifFile = CifIO.readFromInputStream(TestHelper.getInputStream("cif/0red.cif"));
        testUndefinedColumnBehavior(textCifFile);

        CifFile binaryCifFile = CifIO.readFromInputStream(TestHelper.getInputStream("bcif/0red.bcif"));
        testUndefinedColumnBehavior(binaryCifFile);
    }

    private void testUndefinedColumnBehavior(CifFile cifFile) {
        MmCifBlock block = cifFile.as(StandardSchemata.MMCIF).getFirstBlock();
        assertNotNull("header is corrupted", block.getBlockHeader());

        assertTrue(block.getEntry().isDefined());

        String entryId = block.getEntry().getId().get(0);
        assertEquals("0RED", entryId);

        // atom site should be obtainable
        AtomSite atomSite = block.getAtomSite();
        // and return its name
        assertEquals("atom_site", atomSite.getCategoryName());
        // though not be present
        assertFalse(atomSite.isDefined());
        // report 0 rows
        assertEquals(0, atomSite.getRowCount());

        // columns still should be accessible
        FloatColumn cartnX = atomSite.getCartnX();
        assertEquals("Cartn_x", cartnX.getColumnName());
        assertEquals(0, cartnX.getRowCount());
        assertFalse(cartnX.isDefined());
        assertEquals(0, cartnX.values().count());
    }

    @Test
    public void testUnknownFeatureText() throws IOException {
        // read from cif
        InputStream inputStream = TestHelper.getInputStream("cif/1acj.cif");
        MmCifFile text = CifIO.readFromInputStream(inputStream).as(StandardSchemata.MMCIF);

        Cell cell = text.getFirstBlock().getCell();

        StrColumn pdbxUniqueAxis = cell.getPdbxUniqueAxis();

        assertEquals(ValueKind.UNKNOWN, pdbxUniqueAxis.getValueKind(0));
        assertEquals("", pdbxUniqueAxis.get(0));
    }

    @Test
    public void testNotPresentFeatureText() throws IOException {
        // read from cif
        InputStream inputStream = TestHelper.getInputStream("cif/1acj.cif");
        MmCifFile text = CifIO.readFromInputStream(inputStream).as(StandardSchemata.MMCIF);

        StrColumn labelAltId = text.getFirstBlock().getAtomSite().getLabelAltId();

        assertEquals(ValueKind.NOT_PRESENT, labelAltId.getValueKind(0));
        assertEquals("", labelAltId.get(0));
    }

    @Test
    public void testUnknownFeatureBinary() throws IOException {
        // read from cif
        InputStream inputStream = TestHelper.getInputStream("bcif/1acj.bcif");
        MmCifFile text = CifIO.readFromInputStream(inputStream).as(StandardSchemata.MMCIF);

        Cell cell = text.getFirstBlock().getCell();

        StrColumn pdbxUniqueAxis = cell.getPdbxUniqueAxis();

        assertEquals(ValueKind.UNKNOWN, pdbxUniqueAxis.getValueKind(0));
        assertEquals("", pdbxUniqueAxis.get(0));
    }

    @Test
    public void testNotPresentFeatureBinary() throws IOException {
        // read from cif
        InputStream inputStream = TestHelper.getInputStream("bcif/1acj.bcif");
        MmCifFile text = CifIO.readFromInputStream(inputStream).as(StandardSchemata.MMCIF);

        StrColumn labelAltId = text.getFirstBlock().getAtomSite().getLabelAltId();

        assertEquals(ValueKind.NOT_PRESENT, labelAltId.getValueKind(0));
        assertEquals("", labelAltId.get(0));
    }

    @Test
    public void roundTripViaBinary() throws IOException {
        // load cif file, encode as bcif, write as cif again - should roughly match original (number formatting will change)
        for (String id : TEST_CASES.keySet()) {
            roundTripViaBinary(id);
        }
    }

    private void roundTripViaBinary(String testCase) throws IOException {
        String originalContent = new String(TestHelper.getBytes("snapshot/" + testCase + ".cif"));
        CifFile originalFile = CifIO.readFromInputStream(TestHelper.getInputStream("snapshot/" + testCase + ".cif"));

        byte[] bcifBytes = CifIO.writeBinary(originalFile);

        CifFile bcifFile = CifIO.readFromInputStream(new ByteArrayInputStream(bcifBytes));

        byte[] copyBytes = CifIO.writeText(bcifFile);
        String copyContent = new String(copyBytes);

        assertEqualsIgnoringWhitespaces(originalContent, copyContent);
    }

    @Test
    public void readCifWriteBcif() throws IOException {
        for (String id : TEST_CASES.keySet()) {
            readCifWriteBcif(id);
        }
    }

    private void readCifWriteBcif(String testCase) throws IOException {
        byte[] original = TestHelper.getBytes("snapshot/" + testCase + ".bcif");
        CifFile originalFile = CifIO.readFromInputStream(TestHelper.getInputStream("cif/" + testCase + ".cif")).as(StandardSchemata.MMCIF);

        byte[] output = CifIO.writeBinary(originalFile);

        assertEquals(new String(original, StandardCharsets.UTF_8), new String(output, StandardCharsets.UTF_8));
        assertArrayEquals("binary write output does not match snapshot of output for " + testCase +
                " - did the implementation change? if so, update snapshot files in bcif/ciftools/", original, output);
    }

    @Test
    public void readBcifWriteCif() throws IOException {
        for (String id : TEST_CASES.keySet()) {
            readBcifWriteCif(id);
        }
    }

    private void readBcifWriteCif(String testCase) throws IOException {
        String originalContent = new String(TestHelper.getBytes("snapshot/" + testCase + ".cif"));
        MmCifFile originalFile = CifIO.readFromInputStream(TestHelper.getInputStream("snapshot/" + testCase + ".bcif")).as(StandardSchemata.MMCIF);

        String copyContent = new String(CifIO.writeText(originalFile));

        assertEqualsIgnoringWhitespaces(originalContent, copyContent);
    }
}
