package org.rcsb.cif.binary;

import org.rcsb.cif.api.Category;
import org.rcsb.cif.api.Column;
import org.rcsb.cif.binary.codec.Decoder;

import java.util.HashMap;
import java.util.Map;

public class BinaryCategory implements Category {
    private final String name;
    private final int columnCount;
    private final int rowCount;
    private final Map<String, Map<String, Object>> columns;

    public BinaryCategory(Map<String, Object> category) {
        this.name = (String) category.get("name");
        this.rowCount = (int) category.get("rowCount");

        this.columns = new HashMap<>();
        for (Object submap : (Object[]) category.get("columns")) {
            Map<String, Object> binaryColumn = (Map<String, Object>) submap;
            columns.put((String) binaryColumn.get("name"), binaryColumn);
        }
        this.columnCount = columns.size();
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
    public int getColumnCount() {
        return columnCount;
    }

    @Override
    public Column getColumn(String name) {
        Map<String, Object> w = columns.get(name);
        return w == null ? Column.UNDEFINED_COLUMN : wrapColumn(w);
    }

    private Column wrapColumn(Map<String, Object> column) {
        Object data = column.get("data");
        if (data == null) {
            return Column.UNDEFINED_COLUMN;
        }
        Object decodedData = Decoder.decode(column);
        int[] mask = null;
        if (column.get("mask") != null) {
            mask = (int[]) Decoder.decode((Map<String, Object>) column.get("mask"));
            //TODO add mask support
        }
        if (decodedData instanceof int[]) {
            return new IntegerColumn((int[]) decodedData);
        } else if (decodedData instanceof double[]) {
            return new DoubleColumn((double[]) decodedData);
        } else {
            return new StringColumn((String[]) decodedData);
        }
    }
}
