package org.rcsb.cif;

import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.schema.StandardSchemata;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.rcsb.cif.TestHelper.TEST_CASES;

/**
 * Args[0] points to snapshot directory: ciftools-java/src/test/resources/snapshot/
 */
public class UpdateTestFiles {
    public static void main(String[] args) throws IOException {
        Path dest = Paths.get(args[0]);

        // run to update snapshot files
        for (String id : TEST_CASES.keySet()) {
            InputStream inputStream = TestHelper.getInputStream("cif/" + id + ".cif");
            CifFile data = CifIO.readFromInputStream(inputStream).as(StandardSchemata.MMCIF);

            CifOptions options = CifOptions.builder().build();
            CifOptions optionsGzip = CifOptions.builder().gzip(true).build();

            // convert to cif/bcif
            CifIO.writeText(data, dest.resolve(id + ".cif"), options);
            CifIO.writeText(data, dest.resolve(id + ".cif.gz"), optionsGzip);
            CifIO.writeBinary(data, dest.resolve(id + ".bcif"), options);
            CifIO.writeBinary(data, dest.resolve(id + ".bcif.gz"), optionsGzip);
        }
    }
}
