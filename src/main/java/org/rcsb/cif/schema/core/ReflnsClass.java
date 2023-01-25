package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The CATEGORY of data items which specify the properties of reflections
 * in specific classes of reflections.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class ReflnsClass extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "reflns_class";

    public ReflnsClass(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * Code identifying a reflection class.
     * @return StrColumn
     */
    public StrColumn getCode() {
        return new DelegatingStrColumn(parentBlock.getColumn("reflns_class_code"));
    }

    /**
     * Highest resolution for the reflections in this class.
     * This corresponds to the smallest interplanar d value.
     * @return FloatColumn
     */
    public FloatColumn getDResHigh() {
        return new DelegatingFloatColumn(parentBlock.getColumn("reflns_class_d_res_high"));
    }

    /**
     * Lowest resolution for the reflections in this class.
     * This corresponds to the largest interplanar d value.
     * @return FloatColumn
     */
    public FloatColumn getDResLow() {
        return new DelegatingFloatColumn(parentBlock.getColumn("reflns_class_d_res_low"));
    }

    /**
     * Description of a reflection class.
     * @return StrColumn
     */
    public StrColumn getDescription() {
        return new DelegatingStrColumn(parentBlock.getColumn("reflns_class_description"));
    }

    /**
     * Count of reflections in this REFLN class (not the DIFFRN_REFLN set)
     * which are significantly intense (see _reflns.threshold_expression). It may
     * include Friedel equivalent reflections (i.e. those which are equivalent
     * under the Laue symmetry but inequivalent under the crystal class),
     * depending on the nature of the structure and the procedures used.
     * @return IntColumn
     */
    public IntColumn getNumberGt() {
        return new DelegatingIntColumn(parentBlock.getColumn("reflns_class_number_gt"));
    }

    /**
     * Count of reflections in this REFLN class (not the DIFFRN_REFLN set). It
     * may include Friedel equivalent reflections (those which are equivalent
     * under the Laue symmetry but inequivalent under the crystal class),
     * depending on the nature of the structure and the procedures used.
     * @return IntColumn
     */
    public IntColumn getNumberTotal() {
        return new DelegatingIntColumn(parentBlock.getColumn("reflns_class_number_total"));
    }

    /**
     * Residual factor for reflections in this class used in refinement.
     * 
     * sum | F(meas) - F(calc) |
     * R(F all) = ------------------------
     * sum | F(meas) |
     * 
     * F(meas) = the measured structure-factor amplitudes
     * F(calc) = the calculated structure-factor amplitudes
     * 
     * and the sum is taken over the specified reflections
     * @return FloatColumn
     */
    public FloatColumn getRFactorAll() {
        return new DelegatingFloatColumn(parentBlock.getColumn("reflns_class_r_factor_all"));
    }

    /**
     * Residual factor for the reflections in this class judged
     * significantly intense (i.e. greater than required by the
     * _reflns.threshold_expression) and included in the refinement.
     * 
     * sum | F(meas_gt) - F(calc) |
     * R(F gt) = --------------------------------
     * sum | F(meas_gt) |
     * 
     * F(meas) = the measured structure-factor amplitudes
     * F(calc) = the calculated structure-factor amplitudes
     * 
     * and the sum is taken over the specified reflections
     * @return FloatColumn
     */
    public FloatColumn getRFactorGt() {
        return new DelegatingFloatColumn(parentBlock.getColumn("reflns_class_r_factor_gt"));
    }

    /**
     * Residual factor R(F^2^) for reflections in this class judged
     * significantly intense (i.e. greater than required by the
     * _reflns.threshold_expression) and included in the refinement.
     * 
     * sum | F(meas_gt)^2^ - F(calc)^2^ |
     * R(Fsqd gt) = ------------------------------------
     * sum F(meas_gt)^2^
     * 
     * F(meas_gt)^2^ = square of the 'observed' structure-factor
     * F(calc   )^2^ = square of the calculated structure-factor
     * 
     * and the sum is taken over the specified reflections
     * @return FloatColumn
     */
    public FloatColumn getRFsqdFactor() {
        return new DelegatingFloatColumn(parentBlock.getColumn("reflns_class_r_fsqd_factor"));
    }

    /**
     * Residual factor R(I) for reflections in this class judged
     * significantly intense (i.e. greater than required by the
     * _reflns.threshold_expression) and included in the refinement.
     * 
     * sum | I(meas_gt) - I(calc) |
     * R(I gt) =  ----------------------------
     * sum | I(meas_gt) |
     * 
     * I(meas_gt) = the net 'observed' intensity
     * I(calc   ) = the net calculated intensity
     * 
     * and the sum is taken over the specified reflections
     * @return FloatColumn
     */
    public FloatColumn getRIFactor() {
        return new DelegatingFloatColumn(parentBlock.getColumn("reflns_class_r_i_factor"));
    }

    /**
     * For each reflection class, the weighted residual factors for all
     * reflections included in the refinement. The reflections also
     * satisfy the resolution limits established by
     * _reflns_class.d_res_high and _reflns_class.d_res_low.
     * 
     * ( sum w [ Y(meas) - Y(calc) ]^2^  )^1/2^
     * wR = ( ------------------------------- )
     * (         sum w Y(meas)^2^        )
     * 
     * Y(meas) = the measured amplitudes specified by
     * _refine_ls.structure_factor_coef
     * Y(calc) = the calculated amplitudes specified by
     * _refine_ls.structure_factor_coef
     * w       = the least-squares weights
     * 
     * and the sum is taken over the reflections of this class.
     * @return FloatColumn
     */
    public FloatColumn getWrFactorAll() {
        return new DelegatingFloatColumn(parentBlock.getColumn("reflns_class_wr_factor_all"));
    }

}