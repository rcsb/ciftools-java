package org.rcsb.cif.task.convert;

import org.rcsb.cif.CifIO;
import org.rcsb.cif.CifOptions;
import org.rcsb.cif.TestHelper;
import org.rcsb.cif.model.CifFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * Convert to BCIF and CIF files containing similar data as found in MMTF files
 */
public class ConvertCifToReducedFiles {
    private static final List<String> CATEGORY_WHITELIST = new BufferedReader(new InputStreamReader(TestHelper.getInputStream("mmtf-filter.csv")))
            .lines()
            .filter(line -> !line.isEmpty())
            .filter(line -> !line.contains("."))
            .collect(Collectors.toList());
    private static final List<String> COLUMN_WHITELIST = new BufferedReader(new InputStreamReader(TestHelper.getInputStream("mmtf-filter.csv")))
            .lines()
            .filter(line -> !line.isEmpty())
            .filter(line -> line.contains("."))
            .collect(Collectors.toList());

    private static final Path PDB_DIRECTORY = Paths.get("/var/pdb/");
    private static final Path BCIF_DIRECTORY = Paths.get("/Users/sebastian/bcif-reduced/");
    private static final Path CIF_DIRECTORY = Paths.get("/Users/sebastian/cif-reduced/");
    private static final int CHUNK_SIZE = 250;

    public static void main(String[] args) throws IOException {
        System.out.println("whitelisting categories:");
        System.out.println(CATEGORY_WHITELIST);

        System.out.println("whitelisting columns:");
        System.out.println(COLUMN_WHITELIST);

        AtomicInteger counter = new AtomicInteger(0);
        final int target = (int) Files.walk(PDB_DIRECTORY).filter(path -> !Files.isDirectory(path)).count();
        AtomicInteger failed = new AtomicInteger(0);

        long start = System.nanoTime();

        Files.walk(PDB_DIRECTORY)
                .parallel()
                .filter(path -> !Files.isDirectory(path))
                .forEach(path -> {
                    int count = counter.incrementAndGet();
                    if (count % CHUNK_SIZE == 0) {
                        long end_chunk = System.nanoTime();
                        System.out.println("[" + count + " / " + target + "] @ " + (((end_chunk - start) /
                                1_000 / count) + " µs per structure"));
                    }

                    try {
                        Path bcifSubDir = BCIF_DIRECTORY.resolve(path.getParent().toFile().getName());
                        String bcifFilename = path.toFile().getName().replace(".cif.", ".bcif.");
                        if (!Files.exists(bcifSubDir)) {
                            Files.createDirectory(bcifSubDir);
                        }
                        Path bcifOutputPath = bcifSubDir.resolve(bcifFilename);

                        Path cifSubDir = CIF_DIRECTORY.resolve(path.getParent().toFile().getName());
                        String cifFilename = path.toFile().getName();
                        if (!Files.exists(cifSubDir)) {
                            Files.createDirectory(cifSubDir);
                        }
                        Path cifOutputPath = cifSubDir.resolve(cifFilename);

                        // skip existing files
                        if (Files.exists(bcifOutputPath) && Files.exists(cifOutputPath)) {
                            return;
                        }

                        CifFile cifFile = CifIO.readFromPath(path);

                        CifIO.writeBinary(cifFile,
                                bcifOutputPath,
                                CifOptions.builder()
                                        .categoryWhitelist(CATEGORY_WHITELIST)
                                        .columnWhitelist(COLUMN_WHITELIST)
                                        .gzip(true)
                                        .build());
                        CifIO.writeText(cifFile,
                                cifOutputPath,
                                CifOptions.builder()
                                        .categoryWhitelist(CATEGORY_WHITELIST)
                                        .columnWhitelist(COLUMN_WHITELIST)
                                        .gzip(true)
                                        .build());
                    } catch (Exception e) {
                        e.printStackTrace();
                        failed.incrementAndGet();
                    }
                });
        long end = System.nanoTime();
        System.out.println((end - start) / 1_000_000_000 + " s");
        System.out.println("failed for " + failed.intValue() + " structures");
    }
}
