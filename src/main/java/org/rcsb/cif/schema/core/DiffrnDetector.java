package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The CATEGORY of data items which specify the detectors used
 * in the measurement of diffraction intensities.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class DiffrnDetector extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "diffrn_detector";

    public DiffrnDetector(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * The resolution limit of an area diffraction radiation detector.
     * @return FloatColumn
     */
    public FloatColumn getAreaResolMean() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_detector_area_resol_mean"));
    }

    /**
     * Description of special aspects of the radiation detector.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return new DelegatingStrColumn(parentBlock.getColumn("diffrn_detector_details"));
    }

    /**
     * Description of the type of diffraction radiation detector.
     * @return StrColumn
     */
    public StrColumn getDetector() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("diffrn_detector_detector", "diffrn_detector_description"));
    }

    /**
     * Description of the type of diffraction radiation detector.
     * @return StrColumn
     */
    public StrColumn getDescription() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("diffrn_detector_detector", "diffrn_detector_description"));
    }

    /**
     * The maximum time between two detector signals that cannot be resolved.
     * @return FloatColumn
     */
    public FloatColumn getDtime() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_radiation_detector_dtime", "diffrn_detector_dtime"));
    }

    /**
     * The make, model or name of the diffraction radiation detector.
     * @return StrColumn
     */
    public StrColumn getType() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("diffrn_detector_type", "diffrn_detector_make"));
    }

    /**
     * The make, model or name of the diffraction radiation detector.
     * @return StrColumn
     */
    public StrColumn getMake() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("diffrn_detector_type", "diffrn_detector_make"));
    }

}