package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * This category contains details for the chromatographic steps used in the
 * purification of the protein.
 */
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
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * The value of _pdbx_entity_src_gen_chrom.entity_id uniquely identifies
     * each protein contained in the project target complex proteins whose
     * structure is to be determined. This data item is a pointer to _entity.id
     * in the ENTITY category. This item may be a site dependent bar code.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id", StrColumn::new) :
                getBinaryColumn("entity_id"));
    }

    /**
     * This item is the unique identifier for this chromatography step.
     * @return IntColumn
     */
    public IntColumn getStepId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("step_id", IntColumn::new) :
                getBinaryColumn("step_id"));
    }

    /**
     * This item unique identifier for the next production step. This allows
     * a workflow to have multiple entry points leading to a single product.
     * @return IntColumn
     */
    public IntColumn getNextStepId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("next_step_id", IntColumn::new) :
                getBinaryColumn("next_step_id"));
    }

    /**
     * This item is a pointer to pdbx_construct.id in the PDBX_CONSTRUCT
     * category. The referenced sequence is expected to be the amino
     * acid sequence of the expressed product after the
     * chromatography step.
     * @return StrColumn
     */
    public StrColumn getEndConstructId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("end_construct_id", StrColumn::new) :
                getBinaryColumn("end_construct_id"));
    }

    /**
     * This data item is a pointer to pdbx_robot_system.id
     * in the PDBX_ROBOT_SYSTEM category.
     * @return StrColumn
     */
    public StrColumn getRobotId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("robot_id", StrColumn::new) :
                getBinaryColumn("robot_id"));
    }

    /**
     * The date of production step.
     * @return StrColumn
     */
    public StrColumn getDate() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("date", StrColumn::new) :
                getBinaryColumn("date"));
    }

    /**
     * The type of column used in this step.
     * @return StrColumn
     */
    public StrColumn getColumnType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("column_type", StrColumn::new) :
                getBinaryColumn("column_type"));
    }

    /**
     * The volume of the column used in this step.
     * @return FloatColumn
     */
    public FloatColumn getColumnVolume() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("column_volume", FloatColumn::new) :
                getBinaryColumn("column_volume"));
    }

    /**
     * The temperature in degrees celsius at which this column was run.
     * @return FloatColumn
     */
    public FloatColumn getColumnTemperature() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("column_temperature", FloatColumn::new) :
                getBinaryColumn("column_temperature"));
    }

    /**
     * This item is a pointer to pdbx_buffer.id in the PDBX_BUFFER category.
     * The referenced buffer is that in which the column was equilibrated.
     * @return StrColumn
     */
    public StrColumn getEquilibrationBufferId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("equilibration_buffer_id", StrColumn::new) :
                getBinaryColumn("equilibration_buffer_id"));
    }

    /**
     * The rate at which the equilibration buffer flowed through the column.
     * @return FloatColumn
     */
    public FloatColumn getFlowRate() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("flow_rate", FloatColumn::new) :
                getBinaryColumn("flow_rate"));
    }

    /**
     * This item is a pointer to pdbx_buffer.id in the PDBX_BUFFER category.
     * The referenced buffer is that with which the protein was eluted.
     * @return StrColumn
     */
    public StrColumn getElutionBufferId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("elution_buffer_id", StrColumn::new) :
                getBinaryColumn("elution_buffer_id"));
    }

    /**
     * Details of the elution protocol.
     * @return StrColumn
     */
    public StrColumn getElutionProtocol() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("elution_protocol", StrColumn::new) :
                getBinaryColumn("elution_protocol"));
    }

    /**
     * Details of the sample preparation prior to running the column.
     * @return StrColumn
     */
    public StrColumn getSamplePrepDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("sample_prep_details", StrColumn::new) :
                getBinaryColumn("sample_prep_details"));
    }

    /**
     * The volume of protein solution run on the column.
     * @return FloatColumn
     */
    public FloatColumn getSampleVolume() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("sample_volume", FloatColumn::new) :
                getBinaryColumn("sample_volume"));
    }

    /**
     * The concentration of the protein solution put onto the column.
     * @return FloatColumn
     */
    public FloatColumn getSampleConcentration() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("sample_concentration", FloatColumn::new) :
                getBinaryColumn("sample_concentration"));
    }

    /**
     * The method used to determine the concentration of the protein solution put
     * onto the column.
     * @return StrColumn
     */
    public StrColumn getSampleConcMethod() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("sample_conc_method", StrColumn::new) :
                getBinaryColumn("sample_conc_method"));
    }

    /**
     * The total volume of all the fractions pooled to give the purified protein
     * solution.
     * @return FloatColumn
     */
    public FloatColumn getVolumePooledFractions() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("volume_pooled_fractions", FloatColumn::new) :
                getBinaryColumn("volume_pooled_fractions"));
    }

    /**
     * The yield in milligrams of protein recovered in the pooled fractions.
     * @return FloatColumn
     */
    public FloatColumn getYieldPooledFractions() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("yield_pooled_fractions", FloatColumn::new) :
                getBinaryColumn("yield_pooled_fractions"));
    }

    /**
     * The method used to determine the yield
     * @return StrColumn
     */
    public StrColumn getYieldMethod() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("yield_method", StrColumn::new) :
                getBinaryColumn("yield_method"));
    }

    /**
     * Details of any post-chromatographic treatment of the protein sample.
     * @return StrColumn
     */
    public StrColumn getPostTreatment() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("post_treatment", StrColumn::new) :
                getBinaryColumn("post_treatment"));
    }
}
