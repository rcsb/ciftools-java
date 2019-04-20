package org.rcsb.cif.performance;

import org.junit.Ignore;
import org.junit.Test;
import org.rcsb.cif.CifReader;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;
import java.util.zip.GZIPInputStream;

public class CifPerformanceTest {
    private static final Path PDB_DIRECTORY = Paths.get("/var/pdb/");
    private static final Path BCIF_DIRECTORY = Paths.get("/var/bcif/");
    private static final int CHUNK_SIZE = 100;
    private static final boolean PARALLEL = true;

    @Test
    @Ignore
    public void testTextPerformance() throws IOException {
        // parse whole PDB archive
        // test is ignored due to serious run time
        // no fancy performance framework employed as number of operations is so large that disturbances should not matter
        performance(PDB_DIRECTORY, false);
    }

    @Test
    @Ignore
    public void testBinaryPerformance() throws IOException {
        performance(BCIF_DIRECTORY, true);
    }

    private void performance(Path basePath, boolean binary) throws IOException {
        AtomicInteger counter = new AtomicInteger(0);
        final int target = (int) pathStream(basePath).count();
        AtomicInteger failed = new AtomicInteger(0);

        long start = System.nanoTime();

        Stream<Path> stream;
        if (PARALLEL) {
            stream = pathStream(basePath).parallel();
        } else {
            stream = pathStream(basePath);
        }

        stream.forEach(path -> {
                    int count = counter.incrementAndGet();
                    if (count % CHUNK_SIZE == 0) {
                        long end_chunk = System.nanoTime();
                        System.out.println("[" + count + " / " + target + "] @ " + (((end_chunk - start) /
                                1_000_000 / count) + " ms per structure"));
                    }

                    try {
                        if (binary) {

                        } else {
                            InputStream inputStream = new GZIPInputStream(Files.newInputStream(path));
                            CifReader.parseText(inputStream);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        failed.incrementAndGet();
                    }
                });
        long end = System.nanoTime();
        System.out.println((end - start) / 1_000_000_000 + " s");
        System.out.println("failed for " + failed.intValue() + " structures");
    }

    private Stream<Path> pathStream(Path base) throws IOException {
        return Files.walk(PDB_DIRECTORY)
                .filter(path -> !Files.isDirectory(path));
    }
}
