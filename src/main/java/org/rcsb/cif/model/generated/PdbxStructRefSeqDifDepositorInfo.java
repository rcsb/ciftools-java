package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_STRUCT_REF_SEQ_DIF_DEPOSITOR_INFO category capture
 * depositor provided information related to the archival cateogory
 * STRUCT_REF_SEQ_DIF.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ordinal", IntColumn::new) :
                getBinaryColumn("ordinal"));
    }

    /**
     * This data item is a pointer to _struct_ref_seq.ref_id in
     * the STRUCT_REF_SEQ_DEPOSITOR_INFO  category.
     * @return StrColumn
     */
    public StrColumn getRefId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ref_id", StrColumn::new) :
                getBinaryColumn("ref_id"));
    }

    /**
     * This data item is a pointer to _entity.id in the ENTITY category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id", StrColumn::new) :
                getBinaryColumn("entity_id"));
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
     * The monomer position in the referenced database entry.
     * @return IntColumn
     */
    public IntColumn getDbSeqId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("db_seq_id", IntColumn::new) :
                getBinaryColumn("db_seq_id"));
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
     * the entity or biological unit provided by the depositor.
     * @return StrColumn
     */
    public StrColumn getAuthMonId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_mon_id", StrColumn::new) :
                getBinaryColumn("auth_mon_id"));
    }

    /**
     * The monomer position in the author provided sequence.
     * @return IntColumn
     */
    public IntColumn getAuthSeqId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("auth_seq_id", IntColumn::new) :
                getBinaryColumn("auth_seq_id"));
    }

    /**
     * Accession code of the reference database.
     * @return StrColumn
     */
    public StrColumn getDbAccession() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("db_accession", StrColumn::new) :
                getBinaryColumn("db_accession"));
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

    /**
     * The description of the sequence difference.
     * @return StrColumn
     */
    public StrColumn getAnnotation() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("annotation", StrColumn::new) :
                getBinaryColumn("annotation"));
    }
}
