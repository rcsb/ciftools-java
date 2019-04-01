package org.rcsb.cif.model;

import java.util.Map;
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

    public Map<String, CifField> getFields() {
        return fields;
    }

    public Stream<CifField> fields() {
        return fields.values().stream();
    }

    @Override
    public CifField getField(String name) {
        return fields.get(name);
    }

    @Override
    public int getRowCount() {
        return fields().findFirst().map(CifField::getRowCount).orElse(0);
    }

}
