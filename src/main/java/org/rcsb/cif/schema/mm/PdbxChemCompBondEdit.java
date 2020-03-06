package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_CHEM_COMP_BOND_EDIT category provide
 * bond level editing instructions to be applied to imported
 * chemical components.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxChemCompBondEdit extends DelegatingCategory {
    public PdbxChemCompBondEdit(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "ordinal":
                return getOrdinal();
            case "comp_id":
                return getCompId();
            case "edit_op":
                return getEditOp();
            case "atom_id_1":
                return getAtomId1();
            case "atom_id_2":
                return getAtomId2();
            case "edit_bond_value":
                return getEditBondValue();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item uniquely identifies and orders each bond edit instruction.
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return delegate.getColumn("ordinal", DelegatingIntColumn::new);
    }

    /**
     * This data item is a pointer to _pdbx_chem_comp_import.comp_id in the CHEM_COMP
     * category.
     * @return StrColumn
     */
    public StrColumn getCompId() {
        return delegate.getColumn("comp_id", DelegatingStrColumn::new);
    }

    /**
     * The operation or assignment applied to the named imported component.
     * @return StrColumn
     */
    public StrColumn getEditOp() {
        return delegate.getColumn("edit_op", DelegatingStrColumn::new);
    }

    /**
     * The identifier for the first atom in the target bond
     * in imported component.
     * @return StrColumn
     */
    public StrColumn getAtomId1() {
        return delegate.getColumn("atom_id_1", DelegatingStrColumn::new);
    }

    /**
     * The identifier for the second atom in the target bond
     * in imported component.
     * @return StrColumn
     */
    public StrColumn getAtomId2() {
        return delegate.getColumn("atom_id_2", DelegatingStrColumn::new);
    }

    /**
     * The value for the edited bond property value in the generated component.
     * @return StrColumn
     */
    public StrColumn getEditBondValue() {
        return delegate.getColumn("edit_bond_value", DelegatingStrColumn::new);
    }

}