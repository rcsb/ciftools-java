package org.rcsb.cif.model.generated.pdbxentitysrcgenchrom;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxEntitySrcGenChrom extends BaseCategory {
    public PdbxEntitySrcGenChrom(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxEntitySrcGenChrom(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxEntitySrcGenChrom(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_entity_src_gen_chrom.entry_id uniquely identifies
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
     * The value of _pdbx_entity_src_gen_chrom.entity_id uniquely identifies
     * each protein contained in the project target complex proteins whose
     * structure is to be determined. This data item is a pointer to _entity.id
     * in the ENTITY category. This item may be a site dependent bar code.
     * @return EntityId
     */
    public EntityId getEntityId() {
        return (EntityId) (isText ? textFields.computeIfAbsent("entity_id",
                EntityId::new) : getBinaryColumn("entity_id"));
    }

    /**
     * This item is the unique identifier for this chromatography step.
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
     * acid sequence of the expressed product after the
     * chromatography step.
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
     * The type of column used in this step.
     * @return ColumnType
     */
    public ColumnType getColumnType() {
        return (ColumnType) (isText ? textFields.computeIfAbsent("column_type",
                ColumnType::new) : getBinaryColumn("column_type"));
    }

    /**
     * The volume of the column used in this step.
     * @return ColumnVolume
     */
    public ColumnVolume getColumnVolume() {
        return (ColumnVolume) (isText ? textFields.computeIfAbsent("column_volume",
                ColumnVolume::new) : getBinaryColumn("column_volume"));
    }

    /**
     * The temperature in degrees celsius at which this column was run.
     * @return ColumnTemperature
     */
    public ColumnTemperature getColumnTemperature() {
        return (ColumnTemperature) (isText ? textFields.computeIfAbsent("column_temperature",
                ColumnTemperature::new) : getBinaryColumn("column_temperature"));
    }

    /**
     * This item is a pointer to pdbx_buffer.id in the PDBX_BUFFER category.
     * The referenced buffer is that in which the column was equilibrated.
     * @return EquilibrationBufferId
     */
    public EquilibrationBufferId getEquilibrationBufferId() {
        return (EquilibrationBufferId) (isText ? textFields.computeIfAbsent("equilibration_buffer_id",
                EquilibrationBufferId::new) : getBinaryColumn("equilibration_buffer_id"));
    }

    /**
     * The rate at which the equilibration buffer flowed through the column.
     * @return FlowRate
     */
    public FlowRate getFlowRate() {
        return (FlowRate) (isText ? textFields.computeIfAbsent("flow_rate",
                FlowRate::new) : getBinaryColumn("flow_rate"));
    }

    /**
     * This item is a pointer to pdbx_buffer.id in the PDBX_BUFFER category.
     * The referenced buffer is that with which the protein was eluted.
     * @return ElutionBufferId
     */
    public ElutionBufferId getElutionBufferId() {
        return (ElutionBufferId) (isText ? textFields.computeIfAbsent("elution_buffer_id",
                ElutionBufferId::new) : getBinaryColumn("elution_buffer_id"));
    }

    /**
     * Details of the elution protocol.
     * @return ElutionProtocol
     */
    public ElutionProtocol getElutionProtocol() {
        return (ElutionProtocol) (isText ? textFields.computeIfAbsent("elution_protocol",
                ElutionProtocol::new) : getBinaryColumn("elution_protocol"));
    }

    /**
     * Details of the sample preparation prior to running the column.
     * @return SamplePrepDetails
     */
    public SamplePrepDetails getSamplePrepDetails() {
        return (SamplePrepDetails) (isText ? textFields.computeIfAbsent("sample_prep_details",
                SamplePrepDetails::new) : getBinaryColumn("sample_prep_details"));
    }

    /**
     * The volume of protein solution run on the column.
     * @return SampleVolume
     */
    public SampleVolume getSampleVolume() {
        return (SampleVolume) (isText ? textFields.computeIfAbsent("sample_volume",
                SampleVolume::new) : getBinaryColumn("sample_volume"));
    }

    /**
     * The concentration of the protein solution put onto the column.
     * @return SampleConcentration
     */
    public SampleConcentration getSampleConcentration() {
        return (SampleConcentration) (isText ? textFields.computeIfAbsent("sample_concentration",
                SampleConcentration::new) : getBinaryColumn("sample_concentration"));
    }

    /**
     * The method used to determine the concentration of the protein solution put
     * onto the column.
     * @return SampleConcMethod
     */
    public SampleConcMethod getSampleConcMethod() {
        return (SampleConcMethod) (isText ? textFields.computeIfAbsent("sample_conc_method",
                SampleConcMethod::new) : getBinaryColumn("sample_conc_method"));
    }

    /**
     * The total volume of all the fractions pooled to give the purified protein
     * solution.
     * @return VolumePooledFractions
     */
    public VolumePooledFractions getVolumePooledFractions() {
        return (VolumePooledFractions) (isText ? textFields.computeIfAbsent("volume_pooled_fractions",
                VolumePooledFractions::new) : getBinaryColumn("volume_pooled_fractions"));
    }

    /**
     * The yield in milligrams of protein recovered in the pooled fractions.
     * @return YieldPooledFractions
     */
    public YieldPooledFractions getYieldPooledFractions() {
        return (YieldPooledFractions) (isText ? textFields.computeIfAbsent("yield_pooled_fractions",
                YieldPooledFractions::new) : getBinaryColumn("yield_pooled_fractions"));
    }

    /**
     * The method used to determine the yield
     * @return YieldMethod
     */
    public YieldMethod getYieldMethod() {
        return (YieldMethod) (isText ? textFields.computeIfAbsent("yield_method",
                YieldMethod::new) : getBinaryColumn("yield_method"));
    }

    /**
     * Details of any post-chromatographic treatment of the protein sample.
     * @return PostTreatment
     */
    public PostTreatment getPostTreatment() {
        return (PostTreatment) (isText ? textFields.computeIfAbsent("post_treatment",
                PostTreatment::new) : getBinaryColumn("post_treatment"));
    }
}
