package org.rcsb.cif;

import org.junit.Test;
import org.rcsb.cif.model.CifBlock;
import org.rcsb.cif.model.CifCategory;
import org.rcsb.cif.model.CifField;
import org.rcsb.cif.model.CifFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.rcsb.cif.TestHelper.ERROR_MARGIN;
import static org.rcsb.cif.TestHelper.TEST_CASES;

public class CifReaderTest {
    @Test
    public void parse3j3q() throws IOException, ParsingException {
        InputStream inputStream = TestHelper.getInputStream("bcif/3j3q.bcif");
        CifReader.parseBinary(inputStream);
    }

    @Test
    public void parseBinary() throws IOException, ParsingException {
        for (Map.Entry<String, List<Object>> testCase : TEST_CASES.entrySet()) {
            System.out.println("test cases: " + testCase.getKey() + " - binary parsing");
            InputStream inputStream = TestHelper.getInputStream("bcif/" + testCase.getKey() + ".bcif");
            checkParsedEntity(CifReader.parseBinary(inputStream), testCase.getValue());
        }
    }

    @Test
    public void parseText() throws ParsingException, IOException {
        for (Map.Entry<String, List<Object>> testCase : TEST_CASES.entrySet()) {
            System.out.println("test cases: " + testCase.getKey() + " - text parsing");
            InputStream inputStream = TestHelper.getInputStream("cif/" + testCase.getKey() + ".cif");
            checkParsedEntity(CifReader.parseText(inputStream), testCase.getValue());
        }
    }

    private void checkParsedEntity(CifFile cifFile, List<Object> testData) throws ParsingException {
        CifBlock data = cifFile.getBlocks().get(0);
        CifCategory _atom_site = data.getCategory("atom_site");
        double firstCoordinate = _atom_site.getField("Cartn_x").getFloat(0);
        assertEquals("coordinate parsing corrupted", (double) testData.get(0), firstCoordinate, ERROR_MARGIN);

        // the last residue sequence id
        CifField label_seq_id = _atom_site.getField("label_seq_id");
        label_seq_id.ints().max().ifPresent(i -> assertEquals("sequence id parsing corrupted", (int) testData.get(1), i));

        String stringValue = data.getCategory("entry").getField("id").getString(0);
        assertEquals("id parsing corrupted", testData.get(2), stringValue);
    }

    @Test(expected = ParsingException.class)
    public void shouldReportExceptionForEmptyBinaryFile() throws ParsingException, IOException {
        CifReader.parseBinary(TestHelper.getInputStream("bcif/0emp.bcif"));
    }

    @Test(expected = ParsingException.class)
    public void shouldReportExceptionForWrongBinaryContent() throws ParsingException, IOException {
        CifReader.parseBinary(TestHelper.getInputStream("cif/1acj.cif"));
    }

    @Test(expected = ParsingException.class)
    public void shouldReportExceptionForEmptyTextFile() throws ParsingException, IOException {
        CifReader.parseText(TestHelper.getInputStream("cif/0emp.cif"));
    }

    @Test(expected = ParsingException.class)
    public void shouldReportExceptionForWrongTextContent() throws ParsingException, IOException {
        CifReader.parseText(TestHelper.getInputStream("bcif/1acj.bcif"));
    }
}