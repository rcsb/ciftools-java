package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the STRUCT_REF_SEQ category provide a mechanism
 * for indicating and annotating a region (or regions) of alignment
 * between the sequence of an entity or biological unit described
 * in the data block and the sequence in the referenced database
 * entry.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class StructRefSeq extends DelegatingCategory {
    public StructRefSeq(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "align_id":
                return getAlignId();
            case "db_align_beg":
                return getDbAlignBeg();
            case "db_align_end":
                return getDbAlignEnd();
            case "details":
                return getDetails();
            case "ref_id":
                return getRefId();
            case "seq_align_beg":
                return getSeqAlignBeg();
            case "seq_align_end":
                return getSeqAlignEnd();
            case "pdbx_strand_id":
                return getPdbxStrandId();
            case "pdbx_db_accession":
                return getPdbxDbAccession();
            case "pdbx_db_align_beg_ins_code":
                return getPdbxDbAlignBegInsCode();
            case "pdbx_db_align_end_ins_code":
                return getPdbxDbAlignEndInsCode();
            case "pdbx_PDB_id_code":
                return getPdbxPDBIdCode();
            case "pdbx_auth_seq_align_beg":
                return getPdbxAuthSeqAlignBeg();
            case "pdbx_auth_seq_align_end":
                return getPdbxAuthSeqAlignEnd();
            case "pdbx_seq_align_beg_ins_code":
                return getPdbxSeqAlignBegInsCode();
            case "pdbx_seq_align_end_ins_code":
                return getPdbxSeqAlignEndInsCode();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _struct_ref_seq.align_id must uniquely identify a
     * record in the STRUCT_REF_SEQ list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return StrColumn
     */
    public StrColumn getAlignId() {
        return delegate.getColumn("align_id", DelegatingStrColumn::new);
    }

    /**
     * The sequence position in the referenced database entry
     * at which the alignment begins.
     * @return IntColumn
     */
    public IntColumn getDbAlignBeg() {
        return delegate.getColumn("db_align_beg", DelegatingIntColumn::new);
    }

    /**
     * The sequence position in the referenced database entry
     * at which the alignment ends.
     * @return IntColumn
     */
    public IntColumn getDbAlignEnd() {
        return delegate.getColumn("db_align_end", DelegatingIntColumn::new);
    }

    /**
     * A description of special aspects of the sequence alignment.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _struct_ref.id in the
     * STRUCT_REF category.
     * @return StrColumn
     */
    public StrColumn getRefId() {
        return delegate.getColumn("ref_id", DelegatingStrColumn::new);
    }

    /**
     * The sequence position in the entity or biological unit described
     * in the data block at which the alignment begins.
     * 
     * This data item is a pointer to _entity_poly_seq.num in the
     * ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getSeqAlignBeg() {
        return delegate.getColumn("seq_align_beg", DelegatingIntColumn::new);
    }

    /**
     * The sequence position in the entity or biological unit described
     * in the data block at which the alignment ends.
     * 
     * This data item is a pointer to _entity_poly_seq.num in the
     * ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getSeqAlignEnd() {
        return delegate.getColumn("seq_align_end", DelegatingIntColumn::new);
    }

    /**
     * The PDB strand/chain ID .
     * @return StrColumn
     */
    public StrColumn getPdbxStrandId() {
        return delegate.getColumn("pdbx_strand_id", DelegatingStrColumn::new);
    }

    /**
     * Accession code of the reference database.
     * @return StrColumn
     */
    public StrColumn getPdbxDbAccession() {
        return delegate.getColumn("pdbx_db_accession", DelegatingStrColumn::new);
    }

    /**
     * Initial insertion code of the sequence segment of the
     * reference database.
     * @return StrColumn
     */
    public StrColumn getPdbxDbAlignBegInsCode() {
        return delegate.getColumn("pdbx_db_align_beg_ins_code", DelegatingStrColumn::new);
    }

    /**
     * Ending insertion code of the sequence segment of the
     * reference database.
     * @return StrColumn
     */
    public StrColumn getPdbxDbAlignEndInsCode() {
        return delegate.getColumn("pdbx_db_align_end_ins_code", DelegatingStrColumn::new);
    }

    /**
     * The PDB code of the structure.
     * @return StrColumn
     */
    public StrColumn getPdbxPDBIdCode() {
        return delegate.getColumn("pdbx_PDB_id_code", DelegatingStrColumn::new);
    }

    /**
     * Initial position in the PDB sequence segment.
     * @return StrColumn
     */
    public StrColumn getPdbxAuthSeqAlignBeg() {
        return delegate.getColumn("pdbx_auth_seq_align_beg", DelegatingStrColumn::new);
    }

    /**
     * Ending position in the PDB sequence segment
     * @return StrColumn
     */
    public StrColumn getPdbxAuthSeqAlignEnd() {
        return delegate.getColumn("pdbx_auth_seq_align_end", DelegatingStrColumn::new);
    }

    /**
     * Initial insertion code of the PDB sequence segment.
     * @return StrColumn
     */
    public StrColumn getPdbxSeqAlignBegInsCode() {
        return delegate.getColumn("pdbx_seq_align_beg_ins_code", DelegatingStrColumn::new);
    }

    /**
     * Ending insertion code of the sequence segment
     * @return StrColumn
     */
    public StrColumn getPdbxSeqAlignEndInsCode() {
        return delegate.getColumn("pdbx_seq_align_end_ins_code", DelegatingStrColumn::new);
    }

}