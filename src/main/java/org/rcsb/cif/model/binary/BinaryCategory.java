package org.rcsb.cif.model.binary;

import org.rcsb.cif.binary.codec.BinaryCifCodec;
import org.rcsb.cif.model.Category;
import org.rcsb.cif.model.Column;
import org.rcsb.cif.model.LinkedCaseInsensitiveMap;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BinaryCategory implements Category {
    private final String name;
    private final int rowCount;
    private final Object[] encodedColumns;
    private final Map<String, Column<?>> decodedColumns;
    private final List<String> columnNames;

    @SuppressWarnings("unchecked")
    public BinaryCategory(String name, int rowCount, Object[] encodedColumns) {
        this.name = name;
        this.rowCount = rowCount;
        this.encodedColumns = encodedColumns;
        this.decodedColumns = new LinkedCaseInsensitiveMap<>();
        this.columnNames = Stream.of(encodedColumns)
                .map(map -> ((Map<String, Object>) map).get("name"))
                .map(String.class::cast)
                .collect(Collectors.toList());
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
    @SuppressWarnings("unchecked")
    public Column<?> getColumn(String name) {
        Optional<Map<String, Object>> optional = find(name);
        if (optional.isEmpty()) {
            return new Column.EmptyColumn(name);
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

        Column<?> decodedColumn;
        if (binaryData instanceof int[]) {
            decodedColumn = new BinaryIntColumn(name, rowCount, (int[]) binaryData, mask);
        } else if (binaryData instanceof double[]) {
            decodedColumn = new BinaryFloatColumn(name, rowCount, (double[]) binaryData, mask);
        } else {
            decodedColumn = new BinaryStrColumn(name, rowCount, (String[]) binaryData, mask);
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

    @Override
    public Map<String, Column<?>> getColumns() {
        // touch every column to ensure decoding
        columnNames.forEach(this::getColumn);
        return decodedColumns;
    }

    @Override
    public List<String> getColumnNames() {
        return columnNames;
    }
}
