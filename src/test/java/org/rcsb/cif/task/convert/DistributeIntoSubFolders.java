package org.rcsb.cif.task.convert;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DistributeIntoSubFolders {
    public static void main(String[] args) throws IOException {
        Files.list(Paths.get("/Users/sebastian/mmtf/"))
                .filter(path -> !Files.isDirectory(path))
                .forEach(path -> {
                    try {
                        String name = path.toFile().getName();
                        String middle = name.substring(1, 3);

                        Path middlePath = Paths.get("/Users/sebastian/mmtf/").resolve(middle);

                        if (!Files.exists(middlePath)) {
                            Files.createDirectory(middlePath);
                        }

                        Files.move(path, middlePath.resolve(name));
                    } catch (IOException e) {
                        throw new UncheckedIOException(e);
                    }
                });
    }
}
