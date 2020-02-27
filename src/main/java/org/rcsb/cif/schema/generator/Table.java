package org.rcsb.cif.schema.generator;

import java.util.Map;
import java.util.Set;

class Table {
    private final String description;
    private final Set<String> categoryKeyNames;
    private final Map<String, Object> columns;

    Table(String description, Set<String> categoryKeyNames, Map<String, Object> columns) {
        this.description = description;
        this.categoryKeyNames = categoryKeyNames;
        this.columns = columns;
    }

    public String getDescription() {
        return description;
    }

    public Set<String> getCategoryKeyNames() {
        return categoryKeyNames;
    }

    public Map<String, Object> getColumns() {
        return columns;
    }
}
