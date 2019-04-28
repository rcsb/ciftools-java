package org.rcsb.cif.model.generated.structrefseqdif;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return AlignId
     */
    public AlignId getAlignId() {
        return (AlignId) (isText ? textFields.computeIfAbsent("align_id",
                AlignId::new) : getBinaryColumn("align_id"));
    }

    /**
     * The monomer type found at this position in the referenced
     * database entry.
     * 
     * This data item is a pointer to _chem_comp.id in the CHEM_COMP
     * category.
     * @return DbMonId
     */
    public DbMonId getDbMonId() {
        return (DbMonId) (isText ? textFields.computeIfAbsent("db_mon_id",
                DbMonId::new) : getBinaryColumn("db_mon_id"));
    }

    /**
     * A description of special aspects of the point differences
     * between the sequence of the entity or biological unit described
     * in the data block and that in the referenced database entry.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * The monomer type found at this position in the sequence of
     * the entity or biological unit described in this data block.
     * 
     * This data item is a pointer to _chem_comp.id in the CHEM_COMP
     * category.
     * @return MonId
     */
    public MonId getMonId() {
        return (MonId) (isText ? textFields.computeIfAbsent("mon_id",
                MonId::new) : getBinaryColumn("mon_id"));
    }

    /**
     * This data item is a pointer to _entity_poly_seq.num in the
     * ENTITY_POLY_SEQ category.
     * @return SeqNum
     */
    public SeqNum getSeqNum() {
        return (SeqNum) (isText ? textFields.computeIfAbsent("seq_num",
                SeqNum::new) : getBinaryColumn("seq_num"));
    }

    /**
     * 
     * The PDB ID code.
     * @return PdbxPdbIdCode
     */
    public PdbxPdbIdCode getPdbxPdbIdCode() {
        return (PdbxPdbIdCode) (isText ? textFields.computeIfAbsent("pdbx_pdb_id_code",
                PdbxPdbIdCode::new) : getBinaryColumn("pdbx_pdb_id_code"));
    }

    /**
     * PDB strand/chain id.
     * @return PdbxPdbStrandId
     */
    public PdbxPdbStrandId getPdbxPdbStrandId() {
        return (PdbxPdbStrandId) (isText ? textFields.computeIfAbsent("pdbx_pdb_strand_id",
                PdbxPdbStrandId::new) : getBinaryColumn("pdbx_pdb_strand_id"));
    }

    /**
     * Insertion code in PDB sequence
     * @return PdbxPdbInsCode
     */
    public PdbxPdbInsCode getPdbxPdbInsCode() {
        return (PdbxPdbInsCode) (isText ? textFields.computeIfAbsent("pdbx_pdb_ins_code",
                PdbxPdbInsCode::new) : getBinaryColumn("pdbx_pdb_ins_code"));
    }

    /**
     * Insertion code in PDB sequence
     * @return PdbxAuthSeqNum
     */
    public PdbxAuthSeqNum getPdbxAuthSeqNum() {
        return (PdbxAuthSeqNum) (isText ? textFields.computeIfAbsent("pdbx_auth_seq_num",
                PdbxAuthSeqNum::new) : getBinaryColumn("pdbx_auth_seq_num"));
    }

    /**
     * Sequence database name.
     * @return PdbxSeqDbName
     */
    public PdbxSeqDbName getPdbxSeqDbName() {
        return (PdbxSeqDbName) (isText ? textFields.computeIfAbsent("pdbx_seq_db_name",
                PdbxSeqDbName::new) : getBinaryColumn("pdbx_seq_db_name"));
    }

    /**
     * Sequence database accession number.
     * @return PdbxSeqDbAccessionCode
     */
    public PdbxSeqDbAccessionCode getPdbxSeqDbAccessionCode() {
        return (PdbxSeqDbAccessionCode) (isText ? textFields.computeIfAbsent("pdbx_seq_db_accession_code",
                PdbxSeqDbAccessionCode::new) : getBinaryColumn("pdbx_seq_db_accession_code"));
    }

    /**
     * Sequence database sequence number.
     * @return PdbxSeqDbSeqNum
     */
    public PdbxSeqDbSeqNum getPdbxSeqDbSeqNum() {
        return (PdbxSeqDbSeqNum) (isText ? textFields.computeIfAbsent("pdbx_seq_db_seq_num",
                PdbxSeqDbSeqNum::new) : getBinaryColumn("pdbx_seq_db_seq_num"));
    }

    /**
     * A synthetic integer primary key for this category.
     * @return PdbxOrdinal
     */
    public PdbxOrdinal getPdbxOrdinal() {
        return (PdbxOrdinal) (isText ? textFields.computeIfAbsent("pdbx_ordinal",
                PdbxOrdinal::new) : getBinaryColumn("pdbx_ordinal"));
    }
}
