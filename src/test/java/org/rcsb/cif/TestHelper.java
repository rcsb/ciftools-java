package org.rcsb.cif;

import org.junit.Assert;
import org.junit.Test;

import java.io.InputStream;

public class TestHelper {
    public static final double ERROR_MARGIN = 0.001;

    public static InputStream getInputStream(String localPath) {
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(localPath);
        return inputStream == null ? TestHelper.class.getResourceAsStream(localPath) : inputStream;
    }

    @Test
    public void shouldAcquireInputStream() {
        Assert.assertNotNull("Could not acquire inputstream of local resource", getInputStream("cif/1pga.cif"));
    }
}
