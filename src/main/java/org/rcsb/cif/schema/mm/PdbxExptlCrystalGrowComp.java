package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_EXPTL_CRYSTAL_GROW_COMP category record
 * details about the components of the solutions that were 'mixed'
 * to produce the crystal.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxExptlCrystalGrowComp extends DelegatingCategory {
    public PdbxExptlCrystalGrowComp(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "crystal_id":
                return getCrystalId();
            case "comp_id":
                return getCompId();
            case "comp_name":
                return getCompName();
            case "sol_id":
                return getSolId();
            case "conc":
                return getConc();
            case "conc_range":
                return getConcRange();
            case "conc_units":
                return getConcUnits();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _exptl_crystal.id in the
     * EXPTL_CRYSTAL category.
     * @return StrColumn
     */
    public StrColumn getCrystalId() {
        return delegate.getColumn("crystal_id", DelegatingStrColumn::new);
    }

    /**
     * The value of _exptl_crystal_grow_comp.comp_id must uniquely identify
     * each item in the PDBX_EXPTL_CRYSTAL_GROW_COMP list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return StrColumn
     */
    public StrColumn getCompId() {
        return delegate.getColumn("comp_id", DelegatingStrColumn::new);
    }

    /**
     * A common name for the component of the solution.
     * @return StrColumn
     */
    public StrColumn getCompName() {
        return delegate.getColumn("comp_name", DelegatingStrColumn::new);
    }

    /**
     * An identifier for the solution to which the given solution
     * component belongs.
     * @return StrColumn
     */
    public StrColumn getSolId() {
        return delegate.getColumn("sol_id", DelegatingStrColumn::new);
    }

    /**
     * The concentration value of the solution component.
     * @return FloatColumn
     */
    public FloatColumn getConc() {
        return delegate.getColumn("conc", DelegatingFloatColumn::new);
    }

    /**
     * The concentration range of the solution component.
     * @return StrColumn
     */
    public StrColumn getConcRange() {
        return delegate.getColumn("conc_range", DelegatingStrColumn::new);
    }

    /**
     * The concentration units for the solution component.
     * @return StrColumn
     */
    public StrColumn getConcUnits() {
        return delegate.getColumn("conc_units", DelegatingStrColumn::new);
    }

}