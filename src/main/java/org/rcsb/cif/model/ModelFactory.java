package org.rcsb.cif.model;

import org.rcsb.cif.binary.codec.BinaryCifCodec;
import org.rcsb.cif.binary.codec.MessagePackCodec;

import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * The factory for model instances for cases when they are somewhat difficult or ambiguously to obtain.
 */
public class ModelFactory {
    private static final Map<String, SchemaHandler> SCHEMA_MAP = Collections.synchronizedMap(new TreeMap<>(String.CASE_INSENSITIVE_ORDER));

    static class SchemaHandler {
        private final Map<String, Constructor<? extends BaseCategory>> textCategory;
        private final Map<String, Constructor<? extends BaseCategory>> binaryCategory;
        private final Set<String> intColumns;
        private final Set<String> floatColumns;
        private final Set<String> strColumns;

        SchemaHandler(Map<String, Constructor<? extends BaseCategory>> textCategory, Map<String, Constructor<? extends BaseCategory>> binaryCategory, Set<String> intColumns, Set<String> floatColumns, Set<String> strColumns) {
            this.textCategory = textCategory;
            this.binaryCategory = binaryCategory;
            this.intColumns = intColumns;
            this.floatColumns = floatColumns;
            this.strColumns = strColumns;
        }

        Category construct(String categoryName, Map<String, Column> textColumns) {
            Constructor<? extends BaseCategory> constructor = textCategory.get(categoryName);
            // no constructor
            if (constructor == null) {
                return new BaseCategory(categoryName, textColumns);
            }
            // we can delegate
            try {
                return textCategory.get(categoryName).newInstance(categoryName, textColumns);
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException("could not instantiate category class", e);
            }
        }

        Category construct(String categoryName, int rowCount, Object[] encodedColumns) {
            Constructor<? extends BaseCategory> constructor = binaryCategory.get(categoryName);
            // no constructor
            if (constructor == null) {
                return new BaseCategory(categoryName, rowCount, encodedColumns);
            }
            // we can delegate
            try {
                return binaryCategory.get(categoryName).newInstance(categoryName, rowCount, encodedColumns);
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException("could not instantiate category class", e);
            }
        }

        Column construct(String categoryName, String columnName, int rowCount, String data, int[] startToken, int[] endToken, Class<? extends Column> columnType) {
            String name = categoryName + "." + columnName;
            if (intColumns.contains(name)) {
                return new IntColumn(columnName, rowCount, data, startToken, endToken);
            } else if (floatColumns.contains(name)) {
                return new FloatColumn(columnName, rowCount, data, startToken, endToken);
            } else if (strColumns.contains(name)) {
                return new StrColumn(columnName, rowCount, data, startToken, endToken);
            } else {
                return fallbackToTextByType(columnName, rowCount, data, startToken, endToken, columnType);
            }
        }

        Column construct(String categoryName, String columnName, int rowCount, Object binaryData, int[] mask) {
            String name = categoryName + "." + columnName;
            if (intColumns.contains(name)) {
                return new IntColumn(columnName, rowCount, binaryData, mask);
            } else if (floatColumns.contains(name)) {
                return new FloatColumn(columnName, rowCount, binaryData, mask);
            } else if (strColumns.contains(name)) {
                return new StrColumn(columnName, rowCount, binaryData, mask);
            } else {
                return fallbackToBinaryByData(columnName, rowCount, binaryData, mask);
            }
        }

        Column construct(String categoryName, String columnName) {
            String name = categoryName + "." + columnName;
            if (intColumns.contains(name)) {
                return new IntColumn(columnName);
            } else if (floatColumns.contains(name)) {
                return new FloatColumn(columnName);
            } else {
                return new StrColumn(columnName);
            }
        }
    }

    private static Column fallbackToTextByType(String columnName, int rowCount, String data, int[] startToken, int[] endToken, Class<? extends Column> columnType) {
        if (columnType.equals(IntColumn.class)) {
            return new IntColumn(columnName, rowCount, data, startToken, endToken);
        } else if (columnType.equals(FloatColumn.class)) {
            return new FloatColumn(columnName, rowCount, data, startToken, endToken);
        } else {
            return new StrColumn(columnName, rowCount, data, startToken, endToken);
        }
    }

