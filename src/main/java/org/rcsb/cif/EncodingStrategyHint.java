package org.rcsb.cif;

/**
 * Encoding hints can be used to specify the encoding and/or precision for particular columns in the data structure.
 * If not provided, the library will find the most efficient encoding automatically.
 */
public class EncodingStrategyHint {
    private String categoryName;
    private String columnName;
    private String encoding;
    private Integer precision;

    public EncodingStrategyHint() {

    }

    /**
     * Construct a hint from scratch.
     * @param categoryName the category referenced
     * @param columnName the column reference
     * @param encoding the encoding to employ
     * @param precision the precision (number of decimal places to keep)
     */
    public EncodingStrategyHint(String categoryName, String columnName, String encoding, Integer precision) {
        this.categoryName = categoryName;
        this.columnName = columnName;
        this.encoding = encoding;
        this.precision = precision;
    }

    /**
     * The category this hint refers to.
     * @return a string
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * Change the category this hint refers to.
     * @param categoryName the new category name
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * The column this hint refers to.
     * @return a string
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * Change the column this hint refers to.
     * @param columnName the new column name
     */
    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    /**
     * Report the encoding strategy to employ.
     * @return a string of "pack" | "rle" | "delta" | "delta-rle"
     */
    public String getEncoding() {
        return encoding;
    }

    /**
     * Change the encoding strategy to employ.
     * @param encoding "pack" | "rle" | "delta" | "delta-rle"
     */
    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    /**
     * Report the precision to honor.
     * @return an int
     */
    public Integer getPrecision() {
        return precision;
    }

    /**
     * Specify the precision for this column.
     * @param precision the number of decimal places to keep during encoding
     */
    public void setPrecision(Integer precision) {
        this.precision = precision;
    }
}
