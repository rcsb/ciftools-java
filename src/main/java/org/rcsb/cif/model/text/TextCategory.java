package org.rcsb.cif.model.text;

import org.rcsb.cif.model.Category;
import org.rcsb.cif.model.Column;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TextCategory implements Category {
    private final String name;
    private final int rowCount;
    private final Map<String, Column> textFields;
    private final List<String> columnNames;

    public TextCategory(String name, Map<String, Column> textColumns) {
        this.name = name;
        this.rowCount = textColumns.values()
                .stream()
                .findFirst()
                .map(Column::getRowCount)
                .orElse(0);
        this.textFields = textColumns;
        this.columnNames = new ArrayList<>(textColumns.keySet());
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
        return textFields.computeIfAbsent(name, Column.EmptyColumn::new);
    }

    @Override
    public List<String> getColumnNames() {
        return columnNames;
    }

    @Override
    public boolean isDefined() {
        return true;
    }
}
