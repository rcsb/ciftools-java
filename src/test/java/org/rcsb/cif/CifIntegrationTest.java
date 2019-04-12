package org.rcsb.cif;

import org.junit.Assert;
import org.junit.Test;
import org.rcsb.cif.model.CifFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

import static org.rcsb.cif.TestHelper.TEST_CASES;

public class CifIntegrationTest {
    @Test
    public void roundTripViaBinary() throws IOException {
        for (String id : TEST_CASES.keySet()) {
            System.out.println(id + " via binary");
            roundTripViaBinary(id);
        }
    }

    private void roundTripViaBinary(String testCase) throws IOException {
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

    @Test
    public void roundTripViaText() throws IOException {
        for (String id : TEST_CASES.keySet()) {
            System.out.println(id + " via text");
            roundTripViaText(id);
        }
    }

    private void roundTripViaText(String testCase) throws IOException {
        String originalContent = new String(TestHelper.getBytes("bcif/" + testCase + ".bcif"));
        CifFile originalFile = CifReader.parseBinary(TestHelper.getInputStream("bcif/" + testCase + ".bcif"));

        InputStream cifInputStream = CifWriter.writeText(originalFile);
        CifFile cifFile = CifReader.parseText(cifInputStream);

        InputStream copyInputStream = CifWriter.writeBinary(cifFile);
        String copyContent = new BufferedReader(new InputStreamReader(copyInputStream))
                .lines()
                .collect(Collectors.joining("\n"));

        Assert.assertEquals(originalContent, copyContent);
    }
}
