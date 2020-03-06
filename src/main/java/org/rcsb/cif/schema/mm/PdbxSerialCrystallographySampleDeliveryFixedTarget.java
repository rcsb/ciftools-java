package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_SERIAL_CRYSTALLOGRAPHY_SAMPLE_DELIVERY_FIXED_TARGET
 * category record details about sample delivery using a fixed taget.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxSerialCrystallographySampleDeliveryFixedTarget extends DelegatingCategory {
    public PdbxSerialCrystallographySampleDeliveryFixedTarget(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "diffrn_id":
                return getDiffrnId();
            case "description":
                return getDescription();
            case "sample_holding":
                return getSampleHolding();
            case "support_base":
                return getSupportBase();
            case "sample_unit_size":
                return getSampleUnitSize();
            case "crystals_per_unit":
                return getCrystalsPerUnit();
            case "sample_solvent":
                return getSampleSolvent();
            case "sample_dehydration_prevention":
                return getSampleDehydrationPrevention();
            case "motion_control":
                return getMotionControl();
            case "velocity_horizontal":
                return getVelocityHorizontal();
            case "velocity_vertical":
                return getVelocityVertical();
            case "details":
                return getDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The data item is a pointer to _diffrn.id in the DIFFRN
     * category.
     * @return StrColumn
     */
    public StrColumn getDiffrnId() {
        return delegate.getColumn("diffrn_id", DelegatingStrColumn::new);
    }

    /**
     * For a fixed target sample, a description of sample preparation
     * @return StrColumn
     */
    public StrColumn getDescription() {
        return delegate.getColumn("description", DelegatingStrColumn::new);
    }

    /**
     * For a fixed target sample, mechanism to hold sample in the beam
     * @return StrColumn
     */
    public StrColumn getSampleHolding() {
        return delegate.getColumn("sample_holding", DelegatingStrColumn::new);
    }

    /**
     * Type of base holding the support
     * @return StrColumn
     */
    public StrColumn getSupportBase() {
        return delegate.getColumn("support_base", DelegatingStrColumn::new);
    }

    /**
     * Size of pore in grid supporting sample. Diameter or length in micrometres,
     * e.g. pore diameter
     * @return FloatColumn
     */
    public FloatColumn getSampleUnitSize() {
        return delegate.getColumn("sample_unit_size", DelegatingFloatColumn::new);
    }

    /**
     * The number of crystals per dropplet or pore in fixed target
     * @return IntColumn
     */
    public IntColumn getCrystalsPerUnit() {
        return delegate.getColumn("crystals_per_unit", DelegatingIntColumn::new);
    }

    /**
     * The sample solution content and concentration
     * @return StrColumn
     */
    public StrColumn getSampleSolvent() {
        return delegate.getColumn("sample_solvent", DelegatingStrColumn::new);
    }

    /**
     * Method to prevent dehydration of sample
     * @return StrColumn
     */
    public StrColumn getSampleDehydrationPrevention() {
        return delegate.getColumn("sample_dehydration_prevention", DelegatingStrColumn::new);
    }

    /**
     * Device used to control movement of the fixed sample
     * @return StrColumn
     */
    public StrColumn getMotionControl() {
        return delegate.getColumn("motion_control", DelegatingStrColumn::new);
    }

    /**
     * Velocity of sample horizontally relative to a perpendicular beam in millimetres/second
     * @return FloatColumn
     */
    public FloatColumn getVelocityHorizontal() {
        return delegate.getColumn("velocity_horizontal", DelegatingFloatColumn::new);
    }

    /**
     * Velocity of sample vertically relative to a perpendicular beam in millimetres/second
     * @return FloatColumn
     */
    public FloatColumn getVelocityVertical() {
        return delegate.getColumn("velocity_vertical", DelegatingFloatColumn::new);
    }

    /**
     * Any details pertinent to the fixed sample target
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

}