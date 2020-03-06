package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the REFINE_OCCUPANCY category record details
 * about the treatment of atom occupancies during refinement.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class RefineOccupancy extends DelegatingCategory {
    public RefineOccupancy(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "pdbx_refine_id":
                return getPdbxRefineId();
            case "class":
                return getClazz();
            case "details":
                return getDetails();
            case "treatment":
                return getTreatment();
            case "value":
                return getValue();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item uniquely identifies a refinement within an entry.
     * _refine_occupancy.pdbx_refine_id can be used to distinguish the results
     * of joint refinements.
     * @return StrColumn
     */
    public StrColumn getPdbxRefineId() {
        return delegate.getColumn("pdbx_refine_id", DelegatingStrColumn::new);
    }

    /**
     * The class of atoms treated similarly for occupancy refinement.
     * @return StrColumn
     */
    public StrColumn getClazz() {
        return delegate.getColumn("class", DelegatingStrColumn::new);
    }

    /**
     * A description of special aspects of the occupancy refinement for
     * a class of atoms described in _refine_occupancy.class.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The treatment of occupancies for a class of atoms
     * described in _refine_occupancy.class.
     * @return StrColumn
     */
    public StrColumn getTreatment() {
        return delegate.getColumn("treatment", DelegatingStrColumn::new);
    }

    /**
     * The value of occupancy assigned to a class of atoms defined in
     * _refine_occupancy.class. Meaningful only for atoms with fixed
     * occupancy.
     * @return FloatColumn
     */
    public FloatColumn getValue() {
        return delegate.getColumn("value", DelegatingFloatColumn::new);
    }

}