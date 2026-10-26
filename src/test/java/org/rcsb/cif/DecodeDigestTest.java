package org.rcsb.cif;

import org.junit.jupiter.api.Test;
import org.rcsb.cif.model.Block;
import org.rcsb.cif.model.Category;
import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.model.Column;
import org.rcsb.cif.model.FloatColumn;
import org.rcsb.cif.model.IntColumn;
import org.rcsb.cif.model.StrColumn;
import org.rcsb.cif.schema.StandardSchemata;

import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

/**
 * Pins what the readers produce for every fixture: category names, row counts, and per column its name, kind, and the
 * value kind and typed value of every row. Read changes must leave these digests unchanged unless a change is
 * intended.
 * <ul>
 *     <li><code>-Dciftools.digest.update=true</code> rewrites the golden file instead of asserting</li>
 *     <li><code>-Dciftools.digest.dir=... -Dciftools.digest.out=...</code> digests every CIF/BinaryCIF file below a
 *     directory into a TSV, for an A/B comparison of two builds</li>
 * </ul>
 */
class DecodeDigestTest {
    private static final Path RESOURCES = Paths.get("src", "test", "resources");
    private static final Path GOLDEN = RESOURCES.resolve("digest").resolve("digests.properties");
    private static final List<String> MMCIF_DIRS = List.of("bcif", "cif", "ebi", "snapshot", "source");
    private static final List<String> OTHER_DIRS = List.of("non-mmcif");

    @Test
    void readersMatchPinnedDigests() throws IOException {
        Map<String, String> actual = new TreeMap<>();
        for (String dir : MMCIF_DIRS) {
            for (Path file : listFiles(RESOURCES.resolve(dir))) {
                String key = RESOURCES.relativize(file).toString().replace('\\', '/');
                actual.put(key + ":raw", digestRaw(file));
                actual.put(key + ":mmcif", digestMmCif(file));
            }
        }
        for (String dir : OTHER_DIRS) {
            for (Path file : listFiles(RESOURCES.resolve(dir))) {
                String key = RESOURCES.relativize(file).toString().replace('\\', '/');
                actual.put(key + ":raw", digestRaw(file));
            }
        }
        assertFalse(actual.isEmpty(), "no fixtures found below " + RESOURCES.toAbsolutePath());

        if (Boolean.getBoolean("ciftools.digest.update")) {
            Files.createDirectories(GOLDEN.getParent());
            try (Writer writer = Files.newBufferedWriter(GOLDEN, StandardCharsets.UTF_8)) {
                for (Map.Entry<String, String> entry : actual.entrySet()) {
                    writer.write(entry.getKey().replace(":", "\\:") + "=" + entry.getValue() + "\n");
                }
            }
            return;
        }

        Properties golden = new Properties();
        try (InputStream inputStream = Files.newInputStream(GOLDEN)) {
            golden.load(inputStream);
        }
        Map<String, String> expected = new TreeMap<>();
        golden.forEach((k, v) -> expected.put((String) k, (String) v));
        List<String> differences = new ArrayList<>();
        for (String key : union(expected.keySet(), actual.keySet())) {
            if (!Objects.equals(expected.get(key), actual.get(key))) {
                differences.add(key);
            }
        }
        assertEquals(List.of(), differences, "digests differ");
    }

    private static Set<String> union(Set<String> a, Set<String> b) {
        Set<String> union = new TreeSet<>(a);
        union.addAll(b);
        return union;
    }

    @Test
    void digestExternalDirectory() throws IOException {
        String dir = System.getProperty("ciftools.digest.dir");
        String out = System.getProperty("ciftools.digest.out");
        if (dir == null || out == null) {
            return;
        }

        Path root = Paths.get(dir);
        List<Path> files;
        try (Stream<Path> walk = Files.walk(root)) {
            files = walk.filter(Files::isRegularFile)
                    .filter(DecodeDigestTest::isCifFile)
                    .sorted()
                    .collect(Collectors.toList());
        }
        try (Writer writer = Files.newBufferedWriter(Paths.get(out), StandardCharsets.UTF_8)) {
            for (Path file : files) {
                writer.write(root.relativize(file) + "\t" + digestRaw(file) + "\t" + digestMmCif(file) + "\n");
            }
        }
    }

