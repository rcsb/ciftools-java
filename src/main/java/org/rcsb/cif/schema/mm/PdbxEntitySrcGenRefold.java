package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * This category contains details for the refolding steps used in
 * the overall protein production process.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxEntitySrcGenRefold extends DelegatingCategory {
    public PdbxEntitySrcGenRefold(Category delegate) {
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
            case "denature_buffer_id":
                return getDenatureBufferId();
            case "refold_buffer_id":
                return getRefoldBufferId();
            case "temperature":
                return getTemperature();
            case "time":
                return getTime();
            case "storage_buffer_id":
                return getStorageBufferId();
            case "details":
                return getDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_entity_src_gen_refold.entry_id uniquely identifies
     * a sample consisting of one or more proteins whose structure is
     * to be determined. This is a pointer to _entry.id. This item may
     * be a site dependent bar code.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * The value of _pdbx_entity_src_gen_refold.entity_id uniquely identifies
     * each protein contained in the project target protein complex whose
     * structure is to be determined. This data item is a pointer to _entity.id
     * in the ENTITY category. This item may be a site dependent bar code.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * This item is the unique identifier for this refolding step.
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
     * acid sequence of the expressed product after the refolding
     * step.
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
     * The date of this production step.
     * @return StrColumn
     */
    public StrColumn getDate() {
        return delegate.getColumn("date", DelegatingStrColumn::new);
    }

    /**
     * This item is a pointer to pdbx_buffer.id in the PDBX_BUFFER category.
     * The referenced buffer is that in which the protein was denatured.
     * @return StrColumn
     */
    public StrColumn getDenatureBufferId() {
        return delegate.getColumn("denature_buffer_id", DelegatingStrColumn::new);
    }

    /**
     * This item is a pointer to pdbx_buffer.id in the PDBX_BUFFER category.
     * The referenced buffer is that in which the protein was refolded.
     * @return StrColumn
     */
    public StrColumn getRefoldBufferId() {
        return delegate.getColumn("refold_buffer_id", DelegatingStrColumn::new);
    }

    /**
     * The temperature in degrees celsius at which the protein was refolded.
     * @return FloatColumn
     */
    public FloatColumn getTemperature() {
        return delegate.getColumn("temperature", DelegatingFloatColumn::new);
    }

    /**
     * The time in hours over which the protein was refolded.
     * @return FloatColumn
     */
    public FloatColumn getTime() {
        return delegate.getColumn("time", DelegatingFloatColumn::new);
    }

    /**
     * This item is a pointer to pdbx_buffer.id in the PDBX_BUFFER category.
     * The referenced buffer is that in which the refolded protein was stored.
     * @return StrColumn
     */
    public StrColumn getStorageBufferId() {
        return delegate.getColumn("storage_buffer_id", DelegatingStrColumn::new);
    }

    /**
     * String value containing details of the refolding.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

}