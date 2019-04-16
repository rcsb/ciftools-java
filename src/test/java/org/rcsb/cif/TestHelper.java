package org.rcsb.cif;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Origin of files:
 * - bcif created by Mol* encoder
 * - cif created by Mol* encoder
 *
 * All tests ensure that the behavior of the reference implementation (i.e. Mol*) is recreated rather than that output
 * is in perfect agreement with e.g. PDB files.
 */
public class TestHelper {
    public static final double ERROR_MARGIN = 0.001;

    @SuppressWarnings("unchecked")
    public static final Map<String, List<Object>> TEST_CASES = Stream.of(
            Stream.of("1acj", -12.503, 535, "1ACJ").collect(Collectors.toList()),
            Stream.of("1pga", 26.778, 56, "1PGA").collect(Collectors.toList()),
            Stream.of("4cxl", -13.933, 29, "4CXL").collect(Collectors.toList()),
            Stream.of("5zmz", 10.752, 4, "5ZMZ").collect(Collectors.toList())
    ).collect(Collectors.toMap((List l) -> (String) l.get(0), (List l) -> (List<Object>) l.subList(1, l.size())));

    public static void assertEqualsIgnoringWhiteSpaces(String expected, String actual) {
        expected = Pattern.compile("\n")
                .splitAsStream(expected)
                .map(String::trim)
                .collect(Collectors.joining("\n"));
        actual = Pattern.compile("\n")
                .splitAsStream(actual)
                .map(String::trim)
                .collect(Collectors.joining("\n"));
        assertEquals(expected.replaceAll("[ ]+", " "), actual.replaceAll("[ ]+", " "));
    }

    public static InputStream getInputStream(String localPath) {
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(localPath);
        return inputStream == null ? TestHelper.class.getResourceAsStream(localPath) : inputStream;
    }

    public static byte[] getBytes(String localPath) throws IOException {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        int nRead;
        byte[] data = new byte[1024];
        try (InputStream inputStream = getInputStream(localPath)) {
            while ((nRead = inputStream.read(data, 0, data.length)) != -1) {
                buffer.write(data, 0, nRead);
            }
        }

        buffer.flush();
        byte[] byteArray = buffer.toByteArray();
        buffer.close();
        return byteArray;
    }

    public static int[] convertToIntArray(byte[] bytes) {
        int[] out = new int[bytes.length];
        for (int i = 0; i < out.length; i++) {
            out[i] = bytes[i] & 0xFF;
        }
        return out;
    }

    public static int[] convertToIntArray(String hex) {
        return Pattern.compile(" ").splitAsStream(hex)
                .map(s -> "0x" + s)
                .mapToInt(Integer::decode)
                .toArray();
    }

    @Test
    public void shouldAcquireInputStream() {
        assertNotNull("Could not acquire inputstream of local resource", getInputStream("cif/1pga.cif"));
    }
}
