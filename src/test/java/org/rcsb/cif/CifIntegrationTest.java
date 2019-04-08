package org.rcsb.cif;

import org.junit.Assert;
import org.junit.Test;
import org.rcsb.cif.model.CifFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

import static org.junit.Assert.fail;
import static org.rcsb.cif.TestHelper.TEST_CASES;

public class CifIntegrationTest {
    @Test
    public void roundTrip() throws IOException {
        for (String id : TEST_CASES.keySet()) {
            roundTrip(id);
        }
    }

    private void roundTrip(String testCase) throws IOException {
        String originalContent = new String(TestHelper.getBytes("cif/" + testCase + ".cif"));
        CifFile originalFile = CifReader.parseText(TestHelper.getInputStream("cif/" + testCase + ".cif"));

        InputStream bcifInputStream = CifWriter.writeBinary(originalFile);
        CifFile bcifFile = CifReader.parseBinary(bcifInputStream);

        InputStream copyInputStream = CifWriter.writeText(bcifFile);
        String copyContent = new BufferedReader(new InputStreamReader(copyInputStream))
                .lines()
                .collect(Collectors.joining("\n"));

        Assert.assertEquals(originalContent, copyContent);
    }
}
