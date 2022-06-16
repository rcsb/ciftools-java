package org.rcsb.cif;

import org.junit.jupiter.api.Test;

import java.io.IOException;

/**
 * Ensure that the provided Demo is actually running.
 */
class DemoTest {
    @Test
    void testDemo() throws IOException {
        Demo.main(new String[0]);
    }
}
