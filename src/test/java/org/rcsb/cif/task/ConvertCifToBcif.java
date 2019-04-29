package org.rcsb.cif.task;

import org.rcsb.cif.CifReader;
import org.rcsb.cif.CifWriter;
import org.rcsb.cif.model.CifFile;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;
import java.util.zip.GZIPInputStream;

public class ConvertCifToBcif {
    private static final Path PDB_DIRECTORY = Paths.get("/var/pdb/");
    private static final Path BCIF_DIRECTORY = Paths.get("/Users/sebastian/bcif/");
    private static final int CHUNK_SIZE = 100;
    private static final boolean PARALLEL = true;

    public static void main(String[] args) throws IOException {
        AtomicInteger counter = new AtomicInteger(0);
        final int target = (int) pathStream(PDB_DIRECTORY).count();
        AtomicInteger failed = new AtomicInteger(0);

        long start = System.nanoTime();

        Stream<Path> stream;
        if (PARALLEL) {
            stream = pathStream(PDB_DIRECTORY).parallel();
        } else {
            stream = pathStream(PDB_DIRECTORY);
        }
        stream.forEach(path -> {
            int count = counter.incrementAndGet();
            if (count % CHUNK_SIZE == 0) {
                long end_chunk = System.nanoTime();
                System.out.println("[" + count + " / " + target + "] @ " + (((end_chunk - start) /
                        1_000_000 / count) + " ms per structure"));
            }

            try {
                Path subDir = BCIF_DIRECTORY.resolve(path.getParent().toFile().getName());
                String filename = path.toFile().getName().replace(".cif.gz", ".bcif");
                if (!Files.exists(subDir)) {
                    Files.createDirectory(subDir);
                }
                Path outputPath = subDir.resolve(filename);

                InputStream inputStream = new GZIPInputStream(Files.newInputStream(path));
                CifFile cifFile = CifReader.readText(inputStream);
                InputStream outputStream = CifWriter.writeBinary(cifFile);

                Files.copy(outputStream, outputPath, StandardCopyOption.REPLACE_EXISTING);

                inputStream.close();
                outputStream.close();
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
        return Files.walk(PDB_DIRECTORY)
                .filter(path -> !Files.isDirectory(path));
    }
}
