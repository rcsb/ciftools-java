package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_CHEM_COMP_MODEL_ATOM category record coordinates
 * for the chemical component model instance.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxChemCompModelAtom extends BaseCategory {
    public PdbxChemCompModelAtom(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxChemCompModelAtom(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxChemCompModelAtom(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_chem_comp_model_atom.atom_id uniquely identifies
     * each atom in the PDBX_CHEM_COMP_MODEL_ATOM list.
     * @return StrColumn
     */
    public StrColumn getAtomId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_id", StrColumn::new) :
                getBinaryColumn("atom_id"));
    }

    /**
     * The value of _pdbx_chem_comp_model_atom.ordinal_id is an
     * ordinal identifer for each atom in the PDBX_CHEM_COMP_MODEL_ATOM list.
     * @return IntColumn
     */
    public IntColumn getOrdinalId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ordinal_id", IntColumn::new) :
                getBinaryColumn("ordinal_id"));
    }

    /**
     * This data item is a pointer to _pdbx_chem_comp_model.id in the PDBX_CHEM_COMP_MODEL
     * category.
     * @return StrColumn
     */
    public StrColumn getModelId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("model_id", StrColumn::new) :
                getBinaryColumn("model_id"));
    }

    /**
     * The net integer charge assigned to this atom. This is the
     * formal charge assignment normally found in chemical diagrams.
     * @return IntColumn
     */
    public IntColumn getCharge() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("charge", IntColumn::new) :
                getBinaryColumn("charge"));
    }

    /**
     * The x component of the coordinates for this atom in this
     * component model specified as orthogonal angstroms.
     * @return FloatColumn
     */
    public FloatColumn getModelCartnX() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("model_Cartn_x", FloatColumn::new) :
                getBinaryColumn("model_Cartn_x"));
    }

    /**
     * The y component of the coordinates for this atom in this
     * component model specified as orthogonal angstroms.
     * @return FloatColumn
     */
    public FloatColumn getModelCartnY() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("model_Cartn_y", FloatColumn::new) :
                getBinaryColumn("model_Cartn_y"));
    }

    /**
     * The z component of the coordinates for this atom in this
     * component model specified as orthogonal angstroms.
     * @return FloatColumn
     */
    public FloatColumn getModelCartnZ() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("model_Cartn_z", FloatColumn::new) :
                getBinaryColumn("model_Cartn_z"));
    }

    /**
     * The code used to identify the atom species representing
     * this atom type. Normally this code is the element
     * symbol.
     * @return StrColumn
     */
    public StrColumn getTypeSymbol() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type_symbol", StrColumn::new) :
                getBinaryColumn("type_symbol"));
    }
}
