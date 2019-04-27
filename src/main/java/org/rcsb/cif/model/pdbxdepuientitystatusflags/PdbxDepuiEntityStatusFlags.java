package org.rcsb.cif.model.pdbxdepuientitystatusflags;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return DepDatasetId
     */
    public DepDatasetId getDepDatasetId() {
        return (DepDatasetId) (isText ? textFields.computeIfAbsent("dep_dataset_id",
                DepDatasetId::new) : getBinaryColumn("dep_dataset_id"));
    }

    /**
     * A reference to the _entity.id in the ENTITY_POLY category
     * @return EntityId
     */
    public EntityId getEntityId() {
        return (EntityId) (isText ? textFields.computeIfAbsent("entity_id",
                EntityId::new) : getBinaryColumn("entity_id"));
    }

    /**
     * A flag to indicate that the entity has a mutation.
     * @return HasMutation
     */
    public HasMutation getHasMutation() {
        return (HasMutation) (isText ? textFields.computeIfAbsent("has_mutation",
                HasMutation::new) : getBinaryColumn("has_mutation"));
    }

    /**
     * A flag to indicate that sample and coordinate sequence alignments is valid for this entity
     * @return SampleXyzSequenceAlignmentsValid
     */
    public SampleXyzSequenceAlignmentsValid getSampleXyzSequenceAlignmentsValid() {
        return (SampleXyzSequenceAlignmentsValid) (isText ? textFields.computeIfAbsent("sample_xyz_sequence_alignments_valid",
                SampleXyzSequenceAlignmentsValid::new) : getBinaryColumn("sample_xyz_sequence_alignments_valid"));
    }
}
