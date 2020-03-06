package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_CHEM_COMP_MODEL_ATOM category record coordinates
 * for the chemical component model instance.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxChemCompModelAtom extends DelegatingCategory {
    public PdbxChemCompModelAtom(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "atom_id":
                return getAtomId();
            case "ordinal_id":
                return getOrdinalId();
            case "model_id":
                return getModelId();
            case "charge":
                return getCharge();
            case "model_Cartn_x":
                return getModelCartnX();
            case "model_Cartn_y":
                return getModelCartnY();
            case "model_Cartn_z":
                return getModelCartnZ();
            case "type_symbol":
                return getTypeSymbol();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_chem_comp_model_atom.atom_id uniquely identifies
     * each atom in the PDBX_CHEM_COMP_MODEL_ATOM list.
     * @return StrColumn
     */
    public StrColumn getAtomId() {
        return delegate.getColumn("atom_id", DelegatingStrColumn::new);
    }

    /**
     * The value of _pdbx_chem_comp_model_atom.ordinal_id is an
     * ordinal identifer for each atom in the PDBX_CHEM_COMP_MODEL_ATOM list.
     * @return IntColumn
     */
    public IntColumn getOrdinalId() {
        return delegate.getColumn("ordinal_id", DelegatingIntColumn::new);
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
     * The net integer charge assigned to this atom. This is the
     * formal charge assignment normally found in chemical diagrams.
     * @return IntColumn
     */
    public IntColumn getCharge() {
        return delegate.getColumn("charge", DelegatingIntColumn::new);
    }

    /**
     * The x component of the coordinates for this atom in this
     * component model specified as orthogonal angstroms.
     * @return FloatColumn
     */
    public FloatColumn getModelCartnX() {
        return delegate.getColumn("model_Cartn_x", DelegatingFloatColumn::new);
    }

    /**
     * The y component of the coordinates for this atom in this
     * component model specified as orthogonal angstroms.
     * @return FloatColumn
     */
    public FloatColumn getModelCartnY() {
        return delegate.getColumn("model_Cartn_y", DelegatingFloatColumn::new);
    }

    /**
     * The z component of the coordinates for this atom in this
     * component model specified as orthogonal angstroms.
     * @return FloatColumn
     */
    public FloatColumn getModelCartnZ() {
        return delegate.getColumn("model_Cartn_z", DelegatingFloatColumn::new);
    }

    /**
     * The code used to identify the atom species representing
     * this atom type. Normally this code is the element
     * symbol.
     * @return StrColumn
     */
    public StrColumn getTypeSymbol() {
        return delegate.getColumn("type_symbol", DelegatingStrColumn::new);
    }

}