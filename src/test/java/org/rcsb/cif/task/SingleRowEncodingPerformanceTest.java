package org.rcsb.cif.task;

import org.rcsb.cif.CifIO;
import org.rcsb.cif.CifOptions;
import org.rcsb.cif.model.CifFile;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Test case: 5000 structures from Bcif, read, decode, encode (with or without single row strategy), write, read again.
 *
 * naive approach:
 * 128 s, 443407 bytes on average
 *
 * single row approach:
 * 107 s, 359368 bytes on average
 *
 *
 * Whole archive (151079 structures), parallel, as of 8d561ba (04.30.19):
 * naive approach:
 * 802 s, 425063 bytes on average
 *
 * single row approach:
 * 674 s, 345571 bytes on average
 *
 * -16% time, -19% size
 *
 *
 * problem:
 * - difference should vanish for gzipped files
 *
 * TODO rerun, update, plots
 * Whole archive (151079 structures), parallel, as of xxxx (05.03.19):
 * naive approach:
 * xxx s, xxx bytes on average
 *
 * single row approach:
 * xxx s, xxx bytes on average
 */
public class SingleRowEncodingPerformanceTest {
    private static final Path BCIF_DIRECTORY = Paths.get("/var/bcif/");
    private static final int TOTAL_SIZE =
//            5000
            Integer.MAX_VALUE
            ;
    private static final int CHUNK_SIZE = 250;

    public static void main(String[] args) throws IOException {
        System.out.println(" ### standard encoding ###");
        System.out.println();
        roundTrip(CifOptions.builder().singleRow(true).gzip(true).build());
        System.out.println();
        System.out.println();

        System.out.println(" ### single row encoding ###");
        System.out.println();
        roundTrip(CifOptions.builder().singleRow(true).gzip(true).build());
        System.out.println();
        System.out.println();
    }

    private static void roundTrip(CifOptions options) throws IOException {
        AtomicInteger counter = new AtomicInteger(0);
        AtomicInteger failed = new AtomicInteger(0);
        int target = (int) Files.walk(BCIF_DIRECTORY).filter(path -> !Files.isDirectory(path)).count();
        long start = System.nanoTime();
        List<Integer> sizes = new ArrayList<>();

        Files.walk(BCIF_DIRECTORY)
                .parallel()
                .filter(path -> !Files.isDirectory(path))
                .limit(TOTAL_SIZE).forEach(path -> {
                    int count = counter.incrementAndGet();
                    if (count % CHUNK_SIZE == 0) {
                        long end_chunk = System.nanoTime();
                        System.out.println("[" + count + " / " + target + "] @ " + (((end_chunk - start) /
                                1_000 / count) + " µs per structure"));
                    }

                    try {
                        // read source file
                        CifFile cifFile = CifIO.readFromPath(path);
                        byte[] bytes = CifIO.writeBinary(cifFile, options);

                        // get size of encoded file
                        sizes.add(bytes.length);

                        // read once more
                        CifIO.readFromInputStream(new ByteArrayInputStream(bytes));
                    } catch (Exception e) {
                        e.printStackTrace();
                        failed.incrementAndGet();
                    }
                });
        long end = System.nanoTime();
        System.out.println((end - start) / 1_000_000_000 + " s");
        System.out.println("failed for " + failed.intValue() + " structures");
        System.out.println("average size in bytes: " + sizes.stream().mapToInt(i -> i).average().orElse(Integer.MAX_VALUE));
    }
}
