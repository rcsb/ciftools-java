package org.rcsb.cif.model.chemcompatom;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return AltAtomId
     */
    public AltAtomId getAltAtomId() {
        return (AltAtomId) (isText ? textFields.computeIfAbsent("alt_atom_id",
                AltAtomId::new) : getBinaryColumn("alt_atom_id"));
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
     * @return AtomId
     */
    public AtomId getAtomId() {
        return (AtomId) (isText ? textFields.computeIfAbsent("atom_id",
                AtomId::new) : getBinaryColumn("atom_id"));
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
     * component specified as orthogonal angstroms. The choice of
     * reference axis frame for the coordinates is arbitrary.
     * 
     * The set of coordinates input for the entity here is intended to
     * correspond to the atomic model used to generate restraints for
     * structure refinement, not to atom sites in the ATOM_SITE
     * list.
     * @return ModelCartnX
     */
    public ModelCartnX getModelCartnX() {
        return (ModelCartnX) (isText ? textFields.computeIfAbsent("model_Cartn_x",
                ModelCartnX::new) : getBinaryColumn("model_Cartn_x"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _chem_comp_atom.model_Cartn_x.
     * @return ModelCartnXEsd
     */
    public ModelCartnXEsd getModelCartnXEsd() {
        return (ModelCartnXEsd) (isText ? textFields.computeIfAbsent("model_Cartn_x_esd",
                ModelCartnXEsd::new) : getBinaryColumn("model_Cartn_x_esd"));
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
     * @return ModelCartnY
     */
    public ModelCartnY getModelCartnY() {
        return (ModelCartnY) (isText ? textFields.computeIfAbsent("model_Cartn_y",
                ModelCartnY::new) : getBinaryColumn("model_Cartn_y"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _chem_comp_atom.model_Cartn_y.
     * @return ModelCartnYEsd
     */
    public ModelCartnYEsd getModelCartnYEsd() {
        return (ModelCartnYEsd) (isText ? textFields.computeIfAbsent("model_Cartn_y_esd",
                ModelCartnYEsd::new) : getBinaryColumn("model_Cartn_y_esd"));
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
     * @return ModelCartnZ
     */
    public ModelCartnZ getModelCartnZ() {
        return (ModelCartnZ) (isText ? textFields.computeIfAbsent("model_Cartn_z",
                ModelCartnZ::new) : getBinaryColumn("model_Cartn_z"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _chem_comp_atom.model_Cartn_z.
     * @return ModelCartnZEsd
     */
    public ModelCartnZEsd getModelCartnZEsd() {
        return (ModelCartnZEsd) (isText ? textFields.computeIfAbsent("model_Cartn_z_esd",
                ModelCartnZEsd::new) : getBinaryColumn("model_Cartn_z_esd"));
    }

    /**
     * This data item is a pointer to _chem_comp.id in the CHEM_COMP
     * category.
     * @return CompId
     */
    public CompId getCompId() {
        return (CompId) (isText ? textFields.computeIfAbsent("comp_id",
                CompId::new) : getBinaryColumn("comp_id"));
    }

    /**
     * The partial charge assigned to this atom.
     * @return PartialCharge
     */
    public PartialCharge getPartialCharge() {
        return (PartialCharge) (isText ? textFields.computeIfAbsent("partial_charge",
                PartialCharge::new) : getBinaryColumn("partial_charge"));
    }

    /**
     * This data item assigns the atom to a substructure of the
     * component, if appropriate.
     * @return SubstructCode
     */
    public SubstructCode getSubstructCode() {
        return (SubstructCode) (isText ? textFields.computeIfAbsent("substruct_code",
                SubstructCode::new) : getBinaryColumn("substruct_code"));
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

    /**
     * Atom name alignment offset in PDB atom field.
     * @return PdbxAlign
     */
    public PdbxAlign getPdbxAlign() {
        return (PdbxAlign) (isText ? textFields.computeIfAbsent("pdbx_align",
                PdbxAlign::new) : getBinaryColumn("pdbx_align"));
    }

    /**
     * Ordinal index for the component atom list.
     * @return PdbxOrdinal
     */
    public PdbxOrdinal getPdbxOrdinal() {
        return (PdbxOrdinal) (isText ? textFields.computeIfAbsent("pdbx_ordinal",
                PdbxOrdinal::new) : getBinaryColumn("pdbx_ordinal"));
    }

    /**
     * The atom identifier in the subcomponent where a
     * larger component has been divided subcomponents.
     * @return PdbxComponentAtomId
     */
    public PdbxComponentAtomId getPdbxComponentAtomId() {
        return (PdbxComponentAtomId) (isText ? textFields.computeIfAbsent("pdbx_component_atom_id",
                PdbxComponentAtomId::new) : getBinaryColumn("pdbx_component_atom_id"));
    }

    /**
     * The component identifier for the subcomponent where a
     * larger component has been divided subcomponents.
     * @return PdbxComponentCompId
     */
    public PdbxComponentCompId getPdbxComponentCompId() {
        return (PdbxComponentCompId) (isText ? textFields.computeIfAbsent("pdbx_component_comp_id",
                PdbxComponentCompId::new) : getBinaryColumn("pdbx_component_comp_id"));
    }

    /**
     * An alternative identifier for the atom. This data item would be
     * used in cases where alternative nomenclatures exist for labelling
     * atoms in a group.
     * @return PdbxAltAtomId
     */
    public PdbxAltAtomId getPdbxAltAtomId() {
        return (PdbxAltAtomId) (isText ? textFields.computeIfAbsent("pdbx_alt_atom_id",
                PdbxAltAtomId::new) : getBinaryColumn("pdbx_alt_atom_id"));
    }

    /**
     * An alternative identifier for the atom. This data item would be
     * used in cases where alternative nomenclatures exist for labelling
     * atoms in a group.
     * @return PdbxAltCompId
     */
    public PdbxAltCompId getPdbxAltCompId() {
        return (PdbxAltCompId) (isText ? textFields.computeIfAbsent("pdbx_alt_comp_id",
                PdbxAltCompId::new) : getBinaryColumn("pdbx_alt_comp_id"));
    }

    /**
     * An alternative x component of the coordinates for this atom in this
     * component specified as orthogonal angstroms.
     * @return PdbxModelCartnXIdeal
     */
    public PdbxModelCartnXIdeal getPdbxModelCartnXIdeal() {
        return (PdbxModelCartnXIdeal) (isText ? textFields.computeIfAbsent("pdbx_model_Cartn_x_ideal",
                PdbxModelCartnXIdeal::new) : getBinaryColumn("pdbx_model_Cartn_x_ideal"));
    }

    /**
     * An alternative y component of the coordinates for this atom in this
     * component specified as orthogonal angstroms.
     * @return PdbxModelCartnYIdeal
     */
    public PdbxModelCartnYIdeal getPdbxModelCartnYIdeal() {
        return (PdbxModelCartnYIdeal) (isText ? textFields.computeIfAbsent("pdbx_model_Cartn_y_ideal",
                PdbxModelCartnYIdeal::new) : getBinaryColumn("pdbx_model_Cartn_y_ideal"));
    }

    /**
     * An alternative z component of the coordinates for this atom in this
     * component specified as orthogonal angstroms.
     * @return PdbxModelCartnZIdeal
     */
    public PdbxModelCartnZIdeal getPdbxModelCartnZIdeal() {
        return (PdbxModelCartnZIdeal) (isText ? textFields.computeIfAbsent("pdbx_model_Cartn_z_ideal",
                PdbxModelCartnZIdeal::new) : getBinaryColumn("pdbx_model_Cartn_z_ideal"));
    }

    /**
     * The chiral configuration of the atom that is a chiral center.
     * @return PdbxStereoConfig
     */
    public PdbxStereoConfig getPdbxStereoConfig() {
        return (PdbxStereoConfig) (isText ? textFields.computeIfAbsent("pdbx_stereo_config",
                PdbxStereoConfig::new) : getBinaryColumn("pdbx_stereo_config"));
    }

    /**
     * A flag indicating an aromatic atom.
     * @return PdbxAromaticFlag
     */
    public PdbxAromaticFlag getPdbxAromaticFlag() {
        return (PdbxAromaticFlag) (isText ? textFields.computeIfAbsent("pdbx_aromatic_flag",
                PdbxAromaticFlag::new) : getBinaryColumn("pdbx_aromatic_flag"));
    }

    /**
     * A flag indicating a leaving atom.
     * @return PdbxLeavingAtomFlag
     */
    public PdbxLeavingAtomFlag getPdbxLeavingAtomFlag() {
        return (PdbxLeavingAtomFlag) (isText ? textFields.computeIfAbsent("pdbx_leaving_atom_flag",
                PdbxLeavingAtomFlag::new) : getBinaryColumn("pdbx_leaving_atom_flag"));
    }

    /**
     * Preferred residue numbering in the BIRD definition.
     * @return PdbxResidueNumbering
     */
    public PdbxResidueNumbering getPdbxResidueNumbering() {
        return (PdbxResidueNumbering) (isText ? textFields.computeIfAbsent("pdbx_residue_numbering",
                PdbxResidueNumbering::new) : getBinaryColumn("pdbx_residue_numbering"));
    }

    /**
     * Is the atom in a polymer or non-polymer subcomponent in the BIRD definition.
     * @return PdbxPolymerType
     */
    public PdbxPolymerType getPdbxPolymerType() {
        return (PdbxPolymerType) (isText ? textFields.computeIfAbsent("pdbx_polymer_type",
                PdbxPolymerType::new) : getBinaryColumn("pdbx_polymer_type"));
    }

    /**
     * A reference to _pdbx_reference_entity_list.ref_entity_id
     * @return PdbxRefId
     */
    public PdbxRefId getPdbxRefId() {
        return (PdbxRefId) (isText ? textFields.computeIfAbsent("pdbx_ref_id",
                PdbxRefId::new) : getBinaryColumn("pdbx_ref_id"));
    }

    /**
     * A reference to _pdbx_reference_entity_list.component_id
     * @return PdbxComponentId
     */
    public PdbxComponentId getPdbxComponentId() {
        return (PdbxComponentId) (isText ? textFields.computeIfAbsent("pdbx_component_id",
                PdbxComponentId::new) : getBinaryColumn("pdbx_component_id"));
    }

    /**
     * A reference to entity identifier in data  category
     * pdbx_chem_comp_subcomponent_entity_list.
     * @return PdbxComponentEntityId
     */
    public PdbxComponentEntityId getPdbxComponentEntityId() {
        return (PdbxComponentEntityId) (isText ? textFields.computeIfAbsent("pdbx_component_entity_id",
                PdbxComponentEntityId::new) : getBinaryColumn("pdbx_component_entity_id"));
    }
}
