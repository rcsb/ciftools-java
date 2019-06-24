package org.rcsb.cif.task.convert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.zip.GZIPInputStream;

public class UnzipArchive {
    public enum Archive {
        BCIF(Paths.get("/Users/sebastian/bcif/")),
        BCIF_REDUCED(Paths.get("/Users/sebastian/bcif-reduced/")),
        CIF(Paths.get("/var/pdb/")),
        CIF_REDUCED(Paths.get("/Users/sebastian/cif-reduced/")),
        MMTF_REDUCED(Paths.get("/Users/sebastian/mmtf/"));

        private final Path path;

        Archive(Path path) {
            this.path = path;
        }

        public Path getPath() {
            return path;
        }
    }

    public static void main(String[] args) throws IOException {
        Archive archive = Archive.CIF_REDUCED;
        Path outputPath = Paths.get("/Users/sebastian/archive/");

        Files.walk(archive.getPath())
                .filter(path -> !Files.isDirectory(path))
                .forEach(path -> {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new GZIPInputStream(Files.newInputStream(path))));

                        String content = bufferedReader.lines()
                                .collect(Collectors.joining("\n"));
                        String middle = path.toFile().getName().substring(1, 3);

                        Path middlePath = outputPath.resolve(middle);
                        if (!Files.exists(middlePath)) {
                            Files.createDirectory(middlePath);
                        }

                        Files.write(middlePath.resolve(path.toFile().getName()), content.getBytes());

                        bufferedReader.close();
                    } catch (IOException e) {
                        throw new UncheckedIOException(e);
                    }
                });
    }
}
