package org.rcsb.cif.model;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BaseCategory implements Category {
    private final String name;
    private final int rowCount;
    private final List<String> columnNamesEncoded;
    private final List<String> columnNamesLC;

    protected final boolean isText;
    protected final Map<String, Column> textFields;

    protected Object[] encodedColumns;
    private final Map<String, Column> decodedColumns;
    private final boolean defined;

    public BaseCategory(String name) {
        this.name = name;
        this.rowCount = 0;
        this.columnNamesEncoded = Collections.emptyList();
        this.columnNamesLC = Collections.emptyList();

        this.isText = false;
        this.textFields = Collections.emptyMap();

        this.encodedColumns = new Object[0];
        this.decodedColumns = Collections.emptyMap();
        this.defined = false;
    }

    public BaseCategory(String name, Map<String, Column> textColumns) {
        this.name = name;
        this.rowCount = textColumns.values()
                .stream()
                .findFirst()
                .map(Column::getRowCount)
                .orElse(0);
        this.columnNamesEncoded = new ArrayList<>(textColumns.keySet());
        this.columnNamesLC = new ArrayList<>(textColumns.keySet());

        this.isText = true;
        this.textFields = textColumns;

        this.encodedColumns = null;
        this.decodedColumns = null;
        this.defined = true;
    }

    @SuppressWarnings("unchecked")
    public BaseCategory(String name, int rowCount, Object[] encodedColumns) {
        this.name = name;
        this.rowCount = rowCount;

        this.isText = false;
        this.encodedColumns = encodedColumns;
        this.decodedColumns = new LinkedHashMap<>();
        try {
            this.columnNamesEncoded = Stream.of(encodedColumns)
                    .map(map -> ((Map<String, Object>) map).get("name"))
                    .map(String.class::cast)
                    .collect(Collectors.toList());
            this.columnNamesLC = Stream.of(encodedColumns)
                    .map(map -> ((String) ((Map<String, Object>) map).get("name")).toLowerCase())
                    .map(String.class::cast)
                    .collect(Collectors.toList());
        } catch(Exception e) {
            throw new RuntimeException(e);
        }

        this.textFields = null;
        this.defined = true;
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
    public Column getColumn(String name) {
    	name = name.toLowerCase();
        return isText ? getTextColumn(name) : getBinaryColumn(name);
    }

    private Column getTextColumn(String name) {
        return textFields.computeIfAbsent(name, n -> ModelFactory.createEmptyColumn(this.name, n));
    }

    protected Column getBinaryColumn(String name) {
        Optional<Map<String, Object>> optional = find(name);
        // cache decoded fields to reuse them if applicable
        if (!optional.isPresent()) {
            return ModelFactory.createEmptyColumn(this.name, name);
        }
        if (decodedColumns.containsKey(name)) {
            return decodedColumns.get(name);
        }
        Column decodedColumn = ModelFactory.createColumnBinary(this.name, name, optional.get());
        decodedColumns.put(name, decodedColumn);
        return decodedColumn;
    }

    @SuppressWarnings("unchecked")
    private Optional<Map<String, Object>> find(String name) {
        return Stream.of(encodedColumns)
                .map(m -> (Map<String, Object>) m)
                .filter(m -> name.equalsIgnoreCase((String)m.get("name")))
                .findFirst();
    }

    @Override
    public List<String> getColumnNamesEncoded() {
        return columnNamesEncoded;
    }

    @Override
    public List<String> getColumnNames() {
        return columnNamesLC;
    }

    @Override
    public boolean isDefined() {
        return defined;
    }

}
