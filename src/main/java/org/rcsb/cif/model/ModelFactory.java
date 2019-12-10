package org.rcsb.cif.model;

import org.rcsb.cif.binary.codec.Codec;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
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

            CATEGORY_MAP = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
            rawMap.entrySet()
                    .stream()
                    .filter(entry -> !entry.getKey().contains("."))
                    .forEach(entry -> CATEGORY_MAP.put(entry.getKey(), forCategoryName(entry.getValue())));

            COLUMN_MAP = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
            rawMap.entrySet()
                    .stream()
                    .filter(entry -> entry.getKey().contains("."))
                    .forEach(entry -> COLUMN_MAP.put(entry.getKey(), forColumnName(entry.getValue())));
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
     * Create a {@link Category} from text data. Tries to find a strict (i.e. concrete implementation by reflection
     * using the internal) instance of the requested {@link Category}.
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
     * Create a {@link Category} from text data. Make no effort to determine the type and roll with {@link BaseCategory}.
     * @param categoryName the category name
     * @param textColumns the text data to provide within this category
     * @return the created instance
     */
    public static Category createCategoryTextGeneric(String categoryName, Map<String, Column> textColumns) {
        return new BaseCategory(categoryName, textColumns);
    }

    /**
     * Create a {@link Category} from binary data. Tries to find a strict (i.e. concrete implementation by reflection
     * using the  internal) instance of the requested {@link Category}.
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
     * Create a {@link Category} from binary data. No efforts to find a concrete implementation of the requested
     * {@link Category}.
     * @param categoryName the category name
     * @param rowCount the row count
     * @param encodedColumns the data, still encoded, to be decoded once requested
     * @return the created instance
     */
    public static Category createCategoryBinaryGeneric(String categoryName, int rowCount, Object[] encodedColumns) {
        return new BaseCategory(categoryName, rowCount, encodedColumns);
    }

    /**
     * Create an empty {@link Category}, void of data. Used, so that the data model does not throw a
     * {@link NullPointerException} ungracefully. Rather the consumer should enquire whether the {@link Category}
     * present (see {@link Category#isDefined()}. Has row count 0 and can report its name.
     * @param name the name this category should report
     * @return an empty category which will report being undefined
     */
    public static Category createEmptyCategory(String name) {
        return new BaseCategory(name);
    }

    /**
     * The creation method for a {@link Column} based on text data which is not yet parsed.
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
        // if we cannot rely on schema, we could parse/digest data until we can make an elaborate guess about the type -
        // however this would be really slow - so everyone is a String now
        return createColumnText(categoryName, columnName, data, startToken, endToken, StrColumn.class);
    }

    /**
     * The creation method for a {@link Column} based on text data which is not yet parsed.
     * @param categoryName the category to retrieve this class from
     * @param columnName the column name to create
     * @param data the raw string data to parse
     * @param startToken the collection of start indices which will be used to extract data
     * @param endToken the collection of end indices which will be used to extract data
     * @param columnType the column type to enforce when not in dictionary
     * @return the text column, ready to parse particular rows
     */
    public static Column createColumnText(String categoryName,
                                          String columnName,
                                          String data,
                                          int[] startToken,
                                          int[] endToken,
                                          Class<? extends Column> columnType) {
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
            if (columnType.equals(IntColumn.class)) {
                return new IntColumn(columnName, rowCount, data, startToken, endToken);
            } else if (columnType.equals(FloatColumn.class)) {
                return new FloatColumn(columnName, rowCount, data, startToken, endToken);
            } else {
                return new StrColumn(columnName, rowCount, data, startToken, endToken);
            }
        }
    }

    /**
     * The creation method for a {@link Column} based on text data which is not yet parsed. Don't make any attempt at
     * determining the type. It's a String!
     * @param columnName the column name to create
     * @param data the raw string data to parse
     * @param startToken the collection of start indices which will be used to extract data
     * @param endToken the collection of end indices which will be used to extract data
     * @return the StrColumn, ready to parse particular rows
     */
    public static Column createColumnTextGeneric(String columnName,
                                                 String data,
                                                 int[] startToken,
                                                 int[] endToken) {
        return new StrColumn(columnName, startToken.length, data, startToken, endToken);
    }

    /**
     * The creation method for a {@link Column} based on binary (still encoded) data.
     * @param categoryName the category name to create
     * @param columnName the column name to create
     * @param encodedColumn a map encompassing all information needed to create this column
     * @return the decoded column
     */
    @SuppressWarnings({"unchecked"})
    public static Column createColumnBinary(String categoryName, String columnName, Map<String, Object> encodedColumn) {
        Object binaryData = Codec.decode((Map<String, Object>) encodedColumn.get("data"));
        int rowCount = Array.getLength(binaryData);
        Map<String, Object> maskMap = (Map<String, Object>) encodedColumn.get("mask");
        int[] mask = (maskMap == null || maskMap.isEmpty() ? null : (int[]) Codec.decode(maskMap));

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
            if (binaryData instanceof int[]) {
                return new IntColumn(columnName, rowCount, binaryData, mask);
            } else if (binaryData instanceof double[]) {
                return new FloatColumn(columnName, rowCount, binaryData, mask);
            } else {
                return new StrColumn(columnName, rowCount, binaryData, mask);
            }
        }
    }
    /**
     * The creation method for a {@link Column} which is absent.
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
