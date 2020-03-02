package org.rcsb.cif.schema.generated.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 * The CATEGORY of data items which specify different classes of
 * reflections in the raw measured diffraction data.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class DiffrnReflnsClass extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "diffrn_reflns_class";

    public DiffrnReflnsClass(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * 
     * Residual [sum av|del(I)|/sum|av(I)|] for symmetry-equivalent
     * reflections used to calculate the average intensity av(I).
     * The av|del(I)| term is the average absolute difference
     * between av(I) and the individual intensities.
     * @return StrColumn
     */
    public StrColumn getAvREq() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_av_R_eq"));
    }

    /**
     * 
     * Recorded [sum|su(net I)|/sum|net I|] in a reflection class.
     * @return StrColumn
     */
    public StrColumn getAvSuIOverI() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_av_suI_over_I"));
    }

    /**
     * 
     * Code identifying a reflection class.
     * @return StrColumn
     */
    public StrColumn getCode() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_code"));
    }

    /**
     * 
     * Highest resolution in reflection class i.e. smallest d value in class.
     * @return StrColumn
     */
    public StrColumn getDResHigh() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_d_res_high"));
    }

    /**
     * 
     * Lowest resolution in reflection class i.e. largest d value in class.
     * @return StrColumn
     */
    public StrColumn getDResLow() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_d_res_low"));
    }

    /**
     * 
     * Description of a reflection class.
     * @return StrColumn
     */
    public StrColumn getDescription() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_description"));
    }

    /**
     * 
     * Number of measured intensities for a reflection class, excluding
     * the systematic absences arising from centring translations.
     * @return StrColumn
     */
    public StrColumn getNumber() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_number"));
    }
}
