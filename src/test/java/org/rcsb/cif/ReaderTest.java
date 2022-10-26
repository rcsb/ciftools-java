package org.rcsb.cif;

import org.junit.jupiter.api.Test;
import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.model.IntColumn;
import org.rcsb.cif.schema.StandardSchemata;
import org.rcsb.cif.schema.mm.AtomSite;
import org.rcsb.cif.schema.mm.MmCifBlock;
import org.rcsb.cif.schema.mm.MmCifFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;

import static org.junit.jupiter.api.Assertions.*;
import static org.rcsb.cif.TestHelper.ERROR_MARGIN;
import static org.rcsb.cif.TestHelper.TEST_CASES;

class ReaderTest {
    @Test
    void testGzipReadingBehavior() throws IOException {
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
    void parseBinary() throws IOException, ParsingException {
        for (Map.Entry<String, List> testCase : TEST_CASES.entrySet()) {
            InputStream inputStream = TestHelper.getInputStream("bcif/" + testCase.getKey() + ".bcif");
            checkParsedEntity(CifIO.readFromInputStream(inputStream), testCase.getValue());
        }
    }

    @Test
    @SuppressWarnings("rawtypes")
    void parseText() throws ParsingException, IOException {
        for (Map.Entry<String, List> testCase : TEST_CASES.entrySet()) {
            InputStream inputStream = TestHelper.getInputStream("cif/" + testCase.getKey() + ".cif");
            checkParsedEntity(CifIO.readFromInputStream(inputStream), testCase.getValue());
        }
    }

    @SuppressWarnings("rawtypes")
    private void checkParsedEntity(CifFile cifFile, List testData) throws ParsingException {
        MmCifBlock data = cifFile.as(StandardSchemata.MMCIF).getFirstBlock();
        AtomSite _atom_site = data.getAtomSite();
        double firstCoordinate = _atom_site.getCartnX().get(0);
        assertEquals((double) testData.get(0), firstCoordinate, ERROR_MARGIN, "coordinate parsing corrupted");

        // the last residue sequence id
        IntColumn label_seq_id = _atom_site.getLabelSeqId();
        label_seq_id.values().max().ifPresent(i -> assertEquals((int) testData.get(1), i, "sequence id parsing corrupted"));

        String stringValue = data.getCategory("entry").getColumn("id").getStringData(0);
        assertEquals(testData.get(2), stringValue, "id parsing corrupted");
    }

    @Test
    void shouldReportExceptionForEmptyBinaryFile() throws ParsingException {
        InputStream inputStream = TestHelper.getInputStream("bcif/0emp.bcif");
        assertThrows(ParsingException.class, () -> CifIO.readFromInputStream(inputStream));
    }

    @Test
    void shouldReportExceptionForEmptyTextFile() throws ParsingException {
        InputStream inputStream = TestHelper.getInputStream("cif/0emp.cif");
        assertThrows(ParsingException.class, () -> CifIO.readFromInputStream(inputStream));
    }

    @Test
    void shouldHonorFileFormatAndFailWhenMismatching1() throws ParsingException {
        InputStream inputStream = TestHelper.getInputStream("bcif/1a2c.bcif");
        CifOptions options = CifOptions.builder().fileFormatHint(CifOptions.CifOptionsBuilder.FileFormat.BCIF_GZIPPED).build();
        assertThrows(ParsingException.class, () -> CifIO.readFromInputStream(inputStream, options));
    }

    @Test
    void shouldHonorFileFormatAndFailWhenMismatching2() throws ParsingException {
        InputStream inputStream = TestHelper.getInputStream("bcif/1a2c.bcif");
        CifOptions options = CifOptions.builder().fileFormatHint(CifOptions.CifOptionsBuilder.FileFormat.CIF_PLAIN).build();
        assertThrows(ParsingException.class, () -> CifIO.readFromInputStream(inputStream, options));
    }


    @Test
    void whenReadingAlphaFoldText_thenConfidenceScoresAvailable() throws IOException {
        String id = "AF-Q76EI6-F1-model_v4";
        InputStream inputStream = TestHelper.getInputStream("cif/" + id + ".cif");
        MmCifFile cifFile = CifIO.readFromInputStream(inputStream).as(StandardSchemata.MMCIF);

        OptionalDouble averageLocal = cifFile.getFirstBlock()
                .getMaQaMetricLocal()
                .getMetricValue()
                .values()
                .average();

        assertTrue(averageLocal.isPresent());
    }

    @Test
    void whenReadingStringWithEmptyQuotation_thenValueAvailable() throws IOException {
        String id = "AF-O49373-F1-model_v4";
        InputStream inputStream = TestHelper.getInputStream("cif/" + id + ".cif");
        MmCifFile cifFile = CifIO.readFromInputStream(inputStream).as(StandardSchemata.MMCIF);

        String gene = cifFile.getFirstBlock().getCategory("ma_target_ref_db_details").getColumn("gene_name").getStringData(0);
        assertEquals("''cytochrome P450", gene, "Gene name with additional quotes not parsed correctly");
    }
}