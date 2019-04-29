package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_STRUCT_REF_SEQ_INSERTION category
 * annotate deletions in the sequence of the entity described
 * in the referenced database entry.
 */
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
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * A description of any special aspects of the deletion
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * Identifies the polymer entity instance in this entry corresponding
     * to the reference sequence in which the deletion is specified.
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
     * The monomer name found at this position in the referenced
     * database entry.
     * @return StrColumn
     */
    public StrColumn getCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("comp_id", StrColumn::new) :
                getBinaryColumn("comp_id"));
    }

    /**
     * This data item is the database sequence numbering of the deleted
     * residue
     * @return IntColumn
     */
    public IntColumn getDbSeqId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("db_seq_id", IntColumn::new) :
                getBinaryColumn("db_seq_id"));
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
