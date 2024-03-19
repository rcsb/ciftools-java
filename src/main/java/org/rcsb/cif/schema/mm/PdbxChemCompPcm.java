package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_CHEM_COMP_PCM category provide
 * information about the protein modifications that are described
 * by the chemical component.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxChemCompPcm extends DelegatingCategory {
    public PdbxChemCompPcm(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "pcm_id":
                return getPcmId();
            case "comp_id":
                return getCompId();
            case "modified_residue_id":
                return getModifiedResidueId();
            case "type":
                return getType();
            case "category":
                return getCategory();
            case "position":
                return getPosition();
            case "polypeptide_position":
                return getPolypeptidePosition();
            case "comp_id_linking_atom":
                return getCompIdLinkingAtom();
            case "modified_residue_id_linking_atom":
                return getModifiedResidueIdLinkingAtom();
            case "uniprot_specific_ptm_accession":
                return getUniprotSpecificPtmAccession();
            case "uniprot_generic_ptm_accession":
                return getUniprotGenericPtmAccession();
            case "first_instance_model_db_code":
                return getFirstInstanceModelDbCode();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * An ordinal index for this category.
     * @return IntColumn
     */
    public IntColumn getPcmId() {
        return delegate.getColumn("pcm_id", DelegatingIntColumn::new);
    }

    /**
     * Chemical component identifier for the CCD that contains the modification group.
     * @return StrColumn
     */
    public StrColumn getCompId() {
        return delegate.getColumn("comp_id", DelegatingStrColumn::new);
    }

    /**
     * Chemical component identifier for the amino acid residue that is being modified.
     * @return StrColumn
     */
    public StrColumn getModifiedResidueId() {
        return delegate.getColumn("modified_residue_id", DelegatingStrColumn::new);
    }

    /**
     * The type of protein modification.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * The category of protein modification.
     * @return StrColumn
     */
    public StrColumn getCategory() {
        return delegate.getColumn("category", DelegatingStrColumn::new);
    }

    /**
     * The position of the modification on the amino acid.
     * @return StrColumn
     */
    public StrColumn getPosition() {
        return delegate.getColumn("position", DelegatingStrColumn::new);
    }

    /**
     * The position of the modification on the polypeptide.
     * @return StrColumn
     */
    public StrColumn getPolypeptidePosition() {
        return delegate.getColumn("polypeptide_position", DelegatingStrColumn::new);
    }

    /**
     * The atom on the modification group that covalently links the
     * modification to the residue that is being modified. This is
     * only added when the protein modification is linked and so the
     * amino acid group and the modification group are described by
     * separate CCDs.
     * @return StrColumn
     */
    public StrColumn getCompIdLinkingAtom() {
        return delegate.getColumn("comp_id_linking_atom", DelegatingStrColumn::new);
    }

    /**
     * The atom on the polypeptide residue group that covalently links
     * the modification to the residue that is being modified. This is
     * only added when the protein modification is linked and so the
     * amino acid group and the modification group are described by
     * separate CCDs.
     * @return StrColumn
     */
    public StrColumn getModifiedResidueIdLinkingAtom() {
        return delegate.getColumn("modified_residue_id_linking_atom", DelegatingStrColumn::new);
    }

    /**
     * The UniProt PTM accession code that is an exact match for the protein modification.
     * @return StrColumn
     */
    public StrColumn getUniprotSpecificPtmAccession() {
        return delegate.getColumn("uniprot_specific_ptm_accession", DelegatingStrColumn::new);
    }

    /**
     * The UniProt PTM accession code that describes the group of PTMs of which this protein modification is a member.
     * @return StrColumn
     */
    public StrColumn getUniprotGenericPtmAccession() {
        return delegate.getColumn("uniprot_generic_ptm_accession", DelegatingStrColumn::new);
    }

    /**
     * The PDB Entry ID for the first model that contains the protein modification.
     * @return StrColumn
     */
    public StrColumn getFirstInstanceModelDbCode() {
        return delegate.getColumn("first_instance_model_db_code", DelegatingStrColumn::new);
    }

}