package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the CHEM_COMP category give details about each
 * of the chemical components from which the relevant chemical
 * structures can be constructed, such as name, mass or charge.
 * 
 * The related categories CHEM_COMP_ATOM, CHEM_COMP_BOND,
 * CHEM_COMP_ANGLE etc. describe the detailed geometry of these
 * chemical components.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class ChemComp extends BaseCategory {
    public ChemComp(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public ChemComp(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public ChemComp(String name) {
        super(name);
    }

    /**
     * The formula for the chemical component. Formulae are written
     * according to the following rules:
     * 
     * (1) Only recognized element symbols may be used.
     * 
     * (2) Each element symbol is followed by a 'count' number. A count
     * of '1' may be omitted.
     * 
     * (3) A space or parenthesis must separate each cluster of
     * (element symbol + count), but in general parentheses are
     * not used.
     * 
     * (4) The order of elements depends on whether carbon is
     * present or not. If carbon is present, the order should be:
     * C, then H, then the other elements in alphabetical order
     * of their symbol. If carbon is not present, the elements
     * are listed purely in alphabetic order of their symbol. This
     * is the 'Hill' system used by Chemical Abstracts.
     * @return StrColumn
     */
    public StrColumn getFormula() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("formula", StrColumn::new) :
                getBinaryColumn("formula"));
    }

    /**
     * Formula mass in daltons of the chemical component.
     * @return FloatColumn
     */
    public FloatColumn getFormulaWeight() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("formula_weight", FloatColumn::new) :
                getBinaryColumn("formula_weight"));
    }

    /**
     * The value of _chem_comp.id must uniquely identify each item in
     * the CHEM_COMP list.
     * 
     * For protein polymer entities, this is the three-letter code for
     * the amino acid.
     * 
     * For nucleic acid polymer entities, this is the one-letter code
     * for the base.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * A description of special aspects of the generation of the
     * coordinates for the model of the component.
     * @return StrColumn
     */
    public StrColumn getModelDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("model_details", StrColumn::new) :
                getBinaryColumn("model_details"));
    }

    /**
     * A pointer to an external reference file from which the atomic
     * description of the component is taken.
     * @return StrColumn
     */
    public StrColumn getModelErf() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("model_erf", StrColumn::new) :
                getBinaryColumn("model_erf"));
    }

    /**
     * The source of the coordinates for the model of the component.
     * @return StrColumn
     */
    public StrColumn getModelSource() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("model_source", StrColumn::new) :
                getBinaryColumn("model_source"));
    }

    /**
     * A description of the class of a nonstandard monomer if the
     * nonstandard monomer represents a modification of a
     * standard monomer.
     * @return StrColumn
     */
    public StrColumn getMonNstdClass() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("mon_nstd_class", StrColumn::new) :
                getBinaryColumn("mon_nstd_class"));
    }

    /**
     * A description of special details of a nonstandard monomer.
     * @return StrColumn
     */
    public StrColumn getMonNstdDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("mon_nstd_details", StrColumn::new) :
                getBinaryColumn("mon_nstd_details"));
    }

    /**
     * 'yes' indicates that this is a 'standard' monomer, 'no'
     * indicates that it is 'nonstandard'. Nonstandard monomers
     * should be described in more detail using the
     * _chem_comp.mon_nstd_parent, _chem_comp.mon_nstd_class and
     * _chem_comp.mon_nstd_details data items.
     * @return StrColumn
     */
    public StrColumn getMonNstdFlag() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("mon_nstd_flag", StrColumn::new) :
                getBinaryColumn("mon_nstd_flag"));
    }

    /**
     * The name of the parent monomer of the nonstandard monomer,
     * if the nonstandard monomer represents a modification of a
     * standard monomer.
     * @return StrColumn
     */
    public StrColumn getMonNstdParent() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("mon_nstd_parent", StrColumn::new) :
                getBinaryColumn("mon_nstd_parent"));
    }

    /**
     * The identifier for the parent component of the nonstandard
     * component. May be be a comma separated list if this component
     * is derived from multiple components.
     * 
     * Items in this indirectly point to _chem_comp.id in
     * the CHEM_COMP category.
     * @return StrColumn
     */
    public StrColumn getMonNstdParentCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("mon_nstd_parent_comp_id", StrColumn::new) :
                getBinaryColumn("mon_nstd_parent_comp_id"));
    }

    /**
     * The full name of the component.
     * @return StrColumn
     */
    public StrColumn getName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("name", StrColumn::new) :
                getBinaryColumn("name"));
    }

    /**
     * The total number of atoms in the component.
     * @return IntColumn
     */
    public IntColumn getNumberAtomsAll() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("number_atoms_all", IntColumn::new) :
                getBinaryColumn("number_atoms_all"));
    }

    /**
     * The number of non-hydrogen atoms in the component.
     * @return IntColumn
     */
    public IntColumn getNumberAtomsNh() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("number_atoms_nh", IntColumn::new) :
                getBinaryColumn("number_atoms_nh"));
    }

    /**
     * For standard polymer components, the one-letter code for
     * the component.   For non-standard polymer components, the
     * one-letter code for parent component if this exists;
     * otherwise, the one-letter code should be given as 'X'.
     * 
     * Components that derived from multiple parents components
     * are described by a sequence of one-letter-codes.
     * @return StrColumn
     */
    public StrColumn getOneLetterCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("one_letter_code", StrColumn::new) :
                getBinaryColumn("one_letter_code"));
    }

    /**
     * For standard polymer components, the common three-letter code for
     * the component.   Non-standard polymer components and non-polymer
     * components are also assigned three-letter-codes.
     * 
     * For ambiguous polymer components three-letter code should
     * be given as 'UNK'.  Ambiguous ions are assigned the code 'UNX'.
     * Ambiguous non-polymer components are assigned the code 'UNL'.
     * @return StrColumn
     */
    public StrColumn getThreeLetterCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("three_letter_code", StrColumn::new) :
                getBinaryColumn("three_letter_code"));
    }

    /**
     * For standard polymer components, the type of the monomer.
     * Note that monomers that will form polymers are of three types:
     * linking monomers, monomers with some type of N-terminal (or 5')
     * cap and monomers with some type of C-terminal (or 3') cap.
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }

    /**
     * Synonym list for the component.
     * @return StrColumn
     */
    public StrColumn getPdbxSynonyms() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_synonyms", StrColumn::new) :
                getBinaryColumn("pdbx_synonyms"));
    }

    /**
     * For nonstandard components a text description
     * of modification of the parent component.
     * @return StrColumn
     */
    public StrColumn getPdbxModificationDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_modification_details", StrColumn::new) :
                getBinaryColumn("pdbx_modification_details"));
    }

    /**
     * A serial number used by PDB in the FORMUL record.
     * @return IntColumn
     */
    public IntColumn getPdbxComponentNo() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_component_no", IntColumn::new) :
                getBinaryColumn("pdbx_component_no"));
    }

    /**
     * A preliminary classification used by PDB.
     * @return StrColumn
     */
    public StrColumn getPdbxType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_type", StrColumn::new) :
                getBinaryColumn("pdbx_type"));
    }

    /**
     * A preliminary classification used by PDB to indicate
     * that the chemistry of this component while described
     * as clearly as possible is still ambiguous.  Software
     * tools may not be able to process this component
     * definition.
     * @return StrColumn
     */
    public StrColumn getPdbxAmbiguousFlag() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_ambiguous_flag", StrColumn::new) :
                getBinaryColumn("pdbx_ambiguous_flag"));
    }

    /**
     * Identifies the _chem_comp.id of the component that
     * has replaced this component.
     * @return StrColumn
     */
    public StrColumn getPdbxReplacedBy() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_replaced_by", StrColumn::new) :
                getBinaryColumn("pdbx_replaced_by"));
    }

    /**
     * Identifies the _chem_comp.id's of the components
     * which have been replaced by this component.
     * Multiple id codes should be separated by commas.
     * @return StrColumn
     */
    public StrColumn getPdbxReplaces() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_replaces", StrColumn::new) :
                getBinaryColumn("pdbx_replaces"));
    }

    /**
     * The net integer charge assigned to this component. This is the
     * formal charge assignment normally found in chemical diagrams.
     * @return IntColumn
     */
    public IntColumn getPdbxFormalCharge() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_formal_charge", IntColumn::new) :
                getBinaryColumn("pdbx_formal_charge"));
    }

    /**
     * The list of subcomponents contained in this component.
     * @return StrColumn
     */
    public StrColumn getPdbxSubcomponentList() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_subcomponent_list", StrColumn::new) :
                getBinaryColumn("pdbx_subcomponent_list"));
    }

    /**
     * This data item provides additional details about the model coordinates
     * in the component definition.
     * @return StrColumn
     */
    public StrColumn getPdbxModelCoordinatesDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_model_coordinates_details", StrColumn::new) :
                getBinaryColumn("pdbx_model_coordinates_details"));
    }

    /**
     * This data item identifies the PDB database code from which the heavy
     * atom model coordinates were obtained.
     * @return StrColumn
     */
    public StrColumn getPdbxModelCoordinatesDbCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_model_coordinates_db_code", StrColumn::new) :
                getBinaryColumn("pdbx_model_coordinates_db_code"));
    }

    /**
     * This data item identifies the source of the ideal coordinates in the
     * component definition.
     * @return StrColumn
     */
    public StrColumn getPdbxIdealCoordinatesDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_ideal_coordinates_details", StrColumn::new) :
                getBinaryColumn("pdbx_ideal_coordinates_details"));
    }

    /**
     * This data item identifies if ideal coordinates are missing in this definition.
     * @return StrColumn
     */
    public StrColumn getPdbxIdealCoordinatesMissingFlag() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_ideal_coordinates_missing_flag", StrColumn::new) :
                getBinaryColumn("pdbx_ideal_coordinates_missing_flag"));
    }

    /**
     * This data item identifies if model coordinates are missing in this definition.
     * @return StrColumn
     */
    public StrColumn getPdbxModelCoordinatesMissingFlag() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_model_coordinates_missing_flag", StrColumn::new) :
                getBinaryColumn("pdbx_model_coordinates_missing_flag"));
    }

    /**
     * Date component was added to database.
     * @return StrColumn
     */
    public StrColumn getPdbxInitialDate() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_initial_date", StrColumn::new) :
                getBinaryColumn("pdbx_initial_date"));
    }

    /**
     * Date component was last modified.
     * @return StrColumn
     */
    public StrColumn getPdbxModifiedDate() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_modified_date", StrColumn::new) :
                getBinaryColumn("pdbx_modified_date"));
    }

    /**
     * This data item holds the current release status for the component.
     * @return StrColumn
     */
    public StrColumn getPdbxReleaseStatus() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_release_status", StrColumn::new) :
                getBinaryColumn("pdbx_release_status"));
    }

    /**
     * This data item identifies the deposition site that processed
     * this chemical component defintion.
     * @return StrColumn
     */
    public StrColumn getPdbxProcessingSite() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_processing_site", StrColumn::new) :
                getBinaryColumn("pdbx_processing_site"));
    }

    /**
     * The number of subcomponents represented in this component.
     * @return IntColumn
     */
    public IntColumn getPdbxNumberSubcomponents() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_number_subcomponents", IntColumn::new) :
                getBinaryColumn("pdbx_number_subcomponents"));
    }

    /**
     * Internal classifier used to organize ligand
     * dictionary (broad chemical class).
     * @return StrColumn
     */
    public StrColumn getPdbxClass1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_class_1", StrColumn::new) :
                getBinaryColumn("pdbx_class_1"));
    }

    /**
     * Internal classifier used to organize ligand
     * dictionary (notable chemical features).
     * @return StrColumn
     */
    public StrColumn getPdbxClass2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_class_2", StrColumn::new) :
                getBinaryColumn("pdbx_class_2"));
    }

    /**
     * A type classification of this chemical component.
     * @return StrColumn
     */
    public StrColumn getPdbxCompType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_comp_type", StrColumn::new) :
                getBinaryColumn("pdbx_comp_type"));
    }

    /**
     * Previous chemical name used for this component if
     * a name correction has been made.
     * @return StrColumn
     */
    public StrColumn getPdbxReservedName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_reserved_name", StrColumn::new) :
                getBinaryColumn("pdbx_reserved_name"));
    }

    /**
     * Release status of component
     * @return StrColumn
     */
    public StrColumn getPdbxStatus() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_status", StrColumn::new) :
                getBinaryColumn("pdbx_status"));
    }

    /**
     * Modification flag.
     * @return IntColumn
     */
    public IntColumn getPdbxTypeModified() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_type_modified", IntColumn::new) :
                getBinaryColumn("pdbx_type_modified"));
    }

    /**
     * Chemical Abstract Service identifier.
     * @return StrColumn
     */
    public StrColumn getPdbxCasnum() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_casnum", StrColumn::new) :
                getBinaryColumn("pdbx_casnum"));
    }

    /**
     * SMILES code for component.
     * @return StrColumn
     */
    public StrColumn getPdbxSmiles() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_smiles", StrColumn::new) :
                getBinaryColumn("pdbx_smiles"));
    }

    /**
     * NSC identifier for component.
     * @return StrColumn
     */
    public StrColumn getPdbxNscnum() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_nscnum", StrColumn::new) :
                getBinaryColumn("pdbx_nscnum"));
    }
}
