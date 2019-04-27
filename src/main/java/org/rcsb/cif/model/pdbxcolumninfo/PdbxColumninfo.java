package org.rcsb.cif.model.pdbxcolumninfo;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxColumninfo extends BaseCategory {
    public PdbxColumninfo(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxColumninfo(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxColumninfo(String name) {
        super(name);
    }

    /**
     * SQL column name.
     * @return Columnname
     */
    public Columnname getColumnname() {
        return (Columnname) (isText ? textFields.computeIfAbsent("columnname",
                Columnname::new) : getBinaryColumn("columnname"));
    }

    /**
     * SQL table name.
     * @return Tablename
     */
    public Tablename getTablename() {
        return (Tablename) (isText ? textFields.computeIfAbsent("tablename",
                Tablename::new) : getBinaryColumn("tablename"));
    }

    /**
     * SQL column description.
     * @return Description
     */
    public Description getDescription() {
        return (Description) (isText ? textFields.computeIfAbsent("description",
                Description::new) : getBinaryColumn("description"));
    }

    /**
     * SQL column example.
     * @return Example
     */
    public Example getExample() {
        return (Example) (isText ? textFields.computeIfAbsent("example",
                Example::new) : getBinaryColumn("example"));
    }

    /**
     * SQL column type.
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? textFields.computeIfAbsent("type",
                Type::new) : getBinaryColumn("type"));
    }

    /**
     * SQL table serial number.
     * @return TableSerialNo
     */
    public TableSerialNo getTableSerialNo() {
        return (TableSerialNo) (isText ? textFields.computeIfAbsent("table_serial_no",
                TableSerialNo::new) : getBinaryColumn("table_serial_no"));
    }

    /**
     * SQL column serial number.
     * @return ColumnSerialNo
     */
    public ColumnSerialNo getColumnSerialNo() {
        return (ColumnSerialNo) (isText ? textFields.computeIfAbsent("column_serial_no",
                ColumnSerialNo::new) : getBinaryColumn("column_serial_no"));
    }

    /**
     * SQL column visibility in WWW selection querires.
     * @return WWWSelectionCriteria
     */
    public WWWSelectionCriteria getWWWSelectionCriteria() {
        return (WWWSelectionCriteria) (isText ? textFields.computeIfAbsent("WWW_Selection_Criteria",
                WWWSelectionCriteria::new) : getBinaryColumn("WWW_Selection_Criteria"));
    }

    /**
     * SQL column visibility in WWW reports queries.
     * @return WWWReportCriteria
     */
    public WWWReportCriteria getWWWReportCriteria() {
        return (WWWReportCriteria) (isText ? textFields.computeIfAbsent("WWW_Report_Criteria",
                WWWReportCriteria::new) : getBinaryColumn("WWW_Report_Criteria"));
    }
}
