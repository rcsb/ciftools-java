package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * This category contains details for the protein purification
 * tag removal steps used in the overall protein production process
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxEntitySrcGenProteolysis extends DelegatingCategory {
    public PdbxEntitySrcGenProteolysis(Category delegate) {
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
            case "details":
                return getDetails();
            case "protease":
                return getProtease();
            case "protein_protease_ratio":
                return getProteinProteaseRatio();
            case "cleavage_buffer_id":
                return getCleavageBufferId();
            case "cleavage_temperature":
                return getCleavageTemperature();
            case "cleavage_time":
                return getCleavageTime();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_entity_src_gen_proteolysis.entry_id uniquely identifies
     * a sample consisting of one or more proteins whose structure is
     * to be determined. This is a pointer to _entry.id. This item may
     * be a site dependent bar code.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * The value of _pdbx_entity_src_gen_proteolysis.entity_id uniquely identifies
     * each protein contained in the project target complex proteins whose
     * structure is to be determined. This data item is a pointer to _entity.id
     * in the ENTITY category.  This item may be a site dependent bar code.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * This item is the unique identifier for this tag removal step.
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
     * acid sequence of the expressed product after the proteolysis
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
     * The date of production step.
     * @return StrColumn
     */
    public StrColumn getDate() {
        return delegate.getColumn("date", DelegatingStrColumn::new);
    }

    /**
     * Details of this tag removal step.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The name of the protease used for cleavage.
     * @return StrColumn
     */
    public StrColumn getProtease() {
        return delegate.getColumn("protease", DelegatingStrColumn::new);
    }

    /**
     * The ratio of protein to protease used for the cleavage.
     * = mol protein / mol protease
     * @return FloatColumn
     */
    public FloatColumn getProteinProteaseRatio() {
        return delegate.getColumn("protein_protease_ratio", DelegatingFloatColumn::new);
    }

    /**
     * This item is a pointer to pdbx_buffer.id in the PDBX_BUFFER category.
     * The referenced buffer is that in which the cleavage was performed.
     * @return StrColumn
     */
    public StrColumn getCleavageBufferId() {
        return delegate.getColumn("cleavage_buffer_id", DelegatingStrColumn::new);
    }

    /**
     * The temperature in degrees celsius at which the cleavage was performed.
     * @return FloatColumn
     */
    public FloatColumn getCleavageTemperature() {
        return delegate.getColumn("cleavage_temperature", DelegatingFloatColumn::new);
    }

    /**
     * The time in minutes for the cleavage reaction
     * @return FloatColumn
     */
    public FloatColumn getCleavageTime() {
        return delegate.getColumn("cleavage_time", DelegatingFloatColumn::new);
    }

}