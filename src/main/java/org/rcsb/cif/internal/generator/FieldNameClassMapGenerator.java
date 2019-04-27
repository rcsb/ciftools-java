package org.rcsb.cif.internal.generator;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import static org.rcsb.cif.internal.generator.SchemaGenerator.toClassName;

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
                // map to fully qualified class name
                .map(line -> {
                    if (line.contains(".")) {
                        String[] split = line.split("\\.");
                        String baseName = BASE_PACKAGE + "." + toPackageName(split[0]) + "." + toClassName(split[1]);
                        return line + " " + baseName;
                    } else {
                        return line + " " + BASE_PACKAGE + "." + toPackageName(line) + "." + toClassName(line);
                    }
                })

                .forEach(System.out::println);
    }

    private static String toPackageName(String rawName) {
        return toClassName(rawName).toLowerCase();
    }
}
