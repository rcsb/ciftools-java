package org.rcsb.cif.schema.generated.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 * The CATEGORY of data items used to specify the experimental work
 * prior to diffraction measurements. These include crystallization
 * crystal measurements and absorption-correction techniques used..
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Exptl extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "exptl";

    public Exptl(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * 
     * Total number of crystals used in the measurement of intensities.
     * @return IntColumn
     */
    public IntColumn getCrystalsNumber() {
        return new DelegatingIntColumn(parentBlock.getColumn(NAME + "_crystals_number"));
    }

    /**
     * 
     * The method used in the experiment.
     * @return StrColumn
     */
    public StrColumn getMethod() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_method"));
    }

    /**
     * 
     * A description of special aspects of the experimental method.
     * @return StrColumn
     */
    public StrColumn getMethodDetails() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_method_details"));
    }

    /**
     * 
     * Details of the experiment prior to intensity measurement.
     * See also _exptl_crystal.preparation
     * @return StrColumn
     */
    public StrColumn getSpecialDetails() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_special_details"));
    }

    /**
     * 
     * The calculated maximum value of the transmission factor for
     * the specimen. Its value does not include the effects of
     * absorption in the specimen mount. The presence of this
     * item does not imply that the structure factors have been
     * corrected for absorption. For the applied correction see
     * _exptl_absorpt.correction_T_max.
     * @return FloatColumn
     */
    public FloatColumn getTransmissionFactorMax() {
        return new DelegatingFloatColumn(parentBlock.getColumn(NAME + "_transmission_factor_max"));
    }

    /**
     * 
     * The calculated minimum value of the transmission factor for
     * the specimen. Its value does not include the effects of
     * absorption in the specimen mount. The presence of this
     * item does not imply that the structure factors have been
     * corrected for absorption. For the applied correction see
     * _exptl_absorpt.correction_T_min.
     * @return FloatColumn
     */
    public FloatColumn getTransmissionFactorMin() {
        return new DelegatingFloatColumn(parentBlock.getColumn(NAME + "_transmission_factor_min"));
    }
}
