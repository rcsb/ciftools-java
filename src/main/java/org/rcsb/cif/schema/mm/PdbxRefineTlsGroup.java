package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_REFINE_TLS_GROUP category record details about
 * a fragment of a TLS group.
 * 
 * Properties of the TLS group are recorded in PDBX_REFINE_TLS
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxRefineTlsGroup extends DelegatingCategory {
    public PdbxRefineTlsGroup(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "pdbx_refine_id":
                return getPdbxRefineId();
            case "refine_tls_id":
                return getRefineTlsId();
            case "beg_label_asym_id":
                return getBegLabelAsymId();
            case "beg_label_seq_id":
                return getBegLabelSeqId();
            case "beg_auth_asym_id":
                return getBegAuthAsymId();
            case "beg_auth_seq_id":
                return getBegAuthSeqId();
            case "beg_PDB_ins_code":
                return getBegPDBInsCode();
            case "end_label_asym_id":
                return getEndLabelAsymId();
            case "end_label_seq_id":
                return getEndLabelSeqId();
            case "end_auth_asym_id":
                return getEndAuthAsymId();
            case "end_auth_seq_id":
                return getEndAuthSeqId();
            case "end_PDB_ins_code":
                return getEndPDBInsCode();
            case "selection":
                return getSelection();
            case "selection_details":
                return getSelectionDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_refine_tls_group.id must uniquely identify
     * a record in the REFINE_TLS_GROUP list for a particular refinement.
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * This data item uniquely identifies a refinement within an entry.
     * _pdbx_refine_tls_group.pdbx_refine_id can be used to distinguish the results
     * of joint refinements.
     * @return StrColumn
     */
    public StrColumn getPdbxRefineId() {
        return delegate.getColumn("pdbx_refine_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _pdbx_refine_tls.id in the
     * REFINE_TLS category.
     * @return StrColumn
     */
    public StrColumn getRefineTlsId() {
        return delegate.getColumn("refine_tls_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the residue at which the
     * TLS fragment range begins.
     * 
     * This data item is a pointer to _struct_asym.id in the
     * STRUCT_ASYM category.
     * @return StrColumn
     */
    public StrColumn getBegLabelAsymId() {
        return delegate.getColumn("beg_label_asym_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the residue at which the
     * TLS fragment range begins.
     * @return IntColumn
     */
    public IntColumn getBegLabelSeqId() {
        return delegate.getColumn("beg_label_seq_id", DelegatingIntColumn::new);
    }

    /**
     * A component of the identifier for the residue at which the
     * TLS fragment range begins.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getBegAuthAsymId() {
        return delegate.getColumn("beg_auth_asym_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the residue at which the
     * TLS fragment range begins.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getBegAuthSeqId() {
        return delegate.getColumn("beg_auth_seq_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the residue at which the
     * TLS fragment range begins.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getBegPDBInsCode() {
        return delegate.getColumn("beg_PDB_ins_code", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the residue at which the
     * TLS fragment range ends.
     * 
     * This data item is a pointer to _struct_asym.id in the
     * STRUCT_ASYM category.
     * @return StrColumn
     */
    public StrColumn getEndLabelAsymId() {
        return delegate.getColumn("end_label_asym_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the residue at which the
     * TLS fragment range ends.
     * @return IntColumn
     */
    public IntColumn getEndLabelSeqId() {
        return delegate.getColumn("end_label_seq_id", DelegatingIntColumn::new);
    }

    /**
     * A component of the identifier for the residue at which the
     * TLS fragment range ends.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getEndAuthAsymId() {
        return delegate.getColumn("end_auth_asym_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the residue at which the
     * TLS fragment range ends.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getEndAuthSeqId() {
        return delegate.getColumn("end_auth_seq_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the residue at which the
     * TLS fragment range ends.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getEndPDBInsCode() {
        return delegate.getColumn("end_PDB_ins_code", DelegatingStrColumn::new);
    }

    /**
     * A qualification of the subset of atoms in the specified
     * range included in the TLS fragment.
     * @return StrColumn
     */
    public StrColumn getSelection() {
        return delegate.getColumn("selection", DelegatingStrColumn::new);
    }

    /**
     * A text description of subset of atoms included
     * included in the TLS fragment.
     * @return StrColumn
     */
    public StrColumn getSelectionDetails() {
        return delegate.getColumn("selection_details", DelegatingStrColumn::new);
    }

}