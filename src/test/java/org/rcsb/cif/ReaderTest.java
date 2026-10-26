package org.rcsb.cif;

import org.junit.jupiter.api.Test;
import org.rcsb.cif.binary.codec.MessagePackCodec;
import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.model.FloatColumn;
import org.rcsb.cif.model.IntColumn;
import org.rcsb.cif.schema.StandardSchemata;
import org.rcsb.cif.schema.mm.AtomSite;
import org.rcsb.cif.schema.mm.MmCifBlock;
import org.rcsb.cif.schema.mm.MmCifFile;
import org.rcsb.cif.text.TextCifReader;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
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
        String id = "AF-Q76EI6-F1-model_v6";
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
        String id = "AF-O49373-F1-model_v4"; // this is a quirk in the v4 files only
        InputStream inputStream = TestHelper.getInputStream("cif/" + id + ".cif");
        MmCifFile cifFile = CifIO.readFromInputStream(inputStream).as(StandardSchemata.MMCIF);

        String gene = cifFile.getFirstBlock().getMaTargetRefDbDetails().getGeneName().get(0);
        assertEquals("''cytochrome P450", gene, "Gene name with additional quotes not parsed correctly");
    }

    @Test
    void whenReadingBinaryColumnWithTypeMismatch_thenPerformanceNotDegrading() throws IOException {
        String id = "9a2f";
        InputStream inputStream = TestHelper.getInputStream("bcif/" + id + ".bcif.gz");
        AtomSite atomSite = CifIO.readFromInputStream(inputStream).as(StandardSchemata.MMCIF).getFirstBlock().getAtomSite();

        // schema type is float but data is internally encoded as int -- assert that this doesn't degrade performance when accessing values one-by-one
        FloatColumn bIsoOrEquiv = atomSite.getBIsoOrEquiv();

        long start = System.nanoTime();
        double sum = 0.0;
        for (int i = 0; i < bIsoOrEquiv.getRowCount(); i++) {
            // invokes `getArray()`, which used to convert the internal array representation again and again if types diverged
            sum += bIsoOrEquiv.get(i);
        }
        assertEquals(0.0, sum);
        long end = System.nanoTime();
        long delta_ms = (end - start) / 1_000_000;
        assertTrue(delta_ms < 250, "Access to  took " + delta_ms + " ms and we deem that too slow");
    }

    @Test
    void whenReadingTextWithByteOrderMark_thenBomIsSkipped() throws IOException {
        byte[] bom = { (byte) 0xEF, (byte) 0xBB, (byte) 0xBF };
        byte[] text = "data_x\n_a.b 1\n".getBytes(StandardCharsets.UTF_8);
        byte[] bytes = new byte[bom.length + text.length];
        System.arraycopy(bom, 0, bytes, 0, bom.length);
        System.arraycopy(text, 0, bytes, bom.length, text.length);

        CifFile fromStream = CifIO.readFromInputStream(new ByteArrayInputStream(bytes));
        CifFile fromText = new TextCifReader(CifOptions.builder().build()).readText("﻿data_x\n_a.b 1\n");

        for (CifFile cifFile : List.of(fromStream, fromText)) {
            assertEquals("x", cifFile.getBlocks().get(0).getBlockHeader());
            assertEquals("1", cifFile.getBlocks().get(0).getCategory("a").getColumn("b").getStringData(0));
        }
        assertThrows(ParsingException.class, () -> new TextCifReader(CifOptions.builder().build()).readText("﻿"));
    }

    @Test
    void whenReadingUtf8Text_thenValuesAreDecodedAsUtf8() throws IOException {
        byte[] bytes = "data_x\n_a.b 'Müller'\n".getBytes(StandardCharsets.UTF_8);

        CifFile cifFile = CifIO.readFromInputStream(new ByteArrayInputStream(bytes));

        assertEquals("Müller", cifFile.getBlocks().get(0).getCategory("a").getColumn("b").getStringData(0));
    }

    @Test
    void whenLoopValueCountIsNotAMultipleOfColumnCount_thenParsingExceptionWithLine() {
        TextCifReader reader = new TextCifReader(CifOptions.builder().build());

        ParsingException e = assertThrows(ParsingException.class, () -> reader.readText("data_x\nloop_\n_a.b\n_a.c\n1 2 3\n"));

        assertTrue(e.getMessage().contains("[2]"), e.getMessage());
    }

    @Test
    void whenLoopHasNoDataNames_thenParsingException() {
        TextCifReader reader = new TextCifReader(CifOptions.builder().build());

        assertThrows(ParsingException.class, () -> reader.readText("data_x\nloop_\n1 2\n"));
        assertThrows(ParsingException.class, () -> reader.readText("data_x\n_a.b 1\nloop_\n"));
    }

    @Test
    void whenTopLevelMapIsNotFixMap3_thenBinaryIsStillDetected() throws IOException {
        // other encoders may write more keys than 'encoder', 'version' and 'dataBlocks': 0x84 and map16 (0xde)
        for (int extraKeys : new int[] { 1, 13 }) {
            Map<String, Object> map = new LinkedHashMap<>(MessagePackCodec.decode(TestHelper.getInputStream("bcif/1pga.bcif")));
            for (int i = 0; i < extraKeys; i++) {
                map.put("extra" + i, i);
            }
            byte[] bytes = MessagePackCodec.encode(map);
            assertEquals(extraKeys == 1 ? 0x84 : 0xDE, bytes[0] & 0xFF);

            CifFile cifFile = CifIO.readFromInputStream(new ByteArrayInputStream(bytes));

            assertEquals("1PGA", cifFile.getBlocks().get(0).getCategory("entry").getColumn("id").getStringData(0));
        }
    }
}