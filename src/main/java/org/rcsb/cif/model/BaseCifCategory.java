package org.rcsb.cif.model;

import org.rcsb.cif.model.internal.UnknownFieldException;

import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.rcsb.cif.schema.SchemaGenerator.toClassName;

public abstract class BaseCifCategory implements CifCategory {
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

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getRowCount() {
        return rowCount;
    }

    @Override
    public CifColumn getColumn(String name) {
        return isText ? getTextColumn(name) : getBinaryColumn(name, toClassName(name));
    }

    protected CifColumn getTextColumn(String name) {
        return textFields.get(name);
    }

    protected CifColumn getBinaryColumn(String name, String className) {
        Optional<Map<String, Object>> optional = find(name);
        try {
            Class<?> columnClass = Class.forName(className);
            // cache decoded fields to reuse them if applicable
            if (!optional.isPresent()) {
                throw new UnknownFieldException(name);
            }
            if (decodedColumns.containsKey(name)) {
                return decodedColumns.get(name);
            }
            Class<? extends Map> mapClass = decodedColumns.getClass();
            CifColumn decodedColumn = (CifColumn) columnClass.getConstructor(mapClass).newInstance(optional.get());
            decodedColumns.put(name, decodedColumn);
            return decodedColumn;
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
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
