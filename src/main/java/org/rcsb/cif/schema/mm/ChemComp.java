package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the CHEM_COMP category give details about each
 * of the chemical components from which the relevant chemical
 * structures can be constructed, such as name, mass or charge.
 * 
 * The related categories CHEM_COMP_ATOM, CHEM_COMP_BOND,
 * CHEM_COMP_ANGLE etc. describe the detailed geometry of these
 * chemical components.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class ChemComp extends DelegatingCategory {
    public ChemComp(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "formula":
                return getFormula();
            case "formula_weight":
                return getFormulaWeight();
            case "id":
                return getId();
            case "model_details":
                return getModelDetails();
            case "model_erf":
                return getModelErf();
            case "model_source":
                return getModelSource();
            case "mon_nstd_class":
                return getMonNstdClass();
            case "mon_nstd_details":
                return getMonNstdDetails();
            case "mon_nstd_flag":
                return getMonNstdFlag();
            case "mon_nstd_parent":
                return getMonNstdParent();
            case "mon_nstd_parent_comp_id":
                return getMonNstdParentCompId();
            case "name":
                return getName();
            case "number_atoms_all":
                return getNumberAtomsAll();
            case "number_atoms_nh":
                return getNumberAtomsNh();
            case "one_letter_code":
                return getOneLetterCode();
            case "three_letter_code":
                return getThreeLetterCode();
            case "type":
                return getType();
            case "pdbx_synonyms":
                return getPdbxSynonyms();
            case "pdbx_modification_details":
                return getPdbxModificationDetails();
            case "pdbx_component_no":
                return getPdbxComponentNo();
            case "pdbx_type":
                return getPdbxType();
            case "pdbx_ambiguous_flag":
                return getPdbxAmbiguousFlag();
            case "pdbx_replaced_by":
                return getPdbxReplacedBy();
            case "pdbx_replaces":
                return getPdbxReplaces();
            case "pdbx_formal_charge":
                return getPdbxFormalCharge();
            case "pdbx_subcomponent_list":
                return getPdbxSubcomponentList();
            case "pdbx_model_coordinates_details":
                return getPdbxModelCoordinatesDetails();
            case "pdbx_model_coordinates_db_code":
                return getPdbxModelCoordinatesDbCode();
            case "pdbx_ideal_coordinates_details":
                return getPdbxIdealCoordinatesDetails();
            case "pdbx_ideal_coordinates_missing_flag":
                return getPdbxIdealCoordinatesMissingFlag();
            case "pdbx_model_coordinates_missing_flag":
                return getPdbxModelCoordinatesMissingFlag();
            case "pdbx_initial_date":
                return getPdbxInitialDate();
            case "pdbx_modified_date":
                return getPdbxModifiedDate();
            case "pdbx_release_status":
                return getPdbxReleaseStatus();
            case "pdbx_processing_site":
                return getPdbxProcessingSite();
            case "pdbx_number_subcomponents":
                return getPdbxNumberSubcomponents();
            case "pdbx_class_1":
                return getPdbxClass1();
            case "pdbx_class_2":
                return getPdbxClass2();
            case "pdbx_comp_type":
                return getPdbxCompType();
            case "pdbx_reserved_name":
                return getPdbxReservedName();
            case "pdbx_status":
                return getPdbxStatus();
            case "pdbx_type_modified":
                return getPdbxTypeModified();
            case "pdbx_casnum":
                return getPdbxCasnum();
            case "pdbx_smiles":
                return getPdbxSmiles();
            case "pdbx_nscnum":
                return getPdbxNscnum();
            case "pdbx_pcm":
                return getPdbxPcm();
            case "ma_provenance":
                return getMaProvenance();
            default:
                return new DelegatingColumn(column);
        }
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
        return delegate.getColumn("formula", DelegatingStrColumn::new);
    }

    /**
     * Formula mass in daltons of the chemical component.
     * @return FloatColumn
     */
    public FloatColumn getFormulaWeight() {
        return delegate.getColumn("formula_weight", DelegatingFloatColumn::new);
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
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * A description of special aspects of the generation of the
     * coordinates for the model of the component.
     * @return StrColumn
     */
    public StrColumn getModelDetails() {
        return delegate.getColumn("model_details", DelegatingStrColumn::new);
    }

    /**
     * A pointer to an external reference file from which the atomic
     * description of the component is taken.
     * @return StrColumn
     */
    public StrColumn getModelErf() {
        return delegate.getColumn("model_erf", DelegatingStrColumn::new);
    }

    /**
     * The source of the coordinates for the model of the component.
     * @return StrColumn
     */
    public StrColumn getModelSource() {
        return delegate.getColumn("model_source", DelegatingStrColumn::new);
    }

    /**
     * A description of the class of a nonstandard monomer if the
     * nonstandard monomer represents a modification of a
     * standard monomer.
     * @return StrColumn
     */
    public StrColumn getMonNstdClass() {
        return delegate.getColumn("mon_nstd_class", DelegatingStrColumn::new);
    }

    /**
     * A description of special details of a nonstandard monomer.
     * @return StrColumn
     */
    public StrColumn getMonNstdDetails() {
        return delegate.getColumn("mon_nstd_details", DelegatingStrColumn::new);
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
        return delegate.getColumn("mon_nstd_flag", DelegatingStrColumn::new);
    }

    /**
     * The name of the parent monomer of the nonstandard monomer,
     * if the nonstandard monomer represents a modification of a
     * standard monomer.
     * @return StrColumn
     */
    public StrColumn getMonNstdParent() {
        return delegate.getColumn("mon_nstd_parent", DelegatingStrColumn::new);
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
        return delegate.getColumn("mon_nstd_parent_comp_id", DelegatingStrColumn::new);
    }

    /**
     * The full name of the component.
     * @return StrColumn
     */
    public StrColumn getName() {
        return delegate.getColumn("name", DelegatingStrColumn::new);
    }

    /**
     * The total number of atoms in the component.
     * @return IntColumn
     */
    public IntColumn getNumberAtomsAll() {
        return delegate.getColumn("number_atoms_all", DelegatingIntColumn::new);
    }

    /**
     * The number of non-hydrogen atoms in the component.
     * @return IntColumn
     */
    public IntColumn getNumberAtomsNh() {
        return delegate.getColumn("number_atoms_nh", DelegatingIntColumn::new);
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
        return delegate.getColumn("one_letter_code", DelegatingStrColumn::new);
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
        return delegate.getColumn("three_letter_code", DelegatingStrColumn::new);
    }

    /**
     * For standard polymer components, the type of the monomer.
     * Note that monomers that will form polymers are of three types:
     * linking monomers, monomers with some type of N-terminal (or 5')
     * cap and monomers with some type of C-terminal (or 3') cap.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * Synonym list for the component.
     * @return StrColumn
     */
    public StrColumn getPdbxSynonyms() {
        return delegate.getColumn("pdbx_synonyms", DelegatingStrColumn::new);
    }

    /**
     * For nonstandard components a text description
     * of modification of the parent component.
     * @return StrColumn
     */
    public StrColumn getPdbxModificationDetails() {
        return delegate.getColumn("pdbx_modification_details", DelegatingStrColumn::new);
    }

    /**
     * A serial number used by PDB in the FORMUL record.
     * @return IntColumn
     */
    public IntColumn getPdbxComponentNo() {
        return delegate.getColumn("pdbx_component_no", DelegatingIntColumn::new);
    }

    /**
     * A preliminary classification used by PDB.
     * @return StrColumn
     */
    public StrColumn getPdbxType() {
        return delegate.getColumn("pdbx_type", DelegatingStrColumn::new);
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
        return delegate.getColumn("pdbx_ambiguous_flag", DelegatingStrColumn::new);
    }

    /**
     * Identifies the _chem_comp.id of the component that
     * has replaced this component.
     * @return StrColumn
     */
    public StrColumn getPdbxReplacedBy() {
        return delegate.getColumn("pdbx_replaced_by", DelegatingStrColumn::new);
    }

    /**
     * Identifies the _chem_comp.id's of the components
     * which have been replaced by this component.
     * Multiple id codes should be separated by commas.
     * @return StrColumn
     */
    public StrColumn getPdbxReplaces() {
        return delegate.getColumn("pdbx_replaces", DelegatingStrColumn::new);
    }

    /**
     * The net integer charge assigned to this component. This is the
     * formal charge assignment normally found in chemical diagrams.
     * @return IntColumn
     */
    public IntColumn getPdbxFormalCharge() {
        return delegate.getColumn("pdbx_formal_charge", DelegatingIntColumn::new);
    }

    /**
     * The list of subcomponents contained in this component.
     * @return StrColumn
     */
    public StrColumn getPdbxSubcomponentList() {
        return delegate.getColumn("pdbx_subcomponent_list", DelegatingStrColumn::new);
    }

    /**
     * This data item provides additional details about the model coordinates
     * in the component definition.
     * @return StrColumn
     */
    public StrColumn getPdbxModelCoordinatesDetails() {
        return delegate.getColumn("pdbx_model_coordinates_details", DelegatingStrColumn::new);
    }

    /**
     * This data item identifies the PDB database code from which the heavy
     * atom model coordinates were obtained.
     * @return StrColumn
     */
    public StrColumn getPdbxModelCoordinatesDbCode() {
        return delegate.getColumn("pdbx_model_coordinates_db_code", DelegatingStrColumn::new);
    }

    /**
     * This data item identifies the source of the ideal coordinates in the
     * component definition.
     * @return StrColumn
     */
    public StrColumn getPdbxIdealCoordinatesDetails() {
        return delegate.getColumn("pdbx_ideal_coordinates_details", DelegatingStrColumn::new);
    }

    /**
     * This data item identifies if ideal coordinates are missing in this definition.
     * @return StrColumn
     */
    public StrColumn getPdbxIdealCoordinatesMissingFlag() {
        return delegate.getColumn("pdbx_ideal_coordinates_missing_flag", DelegatingStrColumn::new);
    }

    /**
     * This data item identifies if model coordinates are missing in this definition.
     * @return StrColumn
     */
    public StrColumn getPdbxModelCoordinatesMissingFlag() {
        return delegate.getColumn("pdbx_model_coordinates_missing_flag", DelegatingStrColumn::new);
    }

    /**
     * Date component was added to database.
     * @return StrColumn
     */
    public StrColumn getPdbxInitialDate() {
        return delegate.getColumn("pdbx_initial_date", DelegatingStrColumn::new);
    }

    /**
     * Date component was last modified.
     * @return StrColumn
     */
    public StrColumn getPdbxModifiedDate() {
        return delegate.getColumn("pdbx_modified_date", DelegatingStrColumn::new);
    }

    /**
     * This data item holds the current release status for the component.
     * @return StrColumn
     */
    public StrColumn getPdbxReleaseStatus() {
        return delegate.getColumn("pdbx_release_status", DelegatingStrColumn::new);
    }

    /**
     * This data item identifies the deposition site that processed
     * this chemical component defintion.
     * @return StrColumn
     */
    public StrColumn getPdbxProcessingSite() {
        return delegate.getColumn("pdbx_processing_site", DelegatingStrColumn::new);
    }

    /**
     * The number of subcomponents represented in this component.
     * @return IntColumn
     */
    public IntColumn getPdbxNumberSubcomponents() {
        return delegate.getColumn("pdbx_number_subcomponents", DelegatingIntColumn::new);
    }

    /**
     * Internal classifier used to organize ligand
     * dictionary (broad chemical class).
     * @return StrColumn
     */
    public StrColumn getPdbxClass1() {
        return delegate.getColumn("pdbx_class_1", DelegatingStrColumn::new);
    }

    /**
     * Internal classifier used to organize ligand
     * dictionary (notable chemical features).
     * @return StrColumn
     */
    public StrColumn getPdbxClass2() {
        return delegate.getColumn("pdbx_class_2", DelegatingStrColumn::new);
    }

    /**
     * A type classification of this chemical component.
     * @return StrColumn
     */
    public StrColumn getPdbxCompType() {
        return delegate.getColumn("pdbx_comp_type", DelegatingStrColumn::new);
    }

    /**
     * Previous chemical name used for this component if
     * a name correction has been made.
     * @return StrColumn
     */
    public StrColumn getPdbxReservedName() {
        return delegate.getColumn("pdbx_reserved_name", DelegatingStrColumn::new);
    }

    /**
     * Release status of component
     * @return StrColumn
     */
    public StrColumn getPdbxStatus() {
        return delegate.getColumn("pdbx_status", DelegatingStrColumn::new);
    }

    /**
     * Modification flag.
     * @return IntColumn
     */
    public IntColumn getPdbxTypeModified() {
        return delegate.getColumn("pdbx_type_modified", DelegatingIntColumn::new);
    }

    /**
     * Chemical Abstract Service identifier.
     * @return StrColumn
     */
    public StrColumn getPdbxCasnum() {
        return delegate.getColumn("pdbx_casnum", DelegatingStrColumn::new);
    }

    /**
     * SMILES code for component.
     * @return StrColumn
     */
    public StrColumn getPdbxSmiles() {
        return delegate.getColumn("pdbx_smiles", DelegatingStrColumn::new);
    }

    /**
     * NSC identifier for component.
     * @return StrColumn
     */
    public StrColumn getPdbxNscnum() {
        return delegate.getColumn("pdbx_nscnum", DelegatingStrColumn::new);
    }

    /**
     * A flag to indicate if the CCD can be used to represent a protein modification.
     * @return StrColumn
     */
    public StrColumn getPdbxPcm() {
        return delegate.getColumn("pdbx_pcm", DelegatingStrColumn::new);
    }

    /**
     * The provenance information for the chemical component definition.
     * @return StrColumn
     */
    public StrColumn getMaProvenance() {
        return delegate.getColumn("ma_provenance", DelegatingStrColumn::new);
    }

}