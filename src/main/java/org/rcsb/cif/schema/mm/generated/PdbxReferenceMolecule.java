package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_REFERENCE_MOLECULE category record
 * reference information about small polymer molecules.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getPrdId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("prd_id", StrColumn::new) :
                getBinaryColumn("prd_id"));
    }

    /**
     * Formula mass in daltons of the entity.
     * @return FloatColumn
     */
    public FloatColumn getFormulaWeight() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("formula_weight", FloatColumn::new) :
                getBinaryColumn("formula_weight"));
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
     * @return StrColumn
     */
    public StrColumn getFormula() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("formula", StrColumn::new) :
                getBinaryColumn("formula"));
    }

    /**
     * Defines the structural classification of the entity.
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }

    /**
     * Evidence for the assignment of _pdbx_reference_molecule.type
     * @return StrColumn
     */
    public StrColumn getTypeEvidenceCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type_evidence_code", StrColumn::new) :
                getBinaryColumn("type_evidence_code"));
    }

    /**
     * Broadly defines the function of the entity.
     * @return StrColumn
     */
    public StrColumn getClazz() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("class", StrColumn::new) :
                getBinaryColumn("class"));
    }

    /**
     * Evidence for the assignment of _pdbx_reference_molecule.class
     * @return StrColumn
     */
    public StrColumn getClassEvidenceCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("class_evidence_code", StrColumn::new) :
                getBinaryColumn("class_evidence_code"));
    }

    /**
     * A name of the entity.
     * @return StrColumn
     */
    public StrColumn getName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("name", StrColumn::new) :
                getBinaryColumn("name"));
    }

    /**
     * Defines how this entity is represented in PDB data files.
     * @return StrColumn
     */
    public StrColumn getRepresentAs() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("represent_as", StrColumn::new) :
                getBinaryColumn("represent_as"));
    }

    /**
     * For entities represented as single molecules, the identifier
     * corresponding to the chemical definition for the molecule.
     * @return StrColumn
     */
    public StrColumn getChemCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("chem_comp_id", StrColumn::new) :
                getBinaryColumn("chem_comp_id"));
    }

    /**
     * Special details about this molecule.
     * @return StrColumn
     */
    public StrColumn getCompoundDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("compound_details", StrColumn::new) :
                getBinaryColumn("compound_details"));
    }

    /**
     * Description of this molecule.
     * @return StrColumn
     */
    public StrColumn getDescription() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("description", StrColumn::new) :
                getBinaryColumn("description"));
    }

    /**
     * The PDB accession code for the entry containing a representative example of this molecule.
     * @return StrColumn
     */
    public StrColumn getRepresentativePDBIdCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("representative_PDB_id_code", StrColumn::new) :
                getBinaryColumn("representative_PDB_id_code"));
    }

    /**
     * Defines the current PDB release status for this molecule definition.
     * @return StrColumn
     */
    public StrColumn getReleaseStatus() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("release_status", StrColumn::new) :
                getBinaryColumn("release_status"));
    }

    /**
     * Assigns the identifier for the reference molecule which have been replaced
     * by this reference molecule.
     * Multiple molecule identifier codes should be separated by commas.
     * @return StrColumn
     */
    public StrColumn getReplaces() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("replaces", StrColumn::new) :
                getBinaryColumn("replaces"));
    }

    /**
     * Assigns the identifier of the reference molecule that has replaced this molecule.
     * @return StrColumn
     */
    public StrColumn getReplacedBy() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("replaced_by", StrColumn::new) :
                getBinaryColumn("replaced_by"));
    }
}
