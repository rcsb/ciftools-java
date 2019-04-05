package org.rcsb.cif.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TextCifCategory implements CifCategory {
    private final String name;
    private final Map<String, CifField> fields;

    public TextCifCategory(String name, Map<String, CifField> fields) {
        this.name = name;
        this.fields = fields;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public CifField getField(String name) {
        return fields.get(name);
    }

    @Override
    public int getRowCount() {
        return fields.values()
                .stream()
                .findFirst()
                .map(CifField::getRowCount)
                .orElse(0);
    }

    @Override
    public List<String> getFieldNames() {
        return new ArrayList<>(fields.keySet());
    }
}