    private static Column fallbackToBinaryByData(String columnName, int rowCount, Object binaryData, int[] mask) {
        if (binaryData instanceof int[]) {
            return new IntColumn(columnName, rowCount, binaryData, mask);
        } else if (binaryData instanceof double[]) {
            return new FloatColumn(columnName, rowCount, binaryData, mask);
        } else {
            return new StrColumn(columnName, rowCount, binaryData, mask);
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
        String topLevel = toTopLevel(categoryName);
        SchemaHandler schemaHandler = SCHEMA_MAP.computeIfAbsent(topLevel, ModelFactory::ensureProperties);
        if (schemaHandler != null) {
            return schemaHandler.construct(categoryName, textColumns);
        } else {
            return new BaseCategory(categoryName, textColumns);
        }
    }

    private static String toTopLevel(String categoryName) {
        int index = categoryName.indexOf("_");
        return index != -1 ? categoryName.substring(0, index) : categoryName;
    }

    @SuppressWarnings("unchecked")
    private static SchemaHandler ensureProperties(String topLevel) {
        // acquire property file
        InputStream inputStream = Thread.currentThread()
                .getContextClassLoader()
                .getResourceAsStream("class-map/" + topLevel + ".bin");

        // top-level is not 'known' - need to return map to populate map correctly (null values are needed to avoid further tries on failed operations)
        if (inputStream == null) {
            return null;
        }

        try {
            Map<String, Object> schemaMap = MessagePackCodec.decode(inputStream);
            Map<String, Constructor<? extends BaseCategory>> textConstructors = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
            Map<String, Constructor<? extends BaseCategory>> binaryConstructors = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
            Set<String> intColumns = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
            Set<String> floatColumns = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
            Set<String> strColumns = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);

            for (Map.Entry<String, Object> entry : schemaMap.entrySet()) {
                String categoryName = entry.getKey();
                Object[] value = (Object[]) entry.getValue();
                String categoryConstructorName = (String) value[0];
                Class<? extends BaseCategory> clazz = (Class<? extends BaseCategory>) Class.forName(categoryConstructorName);
                textConstructors.put(categoryName, clazz.getConstructor(String.class, Map.class));
                binaryConstructors.put(categoryName, clazz.getConstructor(String.class, int.class, Object[].class));
                for (Object i : (Object[]) value[1]) {
                    intColumns.add(categoryName + "." + i);
                }
                for (Object f : (Object[]) value[2]) {
                    floatColumns.add(categoryName + "." + f);
                }
                for (Object s : (Object[]) value[3]) {
                    strColumns.add(categoryName + "." + s);
                }
            }

            return new SchemaHandler(textConstructors, binaryConstructors, intColumns, floatColumns, strColumns);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            throw new RuntimeException(e);
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
        String topLevel = toTopLevel(categoryName);
        SchemaHandler schemaHandler = SCHEMA_MAP.computeIfAbsent(topLevel, ModelFactory::ensureProperties);
        if (schemaHandler != null) {
            return schemaHandler.construct(categoryName, rowCount, encodedColumns);
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
        String topLevel = toTopLevel(categoryName);
        SchemaHandler schemaHandler = SCHEMA_MAP.computeIfAbsent(topLevel, ModelFactory::ensureProperties);
        int rowCount = startToken.length;
        if (schemaHandler != null) {
            return schemaHandler.construct(categoryName, columnName, rowCount, data, startToken, endToken, columnType);
        } else {
            return fallbackToTextByType(columnName, rowCount, data, startToken, endToken, columnType);
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
        Object binaryData = BinaryCifCodec.decode((Map<String, Object>) encodedColumn.get("data"));
        int rowCount = Array.getLength(binaryData);
        Map<String, Object> maskMap = (Map<String, Object>) encodedColumn.get("mask");
        int[] mask = (maskMap == null || maskMap.isEmpty() ? null : (int[]) BinaryCifCodec.decode(maskMap));

        String topLevel = toTopLevel(categoryName);
        SchemaHandler schemaHandler = SCHEMA_MAP.computeIfAbsent(topLevel, ModelFactory::ensureProperties);
        if (schemaHandler != null) {
            return schemaHandler.construct(categoryName, columnName, rowCount, binaryData, mask);
        } else {
            // binary columns can be readily be packed into their appropriate data type
            return fallbackToBinaryByData(columnName, rowCount, binaryData, mask);
        }
    }
    /**
     * The creation method for a {@link Column} which is absent.
     * @param categoryName the category to retrieve this class from
     * @param columnName the column name to create
     * @return an empty instance of this column
     */
    public static Column createEmptyColumn(String categoryName, String columnName) {
        String topLevel = toTopLevel(categoryName);
        SchemaHandler schemaHandler = SCHEMA_MAP.computeIfAbsent(topLevel, ModelFactory::ensureProperties);
        if (schemaHandler != null) {
            return schemaHandler.construct(categoryName, columnName);
        } else {
            return new StrColumn(columnName);
        }
    }
}
