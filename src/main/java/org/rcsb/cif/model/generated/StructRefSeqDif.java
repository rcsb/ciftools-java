package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the STRUCT_REF_SEQ_DIF category provide a
 * mechanism for indicating and annotating point differences
 * between the sequence of the entity or biological unit described
 * in the data block and the sequence of the referenced database
 * entry.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class StructRefSeqDif extends BaseCategory {
    public StructRefSeqDif(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public StructRefSeqDif(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public StructRefSeqDif(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _struct_ref_seq.align_id in
     * the STRUCT_REF_SEQ  category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getAlignId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("align_id", SingleRowStrColumn::new) :
                getBinaryColumn("align_id"));
    }

    /**
     * The monomer type found at this position in the referenced
     * database entry.
     * 
     * This data item is a pointer to _chem_comp.id in the CHEM_COMP
     * category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDbMonId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("db_mon_id", SingleRowStrColumn::new) :
                getBinaryColumn("db_mon_id"));
    }

    /**
     * A description of special aspects of the point differences
     * between the sequence of the entity or biological unit described
     * in the data block and that in the referenced database entry.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The monomer type found at this position in the sequence of
     * the entity or biological unit described in this data block.
     * 
     * This data item is a pointer to _chem_comp.id in the CHEM_COMP
     * category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getMonId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("mon_id", SingleRowStrColumn::new) :
                getBinaryColumn("mon_id"));
    }

    /**
     * This data item is a pointer to _entity_poly_seq.num in the
     * ENTITY_POLY_SEQ category.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getSeqNum() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("seq_num", SingleRowIntColumn::new) :
                getBinaryColumn("seq_num"));
    }

    /**
     * 
     * The PDB ID code.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxPdbIdCode() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_pdb_id_code", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_pdb_id_code"));
    }

    /**
     * PDB strand/chain id.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxPdbStrandId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_pdb_strand_id", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_pdb_strand_id"));
    }

    /**
     * Insertion code in PDB sequence
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxPdbInsCode() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_pdb_ins_code", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_pdb_ins_code"));
    }

    /**
     * Insertion code in PDB sequence
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxAuthSeqNum() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_auth_seq_num", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_auth_seq_num"));
    }

    /**
     * Sequence database name.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxSeqDbName() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_seq_db_name", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_seq_db_name"));
    }

    /**
     * Sequence database accession number.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxSeqDbAccessionCode() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_seq_db_accession_code", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_seq_db_accession_code"));
    }

    /**
     * Sequence database sequence number.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxSeqDbSeqNum() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_seq_db_seq_num", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_seq_db_seq_num"));
    }

    /**
     * A synthetic integer primary key for this category.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getPdbxOrdinal() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("pdbx_ordinal", SingleRowIntColumn::new) :
                getBinaryColumn("pdbx_ordinal"));
    }
}
