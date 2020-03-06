package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the CHEM_LINK_BOND category record details about
 * bonds in a link between components in the chemical structure.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class ChemLinkBond extends DelegatingCategory {
    public ChemLinkBond(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "atom_1_comp_id":
                return getAtom1CompId();
            case "atom_2_comp_id":
                return getAtom2CompId();
            case "atom_id_1":
                return getAtomId1();
            case "atom_id_2":
                return getAtomId2();
            case "link_id":
                return getLinkId();
            case "value_dist":
                return getValueDist();
            case "value_dist_esd":
                return getValueDistEsd();
            case "value_order":
                return getValueOrder();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item indicates whether atom 1 is found in the first
     * or the second of the two components connected by the link.
     * @return StrColumn
     */
    public StrColumn getAtom1CompId() {
        return delegate.getColumn("atom_1_comp_id", DelegatingStrColumn::new);
    }

    /**
     * This data item indicates whether atom 2 is found in the first
     * or the second of the two chemical components connected by
     * the link.
     * @return StrColumn
     */
    public StrColumn getAtom2CompId() {
        return delegate.getColumn("atom_2_comp_id", DelegatingStrColumn::new);
    }

    /**
     * The ID of the first of the two atoms that define the bond.
     * 
     * As this data item does not point to a specific atom in a
     * specific chemical component, it is not a child in the
     * linkage sense.
     * @return StrColumn
     */
    public StrColumn getAtomId1() {
        return delegate.getColumn("atom_id_1", DelegatingStrColumn::new);
    }

    /**
     * The ID of the second of the two atoms that define the bond.
     * 
     * As this data item does not point to a specific atom in a
     * specific component, it is not a child in the linkage sense.
     * @return StrColumn
     */
    public StrColumn getAtomId2() {
        return delegate.getColumn("atom_id_2", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _chem_link.id in the CHEM_LINK
     * category.
     * @return StrColumn
     */
    public StrColumn getLinkId() {
        return delegate.getColumn("link_id", DelegatingStrColumn::new);
    }

    /**
     * The value that should be taken as the target for the chemical
     * bond associated with the specified atoms, expressed as a
     * distance.
     * @return FloatColumn
     */
    public FloatColumn getValueDist() {
        return delegate.getColumn("value_dist", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _chem_link_bond.value_dist.
     * @return FloatColumn
     */
    public FloatColumn getValueDistEsd() {
        return delegate.getColumn("value_dist_esd", DelegatingFloatColumn::new);
    }

    /**
     * The value that should be taken as the target for the chemical
     * bond associated with the specified atoms, expressed as a bond
     * order.
     * @return StrColumn
     */
    public StrColumn getValueOrder() {
        return delegate.getColumn("value_order", DelegatingStrColumn::new);
    }

}