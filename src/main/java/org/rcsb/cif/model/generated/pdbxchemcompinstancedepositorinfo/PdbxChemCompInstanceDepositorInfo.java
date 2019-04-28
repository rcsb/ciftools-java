package org.rcsb.cif.model.generated.pdbxchemcompinstancedepositorinfo;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxChemCompInstanceDepositorInfo extends BaseCategory {
    public PdbxChemCompInstanceDepositorInfo(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxChemCompInstanceDepositorInfo(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxChemCompInstanceDepositorInfo(String name) {
        super(name);
    }

    /**
     * The value of pdbx_chem_comp_instance_depositor_info.ordinal must uniquely identify a record in
     * the PDBX_CHEM_COMP_INSTANCE_DEPOSITOR_INFO list.
     * @return Ordinal
     */
    public Ordinal getOrdinal() {
        return (Ordinal) (isText ? textFields.computeIfAbsent("ordinal",
                Ordinal::new) : getBinaryColumn("ordinal"));
    }

    /**
     * An element of the chemical component instance identifier.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return LabelAltId
     */
    public LabelAltId getLabelAltId() {
        return (LabelAltId) (isText ? textFields.computeIfAbsent("label_alt_id",
                LabelAltId::new) : getBinaryColumn("label_alt_id"));
    }

    /**
     * An element of the chemical component instance identifier.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return CompId
     */
    public CompId getCompId() {
        return (CompId) (isText ? textFields.computeIfAbsent("comp_id",
                CompId::new) : getBinaryColumn("comp_id"));
    }

    /**
     * Optional element of the chemical component instance identifier.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in the
     * ATOM_SITE category.
     * @return PDBInsCode
     */
    public PDBInsCode getPDBInsCode() {
        return (PDBInsCode) (isText ? textFields.computeIfAbsent("PDB_ins_code",
                PDBInsCode::new) : getBinaryColumn("PDB_ins_code"));
    }

    /**
     * An element of the chemical component instance identifier.
     * 
     * This data item corresponds to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return AuthAsymId
     */
    public AuthAsymId getAuthAsymId() {
        return (AuthAsymId) (isText ? textFields.computeIfAbsent("auth_asym_id",
                AuthAsymId::new) : getBinaryColumn("auth_asym_id"));
    }

    /**
     * An element of the chemical component instance identifier.
     * 
     * This data item corresponds to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return AuthSeqId
     */
    public AuthSeqId getAuthSeqId() {
        return (AuthSeqId) (isText ? textFields.computeIfAbsent("auth_seq_id",
                AuthSeqId::new) : getBinaryColumn("auth_seq_id"));
    }

    /**
     * A flag to indicate if the chemical component instance is a part of a polymer molecule.
     * @return InPolymerFlag
     */
    public InPolymerFlag getInPolymerFlag() {
        return (InPolymerFlag) (isText ? textFields.computeIfAbsent("in_polymer_flag",
                InPolymerFlag::new) : getBinaryColumn("in_polymer_flag"));
    }

    /**
     * A flag to indicate if details about this chemical component instance have been provided by the depositor.
     * @return AuthorProvidedFlag
     */
    public AuthorProvidedFlag getAuthorProvidedFlag() {
        return (AuthorProvidedFlag) (isText ? textFields.computeIfAbsent("author_provided_flag",
                AuthorProvidedFlag::new) : getBinaryColumn("author_provided_flag"));
    }

    /**
     * The observed formula for the chemical component in the deposited coordinates.
     * Formulae are written according to the following rules:
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
}
