package org.rcsb.cif.binary.codec;

import org.junit.jupiter.api.Test;
import org.rcsb.cif.binary.data.ByteArray;
import org.rcsb.cif.binary.data.StringArray;
import org.rcsb.cif.binary.encoding.StringArrayEncoding;

import java.util.regex.Pattern;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class StringArrayCodecTest {
    @Test
    void testForward() {
        // create test case
        StringArray plainArray = new StringArray(new String[] { "a", "AB", "a" });

        // encode
        StringArrayEncoding stringArrayEncoding = new StringArrayEncoding();
        ByteArray encodedData = plainArray.encode(stringArrayEncoding);

        // decode
        StringArray decodedArray = encodedData.decode(stringArrayEncoding);

        assertArrayEquals(plainArray.getData(), decodedArray.getData());
    }

    @Test
    void testRoundtrip() {
        StringArray plainArray = new StringArray(IntStream.range(0, 536)
                .mapToObj(i -> "n")
                .toArray(String[]::new));

        // encode
        StringArrayEncoding stringArrayEncoding = new StringArrayEncoding();
        ByteArray encodedData = plainArray.encode(stringArrayEncoding);

        // decode
        StringArray decodedArray = encodedData.decode(stringArrayEncoding);

        assertArrayEquals(plainArray.getData(), decodedArray.getData());
    }

    @Test
    void testNullAndEmpty() {
        StringArray plainArray = new StringArray(new String[] { "a", "AB", null, null, "", "a", "" });
        // null and "" will be 'merged' into empty strings
        String[] expected = new String[] { "a", "AB", "", "", "", "a", "" };

        // encode
        StringArrayEncoding stringArrayEncoding = new StringArrayEncoding();
        ByteArray encodedData = plainArray.encode(stringArrayEncoding);

        // decode
        StringArray decodedArray = encodedData.decode(stringArrayEncoding);

        assertArrayEquals(expected, decodedArray.getData());
    }

    @Test
    void testChaining() {
        StringArray plainArray = new StringArray(Pattern.compile(", ")
                .splitAsStream("L-peptide linking, L-peptide linking, L-peptide linking, L-peptide linking, " +
                        "L-peptide linking, L-peptide linking, L-peptide linking, peptide linking, L-peptide linking, " +
                        "non-polymer, L-peptide linking, L-peptide linking, L-peptide linking, L-peptide linking, " +
                        "L-peptide linking, L-peptide linking, L-peptide linking, non-polymer, L-peptide linking, " +
                        "L-peptide linking, L-peptide linking, L-peptide linking")
                .toArray(String[]::new));

        // encode
        StringArrayEncoding stringArrayEncoding = new StringArrayEncoding();
        ByteArray encodedData = plainArray.encode(stringArrayEncoding);

        // decode
        StringArray decodedArray = encodedData.decode(stringArrayEncoding);

        assertArrayEquals(plainArray.getData(), decodedArray.getData());
    }
}