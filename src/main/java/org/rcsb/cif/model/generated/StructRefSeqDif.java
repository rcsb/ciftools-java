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
     * @return StrColumn
     */
    public StrColumn getAlignId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("align_id", StrColumn::new) :
                getBinaryColumn("align_id"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("db_mon_id", StrColumn::new) :
                getBinaryColumn("db_mon_id"));
    }

    /**
     * A description of special aspects of the point differences
     * between the sequence of the entity or biological unit described
     * in the data block and that in the referenced database entry.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("mon_id", StrColumn::new) :
                getBinaryColumn("mon_id"));
    }

    /**
     * This data item is a pointer to _entity_poly_seq.num in the
     * ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getSeqNum() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("seq_num", IntColumn::new) :
                getBinaryColumn("seq_num"));
    }

    /**
     * 
     * The PDB ID code.
     * @return StrColumn
     */
    public StrColumn getPdbxPdbIdCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_pdb_id_code", StrColumn::new) :
                getBinaryColumn("pdbx_pdb_id_code"));
    }

    /**
     * PDB strand/chain id.
     * @return StrColumn
     */
    public StrColumn getPdbxPdbStrandId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_pdb_strand_id", StrColumn::new) :
                getBinaryColumn("pdbx_pdb_strand_id"));
    }

    /**
     * Insertion code in PDB sequence
     * @return StrColumn
     */
    public StrColumn getPdbxPdbInsCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_pdb_ins_code", StrColumn::new) :
                getBinaryColumn("pdbx_pdb_ins_code"));
    }

    /**
     * Insertion code in PDB sequence
     * @return StrColumn
     */
    public StrColumn getPdbxAuthSeqNum() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_auth_seq_num", StrColumn::new) :
                getBinaryColumn("pdbx_auth_seq_num"));
    }

    /**
     * Sequence database name.
     * @return StrColumn
     */
    public StrColumn getPdbxSeqDbName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_seq_db_name", StrColumn::new) :
                getBinaryColumn("pdbx_seq_db_name"));
    }

    /**
     * Sequence database accession number.
     * @return StrColumn
     */
    public StrColumn getPdbxSeqDbAccessionCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_seq_db_accession_code", StrColumn::new) :
                getBinaryColumn("pdbx_seq_db_accession_code"));
    }

    /**
     * Sequence database sequence number.
     * @return StrColumn
     */
    public StrColumn getPdbxSeqDbSeqNum() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_seq_db_seq_num", StrColumn::new) :
                getBinaryColumn("pdbx_seq_db_seq_num"));
    }

    /**
     * A synthetic integer primary key for this category.
     * @return IntColumn
     */
    public IntColumn getPdbxOrdinal() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_ordinal", IntColumn::new) :
                getBinaryColumn("pdbx_ordinal"));
    }
}
