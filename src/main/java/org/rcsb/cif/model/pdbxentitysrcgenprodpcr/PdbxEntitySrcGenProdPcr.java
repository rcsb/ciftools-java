package org.rcsb.cif.model.pdbxentitysrcgenprodpcr;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxEntitySrcGenProdPcr extends BaseCategory {
    public PdbxEntitySrcGenProdPcr(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxEntitySrcGenProdPcr(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxEntitySrcGenProdPcr(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_entity_src_gen_prod_pcr.entry_id uniquely identifies
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
     * The value of _pdbx_entity_src_gen_prod_pcr.entity_id uniquely identifies
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
     * This item is the unique identifier for this PCR step.
     * @return StepId
     */
    public StepId getStepId() {
        return (StepId) (isText ? textFields.computeIfAbsent("step_id",
                StepId::new) : getBinaryColumn("step_id"));
    }

    /**
     * This item unique identifier for the next production step.
     * This allows a workflow to have multiple entry points leading
     * to a single product.
     * @return NextStepId
     */
    public NextStepId getNextStepId() {
        return (NextStepId) (isText ? textFields.computeIfAbsent("next_step_id",
                NextStepId::new) : getBinaryColumn("next_step_id"));
    }

    /**
     * This item is a pointer to pdbx_construct.id in the PDBX_CONSTRUCT
     * category. The referenced nucleic acid sequence is that of the
     * PCR product.
     * @return EndConstructId
     */
    public EndConstructId getEndConstructId() {
        return (EndConstructId) (isText ? textFields.computeIfAbsent("end_construct_id",
                EndConstructId::new) : getBinaryColumn("end_construct_id"));
    }

    /**
     * This data item is a pointer to pdbx_robot_system.id in the
     * PDBX_ROBOT_SYSTEM category. The referenced robot is the
     * robot responsible for the PCR reaction (normally the heat
     * cycler).
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
     * This item is a pointer to pdbx_construct.id in the PDBX_CONSTRUCT category.
     * The referenced nucleic acid sequence is that of the forward primer.
     * @return ForwardPrimerId
     */
    public ForwardPrimerId getForwardPrimerId() {
        return (ForwardPrimerId) (isText ? textFields.computeIfAbsent("forward_primer_id",
                ForwardPrimerId::new) : getBinaryColumn("forward_primer_id"));
    }

    /**
     * This item is a pointer to pdbx_construct.id in the PDBX_CONSTRUCT category.
     * The referenced nucleic acid sequence is that of the reverse primer.
     * @return ReversePrimerId
     */
    public ReversePrimerId getReversePrimerId() {
        return (ReversePrimerId) (isText ? textFields.computeIfAbsent("reverse_primer_id",
                ReversePrimerId::new) : getBinaryColumn("reverse_primer_id"));
    }

    /**
     * String value containing details of the PCR reaction.
     * @return ReactionDetails
     */
    public ReactionDetails getReactionDetails() {
        return (ReactionDetails) (isText ? textFields.computeIfAbsent("reaction_details",
                ReactionDetails::new) : getBinaryColumn("reaction_details"));
    }

    /**
     * String value containing details of any purification of the
     * product of the PCR reaction.
     * @return PurificationDetails
     */
    public PurificationDetails getPurificationDetails() {
        return (PurificationDetails) (isText ? textFields.computeIfAbsent("purification_details",
                PurificationDetails::new) : getBinaryColumn("purification_details"));
    }

    /**
     * Summary of the details of the PCR reaction any purification of the
     * product of the PCR reaction.
     * @return Summary
     */
    public Summary getSummary() {
        return (Summary) (isText ? textFields.computeIfAbsent("summary",
                Summary::new) : getBinaryColumn("summary"));
    }
}
