package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxColumninfo extends DelegatingCategory {
    public PdbxColumninfo(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "columnname":
                return getColumnname();
            case "tablename":
                return getTablename();
            case "description":
                return getDescription();
            case "example":
                return getExample();
            case "type":
                return getType();
            case "table_serial_no":
                return getTableSerialNo();
            case "column_serial_no":
                return getColumnSerialNo();
            case "WWW_Selection_Criteria":
                return getWWWSelectionCriteria();
            case "WWW_Report_Criteria":
                return getWWWReportCriteria();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * SQL column name.
     * @return StrColumn
     */
    public StrColumn getColumnname() {
        return delegate.getColumn("columnname", DelegatingStrColumn::new);
    }

    /**
     * SQL table name.
     * @return StrColumn
     */
    public StrColumn getTablename() {
        return delegate.getColumn("tablename", DelegatingStrColumn::new);
    }

    /**
     * SQL column description.
     * @return StrColumn
     */
    public StrColumn getDescription() {
        return delegate.getColumn("description", DelegatingStrColumn::new);
    }

    /**
     * SQL column example.
     * @return StrColumn
     */
    public StrColumn getExample() {
        return delegate.getColumn("example", DelegatingStrColumn::new);
    }

    /**
     * SQL column type.
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
     * SQL column serial number.
     * @return IntColumn
     */
    public IntColumn getColumnSerialNo() {
        return delegate.getColumn("column_serial_no", DelegatingIntColumn::new);
    }

    /**
     * SQL column visibility in WWW selection querires.
     * @return IntColumn
     */
    public IntColumn getWWWSelectionCriteria() {
        return delegate.getColumn("WWW_Selection_Criteria", DelegatingIntColumn::new);
    }

    /**
     * SQL column visibility in WWW reports queries.
     * @return IntColumn
     */
    public IntColumn getWWWReportCriteria() {
        return delegate.getColumn("WWW_Report_Criteria", DelegatingIntColumn::new);
    }

}