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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getAlignId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("align_id", SingleRowStrColumn::new) :
                getBinaryColumn("align_id"));
    }

    /**
     * The sequence position in the referenced database entry
     * at which the alignment begins.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getDbAlignBeg() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("db_align_beg", SingleRowIntColumn::new) :
                getBinaryColumn("db_align_beg"));
    }

    /**
     * The sequence position in the referenced database entry
     * at which the alignment ends.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getDbAlignEnd() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("db_align_end", SingleRowIntColumn::new) :
                getBinaryColumn("db_align_end"));
    }

    /**
     * A description of special aspects of the sequence alignment.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * This data item is a pointer to _struct_ref.id in the
     * STRUCT_REF category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getRefId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("ref_id", SingleRowStrColumn::new) :
                getBinaryColumn("ref_id"));
    }

    /**
     * The sequence position in the entity or biological unit described
     * in the data block at which the alignment begins.
     * 
     * This data item is a pointer to _entity_poly_seq.num in the
     * ENTITY_POLY_SEQ category.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getSeqAlignBeg() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("seq_align_beg", SingleRowIntColumn::new) :
                getBinaryColumn("seq_align_beg"));
    }

    /**
     * The sequence position in the entity or biological unit described
     * in the data block at which the alignment ends.
     * 
     * This data item is a pointer to _entity_poly_seq.num in the
     * ENTITY_POLY_SEQ category.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getSeqAlignEnd() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("seq_align_end", SingleRowIntColumn::new) :
                getBinaryColumn("seq_align_end"));
    }

    /**
     * The PDB strand/chain ID .
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxStrandId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_strand_id", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_strand_id"));
    }

    /**
     * Accession code of the reference database.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxDbAccession() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_db_accession", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_db_accession"));
    }

    /**
     * 
     * Initial insertion code of the sequence segment of the
     * reference database.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxDbAlignBegInsCode() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_db_align_beg_ins_code", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_db_align_beg_ins_code"));
    }

    /**
     * 
     * Ending insertion code of the sequence segment of the
     * reference database.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxDbAlignEndInsCode() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_db_align_end_ins_code", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_db_align_end_ins_code"));
    }

    /**
     * The PDB code of the structure.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxPDBIdCode() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_PDB_id_code", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_PDB_id_code"));
    }

    /**
     * 
     * Initial position in the PDB sequence segment.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxAuthSeqAlignBeg() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_auth_seq_align_beg", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_auth_seq_align_beg"));
    }

    /**
     * 
     * Ending position in the PDB sequence segment
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxAuthSeqAlignEnd() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_auth_seq_align_end", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_auth_seq_align_end"));
    }

    /**
     * 
     * Initial insertion code of the PDB sequence segment.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxSeqAlignBegInsCode() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_seq_align_beg_ins_code", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_seq_align_beg_ins_code"));
    }

    /**
     * 
     * Ending insertion code of the sequence segment
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxSeqAlignEndInsCode() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_seq_align_end_ins_code", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_seq_align_end_ins_code"));
    }
}
