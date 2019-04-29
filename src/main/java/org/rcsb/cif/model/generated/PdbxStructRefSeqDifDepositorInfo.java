package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_STRUCT_REF_SEQ_DIF_DEPOSITOR_INFO category capture
 * depositor provided information related to the archival cateogory
 * STRUCT_REF_SEQ_DIF.
 */
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
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getOrdinal() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("ordinal", SingleRowIntColumn::new) :
                getBinaryColumn("ordinal"));
    }

    /**
     * This data item is a pointer to _struct_ref_seq.ref_id in
     * the STRUCT_REF_SEQ_DEPOSITOR_INFO  category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getRefId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("ref_id", SingleRowStrColumn::new) :
                getBinaryColumn("ref_id"));
    }

    /**
     * This data item is a pointer to _entity.id in the ENTITY category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEntityId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("entity_id", SingleRowStrColumn::new) :
                getBinaryColumn("entity_id"));
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
     * The monomer position in the referenced database entry.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getDbSeqId() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("db_seq_id", SingleRowIntColumn::new) :
                getBinaryColumn("db_seq_id"));
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
     * the entity or biological unit provided by the depositor.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getAuthMonId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("auth_mon_id", SingleRowStrColumn::new) :
                getBinaryColumn("auth_mon_id"));
    }

    /**
     * The monomer position in the author provided sequence.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getAuthSeqId() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("auth_seq_id", SingleRowIntColumn::new) :
                getBinaryColumn("auth_seq_id"));
    }

    /**
     * Accession code of the reference database.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDbAccession() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("db_accession", SingleRowStrColumn::new) :
                getBinaryColumn("db_accession"));
    }

    /**
     * The code for this entity or biological unit or for a closely
     * related entity or biological unit in the named database.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDbCode() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("db_code", SingleRowStrColumn::new) :
                getBinaryColumn("db_code"));
    }

    /**
     * The name of the database containing reference information about
     * this entity or biological unit.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDbName() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("db_name", SingleRowStrColumn::new) :
                getBinaryColumn("db_name"));
    }

    /**
     * The description of the sequence difference.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getAnnotation() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("annotation", SingleRowStrColumn::new) :
                getBinaryColumn("annotation"));
    }
}