    private static List<Path> listFiles(Path dir) throws IOException {
        if (!Files.isDirectory(dir)) {
            return List.of();
        }
        try (Stream<Path> list = Files.list(dir)) {
            return list.filter(Files::isRegularFile)
                    .filter(DecodeDigestTest::isCifFile)
                    .sorted()
                    .collect(Collectors.toList());
        }
    }

    private static boolean isCifFile(Path file) {
        String name = file.getFileName().toString();
        return name.endsWith(".cif") || name.endsWith(".bcif") || name.endsWith(".cif.gz") || name.endsWith(".bcif.gz");
    }

    private static String digestRaw(Path file) {
        Digest digest = new Digest();
        try (InputStream inputStream = Files.newInputStream(file)) {
            CifFile cifFile = CifIO.readFromInputStream(inputStream);
            digestBlocks(digest, cifFile.getBlocks());
        } catch (Exception e) {
            digest.add("exception").add(e.getClass().getName());
        }
        return digest.hex();
    }

    private static String digestMmCif(Path file) {
        Digest digest = new Digest();
        try (InputStream inputStream = Files.newInputStream(file)) {
            CifFile cifFile = CifIO.readFromInputStream(inputStream).as(StandardSchemata.MMCIF);
            digestBlocks(digest, cifFile.getBlocks());
        } catch (Exception e) {
            digest.add("exception").add(e.getClass().getName());
        }
        return digest.hex();
    }

    private static void digestBlocks(Digest digest, List<? extends Block> blocks) {
        for (Block block : blocks) {
            digest.add("block").add(block.getBlockHeader());
            // copy the names: some implementations hand out live maps
            List<String> categoryNames = new ArrayList<>(block.getCategories().keySet());
            for (String categoryName : categoryNames) {
                Category category = block.getCategory(categoryName);
                digest.add("category").add(categoryName).add(category.getRowCount());
                for (String columnName : new ArrayList<>(category.getColumnNames())) {
                    Column<?> column;
                    try {
                        column = category.getColumn(columnName);
                    } catch (RuntimeException e) {
                        digest.add("column").add(columnName).add("exception").add(e.getClass().getName());
                        continue;
                    }
                    digestColumn(digest, columnName, column);
                }
            }
        }
    }

    private static void digestColumn(Digest digest, String columnName, Column<?> column) {
        digest.add("column").add(columnName).add(kind(column)).add(column.getRowCount());
        for (int row = 0; row < column.getRowCount(); row++) {
            try {
                digest.add(column.getValueKind(row).ordinal());
                if (column instanceof IntColumn) {
                    digest.add(((IntColumn) column).get(row));
                } else if (column instanceof FloatColumn) {
                    digest.add(Double.doubleToRawLongBits(((FloatColumn) column).get(row)));
                } else if (column instanceof StrColumn) {
                    digest.add(((StrColumn) column).get(row));
                } else {
                    digest.add(column.getStringData(row));
                }
            } catch (RuntimeException e) {
                digest.add("exception").add(e.getClass().getName());
            }
        }
    }

    private static String kind(Column<?> column) {
        if (column instanceof IntColumn) {
            return "int";
        } else if (column instanceof FloatColumn) {
            return "float";
        } else if (column instanceof StrColumn) {
            return "str";
        } else {
            return "untyped";
        }
    }

    private static class Digest {
        private final MessageDigest messageDigest;

        Digest() {
            try {
                this.messageDigest = MessageDigest.getInstance("SHA-256");
            } catch (NoSuchAlgorithmException e) {
                throw new IllegalStateException(e);
            }
        }

        Digest add(String value) {
            byte[] bytes = value == null ? new byte[] { -1 } : value.getBytes(StandardCharsets.UTF_8);
            add(bytes.length);
            messageDigest.update(bytes);
            return this;
        }

        Digest add(long value) {
            for (int i = 0; i < 8; i++) {
                messageDigest.update((byte) (value >>> (8 * i)));
            }
            return this;
        }

        String hex() {
            StringBuilder hex = new StringBuilder();
            for (byte b : messageDigest.digest()) {
                hex.append(String.format("%02x", b));
            }
            return hex.toString();
        }
    }
}
