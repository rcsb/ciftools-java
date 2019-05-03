package org.rcsb.cif;

import org.junit.Test;
import org.rcsb.cif.model.Category;
import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.model.Column;
import org.rcsb.cif.model.FloatColumn;
import org.rcsb.cif.model.builder.CategoryBuilder;
import org.rcsb.cif.model.builder.CifBuilder;
import org.rcsb.cif.model.builder.FloatColumnBuilder;
import org.rcsb.cif.model.generated.AtomSite;

import java.io.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static org.junit.Assert.*;
import static org.rcsb.cif.TestHelper.*;

public class WriterTest {
    @Test
    public void testNumberFormat() throws IOException {
        // read and write cif file
        InputStream inputStream = getInputStream("cif/1a2c.cif");
        CifFile cifFile = CifReader.readText(inputStream);
        String output = CifWriter.composeText(cifFile);

        Pattern.compile("\n")
                .splitAsStream(output)
                // look for atom site records
                .filter(line -> line.startsWith("ATOM"))
                .map(line -> line.split("\\s+"))
                .forEach(split -> {
                    // x, y, z have 3 decimal digits
                    assertEquals(3, split[10].split("\\.")[1].length());
                    assertEquals(3, split[11].split("\\.")[1].length());
                    assertEquals(3, split[12].split("\\.")[1].length());

                    // occupancy have 2
                    assertEquals(2, split[13].split("\\.")[1].length());

                    // bfactor have at max 6 (default behavior)
                    if (split[14].contains(".")) {
                        assertTrue(split[14].split("\\.")[1].length() <= 6);
                    }
                });
    }

    @Test
    public void testNumberFormatOfBuiltCifFile() {
        CifFile cifFile = new CifBuilder()
                .enterBlock("test")
                .enterCategory("atom_site")
                .enterFloatColumn("occupancy")
                .add(1, 2, 3.456789012345, 1 / 3.0 * 0.999999999999)
                .leaveColumn()
                .leaveCategory()
                .leaveBlock()
                .leaveFile();
        String output = CifWriter.composeText(cifFile);
        Pattern.compile("\n")
                .splitAsStream(output)
                .filter(line -> {
                    try {
                        Double.parseDouble(line);
                        return true;
                    } catch (NumberFormatException e) {
                        return false;
                    }
                })
                .map(String::trim)
                .forEach(number -> {
                    assertEquals(2, number.split("\\.")[1].length());
                });
    }

    @Test
    public void testClassInferenceOfBuiltCifFile() {
        CifFile cifFile = new CifBuilder()
                .enterBlock("test")
                .enterAtomSite()
                .enterBIsoOrEquiv()
                .add(1, 2, 3.456789012345, 1 / 3.0 * 0.999999999999)
                .leaveColumn()
                .leaveCategory()
                .leaveBlock()
                .leaveFile();
        assertTrue(cifFile.getFirstBlock().getCategory("atom_site") instanceof AtomSite);
        assertTrue(cifFile.getFirstBlock().getCategory("atom_site").getColumn("B_iso_or_equiv") instanceof FloatColumn);

        Category atom_site = new CategoryBuilder("atom_site", null)
                .build();
        assertTrue(atom_site instanceof AtomSite);

        Column cartnX = new FloatColumnBuilder<>("atom_site", "Cartn_x", null)
                .build();
        assertTrue(cartnX instanceof FloatColumn);
    }

    @Test
    public void writeText() throws ParsingException, IOException {
        for (String id : TEST_CASES.keySet()) {
            writeText(id);
        }
    }

    private void writeText(String testCase) throws ParsingException, IOException {
        String original = new String(TestHelper.getBytes("cif/" + testCase + ".cif"));

        // read from cif
        InputStream inputStream = TestHelper.getInputStream("cif/" + testCase + ".cif");
        CifFile text = CifReader.readText(inputStream);

        // convert to cif
        String copy = new BufferedReader(new InputStreamReader(CifWriter.writeText(text)))
                .lines()
                .collect(Collectors.joining("\n"));

        assertEqualsLoosely(original, copy);
    }

    @Test
    public void writeBinary() throws ParsingException, IOException {
        for (String id : TEST_CASES.keySet()) {
            writeBinary(id);
        }
    }

    @SuppressWarnings("Duplicates")
    private void writeBinary(String testCase) throws ParsingException, IOException {
        // a snapshot of the ciftools output is used - the implementation will not exactly recreate Mol* output
        // this test is to check if some code change breaks
        byte[] original = TestHelper.getBytes("bcif/ciftools/" + testCase + ".bcif");

        // read from bcif
        InputStream inputStream = TestHelper.getInputStream("bcif/molstar/" + testCase + ".bcif");
        CifFile binary = CifReader.readBinary(inputStream);

        // convert to bcif
        InputStream copy = CifWriter.writeBinary(binary);
        byte[] output = SharedIO.inputStreamToBytes(copy);

        // cannot match to David's bcif data as column types differ slightly
        assertArrayEquals("binary write output does not match snapshot of output - did the implementation change?" +
                " if so, update snapshot files in bcif/ciftools/", original, output);
    }
}
