package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The CATEGORY of data items used to specify information about the
 * refinement of the structural model.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class RefineLsClass extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "refine_ls_class";

    public RefineLsClass(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * Code identifying a certain reflection class.
     * @return StrColumn
     */
    public StrColumn getCode() {
        return new DelegatingStrColumn(parentBlock.getColumn("refine_ls_class_code"));
    }

    /**
     * Highest resolution for the reflections in this class.
     * This corresponds to the smallest interplanar d value.
     * @return FloatColumn
     */
    public FloatColumn getDResHigh() {
        return new DelegatingFloatColumn(parentBlock.getColumn("refine_ls_class_d_res_high"));
    }

    /**
     * Lowest resolution for the reflections in this class.
     * This corresponds to the largest interplanar d value.
     * @return FloatColumn
     */
    public FloatColumn getDResLow() {
        return new DelegatingFloatColumn(parentBlock.getColumn("refine_ls_class_d_res_low"));
    }

    /**
     * Residual factor for reflections in this class included in the
     * refinement.  See _refine_ls.R_factor_all definition for details.
     * @return FloatColumn
     */
    public FloatColumn getRFactorAll() {
        return new DelegatingFloatColumn(parentBlock.getColumn("refine_ls_class_r_factor_all"));
    }

    /**
     * Residual factor for the reflections in this class judged
     * significantly intense (see _reflns.threshold_expression) and
     * included in refinement. See _refine_ls.R_factor_gt for details.
     * @return FloatColumn
     */
    public FloatColumn getRFactorGt() {
        return new DelegatingFloatColumn(parentBlock.getColumn("refine_ls_class_r_factor_gt"));
    }

    /**
     * Residual factor R(F^2^) for reflections in this class judged
     * significantly intense (see _reflns.threshold_expression) and
     * included in refinement. See _refine_ls.R_Fsqd_factor for details.
     * @return FloatColumn
     */
    public FloatColumn getRFsqdFactor() {
        return new DelegatingFloatColumn(parentBlock.getColumn("refine_ls_class_r_fsqd_factor"));
    }

    /**
     * Residual factor R(I) for reflections in this class judged
     * significantly intense (see _reflns.threshold_expression) and
     * included in refinement. See _refine_ls.R_I_factor for details.
     * @return FloatColumn
     */
    public FloatColumn getRIFactor() {
        return new DelegatingFloatColumn(parentBlock.getColumn("refine_ls_class_r_i_factor"));
    }

    /**
     * Weight residual for all reflections in this class judged
     * significantly intense (see _reflns.threshold_expression) and
     * included in refinement. See _refine_ls.wR_factor_all for details.
     * @return FloatColumn
     */
    public FloatColumn getWrFactorAll() {
        return new DelegatingFloatColumn(parentBlock.getColumn("refine_ls_class_wr_factor_all"));
    }

}