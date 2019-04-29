package org.rcsb.cif.performance;

import org.rcsb.cif.TestHelper;
import org.rcsb.cif.binary.BinaryCifReader;
import org.rcsb.cif.binary.BinaryCifWriter;
import org.rcsb.cif.BinaryCifWriterOptions;
import org.rcsb.cif.model.CifFile;

import java.io.IOException;
import java.io.InputStream;
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
 */
public class SingleRowEncodingPerformanceTest {
    private static final Path BCIF_DIRECTORY = Paths.get("/var/bcif/");
    private static final int TOTAL_SIZE =
            5000
//            Integer.MAX_VALUE
            ;
    private static final int CHUNK_SIZE = 250;

    public static void main(String[] args) throws IOException {
        System.out.println(" ### standard encoding ###");
        System.out.println();
        roundTrip(BinaryCifWriterOptions.create().setSingleRowByMessagePack(false).build());
        System.out.println();
        System.out.println();

        System.out.println(" ### single row encoding ###");
        System.out.println();
        roundTrip(BinaryCifWriterOptions.create().setSingleRowByMessagePack(true).build());
        System.out.println();
        System.out.println();
    }

    private static void roundTrip(BinaryCifWriterOptions options) throws IOException {
        AtomicInteger counter = new AtomicInteger(0);
        AtomicInteger failed = new AtomicInteger(0);
        long start = System.nanoTime();
        List<Integer> sizes = new ArrayList<>();

        Files.walk(BCIF_DIRECTORY)
                .filter(path -> !Files.isDirectory(path))
                .limit(TOTAL_SIZE).forEach(path -> {
                    int count = counter.incrementAndGet();
                    if (count % CHUNK_SIZE == 0) {
                        long end_chunk = System.nanoTime();
                        System.out.println("[" + count + " / " + TOTAL_SIZE + "] @ " + (((end_chunk - start) /
                                1_000 / count) + " µs per structure"));
                    }

                    try {
                        // read source file
                        CifFile cifFile = new BinaryCifReader().read(Files.newInputStream(path));
                        InputStream inputStream = new BinaryCifWriter(options).write(cifFile);

                        // get size of encoded file
                        byte[] bytes = TestHelper.getBytes(inputStream);
                        sizes.add(bytes.length);

                        // read once more
                        new BinaryCifReader().readBinary(bytes);
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
