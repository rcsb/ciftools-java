package org.rcsb.cif.model.pdbxentitysrcgenproteolysis;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxEntitySrcGenProteolysis extends BaseCategory {
    public PdbxEntitySrcGenProteolysis(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxEntitySrcGenProteolysis(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxEntitySrcGenProteolysis(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_entity_src_gen_proteolysis.entry_id uniquely identifies
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
     * The value of _pdbx_entity_src_gen_proteolysis.entity_id uniquely identifies
     * each protein contained in the project target complex proteins whose
     * structure is to be determined. This data item is a pointer to _entity.id
     * in the ENTITY category.  This item may be a site dependent bar code.
     * @return EntityId
     */
    public EntityId getEntityId() {
        return (EntityId) (isText ? textFields.computeIfAbsent("entity_id",
                EntityId::new) : getBinaryColumn("entity_id"));
    }

    /**
     * This item is the unique identifier for this tag removal step.
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
     * acid sequence of the expressed product after the proteolysis
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
     * The date of production step.
     * @return Date
     */
    public Date getDate() {
        return (Date) (isText ? textFields.computeIfAbsent("date",
                Date::new) : getBinaryColumn("date"));
    }

    /**
     * Details of this tag removal step.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * The name of the protease used for cleavage.
     * @return Protease
     */
    public Protease getProtease() {
        return (Protease) (isText ? textFields.computeIfAbsent("protease",
                Protease::new) : getBinaryColumn("protease"));
    }

    /**
     * The ratio of protein to protease used for the cleavage.
     * = mol protein / mol protease
     * @return ProteinProteaseRatio
     */
    public ProteinProteaseRatio getProteinProteaseRatio() {
        return (ProteinProteaseRatio) (isText ? textFields.computeIfAbsent("protein_protease_ratio",
                ProteinProteaseRatio::new) : getBinaryColumn("protein_protease_ratio"));
    }

    /**
     * This item is a pointer to pdbx_buffer.id in the PDBX_BUFFER category.
     * The referenced buffer is that in which the cleavage was performed.
     * @return CleavageBufferId
     */
    public CleavageBufferId getCleavageBufferId() {
        return (CleavageBufferId) (isText ? textFields.computeIfAbsent("cleavage_buffer_id",
                CleavageBufferId::new) : getBinaryColumn("cleavage_buffer_id"));
    }

    /**
     * The temperature in degrees celsius at which the cleavage was performed.
     * @return CleavageTemperature
     */
    public CleavageTemperature getCleavageTemperature() {
        return (CleavageTemperature) (isText ? textFields.computeIfAbsent("cleavage_temperature",
                CleavageTemperature::new) : getBinaryColumn("cleavage_temperature"));
    }

    /**
     * The time in minutes for the cleavage reaction
     * @return CleavageTime
     */
    public CleavageTime getCleavageTime() {
        return (CleavageTime) (isText ? textFields.computeIfAbsent("cleavage_time",
                CleavageTime::new) : getBinaryColumn("cleavage_time"));
    }
}
