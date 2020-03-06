package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * This category provides a table of upper and lower distance
 * limits used as criteria in determining covalent bonds.
 * The table is organized by atom type pairs.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxBondDistanceLimits extends DelegatingCategory {
    public PdbxBondDistanceLimits(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "atom_type_1":
                return getAtomType1();
            case "atom_type_2":
                return getAtomType2();
            case "lower_limit":
                return getLowerLimit();
            case "upper_limit":
                return getUpperLimit();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The first atom type defining the bond
     * @return StrColumn
     */
    public StrColumn getAtomType1() {
        return delegate.getColumn("atom_type_1", DelegatingStrColumn::new);
    }

    /**
     * The first atom type defining the bond
     * @return StrColumn
     */
    public StrColumn getAtomType2() {
        return delegate.getColumn("atom_type_2", DelegatingStrColumn::new);
    }

    /**
     * The lower bond distance limit.
     * @return FloatColumn
     */
    public FloatColumn getLowerLimit() {
        return delegate.getColumn("lower_limit", DelegatingFloatColumn::new);
    }

    /**
     * The upper bond distance limit.
     * @return FloatColumn
     */
    public FloatColumn getUpperLimit() {
        return delegate.getColumn("upper_limit", DelegatingFloatColumn::new);
    }

}