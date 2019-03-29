package org.rcsb.cif.model;

import java.util.Map;

public class CifCategory {
    private final String name;
    private final Map<String, CifField> fields;

    public CifCategory(String name, Map<String, CifField> fields) {
        this.name = name;
        this.fields = fields;
    }

    public String getName() {
        return name;
    }

    public Map<String, CifField> getFields() {
        return fields;
    }
}
