package org.rcsb.cif.schema;

import org.rcsb.cif.model.Category;
import org.rcsb.cif.model.Column;
import org.rcsb.cif.model.LinkedCaseInsensitiveMap;
import org.rcsb.cif.schema.core.CifCoreBlock;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DelegatingCategory implements Category {
    protected final Category delegate;

    public DelegatingCategory(Category delegate) {
        this.delegate = delegate;
    }

    @Override
    public String getCategoryName() {
        return delegate.getCategoryName();
    }

    @Override
    public int getRowCount() {
        return delegate.getRowCount();
    }

    @Override
    public Column<?> getColumn(String name) {
        Column<?> column = delegate.getColumn(name);
        String columnName = name;
        if (column == null || column instanceof Column.EmptyColumn) {
            // the delegate may be case-sensitive (e.g. created by a builder)
            columnName = findColumnNameIgnoreCase(name);
            if (columnName == null) {
                return new Column.EmptyColumn(name);
            }
            column = delegate.getColumn(columnName);
        } else if (name.equalsIgnoreCase(column.getColumnName())) {
            // the name as registered, which typed categories rely on to pick the column type
            columnName = column.getColumnName();
        }

        if (column instanceof DelegatingColumn) {
            // happens when cifcore builder is at work
            return column;
        }
        return createDelegate(columnName, column);
    }

    private String findColumnNameIgnoreCase(String name) {
        for (String columnName : delegate.getColumnNames()) {
            if (columnName.equalsIgnoreCase(name)) {
                return columnName;
            }
        }
        return null;
    }

    @Override
    public Map<String, Column<?>> getColumns() {
        Map<String, Column<?>> columns = new LinkedCaseInsensitiveMap<>();
        for (Map.Entry<String, Column<?>> entry : delegate.getColumns().entrySet()) {
            Column<?> column = entry.getValue();
            if (column instanceof DelegatingColumn) {
                // happens when cifcore builder is at work
                columns.put(entry.getKey(), column);
            } else {
                // normal where we actually have to delegate
                columns.put(entry.getKey(), createDelegate(entry.getKey(), entry.getValue()));
            }
        }
        return columns;
    }

    @Override
    public List<String> getColumnNames() {
        return delegate.getColumnNames();
    }

    protected Column<?> createDelegate(String columnName, Column<?> column) {
        return new DelegatingColumn<>(column);
    }

    public static class DelegatingCifCoreCategory implements Category {
        private final String categoryName;
        protected final CifCoreBlock parentBlock;

        public DelegatingCifCoreCategory(String categoryName, CifCoreBlock parentBlock) {
            this.categoryName = categoryName;
            this.parentBlock = parentBlock;
        }

        @Override
        public String getCategoryName() {
            return categoryName;
        }

        @Override
        public int getRowCount() {
            return parentBlock.categories()
                    .filter(category -> category.getCategoryName().startsWith(categoryName))
                    .findFirst()
                    .map(Category::getRowCount)
                    .orElse(0);
        }

        @Override
        public Column<?> getColumn(String name) {
            return parentBlock.getColumn(categoryName + "_" + name);
        }

        @Override
        public Map<String, Column<?>> getColumns() {
            return parentBlock.categories()
                    // the core-cif impl uses 'categoryName_columnName' to identify columns
                    .filter(category -> category.getCategoryName().startsWith(categoryName))
                    // they are stored as categories with that name, those categories report a single column with an empty name
                    .collect(Collectors.toMap(this::extractName, category -> category.getColumn(""), (i, j) -> i, LinkedCaseInsensitiveMap::new));
        }

        private static final List<String> CIF_CORE_COLUMN_NAMES = List.of("");
        @Override
        public List<String> getColumnNames() {
            return CIF_CORE_COLUMN_NAMES;
        }

        private String extractName(Category category) {
            return category.getCategoryName().replaceFirst(categoryName + "_", "");
        }
    }
}
