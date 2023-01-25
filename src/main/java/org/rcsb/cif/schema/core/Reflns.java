package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The CATEGORY of data items used to specify parameters for the complete
 * set of reflections used in the structure refinement process. Note that
 * these parameters are often similar measures to those defined in the
 * DIFFRN categories, but differ in that the parameters refer to the
 * reduced/transformed reflections which have been used to refine the
 * atom site data in the ATOM_SITE category. The DIFFRN definitions refer
 * to the diffraction measurements and the raw reflection data.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Reflns extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "reflns";

    public Reflns(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * Yes or No flag on whether the anomalous dispersion scattering
     * components will be applied in the F complex calculation.
     * See _refln.F_complex
     * @return StrColumn
     */
    public StrColumn getApplyDispersionToFcalc() {
        return new DelegatingStrColumn(parentBlock.getColumn("reflns_apply_dispersion_to_fcalc"));
    }

    /**
     * Highest resolution for the final REFLN data set.
     * This corresponds to the smallest interplanar d value.
     * @return FloatColumn
     */
    public FloatColumn getDResolutionHigh() {
        return new DelegatingFloatColumn(parentBlock.getColumn("reflns_d_resolution_high"));
    }

    /**
     * Lowest resolution for the final REFLN data set.
     * This corresponds to the largest interplanar d value.
     * @return FloatColumn
     */
    public FloatColumn getDResolutionLow() {
        return new DelegatingFloatColumn(parentBlock.getColumn("reflns_d_resolution_low"));
    }

    /**
     * The proportion of Friedel related reflections present in the number of
     * the 'independent reflections' specified by the item _reflns.number_total.
     * 
     * This proportion is calculated as the ratio:
     * 
     * [N(Crystal class) - N(Laue symmetry)] / N(Laue symmetry)
     * 
     * where, working from the DIFFRN_REFLN list,
     * 
     * N(Crystal class) is the number of reflections obtained on
     * averaging under the symmetry of the crystal class
     * N(Laue symmetry) is the number of reflections obtained on
     * averaging under the Laue symmetry.
     * 
     * (a) For centrosymmetric structures its value is
     * necessarily equal to 0.0 as the crystal class
     * is identical to the Laue symmetry.
     * (b) For whole-sphere data for a crystal in the space
     * group P1, _reflns.Friedel_coverage is equal to 1.0,
     * as no reflection h k l is equivalent to -h -k -l
     * in the crystal class and all Friedel pairs
     * {h k l; -h -k -l} have been measured.
     * (c) For whole-sphere data in space group Pmm2, the value
     * will be &lt; 1.0 because although reflections h k l and
     * -h -k -l are not equivalent when h k l indices are
     * non-zero, they are when l=0.
     * (d) For a crystal in the group Pmm2 measurements of the
     * two inequivalent octants h &gt;= 0, k &gt;=0, l lead to the
     * same value as in (c), whereas measurements of the
     * two equivalent octants h &gt;= 0, k, l &gt;= 0 will lead to
     * a zero value for _reflns.Friedel_coverage.
     * @return FloatColumn
     */
    public FloatColumn getFriedelCoverage() {
        return new DelegatingFloatColumn(parentBlock.getColumn("reflns_friedel_coverage"));
    }

    /**
     * The ratio of Friedel pairs measured to _diffrn_reflns.theta_full
     * to the number theoretically possible (ignoring reflections in
     * centric projections and systematic absences throughout).
     * In contrast to _reflns.Friedel_coverage this can take values in
     * the full range 0 to 1 for any non-centrosymmetric space group,
     * and so one can see at a glance how completely the Friedel pairs
     * have been measured. For centrosymmetric space groups the value
     * would be given as not-applicable '.'
     * @return FloatColumn
     */
    public FloatColumn getFriedelFractionFull() {
        return new DelegatingFloatColumn(parentBlock.getColumn("reflns_friedel_fraction_full"));
    }

    /**
     * The ratio of Friedel pairs measured to _diffrn_reflns.theta_max
     * to the number theoretically possible (ignoring reflections in
     * centric projections and systematic absences throughout).
     * In contrast to _reflns.Friedel_coverage this can take values in
     * the full range 0 to 1 for any non-centrosymmetric space group,
     * and so one can see at a glance how completely the Friedel pairs
     * have been measured. For centrosymmetric space groups the value
     * would be given as not-applicable '.'
     * @return FloatColumn
     */
    public FloatColumn getFriedelFractionMax() {
        return new DelegatingFloatColumn(parentBlock.getColumn("reflns_friedel_fraction_max"));
    }

    /**
     * The index of a reciprocal space vector.
     * @return IntColumn
     */
    public IntColumn getLimitHMax() {
        return new DelegatingIntColumn(parentBlock.getColumn("reflns_limit_h_max"));
    }

    /**
     * The index of a reciprocal space vector.
     * @return IntColumn
     */
    public IntColumn getLimitHMin() {
        return new DelegatingIntColumn(parentBlock.getColumn("reflns_limit_h_min"));
    }

    /**
     * The index of a reciprocal space vector.
     * @return IntColumn
     */
    public IntColumn getLimitKMax() {
        return new DelegatingIntColumn(parentBlock.getColumn("reflns_limit_k_max"));
    }

    /**
     * The index of a reciprocal space vector.
     * @return IntColumn
     */
    public IntColumn getLimitKMin() {
        return new DelegatingIntColumn(parentBlock.getColumn("reflns_limit_k_min"));
    }

    /**
     * The index of a reciprocal space vector.
     * @return IntColumn
     */
    public IntColumn getLimitLMax() {
        return new DelegatingIntColumn(parentBlock.getColumn("reflns_limit_l_max"));
    }

    /**
     * The index of a reciprocal space vector.
     * @return IntColumn
     */
    public IntColumn getLimitLMin() {
        return new DelegatingIntColumn(parentBlock.getColumn("reflns_limit_l_min"));
    }

    /**
     * Maximum Miller indices of refined diffraction reflections.
     * @return FloatColumn
     */
    public FloatColumn getLimitMax() {
        return new DelegatingFloatColumn(parentBlock.getColumn("reflns_limit_max"));
    }

    /**
     * Minimum Miller indices of refined diffraction reflections.
     * @return IntColumn
     */
    public IntColumn getLimitMin() {
        return new DelegatingIntColumn(parentBlock.getColumn("reflns_limit_min"));
    }

    /**
     * Count of reflections in the REFLN set (not the DIFFRN_REFLN set) which
     * are significantly intense (see _reflns.threshold_expression). It may
     * include Friedel equivalent reflections (i.e. those which are equivalent
     * under the Laue symmetry but inequivalent under the crystal class),
     * depending on the nature of the structure and the procedures used.
     * @return IntColumn
     */
    public IntColumn getNumberObs() {
        return new DelegatingIntColumn(parentBlock.getAliasedColumn("reflns_number_obs", "reflns_number_gt"));
    }

    /**
     * Count of reflections in the REFLN set (not the DIFFRN_REFLN set) which
     * are significantly intense (see _reflns.threshold_expression). It may
     * include Friedel equivalent reflections (i.e. those which are equivalent
     * under the Laue symmetry but inequivalent under the crystal class),
     * depending on the nature of the structure and the procedures used.
     * @return IntColumn
     */
    public IntColumn getNumberGt() {
        return new DelegatingIntColumn(parentBlock.getAliasedColumn("reflns_number_obs", "reflns_number_gt"));
    }

    /**
     * Number of reflections in the REFLN set (not the DIFFRN_REFLN set). It may
     * include Friedel equivalent reflections (i.e. those which are equivalent
     * under the Laue symmetry but inequivalent under the crystal class),
     * depending on the nature of the structure and the procedures used.
     * @return IntColumn
     */
    public IntColumn getNumberAll() {
        return new DelegatingIntColumn(parentBlock.getAliasedColumn("reflns_number_all", "reflns_number_total"));
    }

    /**
     * Number of reflections in the REFLN set (not the DIFFRN_REFLN set). It may
     * include Friedel equivalent reflections (i.e. those which are equivalent
     * under the Laue symmetry but inequivalent under the crystal class),
     * depending on the nature of the structure and the procedures used.
     * @return IntColumn
     */
    public IntColumn getNumberTotal() {
        return new DelegatingIntColumn(parentBlock.getAliasedColumn("reflns_number_all", "reflns_number_total"));
    }

    /**
     * Description of the properties of the REFLN reflection list that is not
     * given in other data items. Should include details about the averaging
     * of symmetry-equivalent reflections including Friedel pairs.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("reflns_details", "reflns_special_details"));
    }

    /**
     * Description of the properties of the REFLN reflection list that is not
     * given in other data items. Should include details about the averaging
     * of symmetry-equivalent reflections including Friedel pairs.
     * @return StrColumn
     */
    public StrColumn getSpecialDetails() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("reflns_details", "reflns_special_details"));
    }

    /**
     * Description of the criterion used to classify a reflection as having a
     * "significant intensity". This criterion is usually expressed in terms
     * of a u(I) or u(F) threshold. "u" is the standard uncertainty.
     * @return StrColumn
     */
    public StrColumn getObservedCriterion() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("reflns_observed_criterion", "reflns_threshold_expression"));
    }

    /**
     * Description of the criterion used to classify a reflection as having a
     * "significant intensity". This criterion is usually expressed in terms
     * of a u(I) or u(F) threshold. "u" is the standard uncertainty.
     * @return StrColumn
     */
    public StrColumn getThresholdExpression() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("reflns_observed_criterion", "reflns_threshold_expression"));
    }

}