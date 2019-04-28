package org.rcsb.cif.model.generated.pdbxserialcrystallographysampledeliveryfixedtarget;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxSerialCrystallographySampleDeliveryFixedTarget extends BaseCategory {
    public PdbxSerialCrystallographySampleDeliveryFixedTarget(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxSerialCrystallographySampleDeliveryFixedTarget(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxSerialCrystallographySampleDeliveryFixedTarget(String name) {
        super(name);
    }

    /**
     * The data item is a pointer to _diffrn.id in the DIFFRN
     * category.
     * @return DiffrnId
     */
    public DiffrnId getDiffrnId() {
        return (DiffrnId) (isText ? textFields.computeIfAbsent("diffrn_id",
                DiffrnId::new) : getBinaryColumn("diffrn_id"));
    }

    /**
     * For a fixed target sample, a description of sample preparation
     * @return Description
     */
    public Description getDescription() {
        return (Description) (isText ? textFields.computeIfAbsent("description",
                Description::new) : getBinaryColumn("description"));
    }

    /**
     * For a fixed target sample, mechanism to hold sample in the beam
     * @return SampleHolding
     */
    public SampleHolding getSampleHolding() {
        return (SampleHolding) (isText ? textFields.computeIfAbsent("sample_holding",
                SampleHolding::new) : getBinaryColumn("sample_holding"));
    }

    /**
     * Type of base holding the support
     * @return SupportBase
     */
    public SupportBase getSupportBase() {
        return (SupportBase) (isText ? textFields.computeIfAbsent("support_base",
                SupportBase::new) : getBinaryColumn("support_base"));
    }

    /**
     * Size of pore in grid supporting sample. Diameter or length in micrometres,
     * e.g. pore diameter
     * @return SampleUnitSize
     */
    public SampleUnitSize getSampleUnitSize() {
        return (SampleUnitSize) (isText ? textFields.computeIfAbsent("sample_unit_size",
                SampleUnitSize::new) : getBinaryColumn("sample_unit_size"));
    }

    /**
     * The number of crystals per dropplet or pore in fixed target
     * @return CrystalsPerUnit
     */
    public CrystalsPerUnit getCrystalsPerUnit() {
        return (CrystalsPerUnit) (isText ? textFields.computeIfAbsent("crystals_per_unit",
                CrystalsPerUnit::new) : getBinaryColumn("crystals_per_unit"));
    }

    /**
     * The sample solution content and concentration
     * @return SampleSolvent
     */
    public SampleSolvent getSampleSolvent() {
        return (SampleSolvent) (isText ? textFields.computeIfAbsent("sample_solvent",
                SampleSolvent::new) : getBinaryColumn("sample_solvent"));
    }

    /**
     * Method to prevent dehydration of sample
     * @return SampleDehydrationPrevention
     */
    public SampleDehydrationPrevention getSampleDehydrationPrevention() {
        return (SampleDehydrationPrevention) (isText ? textFields.computeIfAbsent("sample_dehydration_prevention",
                SampleDehydrationPrevention::new) : getBinaryColumn("sample_dehydration_prevention"));
    }

    /**
     * Device used to control movement of the fixed sample
     * @return MotionControl
     */
    public MotionControl getMotionControl() {
        return (MotionControl) (isText ? textFields.computeIfAbsent("motion_control",
                MotionControl::new) : getBinaryColumn("motion_control"));
    }

    /**
     * Velocity of sample horizontally relative to a perpendicular beam in millimetres/second
     * @return VelocityHorizontal
     */
    public VelocityHorizontal getVelocityHorizontal() {
        return (VelocityHorizontal) (isText ? textFields.computeIfAbsent("velocity_horizontal",
                VelocityHorizontal::new) : getBinaryColumn("velocity_horizontal"));
    }

    /**
     * Velocity of sample vertically relative to a perpendicular beam in millimetres/second
     * @return VelocityVertical
     */
    public VelocityVertical getVelocityVertical() {
        return (VelocityVertical) (isText ? textFields.computeIfAbsent("velocity_vertical",
                VelocityVertical::new) : getBinaryColumn("velocity_vertical"));
    }

    /**
     * Any details pertinent to the fixed sample target
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }
}
