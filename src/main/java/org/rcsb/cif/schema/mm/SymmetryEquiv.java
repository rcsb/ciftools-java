package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the SYMMETRY_EQUIV category list the
 * symmetry-equivalent positions for the space group.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class SymmetryEquiv extends DelegatingCategory {
    public SymmetryEquiv(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "pos_as_xyz":
                return getPosAsXyz();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _symmetry_equiv.id must uniquely identify
     * a record in the SYMMETRY_EQUIV category.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * Symmetry-equivalent position in the 'xyz' representation. Except
     * for the space group P1, these data will be repeated in a loop.
     * The format of the data item is as per International Tables for
     * Crystallography Vol. A (2002). All equivalent positions should
     * be entered, including those for lattice centring and a centre of
     * symmetry, if present.
     * @return StrColumn
     */
    public StrColumn getPosAsXyz() {
        return delegate.getColumn("pos_as_xyz", DelegatingStrColumn::new);
    }

}