package org.rcsb.cif.schema.generated.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
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
     * 
     * Miller indices of a reflection used to measure the unit cell.
     * @return StrColumn
     */
    public StrColumn getHkl() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_hkl"));
    }

    /**
     * 
     * Theta angle of reflection used to measure the crystal unit cell.
     * @return StrColumn
     */
    public StrColumn getTheta() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_theta"));
    }
}
