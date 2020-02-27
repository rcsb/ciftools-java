package org.rcsb.cif.schema.generator;

import java.util.List;

class EnumCol extends Col {
    private final List<String> values;
    private final String subType;

    EnumCol(List<String> values, String subType, String description) {
        super("enum", description);
        this.values = values;
        this.subType = subType;
    }

    public List<String> getValues() {
        return values;
    }

    public String getSubType() {
        return subType;
    }
}
