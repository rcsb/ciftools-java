package org.rcsb.cif.model.pdbxstructrefseqinsertion;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxStructRefSeqInsertion extends BaseCategory {
    public PdbxStructRefSeqInsertion(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxStructRefSeqInsertion(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxStructRefSeqInsertion(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_struct_ref_seq_insertion.id must
     * uniquely identify a record in the PDBX_STRUCT_REF_SEQ_INSERTION list.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * Part of the identifier of the inserted residue.
     * 
     * This data item is a pointer to _pdbx_poly_seq_scheme.mon_id in the
     * PDBX_POLY_SEQ_SCHEME category.
     * @return CompId
     */
    public CompId getCompId() {
        return (CompId) (isText ? textFields.computeIfAbsent("comp_id",
                CompId::new) : getBinaryColumn("comp_id"));
    }

    /**
     * Part of the identifier of the inserted residue.
     * 
     * This data item is a pointer to _pdbx_poly_seq_scheme.asym_id in the
     * PDBX_POLY_SEQ_SCHEME category.
     * @return AsymId
     */
    public AsymId getAsymId() {
        return (AsymId) (isText ? textFields.computeIfAbsent("asym_id",
                AsymId::new) : getBinaryColumn("asym_id"));
    }

    /**
     * Part of the author identifier of the inserted residue.
     * 
     * This data item is a pointer to _pdbx_poly_seq_scheme.pdb_strand_id in the
     * PDBX_POLY_SEQ_SCHEME category.
     * @return AuthAsymId
     */
    public AuthAsymId getAuthAsymId() {
        return (AuthAsymId) (isText ? textFields.computeIfAbsent("auth_asym_id",
                AuthAsymId::new) : getBinaryColumn("auth_asym_id"));
    }

    /**
     * Part of the author identifier of the inserted residue.
     * 
     * This data item is a pointer to _pdbx_poly_seq_scheme.auth_seq_num in the
     * PDBX_POLY_SEQ_SCHEME category.
     * @return AuthSeqId
     */
    public AuthSeqId getAuthSeqId() {
        return (AuthSeqId) (isText ? textFields.computeIfAbsent("auth_seq_id",
                AuthSeqId::new) : getBinaryColumn("auth_seq_id"));
    }

    /**
     * Part of the author identifier of the inserted residue.
     * 
     * This data item is a pointer to _pdbx_poly_seq_scheme.seq_id in the
     * PDBX_POLY_SEQ_SCHEME category.
     * @return SeqId
     */
    public SeqId getSeqId() {
        return (SeqId) (isText ? textFields.computeIfAbsent("seq_id",
                SeqId::new) : getBinaryColumn("seq_id"));
    }

    /**
     * Part of the author identifier of the inserted residue.
     * 
     * This data item is a pointer to _pdbx_poly_seq_scheme.pdb_ins_code in the
     * PDBX_POLY_SEQ_SCHEME category.
     * @return PDBInsCode
     */
    public PDBInsCode getPDBInsCode() {
        return (PDBInsCode) (isText ? textFields.computeIfAbsent("PDB_ins_code",
                PDBInsCode::new) : getBinaryColumn("PDB_ins_code"));
    }

    /**
     * A description of any special aspects of the insertion
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * The code for this entity or biological unit or for a closely
     * related entity or biological unit in the named database.
     * @return DbCode
     */
    public DbCode getDbCode() {
        return (DbCode) (isText ? textFields.computeIfAbsent("db_code",
                DbCode::new) : getBinaryColumn("db_code"));
    }

    /**
     * The name of the database containing reference information about
     * this entity or biological unit.
     * @return DbName
     */
    public DbName getDbName() {
        return (DbName) (isText ? textFields.computeIfAbsent("db_name",
                DbName::new) : getBinaryColumn("db_name"));
    }
}
