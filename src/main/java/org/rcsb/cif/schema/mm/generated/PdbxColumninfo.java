package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * 
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getColumnname() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("columnname", StrColumn::new) :
                getBinaryColumn("columnname"));
    }

    /**
     * SQL table name.
     * @return StrColumn
     */
    public StrColumn getTablename() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("tablename", StrColumn::new) :
                getBinaryColumn("tablename"));
    }

    /**
     * SQL column description.
     * @return StrColumn
     */
    public StrColumn getDescription() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("description", StrColumn::new) :
                getBinaryColumn("description"));
    }

    /**
     * SQL column example.
     * @return StrColumn
     */
    public StrColumn getExample() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("example", StrColumn::new) :
                getBinaryColumn("example"));
    }

    /**
     * SQL column type.
     * @return IntColumn
     */
    public IntColumn getType() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("type", IntColumn::new) :
                getBinaryColumn("type"));
    }

    /**
     * SQL table serial number.
     * @return IntColumn
     */
    public IntColumn getTableSerialNo() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("table_serial_no", IntColumn::new) :
                getBinaryColumn("table_serial_no"));
    }

    /**
     * SQL column serial number.
     * @return IntColumn
     */
    public IntColumn getColumnSerialNo() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("column_serial_no", IntColumn::new) :
                getBinaryColumn("column_serial_no"));
    }

    /**
     * SQL column visibility in WWW selection querires.
     * @return IntColumn
     */
    public IntColumn getWWWSelectionCriteria() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("WWW_Selection_Criteria", IntColumn::new) :
                getBinaryColumn("WWW_Selection_Criteria"));
    }

    /**
     * SQL column visibility in WWW reports queries.
     * @return IntColumn
     */
    public IntColumn getWWWReportCriteria() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("WWW_Report_Criteria", IntColumn::new) :
                getBinaryColumn("WWW_Report_Criteria"));
    }
}
