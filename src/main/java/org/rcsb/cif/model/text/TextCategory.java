package org.rcsb.cif.model.text;

import org.rcsb.cif.model.Category;
import org.rcsb.cif.model.Column;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TextCategory implements Category {
    private final String name;
    private final int rowCount;
    private final Map<String, Column<?>> textFields;

    public TextCategory(String name, Map<String, Column<?>> textColumns) {
        this.name = name;
        this.rowCount = textColumns.values()
                .stream()
                .findFirst()
                .map(Column::getRowCount)
                .orElse(0);
        this.textFields = textColumns;
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
        // let's switch to getOrDefault to not introduce any meaningless columns when called for missing data
        return textFields.getOrDefault(name, new Column.EmptyColumn(name));
    }

    @Override
    public Map<String, Column<?>> getColumns() {
        return textFields;
    }

    @Override
    public List<String> getColumnNames() {
        // this could cause issues when users call getColumn and introduce empty columns
        return new ArrayList<>(textFields.keySet());
    }
}
