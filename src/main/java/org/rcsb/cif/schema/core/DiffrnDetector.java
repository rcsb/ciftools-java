package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 * The CATEGORY of data items which specify the detectors used in the
 * in the measurement of diffraction intensities.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class DiffrnDetector extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "diffrn_detector";

    public DiffrnDetector(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * 
     * The resolution limit of an area diffraction radiation detector.
     * @return FloatColumn
     */
    public FloatColumn getAreaResolMean() {
        return new DelegatingFloatColumn(parentBlock.getColumn(NAME + "_area_resol_mean"));
    }

    /**
     * 
     * Description of the type of diffraction radiation detector.
     * @return StrColumn
     */
    public StrColumn getDescription() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_description"));
    }

    /**
     * 
     * Description of special aspects of the radiation detector.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_details"));
    }

    /**
     * 
     * The maximum time between two detector signals that cannot be resolved.
     * @return FloatColumn
     */
    public FloatColumn getDtime() {
        return new DelegatingFloatColumn(parentBlock.getColumn(NAME + "_dtime"));
    }

    /**
     * 
     * The make, model or name of the diffraction radiation detector.
     * @return StrColumn
     */
    public StrColumn getMake() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_make"));
    }
}
