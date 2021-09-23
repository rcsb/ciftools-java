package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the MA_SOFTWARE_PARAMETER category record the
 * details of the software parameters used in the modeling
 * protocol steps.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class MaSoftwareParameter extends DelegatingCategory {
    public MaSoftwareParameter(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "parameter_id":
                return getParameterId();
            case "group_id":
                return getGroupId();
            case "name":
                return getName();
            case "description":
                return getDescription();
            case "value":
                return getValue();
            case "data_type":
                return getDataType();
            case "data_type_other_details":
                return getDataTypeOtherDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the parameter.
     * @return IntColumn
     */
    public IntColumn getParameterId() {
        return delegate.getColumn("parameter_id", DelegatingIntColumn::new);
    }

    /**
     * An identifier to denote the set of parameters used by the software.
     * @return IntColumn
     */
    public IntColumn getGroupId() {
        return delegate.getColumn("group_id", DelegatingIntColumn::new);
    }

    /**
     * The name of the parameter as used in the software.
     * @return StrColumn
     */
    public StrColumn getName() {
        return delegate.getColumn("name", DelegatingStrColumn::new);
    }

    /**
     * Description of the parameter.
     * @return StrColumn
     */
    public StrColumn getDescription() {
        return delegate.getColumn("description", DelegatingStrColumn::new);
    }

    /**
     * The value of the parameter.
     * @return StrColumn
     */
    public StrColumn getValue() {
        return delegate.getColumn("value", DelegatingStrColumn::new);
    }

    /**
     * The data type of the parameter.
     * @return StrColumn
     */
    public StrColumn getDataType() {
        return delegate.getColumn("data_type", DelegatingStrColumn::new);
    }

    /**
     * Details of other data types of software parameters.
     * @return StrColumn
     */
    public StrColumn getDataTypeOtherDetails() {
        return delegate.getColumn("data_type_other_details", DelegatingStrColumn::new);
    }

}