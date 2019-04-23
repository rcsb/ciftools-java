package org.rcsb.cif.performance;

import org.rcsb.cif.CifReader;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;
import java.util.zip.GZIPInputStream;

/**
 * Test to track implementation performance.
 *
 * Optimization diary:
 *
 * 1. Text - 1000 structures, single-threaded, Async Profiler hooked
 *
 * - 1.0 base: 52 s total, @ 52 ms per structure
 *
 *
 * 2. Binary - 5000 structures, single-threaded, Async Profiler hooked
 * - 2.0 base: 18 s total, @ 3 ms per structure
 * - 2.1 explicitly buffer InputStream (BinaryCifReader line 18): 13 s total, @ 2646 µs per structure
 * - P1: stream-based traversal of directory is really taxing, 50% of runtime
 * - P2: MessagePack accounts for 50% of time in BinaryCifReader.parse
 * - 2.2 omitted logging: 11 s, @ 2395 µs per structure
 * - addressing P1: acquiring InputStream is the expensive part, File.listFiles is even slower
 *
 */
public class CifPerformanceTest {
    private static final Path PDB_DIRECTORY = Paths.get("/var/pdb/");
    private static final Path BCIF_DIRECTORY = Paths.get("/var/bcif/");
    private static final int TOTAL_SIZE = /*5000*/ Integer.MAX_VALUE;
    private static final int CHUNK_SIZE = 250;
    private static final boolean PARALLEL = false;

    public static void main(String[] args) throws IOException {
        // use main to detach for all the junit overhead
//        testTextPerformance();
        testBinaryPerformance();
    }

    private static void testTextPerformance() throws IOException {
        // parse whole PDB archive
        // test is ignored due to serious run time
        // no fancy performance framework employed as number of operations is so large that disturbances should not matter
        performance(PDB_DIRECTORY, false);
    }

    private static void testBinaryPerformance() throws IOException {
        performance(BCIF_DIRECTORY, true);
    }

    private static void performance(Path basePath, boolean binary) throws IOException {
        AtomicInteger counter = new AtomicInteger(0);
        final int target = (int) pathStream(basePath).count();/*  151079TOTAL_SIZE;*/
        AtomicInteger failed = new AtomicInteger(0);
        long start = System.nanoTime();

        Stream<Path> stream;
        if (PARALLEL) {
            stream = pathStream(basePath).parallel();
        } else {
            stream = pathStream(basePath);
        }

        stream.limit(TOTAL_SIZE).forEach(path -> {
                    int count = counter.incrementAndGet();
                    if (count % CHUNK_SIZE == 0) {
                        long end_chunk = System.nanoTime();
                        System.out.println("[" + count + " / " + target + "] @ " + (((end_chunk - start) /
                                1_000 / count) + "µs per structure"));
                    }

                    try {
                        if (binary) {
                            InputStream inputStream = Files.newInputStream(path);
                            CifReader.parseBinary(inputStream);
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

    private static Stream<Path> pathStream(Path base) throws IOException {
        return Files.walk(base)
                .filter(path -> !Files.isDirectory(path));
    }
}
