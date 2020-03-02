package org.rcsb.cif.schema;

import org.rcsb.cif.model.Category;
import org.rcsb.cif.model.Column;
import org.rcsb.cif.schema.generated.core.CifCoreBlock;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public abstract class DelegatingCategory implements Category {
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
    public Column getColumn(String name) {
        return getColumns().get(name);
    }

    @Override
    public Map<String, Column> getColumns() {
        Map<String, Column> columns = new LinkedHashMap<>();
        for (Map.Entry<String, Column> entry : delegate.getColumns().entrySet()) {
            columns.put(entry.getKey(), createDelegate(entry.getKey(), entry.getValue()));
        }
        return columns;
    }

    protected abstract Column createDelegate(String columnName, Column column);

    @Override
    public boolean isDefined() {
        return delegate.isDefined();
    }

    public static class NOPDelegatingCategory extends DelegatingCategory {
        public NOPDelegatingCategory(Category delegate) {
            super(delegate);
        }

        @Override
        protected Column createDelegate(String columnName, Column column) {
            return new DelegatingColumn(column);
        }
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
        public Column getColumn(String name) {
            return parentBlock.getColumn(categoryName + "_" + name);
        }

        @Override
        public Map<String, Column> getColumns() {
            return parentBlock.categories()
                    // the core-cif impl uses 'categoryName_columnName' to identify columns
                    .filter(category -> category.getCategoryName().startsWith(categoryName))
                    // they are stored as categories with that name, those categories report a single column with an empty name
                    .collect(Collectors.toMap(this::extractName, category -> category.getColumn("")));
        }

        private String extractName(Category category) {
            return category.getCategoryName().replaceFirst(categoryName + "_", "");
        }

        @Override
        public boolean isDefined() {
            return getRowCount() > 0;
        }
    }
}
