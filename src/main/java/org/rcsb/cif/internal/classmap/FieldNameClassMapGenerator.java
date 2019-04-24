package org.rcsb.cif.internal.classmap;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Most effort during reflection is to compose the correct class name with full package and escaped file name. Omit this
 * by creating a lookup table once, which ties raw Cif category and column names to the proper Java classes.
 */
public class FieldNameClassMapGenerator {
    private static final String BASE_PACKAGE = "org.rcsb.cif.model";

    // TODO this will break as soon as matrices with dimensions not matching 3x3 will be introduced into the model
    private static final List<int[]> MATRIX_SUFFIXES = Stream.of("1,1", "1,2", "1,3", "2,1", "2,2", "2,3", "3,1", "3,2", "3,3")
            .map(line -> line.split(","))
            .map(split -> new int[] { Integer.parseInt(split[0]), Integer.parseInt(split[1]) })
            .collect(Collectors.toList());

    public static void main(String[] args) {
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("mmcif-field-names.csv");
        new BufferedReader(new InputStreamReader(inputStream))
                .lines()

                // filter empty lines
                .filter(line -> !line.isEmpty())

                // entry additional entry for category mapping
                .map(line -> line.split("\\."))
                .flatMap(line -> Stream.of(line[0], line[0] + "." + line[1]))
                .distinct()

                // map to fully qualified class name
                .flatMap(line -> {
                    if (line.contains(".")) {
                        String[] split = line.split("\\.");
                        String baseName = BASE_PACKAGE + "." + toPackageName(split[0]) + "." + toClassName(split[1]);
                        if (baseName.endsWith("Vector")) {
                            return IntStream.range(1, 4)
                                    .mapToObj(i -> line + "[" + i + "]" + " " + baseName + i);
                        } else if (baseName.endsWith("Matrix")) {
                            return MATRIX_SUFFIXES.stream()
                                    .map(suffix -> line + "[" + suffix[0] + "][" + suffix[1] + "] " + baseName + suffix[0] + suffix[1]);
                        } else {
                            return Stream.of(line + " " + baseName);
                        }
                    } else {
                        return Stream.of(line + " " + BASE_PACKAGE + "." + toPackageName(line) + "." + toClassName(line));
                    }
                })

                .forEach(System.out::println);
    }

    private static String toClassName(String rawName) {
        String name = Pattern.compile("_").splitAsStream(rawName)
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .collect(Collectors.joining(""))
                // remove invalid characters
                .replaceAll("[/\\\\\\- (){},;:'<>?+=]", "_")
                .replaceAll("_+", "_");
        if (name.equals("Class")) {
            return "Clazz";
        } else if (Character.isDigit(name.charAt(0))) {
            return "_" + name;
        }
        return name;
    }

    private static String toPackageName(String rawName) {
        return toClassName(rawName).toLowerCase();
    }
}
