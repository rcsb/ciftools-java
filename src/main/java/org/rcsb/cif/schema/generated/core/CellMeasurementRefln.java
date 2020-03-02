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
     * The index of a reciprocal space vector.
     * @return StrColumn
     */
    public StrColumn getIndexH() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_index_h"));
    }

    /**
     * 
     * The index of a reciprocal space vector.
     * @return StrColumn
     */
    public StrColumn getIndexK() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_index_k"));
    }

    /**
     * 
     * The index of a reciprocal space vector.
     * @return StrColumn
     */
    public StrColumn getIndexL() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_index_l"));
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
