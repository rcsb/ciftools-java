package org.rcsb.cif;

import org.junit.jupiter.api.Test;
import org.rcsb.cif.binary.data.ByteArray;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.zip.GZIPOutputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

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

    @SuppressWarnings("rawtypes")
    public static final Map<String, List> TEST_CASES = Stream.of(
            Stream.of("1acj", -12.503, 535, "1ACJ").collect(Collectors.toList()),
            Stream.of("1j59", -5.513, 207, "1J59").collect(Collectors.toList()),
            Stream.of("1pga", 26.778, 56, "1PGA").collect(Collectors.toList()),
            Stream.of("4cxl", -13.933, 29, "4CXL").collect(Collectors.toList()),
            Stream.of("5zmz", 10.752, 4, "5ZMZ").collect(Collectors.toList())
    ).collect(Collectors.toMap(l -> (String) l.get(0), l -> l.subList(1, l.size())));

    public static InputStream getInputStream(String localPath) {
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(localPath);
        InputStream re = inputStream == null ? TestHelper.class.getResourceAsStream(localPath) : inputStream;
        Objects.requireNonNull(re, "Could not load test resource " + localPath);
        return re;
    }

    public static byte[] getBytes(String localPath) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int bytesRead;
        byte[] buffer = new byte[1024];
        InputStream inputStream = getInputStream(localPath);
        while ((bytesRead = inputStream.read(buffer, 0, buffer.length)) != -1) {
            byteArrayOutputStream.write(buffer, 0, bytesRead);
        }

        byteArrayOutputStream.flush();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        inputStream.close();

        return byteArray;
    }

    public static void assertEqualsIgnoringQuotesAndDecimalZeros(String expected, String actual) {
        assertEquals(expected.replaceAll("\"", "").replaceAll("(\\d+\\.\\d{0,2})\\d*", "$1").replaceAll("\\.0+ ", " ").replaceAll("(\\.[1-9]+)0+", "$1"),
                actual.replaceAll("\"", "").replaceAll("(\\d+\\.\\d{0,2})\\d*", "$1").replaceAll("\\.0+ ", " ").replaceAll("(\\.[1-9]+)0+", "$1"));
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

    public static byte[] compress(byte[] bytes) throws IOException {
        byte[] output;
        try (ByteArrayOutputStream byteStream = new ByteArrayOutputStream(bytes.length)) {
            try (GZIPOutputStream zipStream = new GZIPOutputStream(byteStream)) {
                zipStream.write(bytes);
            }
            output = byteStream.toByteArray();
        }
        return output;
    }

    @Test
    void shouldAcquireInputStream() {
        assertNotNull(getInputStream("cif/1pga.cif"), "Could not acquire inputstream of local resource");
    }

    @Test
    void messagePackToUint8Array() throws IOException {
        String id = "1j59.bcif";
        assertNotNull(new ByteArray(TestHelper.getBytes("bcif/" + id))
                .decode()
                .getData());
    }
}
