package org.rcsb.cif.task;

import org.rcsb.cif.CifReader;
import org.rcsb.cif.CifWriter;
import org.rcsb.cif.model.CifFile;

import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.zip.GZIPInputStream;

/**
 * Test to track implementation performance. If not stated, test setup was:
 * 5000 structures, single-threaded, Async Profiler hooked
 *
 * Optimization diary:
 *
 * 1. Text
 *
 * - 1.0 base: 107 s total, @ 21407 µs per structure
 * - actual IO is the most time demanding task
 * - 1.1 explicitly buffer InputStream (TextCifReader line 18): 98 s total, @ 19695 µs per structure
 * - 1.2 resizing of token lists is pronounced - provide initial guess to avoid excessive resizing: 85 s total, @ 17177 µs per structure
 *
 *  As of e2b9727 (04.23.19):
 *  - read 151079 structures (mmCIF) in 2620 s, sequential
 *  - read 151079 structures (mmCIF) in 1386 s, parallel @ 12 cores
 *
 * As of e2b9727 (04.23.19):
 * - read, decode, encode, and 'write' (without actual IO) 151079 structures (mmCIF) in ~3600 s, parallel @ 12 cores
 *
 * 2. Binary
 *
 * - 2.0 base: 18 s total, @ 3 ms per structure
 * - 2.1 explicitly buffer InputStream (BinaryCifReader line 18): 13 s total, @ 2646 µs per structure
 * - P1: stream-based traversal of directory seems taxing, 50% of runtime
 * - P2: MessagePack accounts for 50% of time in BinaryCifReader.parse
 * - 2.2 omitted logging: 11 s, @ 2395 µs per structure
 * - addressing P1: acquiring InputStream is the expensive part, File.listFiles is even slower
 *
 * As of 3c4feb0 (04.23.19):
 * - read 151079 structures (binary) in 527 s, sequential
 * - read 151079 structures (binary) in 110 s, parallel @ 12 cores
 *
 * - 2.3 writing: 120 s, @ 23861 µs per structure - classify, toArray calls, and Double.parseDouble take most time
 * - omitted some redundant looping and provided direct access to binary data arrays: 102 s, @ 20586 µs per structure
 *
 * As of 967535d (04.23.19):
 * - read, decode, encode, and 'write' (without actual IO) 151079 structures (binary) in 595 s, parallel @ 12 cores
 *
 */
public class GeneralPerformanceTest {
    private static final Path PDB_DIRECTORY = Paths.get("/var/pdb/");
    private static final Path BCIF_DIRECTORY = Paths.get("/var/bcif/");
    private static final int TOTAL_SIZE =
//            5000
            Integer.MAX_VALUE
            ;
    private static final int CHUNK_SIZE = 250;

    public static void main(String[] args) throws IOException {
//        readTextSequential();
//        readTextParallel();
//
//        readBinarySequential();
        readBinaryParallel();

//        writeTextSequential();
//        writeTextParallel();

//        writeBinarySequential();
//        writeBinaryParallel();
    }

    private static void writeTextSequential() throws IOException {
        performance(PDB_DIRECTORY, false, false, TEXT_WRITE);
    }

    private static void writeTextParallel() throws IOException {
        performance(PDB_DIRECTORY, false, true, TEXT_WRITE);
    }

    private static void writeBinarySequential() throws IOException {
        performance(BCIF_DIRECTORY, true, false, BINARY_WRITE);
    }

    private static void writeBinaryParallel() throws IOException {
        performance(BCIF_DIRECTORY, true, true, BINARY_WRITE);
    }

    private static void readTextSequential() throws IOException {
        performance(PDB_DIRECTORY, false, false, null);
    }

    private static void readTextParallel() throws IOException {
        performance(PDB_DIRECTORY, false, true, null);
    }

    private static void readBinarySequential() throws IOException {
        performance(BCIF_DIRECTORY, true, false, null);
    }

    private static void readBinaryParallel() throws IOException {
        performance(BCIF_DIRECTORY, true, true, null);
    }

    // we define write operations as merely acquiring the InputStream of data to be written without doing any real IO
    private static final Consumer<CifFile> BINARY_WRITE = cifFile -> {
        try {
            CifWriter.writeBinary(cifFile).close();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    };
    private static final Consumer<CifFile> TEXT_WRITE = cifFile -> {
        try {
            CifWriter.writeText(cifFile).close();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    };

    private static void performance(Path basePath, boolean binary, boolean parallel, Consumer<CifFile> downstreamOperation) throws IOException {
        AtomicInteger counter = new AtomicInteger(0);
        int target = (int) pathStream(basePath).count();
        AtomicInteger failed = new AtomicInteger(0);
        long start = System.nanoTime();

        Stream<Path> stream;
        if (parallel) {
            stream = pathStream(basePath).parallel();
        } else {
            stream = pathStream(basePath);
        }

        stream.limit(TOTAL_SIZE).forEach(path -> {
                    int count = counter.incrementAndGet();
                    if (count % CHUNK_SIZE == 0) {
                        long end_chunk = System.nanoTime();
                        System.out.println("[" + count + " / " + target + "] @ " + (((end_chunk - start) /
                                1_000 / count) + " µs per structure"));
                    }

                    try {
                        CifFile cifFile;
                        if (binary) {
                            InputStream inputStream = Files.newInputStream(path);
                            cifFile = CifReader.readBinary(inputStream);
                        } else {
                            InputStream inputStream = new GZIPInputStream(Files.newInputStream(path));
                            cifFile = CifReader.readText(inputStream);
                        }

                        if (downstreamOperation != null) {
                            downstreamOperation.accept(cifFile);
                        }
                    } catch (Exception e) {
                        System.err.println("failed for " + path.toFile().getAbsolutePath());
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
