package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_SERIAL_CRYSTALLOGRAPHY_SAMPLE_DELIVERY_FIXED_TARGET
 * category record details about sample delivery using a fixed taget.
 */
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDiffrnId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("diffrn_id", SingleRowStrColumn::new) :
                getBinaryColumn("diffrn_id"));
    }

    /**
     * For a fixed target sample, a description of sample preparation
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDescription() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("description", SingleRowStrColumn::new) :
                getBinaryColumn("description"));
    }

    /**
     * For a fixed target sample, mechanism to hold sample in the beam
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSampleHolding() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("sample_holding", SingleRowStrColumn::new) :
                getBinaryColumn("sample_holding"));
    }

    /**
     * Type of base holding the support
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSupportBase() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("support_base", SingleRowStrColumn::new) :
                getBinaryColumn("support_base"));
    }

    /**
     * Size of pore in grid supporting sample. Diameter or length in micrometres,
     * e.g. pore diameter
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getSampleUnitSize() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("sample_unit_size", SingleRowFloatColumn::new) :
                getBinaryColumn("sample_unit_size"));
    }

    /**
     * The number of crystals per dropplet or pore in fixed target
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getCrystalsPerUnit() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("crystals_per_unit", SingleRowIntColumn::new) :
                getBinaryColumn("crystals_per_unit"));
    }

    /**
     * The sample solution content and concentration
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSampleSolvent() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("sample_solvent", SingleRowStrColumn::new) :
                getBinaryColumn("sample_solvent"));
    }

    /**
     * Method to prevent dehydration of sample
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSampleDehydrationPrevention() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("sample_dehydration_prevention", SingleRowStrColumn::new) :
                getBinaryColumn("sample_dehydration_prevention"));
    }

    /**
     * Device used to control movement of the fixed sample
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getMotionControl() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("motion_control", SingleRowStrColumn::new) :
                getBinaryColumn("motion_control"));
    }

    /**
     * Velocity of sample horizontally relative to a perpendicular beam in millimetres/second
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getVelocityHorizontal() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("velocity_horizontal", SingleRowFloatColumn::new) :
                getBinaryColumn("velocity_horizontal"));
    }

    /**
     * Velocity of sample vertically relative to a perpendicular beam in millimetres/second
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getVelocityVertical() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("velocity_vertical", SingleRowFloatColumn::new) :
                getBinaryColumn("velocity_vertical"));
    }

    /**
     * Any details pertinent to the fixed sample target
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
    }
}
