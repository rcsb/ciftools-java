package org.rcsb.cif;

import org.junit.Test;
import org.rcsb.cif.model.CifFile;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CifWriterTest {
    private static final List<String> testCases = Stream.of("1acj", "1pga")
            .collect(Collectors.toList());

    @Test
    public void testCifToBcifAndBack() throws ParsingException, IOException {
        for (String id : testCases) {
            testCifToBcifAndBack(id);
        }
    }

    private void testCifToBcifAndBack(String testCase) throws ParsingException, IOException {
        // read from cif
        InputStream inputStream = TestHelper.getInputStream("cif/" + testCase + ".cif");
        CifFile text = CifReader.parseText(inputStream);

        // convert to bcif
        CifWriter.writeBinary(text);
    }
}
