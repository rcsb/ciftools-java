package org.rcsb.cif.model.binary;

import org.rcsb.cif.binary.codec.BinaryCifCodec;
import org.rcsb.cif.model.Category;
import org.rcsb.cif.model.Column;
import org.rcsb.cif.model.LinkedCaseInsensitiveMap;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BinaryCategory implements Category {
    private final String name;
    private final int rowCount;
    private final Object[] encodedColumns;
    private final List<String> columnNames;
    // index of the first encoded column of each name, case-insensitive
    private final Map<String, Integer> columnIndices;
    private final Column<?>[] decodedColumns;
    private volatile Map<String, Column<?>> allColumns;

    @SuppressWarnings("unchecked")
    public BinaryCategory(String name, int rowCount, Object[] encodedColumns) {
        this.name = name;
        this.rowCount = rowCount;
        this.encodedColumns = encodedColumns;
        List<String> columnNames = new ArrayList<>(encodedColumns.length);
        this.columnIndices = new LinkedCaseInsensitiveMap<>(encodedColumns.length);
        for (int i = 0; i < encodedColumns.length; i++) {
            String columnName = (String) ((Map<String, Object>) encodedColumns[i]).get("name");
            columnNames.add(columnName);
            columnIndices.putIfAbsent(columnName, i);
        }
        this.columnNames = columnNames;
        this.decodedColumns = new Column<?>[encodedColumns.length];
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
    public Column<?> getColumn(String name) {
        Integer index = columnIndices.get(name);
        if (index == null) {
            return new Column.EmptyColumn(name);
        }
        return getColumn(index);
    }

    /**
     * Decodes a column on its first access and caches it. Concurrent first accesses may decode twice: both results are
     * equal and either is kept.
     */
    @SuppressWarnings("unchecked")
    private Column<?> getColumn(int index) {
        Column<?> decodedColumn = decodedColumns[index];
        if (decodedColumn != null) {
            return decodedColumn;
        }

        Map<String, Object> encodedColumn = (Map<String, Object>) encodedColumns[index];
        String columnName = (String) encodedColumn.get("name");
        Object binaryData = BinaryCifCodec.decode((Map<String, Object>) encodedColumn.get("data"));
        int rowCount = Array.getLength(binaryData);
        Map<String, Object> maskMap = (Map<String, Object>) encodedColumn.get("mask");
        int[] mask = (maskMap == null || maskMap.isEmpty() ? null : (int[]) BinaryCifCodec.decode(maskMap));

        if (binaryData instanceof int[]) {
            decodedColumn = new BinaryIntColumn(columnName, rowCount, (int[]) binaryData, mask);
        } else if (binaryData instanceof double[]) {
            decodedColumn = new BinaryFloatColumn(columnName, rowCount, (double[]) binaryData, mask);
        } else {
            decodedColumn = new BinaryStrColumn(columnName, rowCount, (String[]) binaryData, mask);
        }
        decodedColumns[index] = decodedColumn;
        return decodedColumn;
    }

    /**
     * Decodes every column that is not decoded yet.
     * @return all columns in file order
     */
    @Override
    public Map<String, Column<?>> getColumns() {
        Map<String, Column<?>> columns = allColumns;
        if (columns == null) {
            columns = new LinkedCaseInsensitiveMap<>(encodedColumns.length);
            for (int i = 0; i < encodedColumns.length; i++) {
                Column<?> column = getColumn(i);
                columns.putIfAbsent(column.getColumnName(), column);
            }
            allColumns = columns;
        }
        return columns;
    }

    @Override
    public List<String> getColumnNames() {
        return columnNames;
    }

    int decodedColumnCount() {
        int count = 0;
        for (Column<?> decodedColumn : decodedColumns) {
            if (decodedColumn != null) {
                count++;
            }
        }
        return count;
    }
}
