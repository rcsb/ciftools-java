package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_REFERENCE_MOLECULE category record
 * reference information about small polymer molecules.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxReferenceMolecule extends DelegatingCategory {
    public PdbxReferenceMolecule(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "prd_id":
                return getPrdId();
            case "formula_weight":
                return getFormulaWeight();
            case "formula":
                return getFormula();
            case "type":
                return getType();
            case "type_evidence_code":
                return getTypeEvidenceCode();
            case "class":
                return getClazz();
            case "class_evidence_code":
                return getClassEvidenceCode();
            case "name":
                return getName();
            case "represent_as":
                return getRepresentAs();
            case "chem_comp_id":
                return getChemCompId();
            case "compound_details":
                return getCompoundDetails();
            case "description":
                return getDescription();
            case "representative_PDB_id_code":
                return getRepresentativePDBIdCode();
            case "release_status":
                return getReleaseStatus();
            case "replaces":
                return getReplaces();
            case "replaced_by":
                return getReplacedBy();
            default:
                return new DelegatingColumn(column);
        }
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
        return delegate.getColumn("prd_id", DelegatingStrColumn::new);
    }

    /**
     * Formula mass in daltons of the entity.
     * @return FloatColumn
     */
    public FloatColumn getFormulaWeight() {
        return delegate.getColumn("formula_weight", DelegatingFloatColumn::new);
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
        return delegate.getColumn("formula", DelegatingStrColumn::new);
    }

    /**
     * Defines the structural classification of the entity.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * Evidence for the assignment of _pdbx_reference_molecule.type
     * @return StrColumn
     */
    public StrColumn getTypeEvidenceCode() {
        return delegate.getColumn("type_evidence_code", DelegatingStrColumn::new);
    }

    /**
     * Broadly defines the function of the entity.
     * @return StrColumn
     */
    public StrColumn getClazz() {
        return delegate.getColumn("class", DelegatingStrColumn::new);
    }

    /**
     * Evidence for the assignment of _pdbx_reference_molecule.class
     * @return StrColumn
     */
    public StrColumn getClassEvidenceCode() {
        return delegate.getColumn("class_evidence_code", DelegatingStrColumn::new);
    }

    /**
     * A name of the entity.
     * @return StrColumn
     */
    public StrColumn getName() {
        return delegate.getColumn("name", DelegatingStrColumn::new);
    }

    /**
     * Defines how this entity is represented in PDB data files.
     * @return StrColumn
     */
    public StrColumn getRepresentAs() {
        return delegate.getColumn("represent_as", DelegatingStrColumn::new);
    }

    /**
     * For entities represented as single molecules, the identifier
     * corresponding to the chemical definition for the molecule.
     * @return StrColumn
     */
    public StrColumn getChemCompId() {
        return delegate.getColumn("chem_comp_id", DelegatingStrColumn::new);
    }

    /**
     * Special details about this molecule.
     * @return StrColumn
     */
    public StrColumn getCompoundDetails() {
        return delegate.getColumn("compound_details", DelegatingStrColumn::new);
    }

    /**
     * Description of this molecule.
     * @return StrColumn
     */
    public StrColumn getDescription() {
        return delegate.getColumn("description", DelegatingStrColumn::new);
    }

    /**
     * The PDB accession code for the entry containing a representative example of this molecule.
     * @return StrColumn
     */
    public StrColumn getRepresentativePDBIdCode() {
        return delegate.getColumn("representative_PDB_id_code", DelegatingStrColumn::new);
    }

    /**
     * Defines the current PDB release status for this molecule definition.
     * @return StrColumn
     */
    public StrColumn getReleaseStatus() {
        return delegate.getColumn("release_status", DelegatingStrColumn::new);
    }

    /**
     * Assigns the identifier for the reference molecule which have been replaced
     * by this reference molecule.
     * Multiple molecule identifier codes should be separated by commas.
     * @return StrColumn
     */
    public StrColumn getReplaces() {
        return delegate.getColumn("replaces", DelegatingStrColumn::new);
    }

    /**
     * Assigns the identifier of the reference molecule that has replaced this molecule.
     * @return StrColumn
     */
    public StrColumn getReplacedBy() {
        return delegate.getColumn("replaced_by", DelegatingStrColumn::new);
    }

}