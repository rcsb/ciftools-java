package org.rcsb.cif;

import org.junit.Test;
import org.rcsb.cif.model.Block;
import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.model.IntColumn;
import org.rcsb.cif.model.generated.AtomSite;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.rcsb.cif.TestHelper.ERROR_MARGIN;
import static org.rcsb.cif.TestHelper.TEST_CASES;

public class ReaderTest {
    @Test
    public void parseBinary() throws IOException, ParsingException {
        for (Map.Entry<String, List<Object>> testCase : TEST_CASES.entrySet()) {
            System.out.println("test cases: " + testCase.getKey() + " - binary parsing");
            InputStream inputStream = TestHelper.getInputStream("bcif/" + testCase.getKey() + ".bcif");
            checkParsedEntity(CifReader.readBinary(inputStream), testCase.getValue());
        }
    }

    @Test
    public void parseText() throws ParsingException, IOException {
        for (Map.Entry<String, List<Object>> testCase : TEST_CASES.entrySet()) {
            System.out.println("test cases: " + testCase.getKey() + " - text parsing");
            InputStream inputStream = TestHelper.getInputStream("cif/" + testCase.getKey() + ".cif");
            checkParsedEntity(CifReader.readText(inputStream), testCase.getValue());
        }
    }

    private void checkParsedEntity(CifFile cifFile, List<Object> testData) throws ParsingException {
        Block data = cifFile.getFirstBlock();
        AtomSite _atom_site = data.getAtomSite();
        double firstCoordinate = _atom_site.getCartnX().get(0);
        assertEquals("coordinate parsing corrupted", (double) testData.get(0), firstCoordinate, ERROR_MARGIN);

        // the last residue sequence id
        IntColumn label_seq_id = _atom_site.getLabelSeqId();
        label_seq_id.values().max().ifPresent(i -> assertEquals("sequence id parsing corrupted", (int) testData.get(1), i));

        String stringValue = data.getEntry().getId().get(0);
        assertEquals("id parsing corrupted", testData.get(2), stringValue);
    }

    @Test(expected = ParsingException.class)
    public void shouldReportExceptionForEmptyBinaryFile() throws ParsingException, IOException {
        CifReader.readBinary(TestHelper.getInputStream("bcif/0emp.bcif"));
    }

    @Test(expected = ParsingException.class)
    public void shouldReportExceptionForWrongBinaryContent() throws ParsingException, IOException {
        CifReader.readBinary(TestHelper.getInputStream("cif/1acj.cif"));
    }

    @Test(expected = ParsingException.class)
    public void shouldReportExceptionForEmptyTextFile() throws ParsingException, IOException {
        CifReader.readText(TestHelper.getInputStream("cif/0emp.cif"));
    }

    @Test(expected = ParsingException.class)
    public void shouldReportExceptionForWrongTextContent() throws ParsingException, IOException {
        CifReader.readText(TestHelper.getInputStream("bcif/modelserver/1acj.bcif"));
    }
}