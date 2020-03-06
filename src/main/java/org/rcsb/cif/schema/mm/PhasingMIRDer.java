package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PHASING_MIR_DER category record details
 * about individual derivatives used in the phasing of the
 * structure when methods involving isomorphous replacement are
 * involved.
 * 
 * A derivative in this context does not necessarily equate with
 * a data set; for instance, the same data set could be used to
 * one resolution limit as an isomorphous scatterer and to a
 * different resolution (and with a different sigma cutoff) as an
 * anomalous scatterer. These would be treated as two distinct
 * derivatives, although both derivatives would point to the same
 * data sets via _phasing_MIR_der.der_set_id and
 * _phasing_MIR_der.native_set_id.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PhasingMIRDer extends DelegatingCategory {
    public PhasingMIRDer(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "d_res_high":
                return getDResHigh();
            case "d_res_low":
                return getDResLow();
            case "der_set_id":
                return getDerSetId();
            case "details":
                return getDetails();
            case "id":
                return getId();
            case "native_set_id":
                return getNativeSetId();
            case "number_of_sites":
                return getNumberOfSites();
            case "power_acentric":
                return getPowerAcentric();
            case "power_centric":
                return getPowerCentric();
            case "R_cullis_acentric":
                return getRCullisAcentric();
            case "R_cullis_anomalous":
                return getRCullisAnomalous();
            case "R_cullis_centric":
                return getRCullisCentric();
            case "reflns_acentric":
                return getReflnsAcentric();
            case "reflns_anomalous":
                return getReflnsAnomalous();
            case "reflns_centric":
                return getReflnsCentric();
            case "reflns_criteria":
                return getReflnsCriteria();
            case "pdbx_R_kraut_centric":
                return getPdbxRKrautCentric();
            case "pdbx_R_kraut_acentric":
                return getPdbxRKrautAcentric();
            case "pdbx_R_kraut":
                return getPdbxRKraut();
            case "pdbx_loc_centric":
                return getPdbxLocCentric();
            case "pdbx_loc_acentric":
                return getPdbxLocAcentric();
            case "pdbx_loc":
                return getPdbxLoc();
            case "pdbx_fom_centric":
                return getPdbxFomCentric();
            case "pdbx_fom_acentric":
                return getPdbxFomAcentric();
            case "pdbx_fom":
                return getPdbxFom();
            case "pdbx_power":
                return getPdbxPower();
            case "pdbx_R_cullis":
                return getPdbxRCullis();
            case "pdbx_reflns":
                return getPdbxReflns();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The lowest value for the interplanar spacings for the
     * reflection data used for this derivative. This is called the
     * highest resolution.
     * @return FloatColumn
     */
    public FloatColumn getDResHigh() {
        return delegate.getColumn("d_res_high", DelegatingFloatColumn::new);
    }

    /**
     * The highest value for  the interplanar spacings for the
     * reflection data used for this derivative. This is called the
     * lowest resolution.
     * @return FloatColumn
     */
    public FloatColumn getDResLow() {
        return delegate.getColumn("d_res_low", DelegatingFloatColumn::new);
    }

    /**
     * The data set that was treated as the derivative in this
     * experiment.
     * 
     * This data item is a pointer to _phasing_set.id in the
     * PHASING_SET category.
     * @return StrColumn
     */
    public StrColumn getDerSetId() {
        return delegate.getColumn("der_set_id", DelegatingStrColumn::new);
    }

    /**
     * A description of special aspects of this derivative, its data,
     * its solution or its use in phasing.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The value of _phasing_MIR_der.id must uniquely identify
     * a record in the PHASING_MIR_DER list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * The data set that was treated as the native in this
     * experiment.
     * 
     * This data item is a pointer to _phasing_set.id in the
     * PHASING_SET category.
     * @return StrColumn
     */
    public StrColumn getNativeSetId() {
        return delegate.getColumn("native_set_id", DelegatingStrColumn::new);
    }

    /**
     * The number of heavy-atom sites in this derivative.
     * @return IntColumn
     */
    public IntColumn getNumberOfSites() {
        return delegate.getColumn("number_of_sites", DelegatingIntColumn::new);
    }

    /**
     * The mean phasing power P for acentric reflections for this
     * derivative.
     * 
     * sum|Fh~calc~^2^|
     * P = (----------------------------)^1/2^
     * sum|Fph~obs~ - Fph~calc~|^2^
     * 
     * Fph~obs~  = the observed structure-factor amplitude of this
     * derivative
     * Fph~calc~ = the calculated structure-factor amplitude of this
     * derivative
     * Fh~calc~  = the calculated structure-factor amplitude from the
     * heavy-atom model
     * 
     * sum is taken over the specified reflections
     * @return FloatColumn
     */
    public FloatColumn getPowerAcentric() {
        return delegate.getColumn("power_acentric", DelegatingFloatColumn::new);
    }

    /**
     * The mean phasing power P for centric reflections for this
     * derivative.
     * 
     * sum|Fh~calc~^2^|
     * P = (----------------------------)^1/2^
     * sum|Fph~obs~ - Fph~calc~|^2^
     * 
     * Fph~obs~  = the observed structure-factor amplitude of the
     * derivative
     * Fph~calc~ = the calculated structure-factor amplitude of the
     * derivative
     * Fh~calc~  = the calculated structure-factor amplitude from the
     * heavy-atom model
     * 
     * sum is taken over the specified reflections
     * @return FloatColumn
     */
    public FloatColumn getPowerCentric() {
        return delegate.getColumn("power_centric", DelegatingFloatColumn::new);
    }

    /**
     * Residual factor R~cullis,acen~ for acentric reflections for this
     * derivative.
     * 
     * The Cullis R factor was originally defined only for centric
     * reflections.  It is, however, also a useful statistical
     * measure for acentric reflections, which is how it is used in
     * this data item.
     * 
     * sum| |Fph~obs~ +/- Fp~obs~| - Fh~calc~ |
     * R~cullis,acen~ = ----------------------------------------
     * sum|Fph~obs~ - Fp~obs~|
     * 
     * Fp~obs~  = the observed structure-factor amplitude of the native
     * Fph~obs~ = the observed structure-factor amplitude of the
     * derivative
     * Fh~calc~ = the calculated structure-factor amplitude from the
     * heavy-atom model
     * 
     * sum is taken over the specified reflections
     * 
     * Ref: Cullis, A. F., Muirhead, H., Perutz, M. F., Rossmann, M. G.
     * &amp; North, A. C. T. (1961). Proc. R. Soc. London Ser. A,
     * 265, 15-38.
     * @return FloatColumn
     */
    public FloatColumn getRCullisAcentric() {
        return delegate.getColumn("R_cullis_acentric", DelegatingFloatColumn::new);
    }

    /**
     * Residual factor R~cullis,ano~ for anomalous reflections for this
     * derivative.
     * 
     * The Cullis R factor was originally defined only for centric
     * reflections.  It is, however, also a useful statistical
     * measure for anomalous  reflections, which is how it is used in
     * this data item.
     * 
     * This is tabulated for acentric terms.  A value less than 1.0
     * means there is some contribution to the phasing from the
     * anomalous data.
     * 
     * sum |Fph+~obs~Fph-~obs~ - Fh+~calc~ - Fh-~calc~|
     * R~cullis,ano~ = ------------------------------------------------
     * sum|Fph+~obs~ - Fph-~obs~|
     * 
     * Fph+~obs~  = the observed positive Friedel structure-factor
     * amplitude for the derivative
     * Fph-~obs~  = the observed negative Friedel structure-factor
     * amplitude for the derivative
     * 
     * Fh+~calc~  = the calculated positive Friedel structure-factor
     * amplitude from the heavy-atom model
     * Fh-~calc~  = the calculated negative Friedel structure-factor
     * amplitude from the heavy-atom model
     * 
     * sum is taken over the specified reflections
     * 
     * Ref: Cullis, A. F., Muirhead, H., Perutz, M. F., Rossmann, M. G.
     * &amp; North, A. C. T. (1961). Proc. R. Soc.  London Ser. A,
     * 265, 15-38.
     * @return FloatColumn
     */
    public FloatColumn getRCullisAnomalous() {
        return delegate.getColumn("R_cullis_anomalous", DelegatingFloatColumn::new);
    }

    /**
     * Residual factor R~cullis~ for centric reflections for this
     * derivative.
     * 
     * sum| |Fph~obs~ +/- Fp~obs~| - Fh~calc~ |
     * R~cullis~ = ----------------------------------------
     * sum|Fph~obs~ - Fp~obs~|
     * 
     * Fp~obs~  = the observed structure-factor amplitude of the native
     * Fph~obs~ = the observed structure-factor amplitude of the
     * derivative
     * Fh~calc~ = the calculated structure-factor amplitude from the
     * heavy-atom model
     * 
     * sum is taken over the specified reflections
     * 
     * Ref: Cullis, A. F., Muirhead, H., Perutz, M. F., Rossmann, M. G.
     * &amp; North, A. C. T. (1961). Proc. R. Soc. London Ser. A,
     * 265, 15-38.
     * @return FloatColumn
     */
    public FloatColumn getRCullisCentric() {
        return delegate.getColumn("R_cullis_centric", DelegatingFloatColumn::new);
    }

    /**
     * The number of acentric reflections used in phasing for this
     * derivative.
     * @return IntColumn
     */
    public IntColumn getReflnsAcentric() {
        return delegate.getColumn("reflns_acentric", DelegatingIntColumn::new);
    }

    /**
     * The number of anomalous reflections used in phasing for this
     * derivative.
     * @return IntColumn
     */
    public IntColumn getReflnsAnomalous() {
        return delegate.getColumn("reflns_anomalous", DelegatingIntColumn::new);
    }

    /**
     * The number of centric reflections used in phasing for this
     * derivative.
     * @return IntColumn
     */
    public IntColumn getReflnsCentric() {
        return delegate.getColumn("reflns_centric", DelegatingIntColumn::new);
    }

    /**
     * Criteria used to limit the reflections used in the phasing
     * calculations.
     * @return StrColumn
     */
    public StrColumn getReflnsCriteria() {
        return delegate.getColumn("reflns_criteria", DelegatingStrColumn::new);
    }

    /**
     * record R_kraut obtained from centric data for each derivative.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRKrautCentric() {
        return delegate.getColumn("pdbx_R_kraut_centric", DelegatingFloatColumn::new);
    }

    /**
     * record R_kraut obtained from acentric data for each derivative.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRKrautAcentric() {
        return delegate.getColumn("pdbx_R_kraut_acentric", DelegatingFloatColumn::new);
    }

    /**
     * record R_kraut obtained from all data data for each derivative.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRKraut() {
        return delegate.getColumn("pdbx_R_kraut", DelegatingFloatColumn::new);
    }

    /**
     * record lack of closure obtained from centric data for
     * each derivative.
     * @return FloatColumn
     */
    public FloatColumn getPdbxLocCentric() {
        return delegate.getColumn("pdbx_loc_centric", DelegatingFloatColumn::new);
    }

    /**
     * record lack of closure obtained from acentric data for
     * each derivative.
     * @return FloatColumn
     */
    public FloatColumn getPdbxLocAcentric() {
        return delegate.getColumn("pdbx_loc_acentric", DelegatingFloatColumn::new);
    }

    /**
     * record lack of closure obtained from all data for
     * each derivative.
     * @return FloatColumn
     */
    public FloatColumn getPdbxLoc() {
        return delegate.getColumn("pdbx_loc", DelegatingFloatColumn::new);
    }

    /**
     * record figure of merit obtained from centric data for
     * each derivative.
     * @return FloatColumn
     */
    public FloatColumn getPdbxFomCentric() {
        return delegate.getColumn("pdbx_fom_centric", DelegatingFloatColumn::new);
    }

    /**
     * record figure of merit obtained from acentric data for
     * each derivative.
     * @return FloatColumn
     */
    public FloatColumn getPdbxFomAcentric() {
        return delegate.getColumn("pdbx_fom_acentric", DelegatingFloatColumn::new);
    }

    /**
     * record figure of merit obtained from all data for
     * each derivative.
     * @return FloatColumn
     */
    public FloatColumn getPdbxFom() {
        return delegate.getColumn("pdbx_fom", DelegatingFloatColumn::new);
    }

    /**
     * record phasing power for each derivative.
     * @return FloatColumn
     */
    public FloatColumn getPdbxPower() {
        return delegate.getColumn("pdbx_power", DelegatingFloatColumn::new);
    }

    /**
     * record R_cullis for each derivative.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRCullis() {
        return delegate.getColumn("pdbx_R_cullis", DelegatingFloatColumn::new);
    }

    /**
     * record number of reflections used for each derivative.
     * @return IntColumn
     */
    public IntColumn getPdbxReflns() {
        return delegate.getColumn("pdbx_reflns", DelegatingIntColumn::new);
    }

}