package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The CATEGORY of data items used to describe the reflection data
 * used in the measurement of the crystal unit cell.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class CellMeasurementRefln extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "cell_measurement_refln";

    public CellMeasurementRefln(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * Miller indices of a reflection used to measure the unit cell.
     * @return IntColumn
     */
    public IntColumn getHkl() {
        return new DelegatingIntColumn(parentBlock.getColumn("cell_measurement_refln_hkl"));
    }

    /**
     * The index of a reciprocal space vector.
     * @return IntColumn
     */
    public IntColumn getIndexH() {
        return new DelegatingIntColumn(parentBlock.getColumn("cell_measurement_refln_index_h"));
    }

    /**
     * The index of a reciprocal space vector.
     * @return IntColumn
     */
    public IntColumn getIndexK() {
        return new DelegatingIntColumn(parentBlock.getColumn("cell_measurement_refln_index_k"));
    }

    /**
     * The index of a reciprocal space vector.
     * @return IntColumn
     */
    public IntColumn getIndexL() {
        return new DelegatingIntColumn(parentBlock.getColumn("cell_measurement_refln_index_l"));
    }

    /**
     * Theta angle of reflection used to measure the crystal unit cell.
     * @return FloatColumn
     */
    public FloatColumn getTheta() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_measurement_refln_theta"));
    }

    /**
     * Standard uncertainty of _cell_measurement_refln.theta.
     * @return FloatColumn
     */
    public FloatColumn getThetaSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("cell_measurement_refln_theta_su"));
    }

}