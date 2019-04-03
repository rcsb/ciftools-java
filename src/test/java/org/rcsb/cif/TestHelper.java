package org.rcsb.cif;

import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.util.stream.Collectors;

public class TestHelper {
    public static final double ERROR_MARGIN = 0.001;

    public static InputStream getInputStream(String localPath) {
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(localPath);
        return inputStream == null ? TestHelper.class.getResourceAsStream(localPath) : inputStream;
    }

    public static byte[] getBytes(String localPath) {
        return new BufferedReader(new InputStreamReader(getInputStream(localPath)))
                .lines()
                .collect(Collectors.joining(System.lineSeparator()))
                .getBytes();
    }

    @Test
    public void shouldAcquireInputStream() {
        Assert.assertNotNull("Could not acquire inputstream of local resource", getInputStream("cif/1pga.cif"));
    }
}
