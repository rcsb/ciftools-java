package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the IHM_STARTING_MODEL_SEQ_DIF category provide a
 * mechanism for indicating and annotating point differences
 * between the sequence of the entity or biological unit described
 * in the data block and the sequence of the starting model used in
 * the integrative modeling referenced from a database. The point
 * differences may be due to point mutations introduced in the
 * starting model or the presence of modified amino acid residues.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class IhmStartingModelSeqDif extends BaseCategory {
    public IhmStartingModelSeqDif(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public IhmStartingModelSeqDif(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public IhmStartingModelSeqDif(String name) {
        super(name);
    }

    /**
     * A unique identifier for the entry.
     * @return IntColumn
     */
    public IntColumn getOrdinalId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ordinal_id", IntColumn::new) :
                getBinaryColumn("ordinal_id"));
    }

    /**
     * A unique identifier for the distinct molecular entities.
     * This data item is a pointer to _entity_poly_seq.entity_id in the ENTITY_POLY category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id", StrColumn::new) :
                getBinaryColumn("entity_id"));
    }

    /**
     * An asym/strand identifier for the entity molecule.
     * This data item is a pointer to _struct_asym.id in the
     * STRUCT_ASYM category.
     * @return StrColumn
     */
    public StrColumn getAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("asym_id", StrColumn::new) :
                getBinaryColumn("asym_id"));
    }

    /**
     * The residue index.
     * This data item is a pointer to _entity_poly_seq.num in the ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getSeqId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("seq_id", IntColumn::new) :
                getBinaryColumn("seq_id"));
    }

    /**
     * The component identifier for the residue.
     * This data item is a pointer to _entity_poly_seq.mon_id in the ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("comp_id", StrColumn::new) :
                getBinaryColumn("comp_id"));
    }

    /**
     * Unique identifier for the starting model record.
     * This data item is a pointer to _ihm_starting_model_details.starting_model_id in the
     * IHM_STARTING_MODEL_DETAILS category.
     * @return StrColumn
     */
    public StrColumn getStartingModelId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("starting_model_id", StrColumn::new) :
                getBinaryColumn("starting_model_id"));
    }

    /**
     * The molecular entity of the database starting model.
     * @return StrColumn
     */
    public StrColumn getDbEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("db_entity_id", StrColumn::new) :
                getBinaryColumn("db_entity_id"));
    }

    /**
     * The asym/strand identifier for the entity molecule of the database starting model.
     * @return StrColumn
     */
    public StrColumn getDbAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("db_asym_id", StrColumn::new) :
                getBinaryColumn("db_asym_id"));
    }

    /**
     * The corresponding residue index of the database starting model.
     * @return IntColumn
     */
    public IntColumn getDbSeqId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("db_seq_id", IntColumn::new) :
                getBinaryColumn("db_seq_id"));
    }

    /**
     * The correspinding component identifier for the residue in the database starting model.
     * @return StrColumn
     */
    public StrColumn getDbCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("db_comp_id", StrColumn::new) :
                getBinaryColumn("db_comp_id"));
    }

    /**
     * A description of special aspects of the point differences
     * between the sequence of the entity or biological unit described
     * in the data block and that in the starting model referenced
     * from a database.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }
}
