package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
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
     * Residual [sum av|del(I)|/sum|av(I)|] for symmetry-equivalent
     * reflections used to calculate the average intensity av(I).
     * The av|del(I)| term is the average absolute difference
     * between av(I) and the individual intensities.
     * @return FloatColumn
     */
    public FloatColumn getAvREq() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_reflns_class_av_r_eq"));
    }

    /**
     * Code identifying a reflection class.
     * @return StrColumn
     */
    public StrColumn getCode() {
        return new DelegatingStrColumn(parentBlock.getColumn("diffrn_reflns_class_code"));
    }

    /**
     * Highest resolution in reflection class i.e. smallest d value in class.
     * @return FloatColumn
     */
    public FloatColumn getDResHigh() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_reflns_class_d_res_high"));
    }

    /**
     * Lowest resolution in reflection class i.e. largest d value in class.
     * @return FloatColumn
     */
    public FloatColumn getDResLow() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_reflns_class_d_res_low"));
    }

    /**
     * Description of a reflection class.
     * @return StrColumn
     */
    public StrColumn getDescription() {
        return new DelegatingStrColumn(parentBlock.getColumn("diffrn_reflns_class_description"));
    }

    /**
     * Number of measured intensities for a reflection class, excluding
     * the systematic absences arising from centring translations.
     * @return IntColumn
     */
    public IntColumn getNumber() {
        return new DelegatingIntColumn(parentBlock.getColumn("diffrn_reflns_class_number"));
    }

    /**
     * Recorded [sum|su(net I)|/sum|net I|] in a reflection class.
     * @return FloatColumn
     */
    public FloatColumn getAvUI_I() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_reflns_class_av_uI/I", "diffrn_reflns_class_av_sgI/I", "diffrn_reflns_class_av_sui_over_i"));
    }

    /**
     * Recorded [sum|su(net I)|/sum|net I|] in a reflection class.
     * @return FloatColumn
     */
    public FloatColumn getAvSgI_I() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_reflns_class_av_uI/I", "diffrn_reflns_class_av_sgI/I", "diffrn_reflns_class_av_sui_over_i"));
    }

    /**
     * Recorded [sum|su(net I)|/sum|net I|] in a reflection class.
     * @return FloatColumn
     */
    public FloatColumn getAvSuiOverI() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_reflns_class_av_uI/I", "diffrn_reflns_class_av_sgI/I", "diffrn_reflns_class_av_sui_over_i"));
    }

}