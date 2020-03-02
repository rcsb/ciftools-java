package org.rcsb.cif.schema.generated.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
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
     * 
     * Code identifying a certain reflection class.
     * @return StrColumn
     */
    public StrColumn getCode() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_code"));
    }

    /**
     * 
     * Highest resolution for the reflections in this class.
     * This corresponds to the smallest interpanar d value.
     * @return StrColumn
     */
    public StrColumn getDResHigh() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_d_res_high"));
    }

    /**
     * 
     * Lowest resolution for the reflections in this class.
     * This corresponds to the largest interpanar d value.
     * @return StrColumn
     */
    public StrColumn getDResLow() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_d_res_low"));
    }

    /**
     * 
     * Residual factor for reflections in this class included in the
     * refinement.  See _refine_ls.R_factor_all definition for details.
     * @return StrColumn
     */
    public StrColumn getRFactorAll() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_R_factor_all"));
    }

    /**
     * 
     * Residual factor for the reflections in this class judged
     * significantly intense (see _reflns.threshold_expression) and
     * included in refinement. See _refine_ls.R_factor_gt for details.
     * @return StrColumn
     */
    public StrColumn getRFactorGt() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_R_factor_gt"));
    }

    /**
     * 
     * Residual factor R(F^2^) for reflections in this class judged
     * significantly intense (see _reflns.threshold_expression) and
     * included in refinement. See _refine_ls.R_Fsqd_factor for details.
     * @return StrColumn
     */
    public StrColumn getRFsqdFactor() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_R_Fsqd_factor"));
    }

    /**
     * 
     * Residual factor R(I) for reflections in this class judged
     * significantly intense (see _reflns.threshold_expression) and
     * included in refinement. See _refine_ls.R_I_factor for details.
     * @return StrColumn
     */
    public StrColumn getRIFactor() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_R_I_factor"));
    }

    /**
     * 
     * Weight residual for all reflections in this class judged
     * significantly intense (see _reflns.threshold_expression) and
     * included in refinement. See _refine_ls.wR_factor_all for details.
     * @return StrColumn
     */
    public StrColumn getWRFactorAll() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_wR_factor_all"));
    }
}
