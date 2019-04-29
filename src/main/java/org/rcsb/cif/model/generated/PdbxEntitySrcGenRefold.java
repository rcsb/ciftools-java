package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * This category contains details for the refolding steps used in
 * the overall protein production process.
 */
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
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * The value of _pdbx_entity_src_gen_refold.entity_id uniquely identifies
     * each protein contained in the project target protein complex whose
     * structure is to be determined. This data item is a pointer to _entity.id
     * in the ENTITY category. This item may be a site dependent bar code.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id", StrColumn::new) :
                getBinaryColumn("entity_id"));
    }

    /**
     * This item is the unique identifier for this refolding step.
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
     * acid sequence of the expressed product after the refolding
     * step.
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
     * The date of this production step.
     * @return StrColumn
     */
    public StrColumn getDate() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("date", StrColumn::new) :
                getBinaryColumn("date"));
    }

    /**
     * This item is a pointer to pdbx_buffer.id in the PDBX_BUFFER category.
     * The referenced buffer is that in which the protein was denatured.
     * @return StrColumn
     */
    public StrColumn getDenatureBufferId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("denature_buffer_id", StrColumn::new) :
                getBinaryColumn("denature_buffer_id"));
    }

    /**
     * This item is a pointer to pdbx_buffer.id in the PDBX_BUFFER category.
     * The referenced buffer is that in which the protein was refolded.
     * @return StrColumn
     */
    public StrColumn getRefoldBufferId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("refold_buffer_id", StrColumn::new) :
                getBinaryColumn("refold_buffer_id"));
    }

    /**
     * The temperature in degrees celsius at which the protein was refolded.
     * @return FloatColumn
     */
    public FloatColumn getTemperature() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("temperature", FloatColumn::new) :
                getBinaryColumn("temperature"));
    }

    /**
     * The time in hours over which the protein was refolded.
     * @return FloatColumn
     */
    public FloatColumn getTime() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("time", FloatColumn::new) :
                getBinaryColumn("time"));
    }

    /**
     * This item is a pointer to pdbx_buffer.id in the PDBX_BUFFER category.
     * The referenced buffer is that in which the refolded protein was stored.
     * @return StrColumn
     */
    public StrColumn getStorageBufferId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("storage_buffer_id", StrColumn::new) :
                getBinaryColumn("storage_buffer_id"));
    }

    /**
     * String value containing details of the refolding.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }
}
