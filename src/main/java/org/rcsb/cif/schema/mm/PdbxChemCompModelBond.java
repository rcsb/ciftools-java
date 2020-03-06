package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_CHEM_COMP_MODEL_BOND category record details about
 * the bonds between atoms in a chemical component model instance.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxChemCompModelBond extends DelegatingCategory {
    public PdbxChemCompModelBond(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "atom_id_1":
                return getAtomId1();
            case "atom_id_2":
                return getAtomId2();
            case "model_id":
                return getModelId();
            case "value_order":
                return getValueOrder();
            case "ordinal_id":
                return getOrdinalId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The ID of the first of the two atoms that define the bond.
     * 
     * This data item is a pointer to _pdbx_chem_comp_model_atom.atom_id in the
     * PDBX_CHEM_COMP_MODEL_ATOM category.
     * @return StrColumn
     */
    public StrColumn getAtomId1() {
        return delegate.getColumn("atom_id_1", DelegatingStrColumn::new);
    }

    /**
     * The ID of the second of the two atoms that define the bond.
     * 
     * This data item is a pointer to _pdbx_chem_comp_model_atom.atom_id in the
     * PDBX_CHEM_COMP_MODEL_ATOM category.
     * @return StrColumn
     */
    public StrColumn getAtomId2() {
        return delegate.getColumn("atom_id_2", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _pdbx_chem_comp_model.id in the PDBX_CHEM_COMP_MODEL
     * category.
     * @return StrColumn
     */
    public StrColumn getModelId() {
        return delegate.getColumn("model_id", DelegatingStrColumn::new);
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
     * The value of _pdbx_chem_comp_model_bond.ordinal_id is an
     * ordinal identifer for each atom in the PDBX_CHEM_COMP_MODEL_BOND list.
     * @return IntColumn
     */
    public IntColumn getOrdinalId() {
        return delegate.getColumn("ordinal_id", DelegatingIntColumn::new);
    }

}