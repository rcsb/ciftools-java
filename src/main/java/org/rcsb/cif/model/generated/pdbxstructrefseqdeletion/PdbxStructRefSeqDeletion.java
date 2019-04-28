package org.rcsb.cif.model.generated.pdbxstructrefseqdeletion;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxStructRefSeqDeletion extends BaseCategory {
    public PdbxStructRefSeqDeletion(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxStructRefSeqDeletion(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxStructRefSeqDeletion(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_struct_ref_seq_deletion.id must
     * uniquely identify a record in the PDBX_STRUCT_REF_SEQ_DELETION list.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * A description of any special aspects of the deletion
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * Identifies the polymer entity instance in this entry corresponding
     * to the reference sequence in which the deletion is specified.
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
     * The monomer name found at this position in the referenced
     * database entry.
     * @return CompId
     */
    public CompId getCompId() {
        return (CompId) (isText ? textFields.computeIfAbsent("comp_id",
                CompId::new) : getBinaryColumn("comp_id"));
    }

    /**
     * This data item is the database sequence numbering of the deleted
     * residue
     * @return DbSeqId
     */
    public DbSeqId getDbSeqId() {
        return (DbSeqId) (isText ? textFields.computeIfAbsent("db_seq_id",
                DbSeqId::new) : getBinaryColumn("db_seq_id"));
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
