package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the CHEM_COMP_BOND category record details about
 * the bonds between atoms in a chemical component. Target values
 * may be specified as bond orders, as a distance between the two
 * atoms, or both.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class ChemCompBond extends DelegatingCategory {
    public ChemCompBond(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "atom_id_1":
                return getAtomId1();
            case "atom_id_2":
                return getAtomId2();
            case "comp_id":
                return getCompId();
            case "value_order":
                return getValueOrder();
            case "value_dist":
                return getValueDist();
            case "value_dist_esd":
                return getValueDistEsd();
            case "pdbx_ordinal":
                return getPdbxOrdinal();
            case "pdbx_stereo_config":
                return getPdbxStereoConfig();
            case "pdbx_aromatic_flag":
                return getPdbxAromaticFlag();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The ID of the first of the two atoms that define the bond.
     * 
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return StrColumn
     */
    public StrColumn getAtomId1() {
        return delegate.getColumn("atom_id_1", DelegatingStrColumn::new);
    }

    /**
     * The ID of the second of the two atoms that define the bond.
     * 
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return StrColumn
     */
    public StrColumn getAtomId2() {
        return delegate.getColumn("atom_id_2", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _chem_comp.id in the CHEM_COMP
     * category.
     * @return StrColumn
     */
    public StrColumn getCompId() {
        return delegate.getColumn("comp_id", DelegatingStrColumn::new);
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
     * of _chem_comp_bond.value_dist.
     * @return FloatColumn
     */
    public FloatColumn getValueDistEsd() {
        return delegate.getColumn("value_dist_esd", DelegatingFloatColumn::new);
    }

    /**
     * Ordinal index for the component bond list.
     * @return IntColumn
     */
    public IntColumn getPdbxOrdinal() {
        return delegate.getColumn("pdbx_ordinal", DelegatingIntColumn::new);
    }

    /**
     * Stereochemical configuration across a double bond.
     * @return StrColumn
     */
    public StrColumn getPdbxStereoConfig() {
        return delegate.getColumn("pdbx_stereo_config", DelegatingStrColumn::new);
    }

    /**
     * A flag indicating an aromatic bond.
     * @return StrColumn
     */
    public StrColumn getPdbxAromaticFlag() {
        return delegate.getColumn("pdbx_aromatic_flag", DelegatingStrColumn::new);
    }

}