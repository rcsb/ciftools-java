package org.rcsb.cif.schema.generated.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 * The CATEGORY of data items which specify the information about
 * reflections divided into shells bounded by d resolution limits.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class ReflnsShell extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "reflns_shell";

    public ReflnsShell(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * 
     * Highest resolution for the reflections in this shell.
     * This corresponds to the smallest interpanar d value.
     * @return FloatColumn
     */
    public FloatColumn getDResHigh() {
        return new DelegatingFloatColumn(parentBlock.getColumn(NAME + "_d_res_high"));
    }

    /**
     * 
     * Resolution for the reflections in this shell stored as
     * the list of lowest and highest values. This is the
     * category key.
     * @return FloatColumn
     */
    public FloatColumn getDResLimits() {
        return new DelegatingFloatColumn(parentBlock.getColumn(NAME + "_d_res_limits"));
    }

    /**
     * 
     * Lowest resolution for the reflections in this shell.
     * This corresponds to the largest interpanar d value.
     * @return FloatColumn
     */
    public FloatColumn getDResLow() {
        return new DelegatingFloatColumn(parentBlock.getColumn(NAME + "_d_res_low"));
    }

    /**
     * 
     * Ratio of the mean intensity in a shell to the mean standard uncertainty
     * of the intensities in the shell.
     * @return FloatColumn
     */
    public FloatColumn getMeanIOverSuIAll() {
        return new DelegatingFloatColumn(parentBlock.getColumn(NAME + "_meanI_over_suI_all"));
    }

    /**
     * 
     * Ratio of the mean intensity of significantly intense reflections (see
     * _reflns.threshold_expression) in this shell to the mean standard
     * uncertainty of the intensities in the shell.
     * @return FloatColumn
     */
    public FloatColumn getMeanIOverSuIGt() {
        return new DelegatingFloatColumn(parentBlock.getColumn(NAME + "_meanI_over_suI_gt"));
    }

    /**
     * 
     * Total count of reflections measured for this resolution shell.
     * @return IntColumn
     */
    public IntColumn getNumberMeasuredAll() {
        return new DelegatingIntColumn(parentBlock.getColumn(NAME + "_number_measured_all"));
    }

    /**
     * 
     * Number of reflections measured for this resolution shell which are
     * significantly intense (see _reflns.threshold_expression).
     * @return IntColumn
     */
    public IntColumn getNumberMeasuredGt() {
        return new DelegatingIntColumn(parentBlock.getColumn(NAME + "_number_measured_gt"));
    }

    /**
     * 
     * Count of symmetry-unique reflections possible in this reflection shell.
     * @return IntColumn
     */
    public IntColumn getNumberPossible() {
        return new DelegatingIntColumn(parentBlock.getColumn(NAME + "_number_possible"));
    }

    /**
     * 
     * Count of symmetry-unique reflections present in this reflection shell.
     * @return IntColumn
     */
    public IntColumn getNumberUniqueAll() {
        return new DelegatingIntColumn(parentBlock.getColumn(NAME + "_number_unique_all"));
    }

    /**
     * 
     * Number of symmetry-unique reflections present in this reflection shell
     * which are significantly intense (see _reflns.threshold_expression).
     * @return IntColumn
     */
    public IntColumn getNumberUniqueGt() {
        return new DelegatingIntColumn(parentBlock.getColumn(NAME + "_number_unique_gt"));
    }

    /**
     * 
     * Percentage of reflections present in this shell over that possible.
     * @return FloatColumn
     */
    public FloatColumn getPercentPossibleAll() {
        return new DelegatingFloatColumn(parentBlock.getColumn(NAME + "_percent_possible_all"));
    }

    /**
     * 
     * Percentage of reflections present in this shell which are significantly
     * intense (see _reflns.threshold_expression), over that possible.
     * @return FloatColumn
     */
    public FloatColumn getPercentPossibleGt() {
        return new DelegatingFloatColumn(parentBlock.getColumn(NAME + "_percent_possible_gt"));
    }

    /**
     * 
     * Rmerge(F) for all reflections in a given shell.
     * 
     * sum~i~ ( sum~j~ | F~j~ - &lt;F&gt; | )
     * Rmerge(F) = --------------------------------
     * sum~i~ ( sum~j~ &lt;F&gt; )
     * 
     * F~j~  = the amplitude of the jth observation of reflection i
     * &lt;F&gt; = the mean of the amplitudes of all observations of
     * reflection i
     * 
     * sum~i~ is taken over all reflections
     * sum~j~ is taken over all observations of each reflection.
     * @return FloatColumn
     */
    public FloatColumn getRmergeFAll() {
        return new DelegatingFloatColumn(parentBlock.getColumn(NAME + "_Rmerge_F_all"));
    }

    /**
     * 
     * Rmerge(F) for reflections in a shell which are significantly intense
     * (see _reflns.threshold_expression). The residual merge expression is
     * shown in the _reflns_shell.Rmerge_F_all definition.
     * @return FloatColumn
     */
    public FloatColumn getRmergeFGt() {
        return new DelegatingFloatColumn(parentBlock.getColumn(NAME + "_Rmerge_F_gt"));
    }

    /**
     * 
     * Rmerge(I) for all reflections in a given shell.
     * 
     * sum~i~ ( sum~j~ | I~j~ - &lt;I&gt; | )
     * Rmerge(I) = --------------------------------
     * sum~i~ ( sum~j~ &lt;I&gt; )
     * 
     * I~j~  = the intensity of the jth observation of reflection i
     * &lt;I&gt; = the mean of the intensities of all observations of
     * reflection i
     * 
     * sum~i~ is taken over all reflections
     * sum~j~ is taken over all observations of each reflection.
     * @return FloatColumn
     */
    public FloatColumn getRmergeIAll() {
        return new DelegatingFloatColumn(parentBlock.getColumn(NAME + "_Rmerge_I_all"));
    }

    /**
     * 
     * Rmerge(I) for reflections in a shell which are significantly intense
     * (see _reflns.threshold_expression). The residual merge expression is
     * shown in the _reflns_shell.Rmerge_I_all definition.
     * @return FloatColumn
     */
    public FloatColumn getRmergeIGt() {
        return new DelegatingFloatColumn(parentBlock.getColumn(NAME + "_Rmerge_I_gt"));
    }
}
