package org.rcsb.cif.model;

import org.rcsb.cif.binary.codec.Codec;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * The factory for model instances for cases when they are somewhat difficult or ambiguously to obtain.
 */
public class ModelFactory {
    private static final Map<String, Class<? extends BaseCategory>> CATEGORY_MAP;
    private static final Map<String, Class<? extends BaseColumn>> COLUMN_MAP;
    static {
        // create class name lookup for reflection
        try {
            InputStream inputStream = Thread.currentThread()
                    .getContextClassLoader()
                    .getResourceAsStream("field-name-class-map.csv");
            Objects.requireNonNull(inputStream, "could not load class name map");
            BufferedReader lookupReader = new BufferedReader(new InputStreamReader(inputStream));

            Map<String, String> rawMap = lookupReader.lines()
                    .map(line -> line.split(" "))
                    .collect(Collectors.toMap(split -> split[0], split -> split[1]));
            lookupReader.close();

            CATEGORY_MAP = rawMap.entrySet()
                    .stream()
                    .filter(entry -> !entry.getKey().contains("."))
                    .collect(Collectors.toMap(Map.Entry::getKey,
                            (Map.Entry<String, String> entry) -> forCategoryName(entry.getValue())));

            COLUMN_MAP = rawMap.entrySet()
                    .stream()
                    .filter(entry -> entry.getKey().contains("."))
                    .collect(Collectors.toMap(Map.Entry::getKey,
                            (Map.Entry<String, String> entry) -> forColumnName(entry.getValue())));
        } catch (IOException e) {
            throw new UncheckedIOException("could not load class name map", e);
        }
    }

    @SuppressWarnings("unchecked")
    private static Class<? extends BaseCategory> forCategoryName(String categoryName) {
        try {
            return (Class<? extends BaseCategory>) Class.forName(categoryName);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("could not acquire category class with name: " + categoryName, e);
        }
    }

    private static Class<? extends BaseColumn> forColumnName(String columnName) {
        // for some reason, the package name is provided in the lookup
        columnName = columnName.split("\\.")[columnName.split("\\.").length - 1];
        switch (columnName) {
            case "FloatColumn":
                return FloatColumn.class;
            case "IntColumn":
                return IntColumn.class;
            case "StrColumn":
                return StrColumn.class;
            default:
                throw new IllegalArgumentException(columnName + " is not known - cannot acquire prototype");
        }
    }

    /**
     * Create a Category from text data. Tries to find a strict (i.e. concrete implementation by reflection using the
     * internal) instance of the requested category.
     * @param categoryName the category name
     * @param textColumns the text data to provide within this category
     * @return the created instance
     */
    public static Category createCategoryText(String categoryName, Map<String, Column> textColumns) {
        // retrieve category class
        Class<? extends BaseCategory> categoryClass = CATEGORY_MAP.get(categoryName);
        if (categoryClass != null) {
            try {
                return categoryClass.getConstructor(String.class, Map.class)
                        .newInstance(categoryName, textColumns);
            } catch (NoSuchMethodException | InstantiationException | IllegalAccessException |
                    InvocationTargetException e) {
                throw new RuntimeException("could not instantiate category class", e);
            }
        } else {
            return new BaseCategory(categoryName, textColumns);
        }
    }

    /**
     * Create a Category from binary data. Tries to find a strict (i.e. concrete implementation by reflection using the
     * internal) instance of the requested category.
     * @param categoryName the category name
     * @param rowCount the row count
     * @param encodedColumns the data, still encoded, to be decoded once requested
     * @return the created instance
     */
    public static Category createCategoryBinary(String categoryName, int rowCount, Object[] encodedColumns) {
        // retrieve category class
        Class<? extends BaseCategory> categoryClass = CATEGORY_MAP.get(categoryName);
        if (categoryClass != null) {
            try {
                return categoryClass.getConstructor(String.class, int.class, Object[].class)
                        .newInstance(categoryName, rowCount, encodedColumns);
            } catch (NoSuchMethodException | InstantiationException | IllegalAccessException |
                    InvocationTargetException e) {
                throw new RuntimeException("could not instantiate category class", e);
            }
        } else {
            return new BaseCategory(categoryName, rowCount, encodedColumns);
        }
    }

    /**
     * Create an empty Category, void of data. Used, so that the data model does not throw NullPointerExceptions
     * ungracefully. Rather the consumer should enquire whether the Category present (see {@link Category#isDefined()}.
     * Has row count 0 and can report its name.
     * @param name the name this category should report
     * @return an empty category which will report being undefined
     */
    public static Category createEmptyCategory(String name) {
        return new BaseCategory(name);
    }

