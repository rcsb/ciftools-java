package org.rcsb.cif.model.generated.pdbxentitysrcgenrefold;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxEntitySrcGenRefold extends BaseCategory {
    public PdbxEntitySrcGenRefold(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxEntitySrcGenRefold(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxEntitySrcGenRefold(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_entity_src_gen_refold.entry_id uniquely identifies
     * a sample consisting of one or more proteins whose structure is
     * to be determined. This is a pointer to _entry.id. This item may
     * be a site dependent bar code.
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * The value of _pdbx_entity_src_gen_refold.entity_id uniquely identifies
     * each protein contained in the project target protein complex whose
     * structure is to be determined. This data item is a pointer to _entity.id
     * in the ENTITY category. This item may be a site dependent bar code.
     * @return EntityId
     */
    public EntityId getEntityId() {
        return (EntityId) (isText ? textFields.computeIfAbsent("entity_id",
                EntityId::new) : getBinaryColumn("entity_id"));
    }

    /**
     * This item is the unique identifier for this refolding step.
     * @return StepId
     */
    public StepId getStepId() {
        return (StepId) (isText ? textFields.computeIfAbsent("step_id",
                StepId::new) : getBinaryColumn("step_id"));
    }

    /**
     * This item unique identifier for the next production step. This allows
     * a workflow to have multiple entry points leading to a single product.
     * @return NextStepId
     */
    public NextStepId getNextStepId() {
        return (NextStepId) (isText ? textFields.computeIfAbsent("next_step_id",
                NextStepId::new) : getBinaryColumn("next_step_id"));
    }

    /**
     * This item is a pointer to pdbx_construct.id in the PDBX_CONSTRUCT
     * category. The referenced sequence is expected to be the amino
     * acid sequence of the expressed product after the refolding
     * step.
     * @return EndConstructId
     */
    public EndConstructId getEndConstructId() {
        return (EndConstructId) (isText ? textFields.computeIfAbsent("end_construct_id",
                EndConstructId::new) : getBinaryColumn("end_construct_id"));
    }

    /**
     * This data item is a pointer to pdbx_robot_system.id
     * in the PDBX_ROBOT_SYSTEM category.
     * @return RobotId
     */
    public RobotId getRobotId() {
        return (RobotId) (isText ? textFields.computeIfAbsent("robot_id",
                RobotId::new) : getBinaryColumn("robot_id"));
    }

    /**
     * The date of this production step.
     * @return Date
     */
    public Date getDate() {
        return (Date) (isText ? textFields.computeIfAbsent("date",
                Date::new) : getBinaryColumn("date"));
    }

    /**
     * This item is a pointer to pdbx_buffer.id in the PDBX_BUFFER category.
     * The referenced buffer is that in which the protein was denatured.
     * @return DenatureBufferId
     */
    public DenatureBufferId getDenatureBufferId() {
        return (DenatureBufferId) (isText ? textFields.computeIfAbsent("denature_buffer_id",
                DenatureBufferId::new) : getBinaryColumn("denature_buffer_id"));
    }

    /**
     * This item is a pointer to pdbx_buffer.id in the PDBX_BUFFER category.
     * The referenced buffer is that in which the protein was refolded.
     * @return RefoldBufferId
     */
    public RefoldBufferId getRefoldBufferId() {
        return (RefoldBufferId) (isText ? textFields.computeIfAbsent("refold_buffer_id",
                RefoldBufferId::new) : getBinaryColumn("refold_buffer_id"));
    }

    /**
     * The temperature in degrees celsius at which the protein was refolded.
     * @return Temperature
     */
    public Temperature getTemperature() {
        return (Temperature) (isText ? textFields.computeIfAbsent("temperature",
                Temperature::new) : getBinaryColumn("temperature"));
    }

    /**
     * The time in hours over which the protein was refolded.
     * @return Time
     */
    public Time getTime() {
        return (Time) (isText ? textFields.computeIfAbsent("time",
                Time::new) : getBinaryColumn("time"));
    }

    /**
     * This item is a pointer to pdbx_buffer.id in the PDBX_BUFFER category.
     * The referenced buffer is that in which the refolded protein was stored.
     * @return StorageBufferId
     */
    public StorageBufferId getStorageBufferId() {
        return (StorageBufferId) (isText ? textFields.computeIfAbsent("storage_buffer_id",
                StorageBufferId::new) : getBinaryColumn("storage_buffer_id"));
    }

    /**
     * String value containing details of the refolding.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }
}
