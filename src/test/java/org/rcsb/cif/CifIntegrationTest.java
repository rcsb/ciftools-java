package org.rcsb.cif;

import org.junit.Assert;
import org.junit.Test;
import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.model.ValueKind;
import org.rcsb.cif.model.generated.atomsite.LabelAltId;
import org.rcsb.cif.model.generated.cell.Cell;
import org.rcsb.cif.model.generated.cell.PdbxUniqueAxis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.rcsb.cif.TestHelper.TEST_CASES;

public class CifIntegrationTest {
    @Test
    public void testUnknownFeatureText() throws IOException {
        // read from cif
        InputStream inputStream = TestHelper.getInputStream("cif/1acj.cif");
        CifFile text = CifReader.parseText(inputStream);

        Cell cell = text.getBlocks().get(0).getCell();

        PdbxUniqueAxis pdbxUniqueAxis = cell.getPdbxUniqueAxis();

        assertEquals(ValueKind.UNKNOWN, pdbxUniqueAxis.getValueKind(0));
        assertEquals("", pdbxUniqueAxis.get(0));
    }

    @Test
    public void testNotPresentFeatureText() throws IOException {
        // read from cif
        InputStream inputStream = TestHelper.getInputStream("cif/1acj.cif");
        CifFile text = CifReader.parseText(inputStream);

        LabelAltId labelAltId = text.getBlocks().get(0).getAtomSite().getLabelAltId();

        assertEquals(ValueKind.NOT_PRESENT, labelAltId.getValueKind(0));
        assertEquals("", labelAltId.get(0));
    }

    @Test
    public void testUnknownFeatureBinary() throws IOException {
        // read from cif
        InputStream inputStream = TestHelper.getInputStream("bcif/1acj.bcif");
        CifFile text = CifReader.parseBinary(inputStream);

        Cell cell = text.getBlocks().get(0).getCell();

        PdbxUniqueAxis pdbxUniqueAxis = cell.getPdbxUniqueAxis();

        assertEquals(ValueKind.UNKNOWN, pdbxUniqueAxis.getValueKind(0));
        assertEquals("", pdbxUniqueAxis.get(0));
    }

    @Test
    public void testNotPresentFeatureBinary() throws IOException {
        // read from cif
        InputStream inputStream = TestHelper.getInputStream("bcif/1acj.bcif");
        CifFile text = CifReader.parseBinary(inputStream);

        LabelAltId labelAltId = text.getBlocks().get(0).getAtomSite().getLabelAltId();

        assertEquals(ValueKind.NOT_PRESENT, labelAltId.getValueKind(0));
        assertEquals("", labelAltId.get(0));
    }

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

    @Test
    public void readCifWriteBcif() throws IOException {
        for (String id : TEST_CASES.keySet()) {
            System.out.println(id + " cif to bcif");
            readCifWriteBcif(id);
        }
    }

    private void readCifWriteBcif(String testCase) throws IOException {
        String originalContent = new String(TestHelper.getBytes("bcif/" + testCase + ".bcif"));
        CifFile originalFile = CifReader.parseText(TestHelper.getInputStream("cif/" + testCase + ".cif"));

        InputStream copyInputStream = CifWriter.writeBinary(originalFile);
        String copyContent = new BufferedReader(new InputStreamReader(copyInputStream))
                .lines()
                .collect(Collectors.joining("\n"));

        Assert.assertEquals(originalContent, copyContent);
    }

    @Test
    public void readBcifWriteCif() throws IOException {
        for (String id : TEST_CASES.keySet()) {
            System.out.println(id + " bcif to cif");
            readBcifWriteCif(id);
        }
    }

    private void readBcifWriteCif(String testCase) throws IOException {
        // last category _pdbe_structure_quality_report_issues is missing in binary source
        String originalContent = new String(TestHelper.getBytes("cif/" + testCase + "-modified.cif"));
        CifFile originalFile = CifReader.parseBinary(TestHelper.getInputStream("bcif/" + testCase + ".bcif"));

        InputStream copyInputStream = CifWriter.writeText(originalFile);
        String copyContent = new BufferedReader(new InputStreamReader(copyInputStream))
                .lines()
                .collect(Collectors.joining("\n"));

        Assert.assertEquals(originalContent, copyContent);
    }
}
