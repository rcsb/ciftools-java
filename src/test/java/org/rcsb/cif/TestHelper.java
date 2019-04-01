package org.rcsb.cif;

import org.junit.Assert;
import org.junit.Test;

import java.io.InputStream;

public class TestHelper {
    static InputStream getInputStream(String localPath) {
        return Thread.currentThread()
                .getContextClassLoader()
                .getResourceAsStream(localPath);
    }

    @Test
    public void shouldAcquireInputStream() {
        // TODO why you no work?
        Assert.assertNotNull("Could not acquire inputstream of local resource", getInputStream("cif/1acj.cif"));
    }
}
