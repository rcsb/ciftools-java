package org.rcsb.cif.model.pdbxstructrefseqdifdepositorinfo;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxStructRefSeqDifDepositorInfo extends BaseCategory {
    public PdbxStructRefSeqDifDepositorInfo(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxStructRefSeqDifDepositorInfo(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxStructRefSeqDifDepositorInfo(String name) {
        super(name);
    }

    /**
     * Ordinal index for this category.
     * @return Ordinal
     */
    public Ordinal getOrdinal() {
        return (Ordinal) (isText ? textFields.computeIfAbsent("ordinal",
                Ordinal::new) : getBinaryColumn("ordinal"));
    }

    /**
     * This data item is a pointer to _struct_ref_seq.ref_id in
     * the STRUCT_REF_SEQ_DEPOSITOR_INFO  category.
     * @return RefId
     */
    public RefId getRefId() {
        return (RefId) (isText ? textFields.computeIfAbsent("ref_id",
                RefId::new) : getBinaryColumn("ref_id"));
    }

    /**
     * This data item is a pointer to _entity.id in the ENTITY category.
     * @return EntityId
     */
    public EntityId getEntityId() {
        return (EntityId) (isText ? textFields.computeIfAbsent("entity_id",
                EntityId::new) : getBinaryColumn("entity_id"));
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
     * The monomer position in the referenced database entry.
     * @return DbSeqId
     */
    public DbSeqId getDbSeqId() {
        return (DbSeqId) (isText ? textFields.computeIfAbsent("db_seq_id",
                DbSeqId::new) : getBinaryColumn("db_seq_id"));
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
     * the entity or biological unit provided by the depositor.
     * @return AuthMonId
     */
    public AuthMonId getAuthMonId() {
        return (AuthMonId) (isText ? textFields.computeIfAbsent("auth_mon_id",
                AuthMonId::new) : getBinaryColumn("auth_mon_id"));
    }

    /**
     * The monomer position in the author provided sequence.
     * @return AuthSeqId
     */
    public AuthSeqId getAuthSeqId() {
        return (AuthSeqId) (isText ? textFields.computeIfAbsent("auth_seq_id",
                AuthSeqId::new) : getBinaryColumn("auth_seq_id"));
    }

    /**
     * Accession code of the reference database.
     * @return DbAccession
     */
    public DbAccession getDbAccession() {
        return (DbAccession) (isText ? textFields.computeIfAbsent("db_accession",
                DbAccession::new) : getBinaryColumn("db_accession"));
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

    /**
     * The description of the sequence difference.
     * @return Annotation
     */
    public Annotation getAnnotation() {
        return (Annotation) (isText ? textFields.computeIfAbsent("annotation",
                Annotation::new) : getBinaryColumn("annotation"));
    }
}
