package org.rcsb.cif.model.generated.pdbxchemcompmodelatom;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return AtomId
     */
    public AtomId getAtomId() {
        return (AtomId) (isText ? textFields.computeIfAbsent("atom_id",
                AtomId::new) : getBinaryColumn("atom_id"));
    }

    /**
     * The value of _pdbx_chem_comp_model_atom.ordinal_id is an
     * ordinal identifer for each atom in the PDBX_CHEM_COMP_MODEL_ATOM list.
     * @return OrdinalId
     */
    public OrdinalId getOrdinalId() {
        return (OrdinalId) (isText ? textFields.computeIfAbsent("ordinal_id",
                OrdinalId::new) : getBinaryColumn("ordinal_id"));
    }

    /**
     * This data item is a pointer to _pdbx_chem_comp_model.id in the PDBX_CHEM_COMP_MODEL
     * category.
     * @return ModelId
     */
    public ModelId getModelId() {
        return (ModelId) (isText ? textFields.computeIfAbsent("model_id",
                ModelId::new) : getBinaryColumn("model_id"));
    }

    /**
     * The net integer charge assigned to this atom. This is the
     * formal charge assignment normally found in chemical diagrams.
     * @return Charge
     */
    public Charge getCharge() {
        return (Charge) (isText ? textFields.computeIfAbsent("charge",
                Charge::new) : getBinaryColumn("charge"));
    }

    /**
     * The x component of the coordinates for this atom in this
     * component model specified as orthogonal angstroms.
     * @return ModelCartnX
     */
    public ModelCartnX getModelCartnX() {
        return (ModelCartnX) (isText ? textFields.computeIfAbsent("model_Cartn_x",
                ModelCartnX::new) : getBinaryColumn("model_Cartn_x"));
    }

    /**
     * The y component of the coordinates for this atom in this
     * component model specified as orthogonal angstroms.
     * @return ModelCartnY
     */
    public ModelCartnY getModelCartnY() {
        return (ModelCartnY) (isText ? textFields.computeIfAbsent("model_Cartn_y",
                ModelCartnY::new) : getBinaryColumn("model_Cartn_y"));
    }

    /**
     * The z component of the coordinates for this atom in this
     * component model specified as orthogonal angstroms.
     * @return ModelCartnZ
     */
    public ModelCartnZ getModelCartnZ() {
        return (ModelCartnZ) (isText ? textFields.computeIfAbsent("model_Cartn_z",
                ModelCartnZ::new) : getBinaryColumn("model_Cartn_z"));
    }

    /**
     * The code used to identify the atom species representing
     * this atom type. Normally this code is the element
     * symbol.
     * @return TypeSymbol
     */
    public TypeSymbol getTypeSymbol() {
        return (TypeSymbol) (isText ? textFields.computeIfAbsent("type_symbol",
                TypeSymbol::new) : getBinaryColumn("type_symbol"));
    }
}
