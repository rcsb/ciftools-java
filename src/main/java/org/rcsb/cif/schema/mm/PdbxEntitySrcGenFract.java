package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * This category contains details for the fraction steps used in
 * the overall protein production process. Examples of fractionation
 * steps are centrifugation and magnetic bead pull-down purification.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxEntitySrcGenFract extends DelegatingCategory {
    public PdbxEntitySrcGenFract(Category delegate) {
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
            case "method":
                return getMethod();
            case "temperature":
                return getTemperature();
            case "details":
                return getDetails();
            case "protein_location":
                return getProteinLocation();
            case "protein_volume":
                return getProteinVolume();
            case "protein_yield":
                return getProteinYield();
            case "protein_yield_method":
                return getProteinYieldMethod();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_entity_src_gen_fract.entry_id uniquely identifies
     * a sample consisting of one or more proteins whose structure is
     * to be determined. This is a pointer to _entry.id. This item may
     * be a site dependent bar code.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * The value of _pdbx_entity_src_gen_fract.entity_id uniquely identifies
     * each protein contained in the project target protein complex whose
     * structure is to be determined. This data item is a pointer to _entity.id
     * in the ENTITY category.  This item may be a site dependent bar code.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * This item is the unique identifier for this fractionation step.
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
     * acid sequence of the expressed product after the fractionation
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
     * This item describes the method of fractionation.
     * @return StrColumn
     */
    public StrColumn getMethod() {
        return delegate.getColumn("method", DelegatingStrColumn::new);
    }

    /**
     * The temperature in degrees celsius at which the fractionation was performed.
     * @return FloatColumn
     */
    public FloatColumn getTemperature() {
        return delegate.getColumn("temperature", DelegatingFloatColumn::new);
    }

    /**
     * String value containing details of the fractionation.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The fraction containing the protein of interest.
     * @return StrColumn
     */
    public StrColumn getProteinLocation() {
        return delegate.getColumn("protein_location", DelegatingStrColumn::new);
    }

    /**
     * The volume of the fraction containing the protein.
     * @return FloatColumn
     */
    public FloatColumn getProteinVolume() {
        return delegate.getColumn("protein_volume", DelegatingFloatColumn::new);
    }

    /**
     * The yield in milligrams of protein from the fractionation.
     * @return FloatColumn
     */
    public FloatColumn getProteinYield() {
        return delegate.getColumn("protein_yield", DelegatingFloatColumn::new);
    }

    /**
     * The method used to determine the yield
     * @return StrColumn
     */
    public StrColumn getProteinYieldMethod() {
        return delegate.getColumn("protein_yield_method", DelegatingStrColumn::new);
    }

}