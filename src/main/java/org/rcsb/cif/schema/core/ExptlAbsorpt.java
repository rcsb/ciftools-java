package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The CATEGORY of data items used to specify the experimental details
 * of the absorption measurements and corrections to the diffraction data.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class ExptlAbsorpt extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "exptl_absorpt";

    public ExptlAbsorpt(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * Standard uncertainty of _exptl_absorpt.coefficient_mu.
     * @return FloatColumn
     */
    public FloatColumn getCoefficientMuSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("exptl_absorpt_coefficient_mu_su"));
    }

    /**
     * Details of the absorption correction process applied to the
     * measured intensities that cannot otherwise be given using
     * other data items from the EXPTL_ABSORPT category.
     * @return StrColumn
     */
    public StrColumn getSpecialDetails() {
        return new DelegatingStrColumn(parentBlock.getColumn("exptl_absorpt_special_details"));
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
    public FloatColumn getCorrectionTMin() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("exptl_absorpt_correction_T_min", "exptl_absorpt_correction_t_min"));
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
    public StrColumn getProcessDetails() {
        return new DelegatingStrColumn(parentBlock.getColumn("exptl_absorpt_process_details"));
    }

}