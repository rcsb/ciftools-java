package org.rcsb.cif.binary;

import org.junit.jupiter.api.Test;
import org.rcsb.cif.CifBuilder;
import org.rcsb.cif.CifIO;
import org.rcsb.cif.CifOptions;
import org.rcsb.cif.EncodingStrategyHint;
import org.rcsb.cif.binary.codec.MessagePackCodec;
import org.rcsb.cif.model.Category;
import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.model.FloatColumn;
import org.rcsb.cif.model.StrColumn;
import org.rcsb.cif.text.TextCifReader;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class BinaryCifWriterTest {
    @Test
    void floatsInScientificNotationAreWrittenAsFloats() throws IOException {
        // Double#toString of these is E-notation: they used to turn the whole column into strings
        double[] values = { 1.0E-4, 2.5, 1.2E8, -3.0E-5, 0 };

        Category written = roundTrip(floatFile("values", values), CifOptions.builder().build());

        assertInstanceOf(FloatColumn.class, written.getColumn("values"));
        assertArrayEquals(values, ((FloatColumn) written.getColumn("values")).getArray());
    }

    @Test
    void textNumbersInScientificNotationAreWrittenAsFloats() throws IOException {
        CifFile text = new TextCifReader(CifOptions.builder().build()).readText("data_x\nloop_\n_a.v\n1.5e-3\n2\n-4.25E+2\n");

        Category written = roundTrip(text, CifOptions.builder().build());

        assertInstanceOf(FloatColumn.class, written.getColumn("v"));
        assertArrayEquals(new double[] { 1.5e-3, 2, -425 }, ((FloatColumn) written.getColumn("v")).getArray());
    }

    @Test
    void nonFiniteFloatsAreWrittenAsStrings() throws IOException {
        Category written = roundTrip(floatFile("values", new double[] { 1.5, Double.NaN }), CifOptions.builder().build());

        assertInstanceOf(StrColumn.class, written.getColumn("values"));
    }

    @Test
    void fixedPointValuesReadAsTheirDecimals() throws IOException {
        // 100 values with 1 to 6 decimals: fixed point, read back as the doubles nearest to the decimals
        double[] values = new double[100];
        for (int i = 0; i < values.length; i++) {
            values[i] = Double.parseDouble(String.format("%d.%0" + (1 + i % 6) + "d", i % 7, (i * 7919) % (int) Math.pow(10, 1 + i % 6)));
        }

        byte[] binary = CifIO.writeBinary(floatFile("values", values));

        assertEquals("FixedPoint", encodingChain(binary, "values").get(0));
        assertArrayEquals(values, ((FloatColumn) read(binary).getColumn("values")).getArray());
    }

    @Test
    void smallFloatColumnsAreWrittenAsPlainDoublesWhereThatIsSmaller() throws IOException {
        byte[] binary = CifIO.writeBinary(floatFile("values", new double[] { 0.123456 }));

        assertEquals(List.of("ByteArray"), encodingChain(binary, "values"));
        assertArrayEquals(new double[] { 0.123456 }, ((FloatColumn) read(binary).getColumn("values")).getArray());
    }

    @Test
    void precisionHintWithoutEncodingRoundsToThatPrecision() throws IOException {
        // full-precision values, e.g. coordinates after a transformation
        double[] values = new double[200];
        for (int i = 0; i < values.length; i++) {
            values[i] = i * Math.PI;
        }
        EncodingStrategyHint hint = new EncodingStrategyHint("test", "values", null, 3);
        CifOptions options = CifOptions.builder().encodingStrategyHint(hint).build();

        byte[] first = CifIO.writeBinary(floatFile("values", values), options);
        byte[] second = CifIO.writeBinary(floatFile("values", values), options);

        assertEquals("FixedPoint", encodingChain(first, "values").get(0));
        double[] read = ((FloatColumn) read(first).getColumn("values")).getArray();
        for (int i = 0; i < values.length; i++) {
            assertEquals(Math.round(values[i] * 1000) / 1000.0, read[i]);
        }
        // the hint is not changed by writing
        assertNull(hint.getEncoding());
        assertEquals(3, hint.getPrecision());
        assertArrayEquals(first, second);
    }

    @Test
    void fixedPointRoundsLikeTextOutput() throws IOException {
        // ties at the 4th decimal: 26.5325 is stored just below the tie, 2.0625 exactly on it (half-even: down)
        double[] values = new double[200];
        double[] tieValues = { 26.5325, 2.0625, 0.0625, 1.2345, -7.0005 };
        for (int i = 0; i < values.length; i++) {
            values[i] = tieValues[i % tieValues.length];
        }
        CifOptions options = CifOptions.builder()
                .encodingStrategyHint(new EncodingStrategyHint("test", "values", null, 3))
                .build();

        double[] read = ((FloatColumn) roundTrip(floatFile("values", values), options).getColumn("values")).getArray();

        assertArrayEquals(new double[] { 26.532, 2.062, 0.062, 1.234, -7.0 }, Arrays.copyOf(read, tieValues.length));
    }

    private static CifFile floatFile(String columnName, double[] values) {
        return CifBuilder.enterFile()
                .enterBlock("test")
                .enterCategory("test")
                .enterFloatColumn(columnName)
                .add(values)
                .leaveColumn()
                .leaveCategory()
                .leaveBlock()
                .leaveFile();
    }

    private static Category roundTrip(CifFile cifFile, CifOptions options) throws IOException {
        return read(CifIO.writeBinary(cifFile, options));
    }

    private static Category read(byte[] binary) throws IOException {
        CifFile cifFile = CifIO.readFromInputStream(new ByteArrayInputStream(binary));
        return cifFile.getBlocks().get(0).categories().findFirst().orElseThrow();
    }

    @SuppressWarnings("unchecked")
    private static List<String> encodingChain(byte[] binary, String columnName) throws IOException {
        Map<String, Object> file = MessagePackCodec.decode(new ByteArrayInputStream(binary));
        Map<String, Object> block = (Map<String, Object>) ((Object[]) file.get("dataBlocks"))[0];
        for (Object category : (Object[]) block.get("categories")) {
            for (Object c : (Object[]) ((Map<String, Object>) category).get("columns")) {
                Map<String, Object> column = (Map<String, Object>) c;
                if (columnName.equals(column.get("name"))) {
                    List<String> kinds = new ArrayList<>();
                    for (Object e : (Object[]) ((Map<String, Object>) column.get("data")).get("encoding")) {
                        kinds.add((String) ((Map<String, Object>) e).get("kind"));
                    }
                    return kinds;
                }
            }
        }
        throw new IllegalArgumentException("no column " + columnName);
    }
}
