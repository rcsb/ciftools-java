package org.rcsb.cif.schema.generated.mm;

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
     * @return StrColumn
     */
    public StrColumn getBegAuthAsymId() {
        return delegate.getColumn("beg_auth_asym_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the residue at which the
     * TLS fragment range begins.
     * @return StrColumn
     */
    public StrColumn getBegAuthSeqId() {
        return delegate.getColumn("beg_auth_seq_id", DelegatingStrColumn::new);
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
     * @return StrColumn
     */
    public StrColumn getEndAuthAsymId() {
        return delegate.getColumn("end_auth_asym_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the residue at which the
     * TLS fragment range ends.
     * @return StrColumn
     */
    public StrColumn getEndAuthSeqId() {
        return delegate.getColumn("end_auth_seq_id", DelegatingStrColumn::new);
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
