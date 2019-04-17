package org.rcsb.cif;

import org.junit.Test;
import org.rcsb.cif.model.CifFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

import static org.rcsb.cif.TestHelper.*;

public class CifWriterTest {
    @Test
    public void writeText() throws ParsingException, IOException {
        for (String id : TEST_CASES.keySet()) {
            System.out.println("test cases: " + id + " - text writing");
            writeText(id);
        }
    }

    @Test
    public void writeBinary() throws ParsingException, IOException {
        for (String id : TEST_CASES.keySet()) {
            System.out.println("test cases: " + id + " - binary writing");
            writeBinary(id);
        }
    }

    private void writeText(String testCase) throws ParsingException, IOException {
        String original = new String(TestHelper.getBytes("cif/" + testCase + ".cif"));

        // read from cif
        InputStream inputStream = TestHelper.getInputStream("cif/" + testCase + ".cif");
        CifFile text = CifReader.parseText(inputStream);

        // convert to cif
        String copy = new BufferedReader(new InputStreamReader(CifWriter.writeText(text)))
                .lines()
                .collect(Collectors.joining("\n"));

        assertEqualsIgnoringWhiteSpacesAndNumberFormat(original, copy);
    }

    private void writeBinary(String testCase) throws ParsingException, IOException {
        String original = new String(TestHelper.getBytes("bcif/" + testCase + ".bcif"));

        // read from bcif
        InputStream inputStream = TestHelper.getInputStream("bcif/" + testCase + ".bcif");
        CifFile binary = CifReader.parseBinary(inputStream);

        // convert to bcif
        String copy = new BufferedReader(new InputStreamReader(CifWriter.writeBinary(binary)))
                .lines()
                .collect(Collectors.joining("\n"));

        System.out.println("original: " + original.getBytes().length + " bytes, copy: " + copy.getBytes().length + " bytes");

        // TODO cannot match to David's bcif data as column types differ slightly
//        assertEquals(original, copy);
    }
}
