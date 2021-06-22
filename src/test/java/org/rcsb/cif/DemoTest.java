package org.rcsb.cif;

import org.junit.jupiter.api.Test;

import java.io.IOException;

/**
 * Ensure that the provided Demo is actually running.
 */
public class DemoTest {
    @Test
    public void testDemo() throws IOException {
        Demo.main(new String[0]);
    }
}
