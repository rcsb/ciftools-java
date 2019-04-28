package org.rcsb.cif.model.generated.structrefseq;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class StructRefSeq extends BaseCategory {
    public StructRefSeq(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public StructRefSeq(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public StructRefSeq(String name) {
        super(name);
    }

    /**
     * The value of _struct_ref_seq.align_id must uniquely identify a
     * record in the STRUCT_REF_SEQ list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return AlignId
     */
    public AlignId getAlignId() {
        return (AlignId) (isText ? textFields.computeIfAbsent("align_id",
                AlignId::new) : getBinaryColumn("align_id"));
    }

    /**
     * The sequence position in the referenced database entry
     * at which the alignment begins.
     * @return DbAlignBeg
     */
    public DbAlignBeg getDbAlignBeg() {
        return (DbAlignBeg) (isText ? textFields.computeIfAbsent("db_align_beg",
                DbAlignBeg::new) : getBinaryColumn("db_align_beg"));
    }

    /**
     * The sequence position in the referenced database entry
     * at which the alignment ends.
     * @return DbAlignEnd
     */
    public DbAlignEnd getDbAlignEnd() {
        return (DbAlignEnd) (isText ? textFields.computeIfAbsent("db_align_end",
                DbAlignEnd::new) : getBinaryColumn("db_align_end"));
    }

    /**
     * A description of special aspects of the sequence alignment.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * This data item is a pointer to _struct_ref.id in the
     * STRUCT_REF category.
     * @return RefId
     */
    public RefId getRefId() {
        return (RefId) (isText ? textFields.computeIfAbsent("ref_id",
                RefId::new) : getBinaryColumn("ref_id"));
    }

    /**
     * The sequence position in the entity or biological unit described
     * in the data block at which the alignment begins.
     * 
     * This data item is a pointer to _entity_poly_seq.num in the
     * ENTITY_POLY_SEQ category.
     * @return SeqAlignBeg
     */
    public SeqAlignBeg getSeqAlignBeg() {
        return (SeqAlignBeg) (isText ? textFields.computeIfAbsent("seq_align_beg",
                SeqAlignBeg::new) : getBinaryColumn("seq_align_beg"));
    }

    /**
     * The sequence position in the entity or biological unit described
     * in the data block at which the alignment ends.
     * 
     * This data item is a pointer to _entity_poly_seq.num in the
     * ENTITY_POLY_SEQ category.
     * @return SeqAlignEnd
     */
    public SeqAlignEnd getSeqAlignEnd() {
        return (SeqAlignEnd) (isText ? textFields.computeIfAbsent("seq_align_end",
                SeqAlignEnd::new) : getBinaryColumn("seq_align_end"));
    }

    /**
     * The PDB strand/chain ID .
     * @return PdbxStrandId
     */
    public PdbxStrandId getPdbxStrandId() {
        return (PdbxStrandId) (isText ? textFields.computeIfAbsent("pdbx_strand_id",
                PdbxStrandId::new) : getBinaryColumn("pdbx_strand_id"));
    }

    /**
     * Accession code of the reference database.
     * @return PdbxDbAccession
     */
    public PdbxDbAccession getPdbxDbAccession() {
        return (PdbxDbAccession) (isText ? textFields.computeIfAbsent("pdbx_db_accession",
                PdbxDbAccession::new) : getBinaryColumn("pdbx_db_accession"));
    }

    /**
     * 
     * Initial insertion code of the sequence segment of the
     * reference database.
     * @return PdbxDbAlignBegInsCode
     */
    public PdbxDbAlignBegInsCode getPdbxDbAlignBegInsCode() {
        return (PdbxDbAlignBegInsCode) (isText ? textFields.computeIfAbsent("pdbx_db_align_beg_ins_code",
                PdbxDbAlignBegInsCode::new) : getBinaryColumn("pdbx_db_align_beg_ins_code"));
    }

    /**
     * 
     * Ending insertion code of the sequence segment of the
     * reference database.
     * @return PdbxDbAlignEndInsCode
     */
    public PdbxDbAlignEndInsCode getPdbxDbAlignEndInsCode() {
        return (PdbxDbAlignEndInsCode) (isText ? textFields.computeIfAbsent("pdbx_db_align_end_ins_code",
                PdbxDbAlignEndInsCode::new) : getBinaryColumn("pdbx_db_align_end_ins_code"));
    }

    /**
     * The PDB code of the structure.
     * @return PdbxPDBIdCode
     */
    public PdbxPDBIdCode getPdbxPDBIdCode() {
        return (PdbxPDBIdCode) (isText ? textFields.computeIfAbsent("pdbx_PDB_id_code",
                PdbxPDBIdCode::new) : getBinaryColumn("pdbx_PDB_id_code"));
    }

    /**
     * 
     * Initial position in the PDB sequence segment.
     * @return PdbxAuthSeqAlignBeg
     */
    public PdbxAuthSeqAlignBeg getPdbxAuthSeqAlignBeg() {
        return (PdbxAuthSeqAlignBeg) (isText ? textFields.computeIfAbsent("pdbx_auth_seq_align_beg",
                PdbxAuthSeqAlignBeg::new) : getBinaryColumn("pdbx_auth_seq_align_beg"));
    }

    /**
     * 
     * Ending position in the PDB sequence segment
     * @return PdbxAuthSeqAlignEnd
     */
    public PdbxAuthSeqAlignEnd getPdbxAuthSeqAlignEnd() {
        return (PdbxAuthSeqAlignEnd) (isText ? textFields.computeIfAbsent("pdbx_auth_seq_align_end",
                PdbxAuthSeqAlignEnd::new) : getBinaryColumn("pdbx_auth_seq_align_end"));
    }

    /**
     * 
     * Initial insertion code of the PDB sequence segment.
     * @return PdbxSeqAlignBegInsCode
     */
    public PdbxSeqAlignBegInsCode getPdbxSeqAlignBegInsCode() {
        return (PdbxSeqAlignBegInsCode) (isText ? textFields.computeIfAbsent("pdbx_seq_align_beg_ins_code",
                PdbxSeqAlignBegInsCode::new) : getBinaryColumn("pdbx_seq_align_beg_ins_code"));
    }

    /**
     * 
     * Ending insertion code of the sequence segment
     * @return PdbxSeqAlignEndInsCode
     */
    public PdbxSeqAlignEndInsCode getPdbxSeqAlignEndInsCode() {
        return (PdbxSeqAlignEndInsCode) (isText ? textFields.computeIfAbsent("pdbx_seq_align_end_ins_code",
                PdbxSeqAlignEndInsCode::new) : getBinaryColumn("pdbx_seq_align_end_ins_code"));
    }
}
