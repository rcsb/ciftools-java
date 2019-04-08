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

import static org.junit.Assert.assertNotNull;

public class TestHelper {
    public static final double ERROR_MARGIN = 0.001;

    @SuppressWarnings("unchecked")
    public static final Map<String, List<Object>> TEST_CASES = Stream.of(
            new Object[] { "1acj", Stream.of(-12.503, 535, "1ACJ").collect(Collectors.toList()) },
            new Object[] { "1pga", Stream.of(26.778, 56, "1PGA").collect(Collectors.toList()) }
    ).collect(Collectors.toMap((Object[] e) -> (String) e[0], (Object[] e) -> (List<Object>) e[1]));

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
