package org.rcsb.cif;

import org.junit.Test;
import org.rcsb.cif.model.BlockBuilder;
import org.rcsb.cif.model.Category;
import org.rcsb.cif.model.CategoryBuilder;
import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.model.CifFileBuilder;
import org.rcsb.cif.model.Column;
import org.rcsb.cif.model.FloatColumn;
import org.rcsb.cif.model.FloatColumnBuilder;
import org.rcsb.cif.model.IntColumn;
import org.rcsb.cif.model.IntColumnBuilder;
import org.rcsb.cif.model.builder.CategoryBuilderImpl;
import org.rcsb.cif.model.builder.CifFileBuilderImpl;
import org.rcsb.cif.model.builder.FloatColumnBuilderImpl;
import org.rcsb.cif.model.text.TextCategory;
import org.rcsb.cif.schema.StandardSchemas;
import org.rcsb.cif.schema.core.CifCoreBlock;
import org.rcsb.cif.schema.core.CifCoreFile;
import org.rcsb.cif.schema.mm.MmCifBlock;
import org.rcsb.cif.schema.mm.MmCifFile;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;
import java.util.regex.Pattern;

import static org.junit.Assert.*;
import static org.rcsb.cif.TestHelper.TEST_CASES;
import static org.rcsb.cif.TestHelper.assertEqualsIgnoringWhitespaces;

public class WriterTest {
    @Test
    public void testNumberFormatOfBuiltCifFile() throws IOException {
        CifFile cifFile = new CifFileBuilderImpl()
                .enterBlock("test")
                .enterCategory("atom_site")
                .enterFloatColumn("occupancy")
                .add(1, 2, 3.456789012345, 1 / 3.0 * 0.999999999999)
                .leaveColumn()
                .leaveCategory()
                .leaveBlock()
                .leaveFile();
        String output = new String(CifIO.writeText(cifFile));
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
                .forEach(number -> assertEquals(2, number.split("\\.")[1].length()));
    }

    @Test
    public void shouldReturnIntAndFloatColumn() throws IOException {
        // upon serialization int and double types were lost for built files
        CategoryBuilder<? extends BlockBuilder<? extends CifFileBuilder>, ? extends CifFileBuilder> categoryBuilder = CifBuilder.enterFile()
                .enterBlock("test")
                .enterCategory("test");

        IntColumnBuilder<? extends CategoryBuilder<? extends BlockBuilder<? extends CifFileBuilder>, ? extends CifFileBuilder>, ? extends BlockBuilder<? extends CifFileBuilder>, ? extends CifFileBuilder> ints = categoryBuilder.enterIntColumn("ints");
        FloatColumnBuilder<? extends CategoryBuilder<? extends BlockBuilder<? extends CifFileBuilder>, ? extends CifFileBuilder>, ? extends BlockBuilder<? extends CifFileBuilder>, ? extends CifFileBuilder> floats = categoryBuilder.enterFloatColumn("floats");

        ints.add(1, 2, 3);
        floats.add(-1.234, 3.1415, 42);

        CifFile cifFile = categoryBuilder.leaveCategory()
                .leaveBlock()
                .leaveFile();

        byte[] binary = CifIO.writeBinary(cifFile);
        byte[] text = CifIO.writeText(cifFile);

        CifFile binaryFile = CifIO.readFromInputStream(new ByteArrayInputStream(binary));
        CifFile textFile = CifIO.readFromInputStream(new ByteArrayInputStream(text));

        Category binaryCategory = binaryFile.getBlocks().get(0).getCategory("test");
        Category textCategory = textFile.getBlocks().get(0).getCategory("test");

        // binary data should have retained type
        IntColumn binaryIntColumn = (IntColumn) binaryCategory.getColumn("ints");
        FloatColumn binaryFloatColumn = (FloatColumn) binaryCategory.getColumn("floats");

        // in text impl we cant be sure without meta information that this is not string data
        Column textIntColumn = textCategory.getColumn("ints");
        Column textFloatColumn = textCategory.getColumn("floats");

        assertNotNull(binaryIntColumn);
        assertNotNull(binaryFloatColumn);
        assertNotNull(textIntColumn);
        assertNotNull(textFloatColumn);
    }

