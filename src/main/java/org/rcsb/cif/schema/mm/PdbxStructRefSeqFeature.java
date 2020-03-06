package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_STRUCT_REF_SEQ_FEATURE category provide a
 * mechanism for identifying and annotating sequence features.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxStructRefSeqFeature extends DelegatingCategory {
    public PdbxStructRefSeqFeature(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "feature_id":
                return getFeatureId();
            case "align_id":
                return getAlignId();
            case "type":
                return getType();
            case "details":
                return getDetails();
            case "pdb_strand_id":
                return getPdbStrandId();
            case "asym_id":
                return getAsymId();
            case "beg_auth_seq_id":
                return getBegAuthSeqId();
            case "end_auth_seq_id":
                return getEndAuthSeqId();
            case "beg_seq_num":
                return getBegSeqNum();
            case "end_seq_num":
                return getEndSeqNum();
            case "beg_auth_mon_id":
                return getBegAuthMonId();
            case "end_auth_mon_id":
                return getEndAuthMonId();
            case "beg_pdb_ins_code":
                return getBegPdbInsCode();
            case "end_pdb_ins_code":
                return getEndPdbInsCode();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Uniquely identfies a sequence feature in
     * the STRUCT_REF_SEQ_FEATURE  category.
     * @return IntColumn
     */
    public IntColumn getFeatureId() {
        return delegate.getColumn("feature_id", DelegatingIntColumn::new);
    }

    /**
     * This data item is a pointer to _struct_ref_seq.align_id in
     * the STRUCT_REF_SEQ  category.
     * @return StrColumn
     */
    public StrColumn getAlignId() {
        return delegate.getColumn("align_id", DelegatingStrColumn::new);
    }

    /**
     * A classification of the feature
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * A description of special aspects of the feature
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * PDB strand/chain id.
     * @return StrColumn
     */
    public StrColumn getPdbStrandId() {
        return delegate.getColumn("pdb_strand_id", DelegatingStrColumn::new);
    }

    /**
     * Instance identifier for the polymer molecule.
     * @return StrColumn
     */
    public StrColumn getAsymId() {
        return delegate.getColumn("asym_id", DelegatingStrColumn::new);
    }

    /**
     * Initial position in the PDB sequence segment.
     * @return StrColumn
     */
    public StrColumn getBegAuthSeqId() {
        return delegate.getColumn("beg_auth_seq_id", DelegatingStrColumn::new);
    }

    /**
     * Ending position in the PDB sequence segment
     * @return StrColumn
     */
    public StrColumn getEndAuthSeqId() {
        return delegate.getColumn("end_auth_seq_id", DelegatingStrColumn::new);
    }

    /**
     * Initial position in the sequence segment.
     * @return StrColumn
     */
    public StrColumn getBegSeqNum() {
        return delegate.getColumn("beg_seq_num", DelegatingStrColumn::new);
    }

    /**
     * Ending position in the sequence segment
     * @return StrColumn
     */
    public StrColumn getEndSeqNum() {
        return delegate.getColumn("end_seq_num", DelegatingStrColumn::new);
    }

    /**
     * Monomer ID at the initial position in the PDB sequence segment.
     * @return StrColumn
     */
    public StrColumn getBegAuthMonId() {
        return delegate.getColumn("beg_auth_mon_id", DelegatingStrColumn::new);
    }

    /**
     * Monomer ID at the terminal position in the PDB sequence segment
     * @return StrColumn
     */
    public StrColumn getEndAuthMonId() {
        return delegate.getColumn("end_auth_mon_id", DelegatingStrColumn::new);
    }

    /**
     * Initial insertion code of the PDB sequence segment.
     * @return StrColumn
     */
    public StrColumn getBegPdbInsCode() {
        return delegate.getColumn("beg_pdb_ins_code", DelegatingStrColumn::new);
    }

    /**
     * Terminal insertion code of the PDB sequence segment.
     * @return StrColumn
     */
    public StrColumn getEndPdbInsCode() {
        return delegate.getColumn("end_pdb_ins_code", DelegatingStrColumn::new);
    }

}