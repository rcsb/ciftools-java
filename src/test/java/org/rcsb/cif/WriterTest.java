package org.rcsb.cif;

import org.junit.jupiter.api.Test;
import org.rcsb.cif.binary.codec.MessagePackCodec;
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
import org.rcsb.cif.model.builder.FloatColumnBuilderImpl;
import org.rcsb.cif.model.text.TextCategory;
import org.rcsb.cif.schema.StandardSchemata;
import org.rcsb.cif.schema.core.AtomSite;
import org.rcsb.cif.schema.core.CifCoreBlock;
import org.rcsb.cif.schema.core.CifCoreFile;
import org.rcsb.cif.schema.mm.MmCifBlock;
import org.rcsb.cif.schema.mm.MmCifFile;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;
import static org.rcsb.cif.TestHelper.TEST_CASES;
import static org.rcsb.cif.TestHelper.assertEqualsIgnoringQuotesAndDecimalZeros;

class WriterTest {
    @Test
    void testNumberFormatOfBuiltCifFile() throws IOException {
        CifFile cifFile = CifBuilder.enterFile()
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
    void shouldReturnIntAndFloatColumn() throws IOException {
        // upon serialization int and double types were lost for built files
        CategoryBuilder<? extends BlockBuilder<? extends CifFileBuilder>, ? extends CifFileBuilder> categoryBuilder = CifBuilder.enterFile()
                .enterBlock("test")
                .enterCategory("test");

        // zero regrets for these generics
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
        Column<?> textIntColumn = textCategory.getColumn("ints");
        Column<?> textFloatColumn = textCategory.getColumn("floats");

        assertNotNull(binaryIntColumn);
        assertNotNull(binaryFloatColumn);
        assertNotNull(textIntColumn);
        assertNotNull(textFloatColumn);
    }

    @Test
    void testClassInferenceOfBuiltMmCifFile() {
        MmCifFile cifFile = CifBuilder.enterFile(StandardSchemata.MMCIF)
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
    void testClassInferenceOfBuiltCifCoreFile() {
        CifCoreFile cifFile = CifBuilder.enterFile(StandardSchemata.CIF_CORE)
                .enterBlock("test")
                .enterAtomSite()
                .enterBIsoOrEquiv()
                .add(1, 2, 3.456789012345, 1 / 3.0 * 0.999999999999)
                .leaveColumn()
                .leaveCategory()
                .leaveBlock()
                .leaveFile();

        CifCoreBlock block = cifFile.getFirstBlock();

        FloatColumn columnBySchema = block.getAtomSite().getBIsoOrEquiv();
        assertTrue(columnBySchema.isDefined());
        Column<?> columnByName = block.getColumn("atom_site_B_iso_or_equiv");
        assertTrue(columnByName.isDefined());
        assertTrue(columnByName instanceof FloatColumn);

        AtomSite categoryBySchema = block.getAtomSite();
        assertTrue(categoryBySchema.isDefined());
        assertEquals(1, categoryBySchema.getColumns().size());
        // retrieval by name is supposed to fail
        Category categoryByName = block.getCategory("atom_site");
        assertFalse(categoryByName.isDefined());

        Category atom_site = new CategoryBuilderImpl<>("atom_site", null).build();
        assertTrue(atom_site instanceof TextCategory);

        FloatColumn cartnX = new FloatColumnBuilderImpl<>("atom_site", "Cartn_x", null).build();
        assertNotNull(cartnX);
    }

    @Test
    void writeText() throws ParsingException, IOException {
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

        assertEqualsIgnoringQuotesAndDecimalZeros(original, copy);
    }

    @Test
    void writeBinary() throws ParsingException, IOException {
        for (String id : TEST_CASES.keySet()) {
            writeBinary(id);
        }
    }

    private void writeBinary(String testCase) throws ParsingException, IOException {
        // a snapshot of the ciftools output is used - the implementation will not exactly recreate Mol* output
        // this test is to check if some code change breaks
        byte[] original = TestHelper.getBytes("snapshot/" + testCase + ".bcif");
        // create gzip on the fly so differences in gzip impl don't cause test failures on Java 17
        byte[] originalGzip = TestHelper.compress(original);

        // read from bcif
        InputStream inputStream = TestHelper.getInputStream("snapshot/" + testCase + ".bcif");
        CifFile binary = CifIO.readFromInputStream(inputStream);

        // convert to bcif
        byte[] output = CifIO.writeBinary(binary);
        byte[] outputGzip = CifIO.writeBinary(binary, CifOptions.builder().gzip(true).build());

        assertEquals(new String(original), new String(output), "failed for " + testCase);
        assertEquals(new String(originalGzip), new String(outputGzip), "failed (gzip) for " + testCase);

        // cannot match to David's bcif data as column types differ slightly
        assertArrayEquals(original, output, "binary write output does not match snapshot of output - did the implementation change?" +
                " if so, update snapshot files in snapshot/");
        assertArrayEquals(originalGzip, outputGzip, "binary write output does not match snapshot of output - did the implementation change?" +
                " if so, update snapshot files in snapshot/");
    }

    @Test
    @SuppressWarnings("unchecked")
    void shouldWriteNullMaskIfAllValuesPresent() throws IOException {
        CifFile cifFile = CifIO.readFromInputStream(TestHelper.getInputStream("cif/1a2c.cif"));
        byte[] bytes = CifIO.writeBinary(cifFile);
        Map<String, Object> message = MessagePackCodec.decode(new ByteArrayInputStream(bytes));
        Map<String, Object> block = (Map<String, Object>) ((Object[]) message.get("dataBlocks"))[0];
        Map<String, Object> atomSite = (Map<String, Object>) Arrays.stream((Object[]) block.get("categories")).map(Map.class::cast).filter(m -> m.get("name").equals("_atom_site")).findFirst().orElse(null);
        assertNotNull(atomSite);
        Map<String, Object> authAsymId = (Map<String, Object>) Arrays.stream((Object[]) atomSite.get("columns")).map(Map.class::cast).filter(m -> m.get("name").equals("auth_asym_id")).findFirst().orElse(null);
        assertNotNull(authAsymId);
        assertNull(authAsymId.get("mask"), "empty mask must be encoded by 'null' value");
    }

    @Test
    void testNonEnglishLocaleSupport() throws IOException {
        // set to some locale that has a different number format
        Locale.setDefault(Locale.FRANCE);

        MmCifFile cifFile = CifIO.readFromInputStream(TestHelper.getInputStream("cif/1a2c.cif"))
                .as(StandardSchemata.MMCIF);
        byte[] written = CifIO.writeText(cifFile);

        MmCifFile back = CifIO.readFromInputStream(new ByteArrayInputStream(written))
                .as(StandardSchemata.MMCIF);
        org.rcsb.cif.schema.mm.AtomSite atomSite = back.getFirstBlock().getAtomSite();
        assertEquals(18.623, atomSite.getCartnX().get(0));
        assertEquals(1.00, atomSite.getOccupancy().get(0));
        assertEquals(0.013895, back.getFirstBlock().getAtomSites().getFractTransfMatrix11().get(0));
    }

    @Test
    void whenReading5E_thenNotTreatedAsScientificNumber() throws IOException {
        // might treat the 5E in `TNT    refinement        5E ? 4 ` as scientific notation
        MmCifFile cifFile = CifIO.readFromInputStream(TestHelper.getInputStream("cif/1onx.cif"))
                .as(StandardSchemata.MMCIF);
        assertNotNull(CifIO.writeBinary(cifFile));
    }

    @Test
    void whenReadingChecksum_thenNotTreatedAsInt() throws IOException {
        // might treat the CRC64 in `_ma_target_ref_db_details.seq_db_sequence_checksum     0197355516942160` as int
        MmCifFile cifFile = CifIO.readFromInputStream(TestHelper.getInputStream("cif/AF-P41068-F1-model_v4.cif"))
                .as(StandardSchemata.MMCIF);
        assertEquals("0197355516942160", cifFile.getFirstBlock().getMaTargetRefDbDetails().getSeqDbSequenceChecksum().get(0));
        assertNotNull(CifIO.writeBinary(cifFile));
    }
}
