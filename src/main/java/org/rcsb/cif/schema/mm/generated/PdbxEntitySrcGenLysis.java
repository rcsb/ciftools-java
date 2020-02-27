package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * This category contains details for the cell lysis steps used in
 * the overall protein production process.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxEntitySrcGenLysis extends BaseCategory {
    public PdbxEntitySrcGenLysis(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxEntitySrcGenLysis(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxEntitySrcGenLysis(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_entity_src_gen_lysis.entry_id uniquely identifies
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
     * The value of _pdbx_entity_src_gen_lysis.entity_id uniquely identifies
     * each protein contained in the project target protein complex whose
     * structure is to be determined. This data item is a pointer to _entity.id
     * in the ENTITY category.  This item may be a site dependent bar code.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id", StrColumn::new) :
                getBinaryColumn("entity_id"));
    }

    /**
     * This item is the unique identifier for this lysis step.
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
     * acid sequence of the expressed product after lysis.
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
     * The lysis method.
     * @return StrColumn
     */
    public StrColumn getMethod() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("method", StrColumn::new) :
                getBinaryColumn("method"));
    }

    /**
     * This item is a pointer to pdbx_buffer.id in the PDBX_BUFFER category.
     * The referenced buffer is that in which the lysis was performed.
     * @return StrColumn
     */
    public StrColumn getBufferId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("buffer_id", StrColumn::new) :
                getBinaryColumn("buffer_id"));
    }

    /**
     * The volume in milliliters of buffer in which the lysis was performed.
     * @return FloatColumn
     */
    public FloatColumn getBufferVolume() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("buffer_volume", FloatColumn::new) :
                getBinaryColumn("buffer_volume"));
    }

    /**
     * The temperature in degrees celsius at which the lysis was performed.
     * @return FloatColumn
     */
    public FloatColumn getTemperature() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("temperature", FloatColumn::new) :
                getBinaryColumn("temperature"));
    }

    /**
     * The time in seconds of the lysis experiment.
     * @return FloatColumn
     */
    public FloatColumn getTime() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("time", FloatColumn::new) :
                getBinaryColumn("time"));
    }

    /**
     * String value containing details of the lysis protocol.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }
}
