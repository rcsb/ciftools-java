package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the REFLNS_CLASS category record details
 * of the reflections used to determine the structural
 * parameters for each reflection class.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("code", StrColumn::new) :
                getBinaryColumn("code"));
    }

    /**
     * Description of each reflection class.
     * @return StrColumn
     */
    public StrColumn getDescription() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("description", StrColumn::new) :
                getBinaryColumn("description"));
    }

    /**
     * For each reflection class, the smallest value in angstroms
     * for the interplanar spacings for the reflections used in the
     * refinement. This is called the highest resolution.
     * @return FloatColumn
     */
    public FloatColumn getDResHigh() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("d_res_high", FloatColumn::new) :
                getBinaryColumn("d_res_high"));
    }

    /**
     * For each reflection class, the largest value in angstroms
     * for the interplanar spacings for the reflections used in the
     * refinement. This is called the lowest resolution.
     * @return FloatColumn
     */
    public FloatColumn getDResLow() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("d_res_low", FloatColumn::new) :
                getBinaryColumn("d_res_low"));
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
     * @return IntColumn
     */
    public IntColumn getNumberGt() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("number_gt", IntColumn::new) :
                getBinaryColumn("number_gt"));
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
     * @return IntColumn
     */
    public IntColumn getNumberTotal() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("number_total", IntColumn::new) :
                getBinaryColumn("number_total"));
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
     * @return FloatColumn
     */
    public FloatColumn getRFactorAll() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("R_factor_all", FloatColumn::new) :
                getBinaryColumn("R_factor_all"));
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
     * @return FloatColumn
     */
    public FloatColumn getRFactorGt() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("R_factor_gt", FloatColumn::new) :
                getBinaryColumn("R_factor_gt"));
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
     * @return FloatColumn
     */
    public FloatColumn getRFsqdFactor() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("R_Fsqd_factor", FloatColumn::new) :
                getBinaryColumn("R_Fsqd_factor"));
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
     * @return FloatColumn
     */
    public FloatColumn getRIFactor() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("R_I_factor", FloatColumn::new) :
                getBinaryColumn("R_I_factor"));
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
     * @return FloatColumn
     */
    public FloatColumn getWRFactorAll() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("wR_factor_all", FloatColumn::new) :
                getBinaryColumn("wR_factor_all"));
    }
}
