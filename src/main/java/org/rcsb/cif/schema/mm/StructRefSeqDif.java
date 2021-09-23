package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the STRUCT_REF_SEQ_DIF category provide a
 * mechanism for indicating and annotating point differences
 * between the sequence of the entity or biological unit described
 * in the data block and the sequence of the referenced database
 * entry.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class StructRefSeqDif extends DelegatingCategory {
    public StructRefSeqDif(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "align_id":
                return getAlignId();
            case "db_mon_id":
                return getDbMonId();
            case "details":
                return getDetails();
            case "mon_id":
                return getMonId();
            case "seq_num":
                return getSeqNum();
            case "pdbx_pdb_id_code":
                return getPdbxPdbIdCode();
            case "pdbx_pdb_strand_id":
                return getPdbxPdbStrandId();
            case "pdbx_pdb_ins_code":
                return getPdbxPdbInsCode();
            case "pdbx_auth_seq_num":
                return getPdbxAuthSeqNum();
            case "pdbx_seq_db_name":
                return getPdbxSeqDbName();
            case "pdbx_seq_db_accession_code":
                return getPdbxSeqDbAccessionCode();
            case "pdbx_seq_db_seq_num":
                return getPdbxSeqDbSeqNum();
            case "pdbx_ordinal":
                return getPdbxOrdinal();
            default:
                return new DelegatingColumn(column);
        }
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
     * The monomer type found at this position in the referenced
     * database entry.
     * 
     * This data item is a pointer to _chem_comp.id in the CHEM_COMP
     * category.
     * @return StrColumn
     */
    public StrColumn getDbMonId() {
        return delegate.getColumn("db_mon_id", DelegatingStrColumn::new);
    }

    /**
     * A description of special aspects of the point differences
     * between the sequence of the entity or biological unit described
     * in the data block and that in the referenced database entry.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The monomer type found at this position in the sequence of
     * the entity or biological unit described in this data block.
     * 
     * This data item is a pointer to _chem_comp.id in the CHEM_COMP
     * category.
     * @return StrColumn
     */
    public StrColumn getMonId() {
        return delegate.getColumn("mon_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _entity_poly_seq.num in the
     * ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getSeqNum() {
        return delegate.getColumn("seq_num", DelegatingIntColumn::new);
    }

    /**
     * The PDB ID code.
     * @return StrColumn
     */
    public StrColumn getPdbxPdbIdCode() {
        return delegate.getColumn("pdbx_pdb_id_code", DelegatingStrColumn::new);
    }

    /**
     * PDB strand/chain id.
     * @return StrColumn
     */
    public StrColumn getPdbxPdbStrandId() {
        return delegate.getColumn("pdbx_pdb_strand_id", DelegatingStrColumn::new);
    }

    /**
     * Insertion code in PDB sequence
     * @return StrColumn
     */
    public StrColumn getPdbxPdbInsCode() {
        return delegate.getColumn("pdbx_pdb_ins_code", DelegatingStrColumn::new);
    }

    /**
     * The PDB sequence residue number.
     * @return StrColumn
     */
    public StrColumn getPdbxAuthSeqNum() {
        return delegate.getColumn("pdbx_auth_seq_num", DelegatingStrColumn::new);
    }

    /**
     * Sequence database name.
     * @return StrColumn
     */
    public StrColumn getPdbxSeqDbName() {
        return delegate.getColumn("pdbx_seq_db_name", DelegatingStrColumn::new);
    }

    /**
     * Sequence database accession number.
     * @return StrColumn
     */
    public StrColumn getPdbxSeqDbAccessionCode() {
        return delegate.getColumn("pdbx_seq_db_accession_code", DelegatingStrColumn::new);
    }

    /**
     * Sequence database sequence number.
     * @return StrColumn
     */
    public StrColumn getPdbxSeqDbSeqNum() {
        return delegate.getColumn("pdbx_seq_db_seq_num", DelegatingStrColumn::new);
    }

    /**
     * A synthetic integer primary key for this category.
     * @return IntColumn
     */
    public IntColumn getPdbxOrdinal() {
        return delegate.getColumn("pdbx_ordinal", DelegatingIntColumn::new);
    }

}