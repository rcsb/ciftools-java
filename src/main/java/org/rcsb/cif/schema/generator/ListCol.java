package org.rcsb.cif.schema.generator;

class ListCol extends Col {
    private final String subType;
    private final String separator;

    ListCol(String subType, String separator, String description) {
        super("list", description);
        this.subType = subType;
        this.separator = separator;
    }

    public String getSubType() {
        return subType;
    }

    public String getSeparator() {
        return separator;
    }
}
