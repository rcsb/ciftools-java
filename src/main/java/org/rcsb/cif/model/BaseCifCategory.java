package org.rcsb.cif.model;

import org.rcsb.cif.schema.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.rcsb.cif.schema.Schema.*;

public class BaseCifCategory implements Category {
    private static final Logger logger = LoggerFactory.getLogger(BaseCifColumn.class);
    private final String name;
    private final int rowCount;
    private final List<String> columnNames;

    protected final boolean isText;
    private final Map<String, CifColumn> textFields;

    private final Object[] encodedColumns;
    private final Map<String, CifColumn> decodedColumns;

    public BaseCifCategory(String name, Map<String, CifColumn> textColumns) {
        this.name = name;
        this.rowCount = textColumns.values()
                .stream()
                .findFirst()
                .map(CifColumn::getRowCount)
                .orElse(0);
        this.columnNames = new ArrayList<>(textColumns.keySet());

        this.isText = true;
        this.textFields = textColumns;

        this.encodedColumns = null;
        this.decodedColumns = null;
    }

    @SuppressWarnings("unchecked")
    public BaseCifCategory(String name, int rowCount, Object[] encodedColumns) {
        this.name = name;
        this.rowCount = rowCount;

        this.isText = false;
        this.encodedColumns = encodedColumns;
        this.decodedColumns = new LinkedHashMap<>();
        try {
            this.columnNames = Stream.of(encodedColumns)
                    .map(map -> ((Map<String, Object>) map).get("name"))
                    .map(String.class::cast)
                    .collect(Collectors.toList());
        } catch(Exception e) {
            throw new RuntimeException(e);
        }

        this.textFields = null;
    }

    @SuppressWarnings("unchecked")
    public static Category create(String catName, Map<String, CifColumn> fields) {
        // well, it's come to this
        // 1. look if category name is in list of considered fields, otherwise don't even bother
        if (filter(catName)) {
            try {
                // 2. if so, try to obtain instance
                Class<? extends BaseCifCategory> category = (Class<? extends BaseCifCategory>) Class.forName(Schema.BASE_PACKAGE
                        + "." + toPackageName(catName) + "." + toClassName(catName));
                return category.getConstructor(String.class, Map.class).newInstance(catName, fields);
            } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
                // though recoverable, any exception points to a flaw in the data model, implementation or schema
                throw new RuntimeException(e);
            }
        } else {
            // 3. if not a known category, roll with base implementation
            return new BaseCifCategory(catName, fields);
        }
    }

    @SuppressWarnings("unchecked")
    public static Category create(String name, int rowCount, Object[] encodedFields) {
        if (filter(name)) {
            try {
                Class<? extends BaseCifCategory> category = (Class<? extends BaseCifCategory>) Class.forName(Schema.BASE_PACKAGE
                        + "." + toPackageName(name) + "." + toClassName(name));
                return category.getConstructor(String.class, int.class, Object[].class).newInstance(name, rowCount, encodedFields);
            } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } else {
            return new BaseCifCategory(name, rowCount, encodedFields);
        }
    }

    @Override
    public String getCategoryName() {
        return name;
    }

    @Override
    public int getRowCount() {
        return rowCount;
    }

    @Override
    public CifColumn getColumn(String name) {
        return isText ? getTextColumn(name) : getBinaryColumn(name);
    }

    protected CifColumn getTextColumn(String name) {
        return textFields.get(name);
    }

    protected CifColumn getBinaryColumn(String name) {
        Optional<Map<String, Object>> optional = find(name);
        // cache decoded fields to reuse them if applicable
        if (!optional.isPresent()) {
            throw new NoSuchElementException(name);
        }
        if (decodedColumns.containsKey(name)) {
            return decodedColumns.get(name);
        }
        logger.debug("decoding binary column: {}.{}", this.name, name);
        CifColumn decodedColumn = BaseCifColumn.create(this.name, name, optional.get());
        decodedColumns.put(name, decodedColumn);
        return decodedColumn;
    }

    @SuppressWarnings("unchecked")
    private Optional<Map<String, Object>> find(String name) {
        return Stream.of(encodedColumns)
                .map(m -> (Map<String, Object>) m)
                .filter(m -> name.equals(m.get("name")))
                .findFirst();
    }

    @Override
    public List<String> getColumnNames() {
        return columnNames;
    }
}
