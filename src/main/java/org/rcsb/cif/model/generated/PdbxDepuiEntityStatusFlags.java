package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_DEPUI_ENTITY_STATUS_FLAGS category record status
 * details related to individual entities.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxDepuiEntityStatusFlags extends BaseCategory {
    public PdbxDepuiEntityStatusFlags(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxDepuiEntityStatusFlags(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxDepuiEntityStatusFlags(String name) {
        super(name);
    }

    /**
     * The internal identifier assigned to each deposition.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDepDatasetId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("dep_dataset_id", SingleRowStrColumn::new) :
                getBinaryColumn("dep_dataset_id"));
    }

    /**
     * A reference to the _entity.id in the ENTITY_POLY category
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEntityId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("entity_id", SingleRowStrColumn::new) :
                getBinaryColumn("entity_id"));
    }

    /**
     * A flag to indicate that the entity has a mutation.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getHasMutation() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("has_mutation", SingleRowStrColumn::new) :
                getBinaryColumn("has_mutation"));
    }

    /**
     * A flag to indicate that sample and coordinate sequence alignments is valid for this entity
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSampleXyzSequenceAlignmentsValid() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("sample_xyz_sequence_alignments_valid", SingleRowStrColumn::new) :
                getBinaryColumn("sample_xyz_sequence_alignments_valid"));
    }
}
