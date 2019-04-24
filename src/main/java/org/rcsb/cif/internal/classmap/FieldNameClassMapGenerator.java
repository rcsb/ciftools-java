package org.rcsb.cif.internal.classmap;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Most effort during reflection is to compose the correct class name with full package and escaped file name. Omit this
 * by creating a lookup table once, which ties raw Cif category and column names to the proper Java classes.
 */
public class FieldNameClassMapGenerator {
    private static final String BASE_PACKAGE = "org.rcsb.cif.model";

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
                .map(line -> {
                    if (line.contains(".")) {
                        String[] split = line.split("\\.");
                        return line + " " + BASE_PACKAGE + "." + toPackageName(split[0]) + "." + toClassName(split[1]);
                    } else {
                        return line + " " + BASE_PACKAGE + "." + toPackageName(line) + "." + toClassName(line);
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
