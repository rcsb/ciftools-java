package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * 
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxTableinfo extends BaseCategory {
    public PdbxTableinfo(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxTableinfo(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxTableinfo(String name) {
        super(name);
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
     * SQL table description.
     * @return StrColumn
     */
    public StrColumn getDescription() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("description", StrColumn::new) :
                getBinaryColumn("description"));
    }

    /**
     * SQL table type.
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
     * SQL table group name..
     * @return StrColumn
     */
    public StrColumn getGroupName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("group_name", StrColumn::new) :
                getBinaryColumn("group_name"));
    }

    /**
     * SQL table visibility in WWW selection querires.
     * @return IntColumn
     */
    public IntColumn getWWWSelectionCriteria() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("WWW_Selection_Criteria", IntColumn::new) :
                getBinaryColumn("WWW_Selection_Criteria"));
    }

    /**
     * SQL table visibility in WWW reports queries.
     * @return IntColumn
     */
    public IntColumn getWWWReportCriteria() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("WWW_Report_Criteria", IntColumn::new) :
                getBinaryColumn("WWW_Report_Criteria"));
    }
}
