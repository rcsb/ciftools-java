package org.rcsb.cif.model.generated.reflnsclass;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ReflnsClass extends BaseCategory {
    public ReflnsClass(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public ReflnsClass(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public ReflnsClass(String name) {
        super(name);
    }

    /**
     * The code identifying a certain reflection class.
     * @return Code
     */
    public Code getCode() {
        return (Code) (isText ? textFields.computeIfAbsent("code",
                Code::new) : getBinaryColumn("code"));
    }

    /**
     * Description of each reflection class.
     * @return Description
     */
    public Description getDescription() {
        return (Description) (isText ? textFields.computeIfAbsent("description",
                Description::new) : getBinaryColumn("description"));
    }

    /**
     * For each reflection class, the smallest value in angstroms
     * for the interplanar spacings for the reflections used in the
     * refinement. This is called the highest resolution.
     * @return DResHigh
     */
    public DResHigh getDResHigh() {
        return (DResHigh) (isText ? textFields.computeIfAbsent("d_res_high",
                DResHigh::new) : getBinaryColumn("d_res_high"));
    }

    /**
     * For each reflection class, the largest value in angstroms
     * for the interplanar spacings for the reflections used in the
     * refinement. This is called the lowest resolution.
     * @return DResLow
     */
    public DResLow getDResLow() {
        return (DResLow) (isText ? textFields.computeIfAbsent("d_res_low",
                DResLow::new) : getBinaryColumn("d_res_low"));
    }

    /**
     * For each reflection class, the number of significantly intense
     * reflections (see _reflns.threshold_expression) in the REFLN
     * list (not the DIFFRN_REFLN list). This may include Friedel-
     * equivalent reflections (i.e. those which are symmetry-equivalent
     * under the Laue symmetry but inequivalent under the crystal
     * class)  according to the nature of the structure and the
     * procedures used. Any special characteristics of the reflections
     * included in the REFLN list should be described using the item
     * _reflns.details.
     * @return NumberGt
     */
    public NumberGt getNumberGt() {
        return (NumberGt) (isText ? textFields.computeIfAbsent("number_gt",
                NumberGt::new) : getBinaryColumn("number_gt"));
    }

    /**
     * For each reflection class, the total number of reflections
     * in the REFLN list (not the DIFFRN_REFLN list). This may
     * include Friedel-equivalent reflections (i.e. those which are
     * symmetry-equivalent under the Laue symmetry but inequivalent
     * under the crystal class) according to the nature of the
     * structure and the procedures used.  Any special characteristics
     * of the reflections included in the REFLN list should be
     * described using the item _reflns.details.
     * @return NumberTotal
     */
    public NumberTotal getNumberTotal() {
        return (NumberTotal) (isText ? textFields.computeIfAbsent("number_total",
                NumberTotal::new) : getBinaryColumn("number_total"));
    }

    /**
     * For each reflection class, the residual factor for all
     * reflections included in the refinement.
     * The reflections also satisfy the resolution limits established by
     * _reflns_class.d_res_high and _reflns_class.d_res_low.
     * This is the conventional R factor. See also the
     * definition of _reflns_class.wR_factor_all.
     * 
     * sum | F(obs) - F(calc) |
     * R = ------------------------
     * sum | F(obs) |
     * 
     * F(obs)  = the observed structure-factor amplitudes
     * F(calc) = the calculated structure-factor amplitudes
     * 
     * and the sum is taken over the reflections of this class.
     * @return RFactorAll
     */
    public RFactorAll getRFactorAll() {
        return (RFactorAll) (isText ? textFields.computeIfAbsent("R_factor_all",
                RFactorAll::new) : getBinaryColumn("R_factor_all"));
    }

    /**
     * For each reflection class, the residual factor for significantly
     * intense reflections (see _reflns.threshold_expression) included
     * in the refinement.
     * The reflections also satisfy the resolution limits established by
     * _reflns_class.d_res_high and _reflns_class.d_res_low.
     * This is the conventional R factor. See also the
     * definition of _reflns_class.wR_factor_all.
     * 
     * sum | F(obs) - F(calc) |
     * R = ------------------------
     * sum | F(obs) |
     * 
     * F(obs)  = the observed structure-factor amplitudes
     * F(calc) = the calculated structure-factor amplitudes
     * 
     * and the sum is taken over the reflections of this class.
     * @return RFactorGt
     */
    public RFactorGt getRFactorGt() {
        return (RFactorGt) (isText ? textFields.computeIfAbsent("R_factor_gt",
                RFactorGt::new) : getBinaryColumn("R_factor_gt"));
    }

    /**
     * For each reflection class, the residual factor R(F^2^) calculated
     * on the squared amplitudes of the observed and calculated
     * structure factors for the reflections judged significantly
     * intense (i.e. satisfying the threshold specified by
     * _reflns.threshold_expression) and included in the refinement.
     * 
     * The reflections also satisfy the resolution limits established
     * by _reflns_class.d_res_high and _reflns_class.d_res_low.
     * 
     * sum | F(obs)^2^ - F(calc)^2^ |
     * R(Fsqd) = -------------------------------
     * sum F(obs)^2^
     * 
     * F(obs)^2^  = squares of the observed structure-factor amplitudes
     * F(calc)^2^ = squares of the calculated structure-factor
     * amplitudes
     * 
     * and the sum is taken over the reflections of this class.
     * @return RFsqdFactor
     */
    public RFsqdFactor getRFsqdFactor() {
        return (RFsqdFactor) (isText ? textFields.computeIfAbsent("R_Fsqd_factor",
                RFsqdFactor::new) : getBinaryColumn("R_Fsqd_factor"));
    }

    /**
     * For each reflection class, the residual factor R(I) for the
     * reflections judged significantly intense (i.e. satisfying the
     * threshold specified by _reflns.threshold_expression) and
     * included in the refinement.
     * 
     * This is most often calculated in Rietveld refinements
     * against powder data, where it is referred to as R~B~ or R~Bragg~.
     * 
     * sum | I(obs) - I(calc) |
     * R(I) =  ------------------------
     * sum | I(obs) |
     * 
     * I(obs)  = the net observed intensities
     * I(calc) = the net calculated intensities
     * 
     * and the sum is taken over the reflections of this class.
     * @return RIFactor
     */
    public RIFactor getRIFactor() {
        return (RIFactor) (isText ? textFields.computeIfAbsent("R_I_factor",
                RIFactor::new) : getBinaryColumn("R_I_factor"));
    }

    /**
     * For each reflection class, the weighted residual factors for all
     * reflections included in the refinement. The reflections also
     * satisfy the resolution limits established by
     * _reflns_class.d_res_high and _reflns_class.d_res_low.
     * See also _reflns_class.R_factor_ definitions.
     * 
     * ( sum w [ Y(obs) - Y(calc) ]^2^  )^1/2^
     * wR = ( ------------------------------ )
     * (         sum w Y(obs)^2^       )
     * 
     * Y(obs)  = the observed amplitude specified by
     * _refine.ls_structure_factor_coef
     * Y(calc) = the calculated amplitude specified by
     * _refine.ls_structure_factor_coef
     * w       = the least-squares weight
     * 
     * and the sum is taken over the reflections of this class.
     * @return WRFactorAll
     */
    public WRFactorAll getWRFactorAll() {
        return (WRFactorAll) (isText ? textFields.computeIfAbsent("wR_factor_all",
                WRFactorAll::new) : getBinaryColumn("wR_factor_all"));
    }
}
