package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the MA_RESTRAINTS category provides the
 * list of the different types of spatial restraints used
 * in the modeling.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class MaRestraints extends DelegatingCategory {
    public MaRestraints(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "restraint_id":
                return getRestraintId();
            case "name":
                return getName();
            case "restraint_type":
                return getRestraintType();
            case "restraint_type_other_details":
                return getRestraintTypeOtherDetails();
            case "data_id":
                return getDataId();
            case "details":
                return getDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the restraint.
     * @return IntColumn
     */
    public IntColumn getRestraintId() {
        return delegate.getColumn("restraint_id", DelegatingIntColumn::new);
    }

    /**
     * An author-given name for the set of restraints.
     * @return StrColumn
     */
    public StrColumn getName() {
        return delegate.getColumn("name", DelegatingStrColumn::new);
    }

    /**
     * The type of restraint.
     * @return StrColumn
     */
    public StrColumn getRestraintType() {
        return delegate.getColumn("restraint_type", DelegatingStrColumn::new);
    }

    /**
     * Details for other restraint types.
     * @return StrColumn
     */
    public StrColumn getRestraintTypeOtherDetails() {
        return delegate.getColumn("restraint_type_other_details", DelegatingStrColumn::new);
    }

    /**
     * The identifier linking to the data category.
     * This data item is a pointer to _ma_data.id
     * in the MA_DATA category.
     * @return IntColumn
     */
    public IntColumn getDataId() {
        return delegate.getColumn("data_id", DelegatingIntColumn::new);
    }

    /**
     * Additional details regarding the restraints used in the modeling.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

}