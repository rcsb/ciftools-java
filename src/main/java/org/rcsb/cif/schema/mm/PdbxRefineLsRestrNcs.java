package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Holds details of NCS restraints in cases where multiple
 * conditions are provided for each domain.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxRefineLsRestrNcs extends DelegatingCategory {
    public PdbxRefineLsRestrNcs(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "dom_id":
                return getDomId();
            case "type":
                return getType();
            case "number":
                return getNumber();
            case "rms_dev":
                return getRmsDev();
            case "weight":
                return getWeight();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _struct_ncs_dom.id in the
     * STRUCT_NCS_DOM category.
     * @return StrColumn
     */
    public StrColumn getDomId() {
        return delegate.getColumn("dom_id", DelegatingStrColumn::new);
    }

    /**
     * The type of restraint applied to the domain
     * specified by _pdbx_refine_ls_restr_ncs.dom_id and in the domains
     * against which it was restrained.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * The number of this type of restraint applied to the domain
     * specified by _pdbx_refine_ls_restr_ncs.dom_id and in the domains
     * against which it was restrained.
     * @return IntColumn
     */
    public IntColumn getNumber() {
        return delegate.getColumn("number", DelegatingIntColumn::new);
    }

    /**
     * The root-mean-square deviation in restraints for the domain
     * specified by _pdbx_refine_ls_restr_ncs.dom_id and in the domains
     * against which it was restrained.
     * @return FloatColumn
     */
    public FloatColumn getRmsDev() {
        return delegate.getColumn("rms_dev", DelegatingFloatColumn::new);
    }

    /**
     * The value of the weighting coefficient used in
     * non-crystalographic restaint in the domain
     * specified by _pdbx_refine_ls_restr_ncs.dom_id
     * to equivalent atomic positions in the domains
     * against which it was restrained.
     * @return FloatColumn
     */
    public FloatColumn getWeight() {
        return delegate.getColumn("weight", DelegatingFloatColumn::new);
    }

}