    @Test
    public void testClassInferenceOfBuiltMmCifFile() {
        MmCifFile cifFile = CifBuilder.enterFile(StandardSchemas.MMCIF)
                .enterBlock("test")
                .enterAtomSite()
                .enterBIsoOrEquiv()
                .add(1, 2, 3.456789012345, 1 / 3.0 * 0.999999999999)
                .leaveColumn()
                .leaveCategory()
                .leaveBlock()
                .leaveFile();
        MmCifBlock block = cifFile.getFirstBlock();
        assertTrue(block.getCategory("atom_site") instanceof org.rcsb.cif.schema.mm.AtomSite);
        assertTrue(block.getCategory("atom_site").getColumn("B_iso_or_equiv") instanceof FloatColumn);

        Category atom_site = new CategoryBuilderImpl<>("atom_site", null).build();
        assertTrue(atom_site instanceof TextCategory);

        FloatColumn cartnX = new FloatColumnBuilderImpl<>("atom_site", "Cartn_x", null).build();
        assertNotNull(cartnX);
    }

    @Test
    public void testClassInferenceOfBuiltCifCoreFile() {
        CifCoreFile cifFile = CifBuilder.enterFile(StandardSchemas.CIF_CORE)
                .enterBlock("test")
                .enterAtomSite()
                .enterBIsoOrEquiv()
                .add(1, 2, 3.456789012345, 1 / 3.0 * 0.999999999999)
                .leaveColumn()
                .leaveCategory()
                .leaveBlock()
                .leaveFile();
        CifCoreBlock block = cifFile.getFirstBlock();
        assertTrue(block.getCategory("atom_site") instanceof org.rcsb.cif.schema.core.AtomSite);
        // TODO fix this at builder level
        assertTrue(block.getCategory("atom_site").isDefined());
        assertTrue(block.getColumn("atom_site_B_iso_or_equiv").isDefined());
        assertTrue(block.getColumn("atom_site_B_iso_or_equiv") instanceof FloatColumn);

        Category atom_site = new CategoryBuilderImpl<>("atom_site", null).build();
        assertTrue(atom_site instanceof TextCategory);

        FloatColumn cartnX = new FloatColumnBuilderImpl<>("atom_site", "Cartn_x", null).build();
        assertNotNull(cartnX);
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
        CifFile text = CifIO.readFromInputStream(inputStream);

        // convert to cif
        String copy = new String(CifIO.writeText(text));

        assertEqualsIgnoringWhitespaces(original, copy);
    }

    @Test
    public void writeBinary() throws ParsingException, IOException {
        for (String id : TEST_CASES.keySet()) {
            writeBinary(id);
        }
    }

    private void writeBinary(String testCase) throws ParsingException, IOException {
        // a snapshot of the ciftools output is used - the implementation will not exactly recreate Mol* output
        // this test is to check if some code change breaks
        byte[] original = TestHelper.getBytes("snapshot/" + testCase + ".bcif");
        byte[] originalGzip = TestHelper.getBytes("snapshot/" + testCase + ".bcif.gz");

        // read from bcif
        InputStream inputStream = TestHelper.getInputStream("snapshot/" + testCase + ".bcif");
        CifFile binary = CifIO.readFromInputStream(inputStream);

        // convert to bcif
        byte[] output = CifIO.writeBinary(binary);
        byte[] outputGzip = CifIO.writeBinary(binary, CifOptions.builder().gzip(true).build());

        assertEquals("failed for " + testCase, new String(original), new String(output));
        assertEquals("failed (gzip) for " + testCase, new String(originalGzip), new String(outputGzip));

        // cannot match to David's bcif data as column types differ slightly
        assertArrayEquals("binary write output does not match snapshot of output - did the implementation change?" +
                " if so, update snapshot files in snapshot/", original, output);
        assertArrayEquals("binary write output does not match snapshot of output - did the implementation change?" +
                " if so, update snapshot files in snapshot/", originalGzip, outputGzip);
    }

    public static void main(String[] args) throws IOException {
        // run to update snapshot files
        for (String id : TEST_CASES.keySet()) {
            InputStream inputStream = TestHelper.getInputStream("cif/" + id + ".cif");
            CifFile data = CifIO.readFromInputStream(inputStream).with(StandardSchemas.MMCIF);

            CifOptions options = CifOptions.builder().build();
            CifOptions optionsGzip = CifOptions.builder().gzip(true).build();

            // convert to cif/bcif
            CifIO.writeText(data,
                    Paths.get("/Users/sebastian/snapshot/").resolve(id + ".cif"),
                    options);

            CifIO.writeText(data,
                    Paths.get("/Users/sebastian/snapshot/").resolve(id + ".cif.gz"),
                    optionsGzip);

            CifIO.writeBinary(data,
                    Paths.get("/Users/sebastian/snapshot/").resolve(id + ".bcif"),
                    options);

            CifIO.writeBinary(data,
                    Paths.get("/Users/sebastian/snapshot/").resolve(id + ".bcif.gz"),
                    optionsGzip);
        }
    }
}
