package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the CHEM_COMP_ATOM category record details about
 * the atoms in a chemical component. Specifying the atomic
 * coordinates for the components in this category is an
 * alternative to specifying the structure of the component
 * via bonds, angles, planes etc. in the appropriate
 * CHEM_COMP subcategories.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ChemCompAtom extends BaseCategory {
    public ChemCompAtom(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public ChemCompAtom(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public ChemCompAtom(String name) {
        super(name);
    }

    /**
     * An alternative identifier for the atom. This data item would be
     * used in cases where alternative nomenclatures exist for labelling
     * atoms in a group.
     * @return StrColumn
     */
    public StrColumn getAltAtomId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("alt_atom_id", StrColumn::new) :
                getBinaryColumn("alt_atom_id"));
    }

    /**
     * The value of _chem_comp_atom.atom_id must uniquely identify
     * each atom in each monomer in the CHEM_COMP_ATOM list.
     * 
     * The atom identifiers need not be unique over all atoms in the
     * data block; they need only be unique for each atom in a
     * component.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return StrColumn
     */
    public StrColumn getAtomId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_id", StrColumn::new) :
                getBinaryColumn("atom_id"));
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
     * component specified as orthogonal angstroms. The choice of
     * reference axis frame for the coordinates is arbitrary.
     * 
     * The set of coordinates input for the entity here is intended to
     * correspond to the atomic model used to generate restraints for
     * structure refinement, not to atom sites in the ATOM_SITE
     * list.
     * @return FloatColumn
     */
    public FloatColumn getModelCartnX() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("model_Cartn_x", FloatColumn::new) :
                getBinaryColumn("model_Cartn_x"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _chem_comp_atom.model_Cartn_x.
     * @return FloatColumn
     */
    public FloatColumn getModelCartnXEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("model_Cartn_x_esd", FloatColumn::new) :
                getBinaryColumn("model_Cartn_x_esd"));
    }

    /**
     * The y component of the coordinates for this atom in this
     * component specified as orthogonal angstroms. The choice of
     * reference axis frame for the coordinates is arbitrary.
     * 
     * The set of coordinates input for the entity here is intended to
     * correspond to the atomic model used to generate restraints for
     * structure refinement, not to atom sites in the ATOM_SITE
     * list.
     * @return FloatColumn
     */
    public FloatColumn getModelCartnY() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("model_Cartn_y", FloatColumn::new) :
                getBinaryColumn("model_Cartn_y"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _chem_comp_atom.model_Cartn_y.
     * @return FloatColumn
     */
    public FloatColumn getModelCartnYEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("model_Cartn_y_esd", FloatColumn::new) :
                getBinaryColumn("model_Cartn_y_esd"));
    }

    /**
     * The z component of the coordinates for this atom in this
     * component specified as orthogonal angstroms. The choice of
     * reference axis frame for the coordinates is arbitrary.
     * 
     * The set of coordinates input for the entity here is intended to
     * correspond to the atomic model used to generate restraints for
     * structure refinement, not to atom sites in the ATOM_SITE
     * list.
     * @return FloatColumn
     */
    public FloatColumn getModelCartnZ() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("model_Cartn_z", FloatColumn::new) :
                getBinaryColumn("model_Cartn_z"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _chem_comp_atom.model_Cartn_z.
     * @return FloatColumn
     */
    public FloatColumn getModelCartnZEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("model_Cartn_z_esd", FloatColumn::new) :
                getBinaryColumn("model_Cartn_z_esd"));
    }

    /**
     * This data item is a pointer to _chem_comp.id in the CHEM_COMP
     * category.
     * @return StrColumn
     */
    public StrColumn getCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("comp_id", StrColumn::new) :
                getBinaryColumn("comp_id"));
    }

    /**
     * The partial charge assigned to this atom.
     * @return FloatColumn
     */
    public FloatColumn getPartialCharge() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("partial_charge", FloatColumn::new) :
                getBinaryColumn("partial_charge"));
    }

    /**
     * This data item assigns the atom to a substructure of the
     * component, if appropriate.
     * @return StrColumn
     */
    public StrColumn getSubstructCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("substruct_code", StrColumn::new) :
                getBinaryColumn("substruct_code"));
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

    /**
     * Atom name alignment offset in PDB atom field.
     * @return IntColumn
     */
    public IntColumn getPdbxAlign() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_align", IntColumn::new) :
                getBinaryColumn("pdbx_align"));
    }

    /**
     * Ordinal index for the component atom list.
     * @return IntColumn
     */
    public IntColumn getPdbxOrdinal() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_ordinal", IntColumn::new) :
                getBinaryColumn("pdbx_ordinal"));
    }

    /**
     * The atom identifier in the subcomponent where a
     * larger component has been divided subcomponents.
     * @return StrColumn
     */
    public StrColumn getPdbxComponentAtomId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_component_atom_id", StrColumn::new) :
                getBinaryColumn("pdbx_component_atom_id"));
    }

    /**
     * The component identifier for the subcomponent where a
     * larger component has been divided subcomponents.
     * @return StrColumn
     */
    public StrColumn getPdbxComponentCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_component_comp_id", StrColumn::new) :
                getBinaryColumn("pdbx_component_comp_id"));
    }

    /**
     * An alternative identifier for the atom. This data item would be
     * used in cases where alternative nomenclatures exist for labelling
     * atoms in a group.
     * @return StrColumn
     */
    public StrColumn getPdbxAltAtomId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_alt_atom_id", StrColumn::new) :
                getBinaryColumn("pdbx_alt_atom_id"));
    }

    /**
     * An alternative identifier for the atom. This data item would be
     * used in cases where alternative nomenclatures exist for labelling
     * atoms in a group.
     * @return StrColumn
     */
    public StrColumn getPdbxAltCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_alt_comp_id", StrColumn::new) :
                getBinaryColumn("pdbx_alt_comp_id"));
    }

    /**
     * An alternative x component of the coordinates for this atom in this
     * component specified as orthogonal angstroms.
     * @return FloatColumn
     */
    public FloatColumn getPdbxModelCartnXIdeal() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_model_Cartn_x_ideal", FloatColumn::new) :
                getBinaryColumn("pdbx_model_Cartn_x_ideal"));
    }

    /**
     * An alternative y component of the coordinates for this atom in this
     * component specified as orthogonal angstroms.
     * @return FloatColumn
     */
    public FloatColumn getPdbxModelCartnYIdeal() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_model_Cartn_y_ideal", FloatColumn::new) :
                getBinaryColumn("pdbx_model_Cartn_y_ideal"));
    }

    /**
     * An alternative z component of the coordinates for this atom in this
     * component specified as orthogonal angstroms.
     * @return FloatColumn
     */
    public FloatColumn getPdbxModelCartnZIdeal() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_model_Cartn_z_ideal", FloatColumn::new) :
                getBinaryColumn("pdbx_model_Cartn_z_ideal"));
    }

    /**
     * The chiral configuration of the atom that is a chiral center.
     * @return StrColumn
     */
    public StrColumn getPdbxStereoConfig() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_stereo_config", StrColumn::new) :
                getBinaryColumn("pdbx_stereo_config"));
    }

    /**
     * A flag indicating an aromatic atom.
     * @return StrColumn
     */
    public StrColumn getPdbxAromaticFlag() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_aromatic_flag", StrColumn::new) :
                getBinaryColumn("pdbx_aromatic_flag"));
    }

    /**
     * A flag indicating a leaving atom.
     * @return StrColumn
     */
    public StrColumn getPdbxLeavingAtomFlag() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_leaving_atom_flag", StrColumn::new) :
                getBinaryColumn("pdbx_leaving_atom_flag"));
    }

    /**
     * Preferred residue numbering in the BIRD definition.
     * @return IntColumn
     */
    public IntColumn getPdbxResidueNumbering() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_residue_numbering", IntColumn::new) :
                getBinaryColumn("pdbx_residue_numbering"));
    }

    /**
     * Is the atom in a polymer or non-polymer subcomponent in the BIRD definition.
     * @return StrColumn
     */
    public StrColumn getPdbxPolymerType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_polymer_type", StrColumn::new) :
                getBinaryColumn("pdbx_polymer_type"));
    }

    /**
     * A reference to _pdbx_reference_entity_list.ref_entity_id
     * @return StrColumn
     */
    public StrColumn getPdbxRefId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_ref_id", StrColumn::new) :
                getBinaryColumn("pdbx_ref_id"));
    }

    /**
     * A reference to _pdbx_reference_entity_list.component_id
     * @return IntColumn
     */
    public IntColumn getPdbxComponentId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_component_id", IntColumn::new) :
                getBinaryColumn("pdbx_component_id"));
    }

    /**
     * A reference to entity identifier in data  category
     * pdbx_chem_comp_subcomponent_entity_list.
     * @return IntColumn
     */
    public IntColumn getPdbxComponentEntityId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_component_entity_id", IntColumn::new) :
                getBinaryColumn("pdbx_component_entity_id"));
    }
}
