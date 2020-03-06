package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxTableinfo extends DelegatingCategory {
    public PdbxTableinfo(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "tablename":
                return getTablename();
            case "description":
                return getDescription();
            case "type":
                return getType();
            case "table_serial_no":
                return getTableSerialNo();
            case "group_name":
                return getGroupName();
            case "WWW_Selection_Criteria":
                return getWWWSelectionCriteria();
            case "WWW_Report_Criteria":
                return getWWWReportCriteria();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * SQL table name.
     * @return StrColumn
     */
    public StrColumn getTablename() {
        return delegate.getColumn("tablename", DelegatingStrColumn::new);
    }

    /**
     * SQL table description.
     * @return StrColumn
     */
    public StrColumn getDescription() {
        return delegate.getColumn("description", DelegatingStrColumn::new);
    }

    /**
     * SQL table type.
     * @return IntColumn
     */
    public IntColumn getType() {
        return delegate.getColumn("type", DelegatingIntColumn::new);
    }

    /**
     * SQL table serial number.
     * @return IntColumn
     */
    public IntColumn getTableSerialNo() {
        return delegate.getColumn("table_serial_no", DelegatingIntColumn::new);
    }

    /**
     * SQL table group name..
     * @return StrColumn
     */
    public StrColumn getGroupName() {
        return delegate.getColumn("group_name", DelegatingStrColumn::new);
    }

    /**
     * SQL table visibility in WWW selection querires.
     * @return IntColumn
     */
    public IntColumn getWWWSelectionCriteria() {
        return delegate.getColumn("WWW_Selection_Criteria", DelegatingIntColumn::new);
    }

    /**
     * SQL table visibility in WWW reports queries.
     * @return IntColumn
     */
    public IntColumn getWWWReportCriteria() {
        return delegate.getColumn("WWW_Report_Criteria", DelegatingIntColumn::new);
    }

}