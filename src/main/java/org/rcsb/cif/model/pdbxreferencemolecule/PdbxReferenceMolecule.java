package org.rcsb.cif.model.pdbxreferencemolecule;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxReferenceMolecule extends BaseCategory {
    public PdbxReferenceMolecule(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxReferenceMolecule(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxReferenceMolecule(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_reference_molecule.prd_id is the unique identifier
     * for the reference molecule in this family.
     * 
     * By convention this ID uniquely identifies the reference molecule in
     * in the PDB reference dictionary.
     * 
     * The ID has the template form PRD_dddddd (e.g. PRD_000001)
     * @return PrdId
     */
    public PrdId getPrdId() {
        return (PrdId) (isText ? textFields.computeIfAbsent("prd_id",
                PrdId::new) : getBinaryColumn("prd_id"));
    }

    /**
     * Formula mass in daltons of the entity.
     * @return FormulaWeight
     */
    public FormulaWeight getFormulaWeight() {
        return (FormulaWeight) (isText ? textFields.computeIfAbsent("formula_weight",
                FormulaWeight::new) : getBinaryColumn("formula_weight"));
    }

    /**
     * The formula for the reference entity. Formulae are written
     * according to the rules:
     * 
     * 1. Only recognised element symbols may be used.
     * 
     * 2. Each element symbol is followed by a 'count' number. A count
     * of '1' may be omitted.
     * 
     * 3. A space or parenthesis must separate each element symbol and
     * its count, but in general parentheses are not used.
     * 
     * 4. The order of elements depends on whether or not carbon is
     * present. If carbon is present, the order should be: C, then
     * H, then the other elements in alphabetical order of their
     * symbol. If carbon is not present, the elements are listed
     * purely in alphabetic order of their symbol. This is the
     * 'Hill' system used by Chemical Abstracts.
     * @return Formula
     */
    public Formula getFormula() {
        return (Formula) (isText ? textFields.computeIfAbsent("formula",
                Formula::new) : getBinaryColumn("formula"));
    }

    /**
     * Defines the structural classification of the entity.
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? textFields.computeIfAbsent("type",
                Type::new) : getBinaryColumn("type"));
    }

    /**
     * Evidence for the assignment of _pdbx_reference_molecule.type
     * @return TypeEvidenceCode
     */
    public TypeEvidenceCode getTypeEvidenceCode() {
        return (TypeEvidenceCode) (isText ? textFields.computeIfAbsent("type_evidence_code",
                TypeEvidenceCode::new) : getBinaryColumn("type_evidence_code"));
    }

    /**
     * Broadly defines the function of the entity.
     * @return Clazz
     */
    public Clazz getClazz() {
        return (Clazz) (isText ? textFields.computeIfAbsent("class",
                Clazz::new) : getBinaryColumn("class"));
    }

    /**
     * Evidence for the assignment of _pdbx_reference_molecule.class
     * @return ClassEvidenceCode
     */
    public ClassEvidenceCode getClassEvidenceCode() {
        return (ClassEvidenceCode) (isText ? textFields.computeIfAbsent("class_evidence_code",
                ClassEvidenceCode::new) : getBinaryColumn("class_evidence_code"));
    }

    /**
     * A name of the entity.
     * @return Name
     */
    public Name getName() {
        return (Name) (isText ? textFields.computeIfAbsent("name",
                Name::new) : getBinaryColumn("name"));
    }

    /**
     * Defines how this entity is represented in PDB data files.
     * @return RepresentAs
     */
    public RepresentAs getRepresentAs() {
        return (RepresentAs) (isText ? textFields.computeIfAbsent("represent_as",
                RepresentAs::new) : getBinaryColumn("represent_as"));
    }

    /**
     * For entities represented as single molecules, the identifier
     * corresponding to the chemical definition for the molecule.
     * @return ChemCompId
     */
    public ChemCompId getChemCompId() {
        return (ChemCompId) (isText ? textFields.computeIfAbsent("chem_comp_id",
                ChemCompId::new) : getBinaryColumn("chem_comp_id"));
    }

    /**
     * Special details about this molecule.
     * @return CompoundDetails
     */
    public CompoundDetails getCompoundDetails() {
        return (CompoundDetails) (isText ? textFields.computeIfAbsent("compound_details",
                CompoundDetails::new) : getBinaryColumn("compound_details"));
    }

    /**
     * Description of this molecule.
     * @return Description
     */
    public Description getDescription() {
        return (Description) (isText ? textFields.computeIfAbsent("description",
                Description::new) : getBinaryColumn("description"));
    }

    /**
     * The PDB accession code for the entry containing a representative example of this molecule.
     * @return RepresentativePDBIdCode
     */
    public RepresentativePDBIdCode getRepresentativePDBIdCode() {
        return (RepresentativePDBIdCode) (isText ? textFields.computeIfAbsent("representative_PDB_id_code",
                RepresentativePDBIdCode::new) : getBinaryColumn("representative_PDB_id_code"));
    }

    /**
     * Defines the current PDB release status for this molecule definition.
     * @return ReleaseStatus
     */
    public ReleaseStatus getReleaseStatus() {
        return (ReleaseStatus) (isText ? textFields.computeIfAbsent("release_status",
                ReleaseStatus::new) : getBinaryColumn("release_status"));
    }

    /**
     * Assigns the identifier for the reference molecule which have been replaced
     * by this reference molecule.
     * Multiple molecule identifier codes should be separated by commas.
     * @return Replaces
     */
    public Replaces getReplaces() {
        return (Replaces) (isText ? textFields.computeIfAbsent("replaces",
                Replaces::new) : getBinaryColumn("replaces"));
    }

    /**
     * Assigns the identifier of the reference molecule that has replaced this molecule.
     * @return ReplacedBy
     */
    public ReplacedBy getReplacedBy() {
        return (ReplacedBy) (isText ? textFields.computeIfAbsent("replaced_by",
                ReplacedBy::new) : getBinaryColumn("replaced_by"));
    }
}
