package org.rcsb.cif;

import org.junit.Test;
import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.model.IntColumn;
import org.rcsb.cif.schema.StandardSchemas;
import org.rcsb.cif.schema.mm.generated.AtomSite;
import org.rcsb.cif.schema.mm.generated.MmCifBlock;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.rcsb.cif.TestHelper.ERROR_MARGIN;
import static org.rcsb.cif.TestHelper.TEST_CASES;

public class ReaderTest {
    @Test
    public void testGzipReadingBehavior() throws IOException {
        // should recognize gzipped formats and decode them without specifying
        for (String id : TEST_CASES.keySet()) {
            testGzipReadingBehavior(id);
        }
    }

    private void testGzipReadingBehavior(String testCase) throws IOException {
        CifFile binaryGz = CifIO.readFromInputStream(TestHelper.getInputStream("bcif/" + testCase + ".bcif.gz"));
        assertEquals(testCase.toUpperCase(), binaryGz.getBlocks().get(0).getCategory("entry").getColumn("id").getStringData(0));

        CifFile binary = CifIO.readFromInputStream(TestHelper.getInputStream("bcif/" + testCase + ".bcif"));
        assertEquals(testCase.toUpperCase(), binary.getBlocks().get(0).getCategory("entry").getColumn("id").getStringData(0));

        CifFile textGz = CifIO.readFromInputStream(TestHelper.getInputStream("cif/" + testCase + ".cif.gz"));
        assertEquals(testCase.toUpperCase(), textGz.getBlocks().get(0).getCategory("entry").getColumn("id").getStringData(0));

        CifFile text = CifIO.readFromInputStream(TestHelper.getInputStream("cif/" + testCase + ".cif"));
        assertEquals(testCase.toUpperCase(), text.getBlocks().get(0).getCategory("entry").getColumn("id").getStringData(0));
    }

    @Test
    @SuppressWarnings("rawtypes")
    public void parseBinary() throws IOException, ParsingException {
        for (Map.Entry<String, List> testCase : TEST_CASES.entrySet()) {
            InputStream inputStream = TestHelper.getInputStream("bcif/" + testCase.getKey() + ".bcif");
            checkParsedEntity(CifIO.readFromInputStream(inputStream), testCase.getValue());
        }
    }

    @Test
    @SuppressWarnings("rawtypes")
    public void parseText() throws ParsingException, IOException {
        for (Map.Entry<String, List> testCase : TEST_CASES.entrySet()) {
            InputStream inputStream = TestHelper.getInputStream("cif/" + testCase.getKey() + ".cif");
            checkParsedEntity(CifIO.readFromInputStream(inputStream), testCase.getValue());
        }
    }

    @SuppressWarnings("rawtypes")
    private void checkParsedEntity(CifFile cifFile, List testData) throws ParsingException {
        MmCifBlock data = cifFile.getFirstBlock(StandardSchemas.MMCIF);
        AtomSite _atom_site = data.getAtomSite();
        double firstCoordinate = _atom_site.getCartnX().get(0);
        assertEquals("coordinate parsing corrupted", (double) testData.get(0), firstCoordinate, ERROR_MARGIN);

        // the last residue sequence id
        IntColumn label_seq_id = _atom_site.getLabelSeqId();
        label_seq_id.values().max().ifPresent(i -> assertEquals("sequence id parsing corrupted", (int) testData.get(1), i));

        String stringValue = data.getCategory("entry").getColumn("id").getStringData(0);
        assertEquals("id parsing corrupted", testData.get(2), stringValue);
    }

    @Test(expected = ParsingException.class)
    public void shouldReportExceptionForEmptyBinaryFile() throws ParsingException, IOException {
        CifIO.readFromInputStream(TestHelper.getInputStream("bcif/0emp.bcif"));
    }

    @Test(expected = ParsingException.class)
    public void shouldReportExceptionForEmptyTextFile() throws ParsingException, IOException {
        CifIO.readFromInputStream(TestHelper.getInputStream("cif/0emp.cif"));
    }

    @Test(expected = ParsingException.class)
    public void shouldHonorFileFormatAndFailWhenMismatching1() throws ParsingException, IOException {
        CifIO.readFromInputStream(TestHelper.getInputStream("bcif/1a2c.bcif"),
                CifOptions.builder().fileFormatHint(CifOptions.CifOptionsBuilder.FileFormat.BCIF_GZIPPED).build());
    }

    @Test(expected = ParsingException.class)
    public void shouldHonorFileFormatAndFailWhenMismatching2() throws ParsingException, IOException {
        CifIO.readFromInputStream(TestHelper.getInputStream("bcif/1a2c.bcif"),
                CifOptions.builder().fileFormatHint(CifOptions.CifOptionsBuilder.FileFormat.CIF_PLAIN).build());
    }
}