    /**
     * Create a single row column based on text data.
     * @param categoryName the category to retrieve this class from
     * @param columnName the column name to create
     * @param data the raw string data\ to parse
     * @param startToken the start index which will be used to extract data
     * @param endToken the end index which will be used to extract data
     * @return the text column
     * @see ModelFactory#createColumnText(String, String, String, int[], int[])
     */
    public static Column createColumnText(String categoryName,
                                          String columnName,
                                          String data,
                                          int startToken,
                                          int endToken) {
        return createColumnText(categoryName, columnName, data, new int[] { startToken }, new int[] { endToken });
    }

    /**
     * The creation method for a column based on text data which is not yet parsed.
     * @param categoryName the category to retrieve this class from
     * @param columnName the column name to create
     * @param data the raw string data to parse
     * @param startToken the collection of start indices which will be used to extract data
     * @param endToken the collection of end indices which will be used to extract data
     * @return the text column, ready to parse particular rows
     */
    public static Column createColumnText(String categoryName,
                                          String columnName,
                                          String data,
                                          int[] startToken,
                                          int[] endToken) {
        int rowCount = startToken.length;
        Class<? extends BaseColumn> columnClass = COLUMN_MAP.get(categoryName + "." + columnName);
        if (columnClass != null) {
            try {
                return columnClass.getConstructor(String.class, int.class, String.class, int[].class, int[].class)
                        .newInstance(columnName, rowCount, data, startToken, endToken);
            } catch (NoSuchMethodException | InstantiationException | IllegalAccessException |
                    InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } else {
            // cannot rely on schema, we could parse/digest data until we can make an elaborate guess about the type -
            // however this would be really slow
            return new StrColumn(columnName, rowCount, data, startToken, endToken);
        }
    }

    /**
     * The creation method for a column based on binary (still encoded) data.
     * @param categoryName the category to retrieve this class from
     * @param columnName the column name to create
     * @param encodedColumn a map encompassing all information needed to create this column
     * @return the decoded column
     */
    @SuppressWarnings("unchecked")
    public static Column createColumnBinary(String categoryName, String columnName, Map<String, Object> encodedColumn) {
        Object binaryData = Codec.decode((Map<String, Object>) encodedColumn.get("data"));
        boolean isIntArray = binaryData instanceof int[];
        boolean isDoubleArray = binaryData instanceof double[];
        int rowCount = isIntArray ? ((int[]) binaryData).length :
                isDoubleArray ? ((double[]) binaryData).length : ((String[]) binaryData).length;
        boolean hasMask = encodedColumn.containsKey("mask") && encodedColumn.get("mask") != null &&
                !((Map) encodedColumn.get("mask")).isEmpty();
        int[] mask = hasMask ? (int[]) Codec.decode((Map<String, Object>) encodedColumn.get("mask")) : null;

        Class<? extends BaseColumn> columnClass = COLUMN_MAP.get(categoryName + "." + columnName);
        if (columnClass != null) {
            try {
                return columnClass.getConstructor(String.class, int.class, Object.class, int[].class)
                        .newInstance(columnName, rowCount, binaryData, mask);
            } catch (NoSuchMethodException | InstantiationException | IllegalAccessException |
                    InvocationTargetException e) {
                throw new RuntimeException("could not instantiate column class", e);
            }
        } else {
            // binary columns can be readily be packed into their appropriate data type
            if (isIntArray) {
                return new IntColumn(columnName, rowCount, binaryData, mask);
            } else if (isDoubleArray) {
                return new FloatColumn(columnName, rowCount, binaryData, mask);
            } else {
                return new StrColumn(columnName, rowCount, binaryData, mask);
            }
        }
    }

    /**
     * The creation method for absent columns.
     * @param categoryName the category to retrieve this class from
     * @param columnName the column name to create
     * @return an empty instance of this column
     */
    public static Column createEmptyColumn(String categoryName, String columnName) {
        Class<? extends BaseColumn> columnClass = COLUMN_MAP.get(categoryName + "." + columnName);
        if (columnClass != null) {
            try {
                return columnClass.getConstructor(String.class)
                        .newInstance(columnName);
            } catch (NoSuchMethodException | InstantiationException | IllegalAccessException |
                    InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } else {
            return new StrColumn(columnName);
        }
    }
}
