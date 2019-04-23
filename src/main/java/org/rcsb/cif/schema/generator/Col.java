package org.rcsb.cif.schema.generator;

abstract class Col {
    private final String type;
    private final String description;

    Col(String type, String description) {
        this.type = type;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }
}
