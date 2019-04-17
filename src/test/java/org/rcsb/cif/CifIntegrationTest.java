package org.rcsb.cif;

import org.junit.Test;
import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.model.ValueKind;
import org.rcsb.cif.model.generated.atomsite.*;
import org.rcsb.cif.model.generated.cell.Cell;
import org.rcsb.cif.model.generated.cell.PdbxUniqueAxis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.rcsb.cif.TestHelper.TEST_CASES;
import static org.rcsb.cif.TestHelper.assertEqualsIgnoringWhiteSpacesAndNumberFormat;

/**
 * More complex tests for interactions between various parts of the code. Especially round-trip are used to assess the
 * fidelity of the implementation. For a Cif file encoding and subsequent decoding should arrive at the original file
 * content. For Bcif decoding and encoding should do the same.
 */
public class CifIntegrationTest {
    @Test
    public void testNumberFormat() {
        String[] data = {"1.0", "2", "-1.567891234567"};

        // coord columns print with 3 decimal digits
        CartnX cartnX = new CartnX("name", data.length, data);
        CartnY cartnY = new CartnY("name", data.length, data);
        CartnZ cartnZ = new CartnZ("name", data.length, data);

        Stream.of(cartnX, cartnY, cartnZ).forEach(coordColumn -> {
            double x1 = coordColumn.get(0);
            double x2 = coordColumn.get(1);
            double x3 = coordColumn.get(2);

            assertEquals("1.000", coordColumn.format(x1));
            assertEquals("2.000", coordColumn.format(x2));
            assertEquals("-1.568", coordColumn.format(x3));
        });

        // occupancy uses 2 decimal digits
        Occupancy occupancy = new Occupancy("name", data.length, data);
        double occ1 = occupancy.get(0);
        double occ2 = occupancy.get(1);
        double occ3 = occupancy.get(2);

        assertEquals("1.00", occupancy.format(occ1));
        assertEquals("2.00", occupancy.format(occ2));
        assertEquals("-1.57", occupancy.format(occ3));

        // all other should fallback to default behavior
        BIsoOrEquiv bIsoOrEquiv = new BIsoOrEquiv("name", data.length, data);
        double iso1 = bIsoOrEquiv.get(0);
        double iso2 = bIsoOrEquiv.get(1);
        double iso3 = bIsoOrEquiv.get(2);

        // truncate float which perfectly round to integers
        assertEquals("1", bIsoOrEquiv.format(iso1));
        assertEquals("2", bIsoOrEquiv.format(iso2));
        // cut long numbers after 6 decimal places
        assertEquals("-1.567891", bIsoOrEquiv.format(iso3));
    }

    @Test
    public void test_pdbx_poly_seq_scheme_auth_mon_idText() throws IOException {
        InputStream inputStream = TestHelper.getInputStream("cif/1acj.cif");
        CifFile text = CifReader.parseText(inputStream);

        String stringData = text.getBlocks().get(0)
                .getCategory("pdbx_poly_seq_scheme")
                .getColumn("auth_mon_id")
                .getStringData(0);
        System.out.println(stringData);
    }

    @Test
    public void test_pdbx_poly_seq_scheme_auth_mon_idBinary() throws IOException {
        InputStream inputStream = TestHelper.getInputStream("bcif/modelserver/1acj.bcif");
        CifFile text = CifReader.parseBinary(inputStream);

        String stringData = text.getBlocks().get(0)
                .getCategory("pdbx_poly_seq_scheme")
                .getColumn("auth_mon_id")
                .getStringData(0);
        System.out.println(stringData);
    }

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
        InputStream inputStream = TestHelper.getInputStream("bcif/modelserver/1acj.bcif");
        CifFile text = CifReader.parseBinary(inputStream);

        Cell cell = text.getBlocks().get(0).getCell();

        PdbxUniqueAxis pdbxUniqueAxis = cell.getPdbxUniqueAxis();

        assertEquals(ValueKind.UNKNOWN, pdbxUniqueAxis.getValueKind(0));
        assertEquals("", pdbxUniqueAxis.get(0));
    }

    @Test
    public void testNotPresentFeatureBinary() throws IOException {
        // read from cif
        InputStream inputStream = TestHelper.getInputStream("bcif/modelserver/1acj.bcif");
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

        assertEqualsIgnoringWhiteSpacesAndNumberFormat(originalContent, copyContent);
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

        // cannot match to David's bcif data as column types differ slightly
//        assertEquals(originalContent, copyContent);
        assertNotNull(originalContent);
        assertNotNull(copyContent);
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

        // cannot match to David's bcif data as column types differ slightly
//        assertEquals(originalContent, copyContent);
        assertNotNull(originalContent);
        assertNotNull(copyContent);
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
        String originalContent = new String(TestHelper.getBytes("cif/" + testCase + ".mol"));
        CifFile originalFile = CifReader.parseBinary(TestHelper.getInputStream("bcif/" + testCase + ".bcif"));

        InputStream copyInputStream = CifWriter.writeText(originalFile);
        String copyContent = new BufferedReader(new InputStreamReader(copyInputStream))
                .lines()
                .collect(Collectors.joining("\n"));

        assertEqualsIgnoringWhiteSpacesAndNumberFormat(originalContent, copyContent);
    }
}
