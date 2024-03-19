package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The CATEGORY of data items used to specify the experimental work
 * prior to diffraction measurements. These include crystallization
 * crystal measurements and absorption-correction techniques used.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Exptl extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "exptl";

    public Exptl(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * Total number of crystals used in the measurement of intensities.
     * @return IntColumn
     */
    public IntColumn getCrystalsNumber() {
        return new DelegatingIntColumn(parentBlock.getColumn("exptl_crystals_number"));
    }

    /**
     * The method used in the experiment.
     * @return StrColumn
     */
    public StrColumn getMethod() {
        return new DelegatingStrColumn(parentBlock.getColumn("exptl_method"));
    }

    /**
     * A description of special aspects of the experimental method.
     * @return StrColumn
     */
    public StrColumn getMethodDetails() {
        return new DelegatingStrColumn(parentBlock.getColumn("exptl_method_details"));
    }

    /**
     * The calculated maximum value of the transmission factor for
     * the specimen. Its value does not include the effects of
     * absorption in the specimen mount. The presence of this
     * item does not imply that the structure factors have been
     * corrected for absorption. For the applied correction see
     * _exptl_absorpt.correction_T_max.
     * @return FloatColumn
     */
    public FloatColumn getTransmissionFactorMax() {
        return new DelegatingFloatColumn(parentBlock.getColumn("exptl_transmission_factor_max"));
    }

    /**
     * Standard uncertainty of _exptl.transmission_factor_max.
     * @return FloatColumn
     */
    public FloatColumn getTransmissionFactorMaxSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("exptl_transmission_factor_max_su"));
    }

    /**
     * The calculated minimum value of the transmission factor for
     * the specimen. Its value does not include the effects of
     * absorption in the specimen mount. The presence of this
     * item does not imply that the structure factors have been
     * corrected for absorption. For the applied correction see
     * _exptl_absorpt.correction_T_min.
     * @return FloatColumn
     */
    public FloatColumn getTransmissionFactorMin() {
        return new DelegatingFloatColumn(parentBlock.getColumn("exptl_transmission_factor_min"));
    }

    /**
     * Standard uncertainty of _exptl.transmission_factor_min.
     * @return FloatColumn
     */
    public FloatColumn getTransmissionFactorMinSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("exptl_transmission_factor_min_su"));
    }

    /**
     * Details of the experiment prior to intensity measurement.
     * See also _exptl_crystal.preparation
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("exptl_details", "exptl_special_details"));
    }

    /**
     * Details of the experiment prior to intensity measurement.
     * See also _exptl_crystal.preparation
     * @return StrColumn
     */
    public StrColumn getSpecialDetails() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("exptl_details", "exptl_special_details"));
    }

    /**
     * Linear absorption coefficient, μ, calculated from the atomic content of
     * the cell, the density and the radiation wavelength.
     * @return FloatColumn
     */
    public FloatColumn getAbsorptCoefficientMu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("exptl_absorpt_coefficient_mu"));
    }

    /**
     * Linear absorption coefficient, μ, calculated from the atomic content of
     * the cell, the density and the radiation wavelength.
     * @return FloatColumn
     */
    public FloatColumn getCoefficientMu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("exptl_absorpt_coefficient_mu"));
    }

    /**
     * Maximum transmission factor for the crystal and radiation applied
     * to the measured intensities, it includes the correction for
     * absorption by the specimen mount and diffractometer as well
     * as by the specimen itself. These values give the transmission (T)
     * factor by which measured intensities have been REDUCED due to
     * absorption. Sometimes referred to as absorption correction A or
     * 1/A* (see "Crystal Structure Analysis for Chemists and Biologists"
     * by J.P. Glusker et al., Wiley)
     * @return FloatColumn
     */
    public FloatColumn getAbsorptCorrectionTMax() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("exptl_absorpt_correction_T_max", "exptl_absorpt_correction_t_max"));
    }

    /**
     * Maximum transmission factor for the crystal and radiation applied
     * to the measured intensities, it includes the correction for
     * absorption by the specimen mount and diffractometer as well
     * as by the specimen itself. These values give the transmission (T)
     * factor by which measured intensities have been REDUCED due to
     * absorption. Sometimes referred to as absorption correction A or
     * 1/A* (see "Crystal Structure Analysis for Chemists and Biologists"
     * by J.P. Glusker et al., Wiley)
     * @return FloatColumn
     */
    public FloatColumn getCorrectionTMax() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("exptl_absorpt_correction_T_max", "exptl_absorpt_correction_t_max"));
    }

    /**
     * Minimum transmission factor for the crystal and radiation applied
     * to the measured intensities, it includes the correction for
     * absorption by the specimen mount and diffractometer as well
     * as by the specimen itself. These values give the transmission (T)
     * factor by which measured intensities have been REDUCED due to
     * absorption. Sometimes referred to as absorption correction A or
     * 1/A* (see "Crystal Structure Analysis for Chemists and Biologists"
     * by J.P. Glusker et al., Wiley)
     * @return FloatColumn
     */
    public FloatColumn getAbsorptCorrectionTMin() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("exptl_absorpt_correction_T_min", "exptl_absorpt_correction_t_min"));
    }

    /**
     * Minimum transmission factor for the crystal and radiation applied
     * to the measured intensities, it includes the correction for
     * absorption by the specimen mount and diffractometer as well
     * as by the specimen itself. These values give the transmission (T)
     * factor by which measured intensities have been REDUCED due to
     * absorption. Sometimes referred to as absorption correction A or
     * 1/A* (see "Crystal Structure Analysis for Chemists and Biologists"
     * by J.P. Glusker et al., Wiley)
     * @return FloatColumn
     */
    public FloatColumn getCorrectionTMin() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("exptl_absorpt_correction_T_min", "exptl_absorpt_correction_t_min"));
    }

    /**
     * Code identifying the absorption correction type and method.
     * The 'empirical' approach should NOT be used if more detailed
     * information on the crystal shape is available.
     * @return StrColumn
     */
    public StrColumn getAbsorptCorrectionType() {
        return new DelegatingStrColumn(parentBlock.getColumn("exptl_absorpt_correction_type"));
    }

    /**
     * Code identifying the absorption correction type and method.
     * The 'empirical' approach should NOT be used if more detailed
     * information on the crystal shape is available.
     * @return StrColumn
     */
    public StrColumn getCorrectionType() {
        return new DelegatingStrColumn(parentBlock.getColumn("exptl_absorpt_correction_type"));
    }

    /**
     * Description of the absorption correction process applied to the
     * measured intensities. A literature reference should be supplied
     * for psi-scan or multi-scan techniques.
     * @return StrColumn
     */
    public StrColumn getAbsorptProcessDetails() {
        return new DelegatingStrColumn(parentBlock.getColumn("exptl_absorpt_process_details"));
    }

    /**
     * Description of the absorption correction process applied to the
     * measured intensities. A literature reference should be supplied
     * for psi-scan or multi-scan techniques.
     * @return StrColumn
     */
    public StrColumn getProcessDetails() {
        return new DelegatingStrColumn(parentBlock.getColumn("exptl_absorpt_process_details"));
    }

}