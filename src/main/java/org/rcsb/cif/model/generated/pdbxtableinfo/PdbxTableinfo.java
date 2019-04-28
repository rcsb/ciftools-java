package org.rcsb.cif.model.generated.pdbxtableinfo;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return Tablename
     */
    public Tablename getTablename() {
        return (Tablename) (isText ? textFields.computeIfAbsent("tablename",
                Tablename::new) : getBinaryColumn("tablename"));
    }

    /**
     * SQL table description.
     * @return Description
     */
    public Description getDescription() {
        return (Description) (isText ? textFields.computeIfAbsent("description",
                Description::new) : getBinaryColumn("description"));
    }

    /**
     * SQL table type.
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
     * SQL table group name..
     * @return GroupName
     */
    public GroupName getGroupName() {
        return (GroupName) (isText ? textFields.computeIfAbsent("group_name",
                GroupName::new) : getBinaryColumn("group_name"));
    }

    /**
     * SQL table visibility in WWW selection querires.
     * @return WWWSelectionCriteria
     */
    public WWWSelectionCriteria getWWWSelectionCriteria() {
        return (WWWSelectionCriteria) (isText ? textFields.computeIfAbsent("WWW_Selection_Criteria",
                WWWSelectionCriteria::new) : getBinaryColumn("WWW_Selection_Criteria"));
    }

    /**
     * SQL table visibility in WWW reports queries.
     * @return WWWReportCriteria
     */
    public WWWReportCriteria getWWWReportCriteria() {
        return (WWWReportCriteria) (isText ? textFields.computeIfAbsent("WWW_Report_Criteria",
                WWWReportCriteria::new) : getBinaryColumn("WWW_Report_Criteria"));
    }
}
