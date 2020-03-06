package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * This category contains details for the chromatographic steps used in the
 * purification of the protein.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxEntitySrcGenChrom extends DelegatingCategory {
    public PdbxEntitySrcGenChrom(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entry_id":
                return getEntryId();
            case "entity_id":
                return getEntityId();
            case "step_id":
                return getStepId();
            case "next_step_id":
                return getNextStepId();
            case "end_construct_id":
                return getEndConstructId();
            case "robot_id":
                return getRobotId();
            case "date":
                return getDate();
            case "column_type":
                return getColumnType();
            case "column_volume":
                return getColumnVolume();
            case "column_temperature":
                return getColumnTemperature();
            case "equilibration_buffer_id":
                return getEquilibrationBufferId();
            case "flow_rate":
                return getFlowRate();
            case "elution_buffer_id":
                return getElutionBufferId();
            case "elution_protocol":
                return getElutionProtocol();
            case "sample_prep_details":
                return getSamplePrepDetails();
            case "sample_volume":
                return getSampleVolume();
            case "sample_concentration":
                return getSampleConcentration();
            case "sample_conc_method":
                return getSampleConcMethod();
            case "volume_pooled_fractions":
                return getVolumePooledFractions();
            case "yield_pooled_fractions":
                return getYieldPooledFractions();
            case "yield_method":
                return getYieldMethod();
            case "post_treatment":
                return getPostTreatment();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_entity_src_gen_chrom.entry_id uniquely identifies
     * a sample consisting of one or more proteins whose structure is
     * to be determined. This is a pointer to _entry.id. This item may
     * be a site dependent bar code.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * The value of _pdbx_entity_src_gen_chrom.entity_id uniquely identifies
     * each protein contained in the project target complex proteins whose
     * structure is to be determined. This data item is a pointer to _entity.id
     * in the ENTITY category. This item may be a site dependent bar code.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * This item is the unique identifier for this chromatography step.
     * @return IntColumn
     */
    public IntColumn getStepId() {
        return delegate.getColumn("step_id", DelegatingIntColumn::new);
    }

    /**
     * This item unique identifier for the next production step. This allows
     * a workflow to have multiple entry points leading to a single product.
     * @return IntColumn
     */
    public IntColumn getNextStepId() {
        return delegate.getColumn("next_step_id", DelegatingIntColumn::new);
    }

    /**
     * This item is a pointer to pdbx_construct.id in the PDBX_CONSTRUCT
     * category. The referenced sequence is expected to be the amino
     * acid sequence of the expressed product after the
     * chromatography step.
     * @return StrColumn
     */
    public StrColumn getEndConstructId() {
        return delegate.getColumn("end_construct_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to pdbx_robot_system.id
     * in the PDBX_ROBOT_SYSTEM category.
     * @return StrColumn
     */
    public StrColumn getRobotId() {
        return delegate.getColumn("robot_id", DelegatingStrColumn::new);
    }

    /**
     * The date of production step.
     * @return StrColumn
     */
    public StrColumn getDate() {
        return delegate.getColumn("date", DelegatingStrColumn::new);
    }

    /**
     * The type of column used in this step.
     * @return StrColumn
     */
    public StrColumn getColumnType() {
        return delegate.getColumn("column_type", DelegatingStrColumn::new);
    }

    /**
     * The volume of the column used in this step.
     * @return FloatColumn
     */
    public FloatColumn getColumnVolume() {
        return delegate.getColumn("column_volume", DelegatingFloatColumn::new);
    }

    /**
     * The temperature in degrees celsius at which this column was run.
     * @return FloatColumn
     */
    public FloatColumn getColumnTemperature() {
        return delegate.getColumn("column_temperature", DelegatingFloatColumn::new);
    }

    /**
     * This item is a pointer to pdbx_buffer.id in the PDBX_BUFFER category.
     * The referenced buffer is that in which the column was equilibrated.
     * @return StrColumn
     */
    public StrColumn getEquilibrationBufferId() {
        return delegate.getColumn("equilibration_buffer_id", DelegatingStrColumn::new);
    }

    /**
     * The rate at which the equilibration buffer flowed through the column.
     * @return FloatColumn
     */
    public FloatColumn getFlowRate() {
        return delegate.getColumn("flow_rate", DelegatingFloatColumn::new);
    }

    /**
     * This item is a pointer to pdbx_buffer.id in the PDBX_BUFFER category.
     * The referenced buffer is that with which the protein was eluted.
     * @return StrColumn
     */
    public StrColumn getElutionBufferId() {
        return delegate.getColumn("elution_buffer_id", DelegatingStrColumn::new);
    }

    /**
     * Details of the elution protocol.
     * @return StrColumn
     */
    public StrColumn getElutionProtocol() {
        return delegate.getColumn("elution_protocol", DelegatingStrColumn::new);
    }

    /**
     * Details of the sample preparation prior to running the column.
     * @return StrColumn
     */
    public StrColumn getSamplePrepDetails() {
        return delegate.getColumn("sample_prep_details", DelegatingStrColumn::new);
    }

    /**
     * The volume of protein solution run on the column.
     * @return FloatColumn
     */
    public FloatColumn getSampleVolume() {
        return delegate.getColumn("sample_volume", DelegatingFloatColumn::new);
    }

    /**
     * The concentration of the protein solution put onto the column.
     * @return FloatColumn
     */
    public FloatColumn getSampleConcentration() {
        return delegate.getColumn("sample_concentration", DelegatingFloatColumn::new);
    }

    /**
     * The method used to determine the concentration of the protein solution put
     * onto the column.
     * @return StrColumn
     */
    public StrColumn getSampleConcMethod() {
        return delegate.getColumn("sample_conc_method", DelegatingStrColumn::new);
    }

    /**
     * The total volume of all the fractions pooled to give the purified protein
     * solution.
     * @return FloatColumn
     */
    public FloatColumn getVolumePooledFractions() {
        return delegate.getColumn("volume_pooled_fractions", DelegatingFloatColumn::new);
    }

    /**
     * The yield in milligrams of protein recovered in the pooled fractions.
     * @return FloatColumn
     */
    public FloatColumn getYieldPooledFractions() {
        return delegate.getColumn("yield_pooled_fractions", DelegatingFloatColumn::new);
    }

    /**
     * The method used to determine the yield
     * @return StrColumn
     */
    public StrColumn getYieldMethod() {
        return delegate.getColumn("yield_method", DelegatingStrColumn::new);
    }

    /**
     * Details of any post-chromatographic treatment of the protein sample.
     * @return StrColumn
     */
    public StrColumn getPostTreatment() {
        return delegate.getColumn("post_treatment", DelegatingStrColumn::new);
    }

}