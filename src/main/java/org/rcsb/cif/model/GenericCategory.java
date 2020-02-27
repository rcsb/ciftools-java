package org.rcsb.cif.model;

import org.rcsb.cif.binary.codec.BinaryCifCodec;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GenericCategory implements Category {
    private final String name;
    private final int rowCount;
    private final List<String> columnNames;

    private final boolean isText;
    private final Map<String, Column> textFields;

    private final Object[] encodedColumns;
    private final Map<String, Column> decodedColumns;
    private final boolean defined;

    public GenericCategory(String name) {
        this.name = name;
        this.rowCount = 0;
        this.columnNames = Collections.emptyList();

        this.isText = false;
        this.textFields = Collections.emptyMap();

        this.encodedColumns = new Object[0];
        this.decodedColumns = Collections.emptyMap();
        this.defined = false;
    }

    public GenericCategory(String name, Map<String, Column> textColumns) {
        this.name = name;
        this.rowCount = textColumns.values()
                .stream()
                .findFirst()
                .map(Column::getRowCount)
                .orElse(0);
        this.columnNames = new ArrayList<>(textColumns.keySet());

        this.isText = true;
        this.textFields = textColumns;

        this.encodedColumns = null;
        this.decodedColumns = null;
        this.defined = true;
    }

    @SuppressWarnings("unchecked")
    public GenericCategory(String name, int rowCount, Object[] encodedColumns) {
        this.name = name;
        this.rowCount = rowCount;

        this.isText = false;
        this.encodedColumns = encodedColumns;
        this.decodedColumns = new LinkedCaseInsensitiveMap<>();
        try {
            this.columnNames = Stream.of(encodedColumns)
                    .map(map -> ((Map<String, Object>) map).get("name"))
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
        return isText ? getTextColumn(name) : getBinaryColumn(name);
    }

    private Column getTextColumn(String name) {
        return textFields.computeIfAbsent(name, StrColumn::new);
    }

    @Override
    public <C extends Column> C getColumn(String name, Function<Column, C> wrapper) {
        return wrapper.apply(getColumn(name));
    }

    @Override
    public List<String> getColumnNames() {
        return columnNames;
    }

    @Override
    public boolean isDefined() {
        return defined;
    }

    @SuppressWarnings("unchecked")
    Column getBinaryColumn(String name) {
        Optional<Map<String, Object>> optional = find(name);
        if (optional.isEmpty()) {
            return new StrColumn(name);
        }
        // cache decoded fields to reuse them if applicable
        if (decodedColumns.containsKey(name)) {
            return decodedColumns.get(name);
        }

        Map<String, Object> encodedColumn = optional.get();
        Object binaryData = BinaryCifCodec.decode((Map<String, Object>) encodedColumn.get("data"));
        int rowCount = Array.getLength(binaryData);
        Map<String, Object> maskMap = (Map<String, Object>) encodedColumn.get("mask");
        int[] mask = (maskMap == null || maskMap.isEmpty() ? null : (int[]) BinaryCifCodec.decode(maskMap));

        Column decodedColumn;
        if (binaryData instanceof int[]) {
            decodedColumn = new IntColumn(name, rowCount, binaryData, mask);
        } else if (binaryData instanceof double[]) {
            decodedColumn = new FloatColumn(name, rowCount, binaryData, mask);
        } else {
            decodedColumn = new StrColumn(name, rowCount, binaryData, mask);
        }
        decodedColumns.put(name, decodedColumn);
        return decodedColumn;
    }

    @SuppressWarnings("unchecked")
    private Optional<Map<String, Object>> find(String name) {
        return Stream.of(encodedColumns)
                .map(m -> (Map<String, Object>) m)
                .filter(m -> name.equalsIgnoreCase((String) m.get("name")))
                .findFirst();
    }
}
