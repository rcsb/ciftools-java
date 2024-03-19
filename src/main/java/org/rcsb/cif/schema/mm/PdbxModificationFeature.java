package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_MODIFICATION_FEATURE category provides
 * information about all the protein modifications that have been
 * modeled in the entry.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxModificationFeature extends DelegatingCategory {
    public PdbxModificationFeature(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "ordinal":
                return getOrdinal();
            case "label_comp_id":
                return getLabelCompId();
            case "label_asym_id":
                return getLabelAsymId();
            case "label_seq_id":
                return getLabelSeqId();
            case "modified_residue_label_comp_id":
                return getModifiedResidueLabelCompId();
            case "modified_residue_label_asym_id":
                return getModifiedResidueLabelAsymId();
            case "modified_residue_label_seq_id":
                return getModifiedResidueLabelSeqId();
            case "auth_comp_id":
                return getAuthCompId();
            case "auth_asym_id":
                return getAuthAsymId();
            case "auth_seq_id":
                return getAuthSeqId();
            case "PDB_ins_code":
                return getPDBInsCode();
            case "symmetry":
                return getSymmetry();
            case "modified_residue_auth_comp_id":
                return getModifiedResidueAuthCompId();
            case "modified_residue_auth_asym_id":
                return getModifiedResidueAuthAsymId();
            case "modified_residue_auth_seq_id":
                return getModifiedResidueAuthSeqId();
            case "modified_residue_PDB_ins_code":
                return getModifiedResiduePDBInsCode();
            case "modified_residue_symmetry":
                return getModifiedResidueSymmetry();
            case "comp_id_linking_atom":
                return getCompIdLinkingAtom();
            case "modified_residue_id_linking_atom":
                return getModifiedResidueIdLinkingAtom();
            case "modified_residue_id":
                return getModifiedResidueId();
            case "ref_pcm_id":
                return getRefPcmId();
            case "ref_comp_id":
                return getRefCompId();
            case "type":
                return getType();
            case "category":
                return getCategory();
            case "biological_function":
                return getBiologicalFunction();
            case "biological_function_details":
                return getBiologicalFunctionDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * An ordinal index for this category.
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return delegate.getColumn("ordinal", DelegatingIntColumn::new);
    }

    /**
     * A component of the identifier for the chemical component that
     * describes the protein modification.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelCompId() {
        return delegate.getColumn("label_comp_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the chemical component that
     * describes the protein modification.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAsymId() {
        return delegate.getColumn("label_asym_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the chemical component that
     * describes the protein modification.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getLabelSeqId() {
        return delegate.getColumn("label_seq_id", DelegatingIntColumn::new);
    }

    /**
     * A component of the identifier for the chemical component that
     * is being modified.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getModifiedResidueLabelCompId() {
        return delegate.getColumn("modified_residue_label_comp_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the chemical component that
     * is being modified.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getModifiedResidueLabelAsymId() {
        return delegate.getColumn("modified_residue_label_asym_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the chemical component that
     * is being modified.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getModifiedResidueLabelSeqId() {
        return delegate.getColumn("modified_residue_label_seq_id", DelegatingIntColumn::new);
    }

    /**
     * A component of the identifier for the chemical component that
     * describes the protein modification.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthCompId() {
        return delegate.getColumn("auth_comp_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the chemical component that
     * describes the protein modification.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId() {
        return delegate.getColumn("auth_asym_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the chemical component that
     * describes the protein modification.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthSeqId() {
        return delegate.getColumn("auth_seq_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the chemical component that
     * describes the protein modification.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPDBInsCode() {
        return delegate.getColumn("PDB_ins_code", DelegatingStrColumn::new);
    }

    /**
     * Describes the symmetry operation that should be applied to the
     * protein modification group.
     * @return StrColumn
     */
    public StrColumn getSymmetry() {
        return delegate.getColumn("symmetry", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the chemical component that
     * is being modified.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getModifiedResidueAuthCompId() {
        return delegate.getColumn("modified_residue_auth_comp_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the chemical component that
     * is being modified.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getModifiedResidueAuthAsymId() {
        return delegate.getColumn("modified_residue_auth_asym_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the chemical component that
     * is being modified.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getModifiedResidueAuthSeqId() {
        return delegate.getColumn("modified_residue_auth_seq_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the chemical component that
     * is being modified.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getModifiedResiduePDBInsCode() {
        return delegate.getColumn("modified_residue_PDB_ins_code", DelegatingStrColumn::new);
    }

    /**
     * Describes the symmetry operation that should be applied to the
     * chemical component that is being modified.
     * @return StrColumn
     */
    public StrColumn getModifiedResidueSymmetry() {
        return delegate.getColumn("modified_residue_symmetry", DelegatingStrColumn::new);
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
     * Chemical component identifier for the amino acid residue that is being modified.
     * @return StrColumn
     */
    public StrColumn getModifiedResidueId() {
        return delegate.getColumn("modified_residue_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the unique kind of protein
     * modification.
     * 
     * This data item is a pointer to _pdbx_chem_comp_pcm.pcm_id in the
     * CHEM_COMP_PCM category.
     * @return IntColumn
     */
    public IntColumn getRefPcmId() {
        return delegate.getColumn("ref_pcm_id", DelegatingIntColumn::new);
    }

    /**
     * A component of the identifier for the unique kind of protein
     * modification.
     * 
     * This data item is a pointer to _pdbx_chem_comp_pcm.comp_id in the
     * CHEM_COMP_PCM category.
     * @return StrColumn
     */
    public StrColumn getRefCompId() {
        return delegate.getColumn("ref_comp_id", DelegatingStrColumn::new);
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
     * A flag to indicate if the protein modification at this site can
     * occur naturally and that it is expected to have a biological
     * function.
     * @return StrColumn
     */
    public StrColumn getBiologicalFunction() {
        return delegate.getColumn("biological_function", DelegatingStrColumn::new);
    }

    /**
     * Details of the biological function of the protein modification at this site.
     * @return StrColumn
     */
    public StrColumn getBiologicalFunctionDetails() {
        return delegate.getColumn("biological_function_details", DelegatingStrColumn::new);
    }

}