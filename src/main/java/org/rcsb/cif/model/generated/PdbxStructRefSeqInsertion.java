package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_STRUCT_REF_SEQ_INSERTION category
 * annotate insertions in the sequence of the entity described
 * in the referenced database entry.
 */
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
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * Part of the identifier of the inserted residue.
     * 
     * This data item is a pointer to _pdbx_poly_seq_scheme.mon_id in the
     * PDBX_POLY_SEQ_SCHEME category.
     * @return StrColumn
     */
    public StrColumn getCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("comp_id", StrColumn::new) :
                getBinaryColumn("comp_id"));
    }

    /**
     * Part of the identifier of the inserted residue.
     * 
     * This data item is a pointer to _pdbx_poly_seq_scheme.asym_id in the
     * PDBX_POLY_SEQ_SCHEME category.
     * @return StrColumn
     */
    public StrColumn getAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("asym_id", StrColumn::new) :
                getBinaryColumn("asym_id"));
    }

    /**
     * Part of the author identifier of the inserted residue.
     * 
     * This data item is a pointer to _pdbx_poly_seq_scheme.pdb_strand_id in the
     * PDBX_POLY_SEQ_SCHEME category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_asym_id", StrColumn::new) :
                getBinaryColumn("auth_asym_id"));
    }

    /**
     * Part of the author identifier of the inserted residue.
     * 
     * This data item is a pointer to _pdbx_poly_seq_scheme.auth_seq_num in the
     * PDBX_POLY_SEQ_SCHEME category.
     * @return StrColumn
     */
    public StrColumn getAuthSeqId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_seq_id", StrColumn::new) :
                getBinaryColumn("auth_seq_id"));
    }

    /**
     * Part of the author identifier of the inserted residue.
     * 
     * This data item is a pointer to _pdbx_poly_seq_scheme.seq_id in the
     * PDBX_POLY_SEQ_SCHEME category.
     * @return IntColumn
     */
    public IntColumn getSeqId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("seq_id", IntColumn::new) :
                getBinaryColumn("seq_id"));
    }

    /**
     * Part of the author identifier of the inserted residue.
     * 
     * This data item is a pointer to _pdbx_poly_seq_scheme.pdb_ins_code in the
     * PDBX_POLY_SEQ_SCHEME category.
     * @return StrColumn
     */
    public StrColumn getPDBInsCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("PDB_ins_code", StrColumn::new) :
                getBinaryColumn("PDB_ins_code"));
    }

    /**
     * A description of any special aspects of the insertion
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The code for this entity or biological unit or for a closely
     * related entity or biological unit in the named database.
     * @return StrColumn
     */
    public StrColumn getDbCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("db_code", StrColumn::new) :
                getBinaryColumn("db_code"));
    }

    /**
     * The name of the database containing reference information about
     * this entity or biological unit.
     * @return StrColumn
     */
    public StrColumn getDbName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("db_name", StrColumn::new) :
                getBinaryColumn("db_name"));
    }
}
