package org.rcsb.cif;

public class EncodingStrategyHint {
    private String categoryName;
    private String columnName;
    private String encoding;
    private Integer precision;

    public EncodingStrategyHint() {

    }

    public EncodingStrategyHint(String categoryName, String columnName, String encoding, Integer precision) {
        this.categoryName = categoryName;
        this.columnName = columnName;
        this.encoding = encoding;
        this.precision = precision;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public Integer getPrecision() {
        return precision;
    }

    public void setPrecision(Integer precision) {
        this.precision = precision;
    }
}
