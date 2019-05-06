package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_SERIAL_CRYSTALLOGRAPHY_SAMPLE_DELIVERY_FIXED_TARGET
 * category record details about sample delivery using a fixed taget.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getDiffrnId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("diffrn_id", StrColumn::new) :
                getBinaryColumn("diffrn_id"));
    }

    /**
     * For a fixed target sample, a description of sample preparation
     * @return StrColumn
     */
    public StrColumn getDescription() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("description", StrColumn::new) :
                getBinaryColumn("description"));
    }

    /**
     * For a fixed target sample, mechanism to hold sample in the beam
     * @return StrColumn
     */
    public StrColumn getSampleHolding() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("sample_holding", StrColumn::new) :
                getBinaryColumn("sample_holding"));
    }

    /**
     * Type of base holding the support
     * @return StrColumn
     */
    public StrColumn getSupportBase() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("support_base", StrColumn::new) :
                getBinaryColumn("support_base"));
    }

    /**
     * Size of pore in grid supporting sample. Diameter or length in micrometres,
     * e.g. pore diameter
     * @return FloatColumn
     */
    public FloatColumn getSampleUnitSize() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("sample_unit_size", FloatColumn::new) :
                getBinaryColumn("sample_unit_size"));
    }

    /**
     * The number of crystals per dropplet or pore in fixed target
     * @return IntColumn
     */
    public IntColumn getCrystalsPerUnit() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("crystals_per_unit", IntColumn::new) :
                getBinaryColumn("crystals_per_unit"));
    }

    /**
     * The sample solution content and concentration
     * @return StrColumn
     */
    public StrColumn getSampleSolvent() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("sample_solvent", StrColumn::new) :
                getBinaryColumn("sample_solvent"));
    }

    /**
     * Method to prevent dehydration of sample
     * @return StrColumn
     */
    public StrColumn getSampleDehydrationPrevention() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("sample_dehydration_prevention", StrColumn::new) :
                getBinaryColumn("sample_dehydration_prevention"));
    }

    /**
     * Device used to control movement of the fixed sample
     * @return StrColumn
     */
    public StrColumn getMotionControl() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("motion_control", StrColumn::new) :
                getBinaryColumn("motion_control"));
    }

    /**
     * Velocity of sample horizontally relative to a perpendicular beam in millimetres/second
     * @return FloatColumn
     */
    public FloatColumn getVelocityHorizontal() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("velocity_horizontal", FloatColumn::new) :
                getBinaryColumn("velocity_horizontal"));
    }

    /**
     * Velocity of sample vertically relative to a perpendicular beam in millimetres/second
     * @return FloatColumn
     */
    public FloatColumn getVelocityVertical() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("velocity_vertical", FloatColumn::new) :
                getBinaryColumn("velocity_vertical"));
    }

    /**
     * Any details pertinent to the fixed sample target
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }
}
