package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the STRUCT_REF_SEQ category provide a mechanism
 * for indicating and annotating a region (or regions) of alignment
 * between the sequence of an entity or biological unit described
 * in the data block and the sequence in the referenced database
 * entry.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getAlignId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("align_id", StrColumn::new) :
                getBinaryColumn("align_id"));
    }

    /**
     * The sequence position in the referenced database entry
     * at which the alignment begins.
     * @return IntColumn
     */
    public IntColumn getDbAlignBeg() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("db_align_beg", IntColumn::new) :
                getBinaryColumn("db_align_beg"));
    }

    /**
     * The sequence position in the referenced database entry
     * at which the alignment ends.
     * @return IntColumn
     */
    public IntColumn getDbAlignEnd() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("db_align_end", IntColumn::new) :
                getBinaryColumn("db_align_end"));
    }

    /**
     * A description of special aspects of the sequence alignment.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * This data item is a pointer to _struct_ref.id in the
     * STRUCT_REF category.
     * @return StrColumn
     */
    public StrColumn getRefId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ref_id", StrColumn::new) :
                getBinaryColumn("ref_id"));
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
        return (IntColumn) (isText ? textFields.computeIfAbsent("seq_align_beg", IntColumn::new) :
                getBinaryColumn("seq_align_beg"));
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
        return (IntColumn) (isText ? textFields.computeIfAbsent("seq_align_end", IntColumn::new) :
                getBinaryColumn("seq_align_end"));
    }

    /**
     * The PDB strand/chain ID .
     * @return StrColumn
     */
    public StrColumn getPdbxStrandId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_strand_id", StrColumn::new) :
                getBinaryColumn("pdbx_strand_id"));
    }

    /**
     * Accession code of the reference database.
     * @return StrColumn
     */
    public StrColumn getPdbxDbAccession() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_db_accession", StrColumn::new) :
                getBinaryColumn("pdbx_db_accession"));
    }

    /**
     * 
     * Initial insertion code of the sequence segment of the
     * reference database.
     * @return StrColumn
     */
    public StrColumn getPdbxDbAlignBegInsCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_db_align_beg_ins_code", StrColumn::new) :
                getBinaryColumn("pdbx_db_align_beg_ins_code"));
    }

    /**
     * 
     * Ending insertion code of the sequence segment of the
     * reference database.
     * @return StrColumn
     */
    public StrColumn getPdbxDbAlignEndInsCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_db_align_end_ins_code", StrColumn::new) :
                getBinaryColumn("pdbx_db_align_end_ins_code"));
    }

    /**
     * The PDB code of the structure.
     * @return StrColumn
     */
    public StrColumn getPdbxPDBIdCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_PDB_id_code", StrColumn::new) :
                getBinaryColumn("pdbx_PDB_id_code"));
    }

    /**
     * 
     * Initial position in the PDB sequence segment.
     * @return StrColumn
     */
    public StrColumn getPdbxAuthSeqAlignBeg() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_auth_seq_align_beg", StrColumn::new) :
                getBinaryColumn("pdbx_auth_seq_align_beg"));
    }

    /**
     * 
     * Ending position in the PDB sequence segment
     * @return StrColumn
     */
    public StrColumn getPdbxAuthSeqAlignEnd() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_auth_seq_align_end", StrColumn::new) :
                getBinaryColumn("pdbx_auth_seq_align_end"));
    }

    /**
     * 
     * Initial insertion code of the PDB sequence segment.
     * @return StrColumn
     */
    public StrColumn getPdbxSeqAlignBegInsCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_seq_align_beg_ins_code", StrColumn::new) :
                getBinaryColumn("pdbx_seq_align_beg_ins_code"));
    }

    /**
     * 
     * Ending insertion code of the sequence segment
     * @return StrColumn
     */
    public StrColumn getPdbxSeqAlignEndInsCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_seq_align_end_ins_code", StrColumn::new) :
                getBinaryColumn("pdbx_seq_align_end_ins_code"));
    }
}
