package org.rcsb.cif.model.generated.chemcomp;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return Formula
     */
    public Formula getFormula() {
        return (Formula) (isText ? textFields.computeIfAbsent("formula",
                Formula::new) : getBinaryColumn("formula"));
    }

    /**
     * Formula mass in daltons of the chemical component.
     * @return FormulaWeight
     */
    public FormulaWeight getFormulaWeight() {
        return (FormulaWeight) (isText ? textFields.computeIfAbsent("formula_weight",
                FormulaWeight::new) : getBinaryColumn("formula_weight"));
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
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * A description of special aspects of the generation of the
     * coordinates for the model of the component.
     * @return ModelDetails
     */
    public ModelDetails getModelDetails() {
        return (ModelDetails) (isText ? textFields.computeIfAbsent("model_details",
                ModelDetails::new) : getBinaryColumn("model_details"));
    }

    /**
     * A pointer to an external reference file from which the atomic
     * description of the component is taken.
     * @return ModelErf
     */
    public ModelErf getModelErf() {
        return (ModelErf) (isText ? textFields.computeIfAbsent("model_erf",
                ModelErf::new) : getBinaryColumn("model_erf"));
    }

    /**
     * The source of the coordinates for the model of the component.
     * @return ModelSource
     */
    public ModelSource getModelSource() {
        return (ModelSource) (isText ? textFields.computeIfAbsent("model_source",
                ModelSource::new) : getBinaryColumn("model_source"));
    }

    /**
     * A description of the class of a nonstandard monomer if the
     * nonstandard monomer represents a modification of a
     * standard monomer.
     * @return MonNstdClass
     */
    public MonNstdClass getMonNstdClass() {
        return (MonNstdClass) (isText ? textFields.computeIfAbsent("mon_nstd_class",
                MonNstdClass::new) : getBinaryColumn("mon_nstd_class"));
    }

    /**
     * A description of special details of a nonstandard monomer.
     * @return MonNstdDetails
     */
    public MonNstdDetails getMonNstdDetails() {
        return (MonNstdDetails) (isText ? textFields.computeIfAbsent("mon_nstd_details",
                MonNstdDetails::new) : getBinaryColumn("mon_nstd_details"));
    }

    /**
     * 'yes' indicates that this is a 'standard' monomer, 'no'
     * indicates that it is 'nonstandard'. Nonstandard monomers
     * should be described in more detail using the
     * _chem_comp.mon_nstd_parent, _chem_comp.mon_nstd_class and
     * _chem_comp.mon_nstd_details data items.
     * @return MonNstdFlag
     */
    public MonNstdFlag getMonNstdFlag() {
        return (MonNstdFlag) (isText ? textFields.computeIfAbsent("mon_nstd_flag",
                MonNstdFlag::new) : getBinaryColumn("mon_nstd_flag"));
    }

    /**
     * The name of the parent monomer of the nonstandard monomer,
     * if the nonstandard monomer represents a modification of a
     * standard monomer.
     * @return MonNstdParent
     */
    public MonNstdParent getMonNstdParent() {
        return (MonNstdParent) (isText ? textFields.computeIfAbsent("mon_nstd_parent",
                MonNstdParent::new) : getBinaryColumn("mon_nstd_parent"));
    }

    /**
     * The identifier for the parent component of the nonstandard
     * component. May be be a comma separated list if this component
     * is derived from multiple components.
     * 
     * Items in this indirectly point to _chem_comp.id in
     * the CHEM_COMP category.
     * @return MonNstdParentCompId
     */
    public MonNstdParentCompId getMonNstdParentCompId() {
        return (MonNstdParentCompId) (isText ? textFields.computeIfAbsent("mon_nstd_parent_comp_id",
                MonNstdParentCompId::new) : getBinaryColumn("mon_nstd_parent_comp_id"));
    }

    /**
     * The full name of the component.
     * @return Name
     */
    public Name getName() {
        return (Name) (isText ? textFields.computeIfAbsent("name",
                Name::new) : getBinaryColumn("name"));
    }

    /**
     * The total number of atoms in the component.
     * @return NumberAtomsAll
     */
    public NumberAtomsAll getNumberAtomsAll() {
        return (NumberAtomsAll) (isText ? textFields.computeIfAbsent("number_atoms_all",
                NumberAtomsAll::new) : getBinaryColumn("number_atoms_all"));
    }

    /**
     * The number of non-hydrogen atoms in the component.
     * @return NumberAtomsNh
     */
    public NumberAtomsNh getNumberAtomsNh() {
        return (NumberAtomsNh) (isText ? textFields.computeIfAbsent("number_atoms_nh",
                NumberAtomsNh::new) : getBinaryColumn("number_atoms_nh"));
    }

    /**
     * For standard polymer components, the one-letter code for
     * the component.   For non-standard polymer components, the
     * one-letter code for parent component if this exists;
     * otherwise, the one-letter code should be given as 'X'.
     * 
     * Components that derived from multiple parents components
     * are described by a sequence of one-letter-codes.
     * @return OneLetterCode
     */
    public OneLetterCode getOneLetterCode() {
        return (OneLetterCode) (isText ? textFields.computeIfAbsent("one_letter_code",
                OneLetterCode::new) : getBinaryColumn("one_letter_code"));
    }

    /**
     * For standard polymer components, the common three-letter code for
     * the component.   Non-standard polymer components and non-polymer
     * components are also assigned three-letter-codes.
     * 
     * For ambiguous polymer components three-letter code should
     * be given as 'UNK'.  Ambiguous ions are assigned the code 'UNX'.
     * Ambiguous non-polymer components are assigned the code 'UNL'.
     * @return ThreeLetterCode
     */
    public ThreeLetterCode getThreeLetterCode() {
        return (ThreeLetterCode) (isText ? textFields.computeIfAbsent("three_letter_code",
                ThreeLetterCode::new) : getBinaryColumn("three_letter_code"));
    }

    /**
     * For standard polymer components, the type of the monomer.
     * Note that monomers that will form polymers are of three types:
     * linking monomers, monomers with some type of N-terminal (or 5')
     * cap and monomers with some type of C-terminal (or 3') cap.
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? textFields.computeIfAbsent("type",
                Type::new) : getBinaryColumn("type"));
    }

    /**
     * Synonym list for the component.
     * @return PdbxSynonyms
     */
    public PdbxSynonyms getPdbxSynonyms() {
        return (PdbxSynonyms) (isText ? textFields.computeIfAbsent("pdbx_synonyms",
                PdbxSynonyms::new) : getBinaryColumn("pdbx_synonyms"));
    }

    /**
     * For nonstandard components a text description
     * of modification of the parent component.
     * @return PdbxModificationDetails
     */
    public PdbxModificationDetails getPdbxModificationDetails() {
        return (PdbxModificationDetails) (isText ? textFields.computeIfAbsent("pdbx_modification_details",
                PdbxModificationDetails::new) : getBinaryColumn("pdbx_modification_details"));
    }

    /**
     * A serial number used by PDB in the FORMUL record.
     * @return PdbxComponentNo
     */
    public PdbxComponentNo getPdbxComponentNo() {
        return (PdbxComponentNo) (isText ? textFields.computeIfAbsent("pdbx_component_no",
                PdbxComponentNo::new) : getBinaryColumn("pdbx_component_no"));
    }

    /**
     * A preliminary classification used by PDB.
     * @return PdbxType
     */
    public PdbxType getPdbxType() {
        return (PdbxType) (isText ? textFields.computeIfAbsent("pdbx_type",
                PdbxType::new) : getBinaryColumn("pdbx_type"));
    }

    /**
     * A preliminary classification used by PDB to indicate
     * that the chemistry of this component while described
     * as clearly as possible is still ambiguous.  Software
     * tools may not be able to process this component
     * definition.
     * @return PdbxAmbiguousFlag
     */
    public PdbxAmbiguousFlag getPdbxAmbiguousFlag() {
        return (PdbxAmbiguousFlag) (isText ? textFields.computeIfAbsent("pdbx_ambiguous_flag",
                PdbxAmbiguousFlag::new) : getBinaryColumn("pdbx_ambiguous_flag"));
    }

    /**
     * Identifies the _chem_comp.id of the component that
     * has replaced this component.
     * @return PdbxReplacedBy
     */
    public PdbxReplacedBy getPdbxReplacedBy() {
        return (PdbxReplacedBy) (isText ? textFields.computeIfAbsent("pdbx_replaced_by",
                PdbxReplacedBy::new) : getBinaryColumn("pdbx_replaced_by"));
    }

    /**
     * Identifies the _chem_comp.id's of the components
     * which have been replaced by this component.
     * Multiple id codes should be separated by commas.
     * @return PdbxReplaces
     */
    public PdbxReplaces getPdbxReplaces() {
        return (PdbxReplaces) (isText ? textFields.computeIfAbsent("pdbx_replaces",
                PdbxReplaces::new) : getBinaryColumn("pdbx_replaces"));
    }

    /**
     * The net integer charge assigned to this component. This is the
     * formal charge assignment normally found in chemical diagrams.
     * @return PdbxFormalCharge
     */
    public PdbxFormalCharge getPdbxFormalCharge() {
        return (PdbxFormalCharge) (isText ? textFields.computeIfAbsent("pdbx_formal_charge",
                PdbxFormalCharge::new) : getBinaryColumn("pdbx_formal_charge"));
    }

    /**
     * The list of subcomponents contained in this component.
     * @return PdbxSubcomponentList
     */
    public PdbxSubcomponentList getPdbxSubcomponentList() {
        return (PdbxSubcomponentList) (isText ? textFields.computeIfAbsent("pdbx_subcomponent_list",
                PdbxSubcomponentList::new) : getBinaryColumn("pdbx_subcomponent_list"));
    }

    /**
     * This data item provides additional details about the model coordinates
     * in the component definition.
     * @return PdbxModelCoordinatesDetails
     */
    public PdbxModelCoordinatesDetails getPdbxModelCoordinatesDetails() {
        return (PdbxModelCoordinatesDetails) (isText ? textFields.computeIfAbsent("pdbx_model_coordinates_details",
                PdbxModelCoordinatesDetails::new) : getBinaryColumn("pdbx_model_coordinates_details"));
    }

    /**
     * This data item identifies the PDB database code from which the heavy
     * atom model coordinates were obtained.
     * @return PdbxModelCoordinatesDbCode
     */
    public PdbxModelCoordinatesDbCode getPdbxModelCoordinatesDbCode() {
        return (PdbxModelCoordinatesDbCode) (isText ? textFields.computeIfAbsent("pdbx_model_coordinates_db_code",
                PdbxModelCoordinatesDbCode::new) : getBinaryColumn("pdbx_model_coordinates_db_code"));
    }

    /**
     * This data item identifies the source of the ideal coordinates in the
     * component definition.
     * @return PdbxIdealCoordinatesDetails
     */
    public PdbxIdealCoordinatesDetails getPdbxIdealCoordinatesDetails() {
        return (PdbxIdealCoordinatesDetails) (isText ? textFields.computeIfAbsent("pdbx_ideal_coordinates_details",
                PdbxIdealCoordinatesDetails::new) : getBinaryColumn("pdbx_ideal_coordinates_details"));
    }

    /**
     * This data item identifies if ideal coordinates are missing in this definition.
     * @return PdbxIdealCoordinatesMissingFlag
     */
    public PdbxIdealCoordinatesMissingFlag getPdbxIdealCoordinatesMissingFlag() {
        return (PdbxIdealCoordinatesMissingFlag) (isText ? textFields.computeIfAbsent("pdbx_ideal_coordinates_missing_flag",
                PdbxIdealCoordinatesMissingFlag::new) : getBinaryColumn("pdbx_ideal_coordinates_missing_flag"));
    }

    /**
     * This data item identifies if model coordinates are missing in this definition.
     * @return PdbxModelCoordinatesMissingFlag
     */
    public PdbxModelCoordinatesMissingFlag getPdbxModelCoordinatesMissingFlag() {
        return (PdbxModelCoordinatesMissingFlag) (isText ? textFields.computeIfAbsent("pdbx_model_coordinates_missing_flag",
                PdbxModelCoordinatesMissingFlag::new) : getBinaryColumn("pdbx_model_coordinates_missing_flag"));
    }

    /**
     * Date component was added to database.
     * @return PdbxInitialDate
     */
    public PdbxInitialDate getPdbxInitialDate() {
        return (PdbxInitialDate) (isText ? textFields.computeIfAbsent("pdbx_initial_date",
                PdbxInitialDate::new) : getBinaryColumn("pdbx_initial_date"));
    }

    /**
     * Date component was last modified.
     * @return PdbxModifiedDate
     */
    public PdbxModifiedDate getPdbxModifiedDate() {
        return (PdbxModifiedDate) (isText ? textFields.computeIfAbsent("pdbx_modified_date",
                PdbxModifiedDate::new) : getBinaryColumn("pdbx_modified_date"));
    }

    /**
     * This data item holds the current release status for the component.
     * @return PdbxReleaseStatus
     */
    public PdbxReleaseStatus getPdbxReleaseStatus() {
        return (PdbxReleaseStatus) (isText ? textFields.computeIfAbsent("pdbx_release_status",
                PdbxReleaseStatus::new) : getBinaryColumn("pdbx_release_status"));
    }

    /**
     * This data item identifies the deposition site that processed
     * this chemical component defintion.
     * @return PdbxProcessingSite
     */
    public PdbxProcessingSite getPdbxProcessingSite() {
        return (PdbxProcessingSite) (isText ? textFields.computeIfAbsent("pdbx_processing_site",
                PdbxProcessingSite::new) : getBinaryColumn("pdbx_processing_site"));
    }

    /**
     * The number of subcomponents represented in this component.
     * @return PdbxNumberSubcomponents
     */
    public PdbxNumberSubcomponents getPdbxNumberSubcomponents() {
        return (PdbxNumberSubcomponents) (isText ? textFields.computeIfAbsent("pdbx_number_subcomponents",
                PdbxNumberSubcomponents::new) : getBinaryColumn("pdbx_number_subcomponents"));
    }

    /**
     * Internal classifier used to organize ligand
     * dictionary (broad chemical class).
     * @return PdbxClass1
     */
    public PdbxClass1 getPdbxClass1() {
        return (PdbxClass1) (isText ? textFields.computeIfAbsent("pdbx_class_1",
                PdbxClass1::new) : getBinaryColumn("pdbx_class_1"));
    }

    /**
     * Internal classifier used to organize ligand
     * dictionary (notable chemical features).
     * @return PdbxClass2
     */
    public PdbxClass2 getPdbxClass2() {
        return (PdbxClass2) (isText ? textFields.computeIfAbsent("pdbx_class_2",
                PdbxClass2::new) : getBinaryColumn("pdbx_class_2"));
    }

    /**
     * A type classification of this chemical component.
     * @return PdbxCompType
     */
    public PdbxCompType getPdbxCompType() {
        return (PdbxCompType) (isText ? textFields.computeIfAbsent("pdbx_comp_type",
                PdbxCompType::new) : getBinaryColumn("pdbx_comp_type"));
    }

    /**
     * Previous chemical name used for this component if
     * a name correction has been made.
     * @return PdbxReservedName
     */
    public PdbxReservedName getPdbxReservedName() {
        return (PdbxReservedName) (isText ? textFields.computeIfAbsent("pdbx_reserved_name",
                PdbxReservedName::new) : getBinaryColumn("pdbx_reserved_name"));
    }

    /**
     * Release status of component
     * @return PdbxStatus
     */
    public PdbxStatus getPdbxStatus() {
        return (PdbxStatus) (isText ? textFields.computeIfAbsent("pdbx_status",
                PdbxStatus::new) : getBinaryColumn("pdbx_status"));
    }

    /**
     * Modification flag.
     * @return PdbxTypeModified
     */
    public PdbxTypeModified getPdbxTypeModified() {
        return (PdbxTypeModified) (isText ? textFields.computeIfAbsent("pdbx_type_modified",
                PdbxTypeModified::new) : getBinaryColumn("pdbx_type_modified"));
    }

    /**
     * Chemical Abstract Service identifier.
     * @return PdbxCasnum
     */
    public PdbxCasnum getPdbxCasnum() {
        return (PdbxCasnum) (isText ? textFields.computeIfAbsent("pdbx_casnum",
                PdbxCasnum::new) : getBinaryColumn("pdbx_casnum"));
    }

    /**
     * SMILES code for component.
     * @return PdbxSmiles
     */
    public PdbxSmiles getPdbxSmiles() {
        return (PdbxSmiles) (isText ? textFields.computeIfAbsent("pdbx_smiles",
                PdbxSmiles::new) : getBinaryColumn("pdbx_smiles"));
    }

    /**
     * NSC identifier for component.
     * @return PdbxNscnum
     */
    public PdbxNscnum getPdbxNscnum() {
        return (PdbxNscnum) (isText ? textFields.computeIfAbsent("pdbx_nscnum",
                PdbxNscnum::new) : getBinaryColumn("pdbx_nscnum"));
    }
}
