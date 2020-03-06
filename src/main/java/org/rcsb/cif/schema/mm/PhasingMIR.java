package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PHASING_MIR category record details about
 * the phasing of the structure where methods involving isomorphous
 * replacement are involved.
 * 
 * All isomorphous-replacement-based techniques are covered
 * by this category, including single isomorphous replacement (SIR),
 * multiple isomorphous replacement (MIR) and single or multiple
 * isomorphous replacement plus anomalous scattering (SIRAS, MIRAS).
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PhasingMIR extends DelegatingCategory {
    public PhasingMIR(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "details":
                return getDetails();
            case "d_res_high":
                return getDResHigh();
            case "d_res_low":
                return getDResLow();
            case "entry_id":
                return getEntryId();
            case "FOM":
                return getFOM();
            case "FOM_acentric":
                return getFOMAcentric();
            case "FOM_centric":
                return getFOMCentric();
            case "method":
                return getMethod();
            case "reflns":
                return getReflns();
            case "reflns_acentric":
                return getReflnsAcentric();
            case "reflns_centric":
                return getReflnsCentric();
            case "reflns_criterion":
                return getReflnsCriterion();
            case "pdbx_number_derivatives":
                return getPdbxNumberDerivatives();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A description of special aspects of the isomorphous-replacement
     * phasing.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The lowest value in angstroms for the interplanar spacings
     * for the reflection data used for the native data set. This is
     * called the highest resolution.
     * @return FloatColumn
     */
    public FloatColumn getDResHigh() {
        return delegate.getColumn("d_res_high", DelegatingFloatColumn::new);
    }

    /**
     * The highest value in angstroms for the interplanar spacings
     * for the reflection data used for the native data set. This is
     * called the lowest resolution.
     * @return FloatColumn
     */
    public FloatColumn getDResLow() {
        return delegate.getColumn("d_res_low", DelegatingFloatColumn::new);
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * The mean value of the figure of merit m for all reflections
     * phased in the native data set.
     * 
     * int P~alpha~ exp(i*alpha) dalpha
     * m = --------------------------------
     * int P~alpha~ dalpha
     * 
     * P~a~ = the probability that the phase angle a is correct
     * 
     * the integral is taken over the range alpha = 0 to 2 pi.
     * @return FloatColumn
     */
    public FloatColumn getFOM() {
        return delegate.getColumn("FOM", DelegatingFloatColumn::new);
    }

    /**
     * The mean value of the figure of merit m for the acentric
     * reflections phased in the native data set.
     * 
     * int P~alpha~ exp(i*alpha) dalpha
     * m = --------------------------------
     * int P~alpha~ dalpha
     * 
     * P~a~ = the probability that the phase angle a is correct
     * 
     * the integral is taken over the range alpha = 0 to 2 pi.
     * @return FloatColumn
     */
    public FloatColumn getFOMAcentric() {
        return delegate.getColumn("FOM_acentric", DelegatingFloatColumn::new);
    }

    /**
     * The mean value of the figure of merit m for the centric
     * reflections phased in the native data set.
     * 
     * int P~alpha~ exp(i*alpha) dalpha
     * m = --------------------------------
     * int P~alpha~ dalpha
     * 
     * P~a~ = the probability that the phase angle a is correct
     * 
     * the integral is taken over the range alpha = 0 to 2 pi.
     * @return FloatColumn
     */
    public FloatColumn getFOMCentric() {
        return delegate.getColumn("FOM_centric", DelegatingFloatColumn::new);
    }

    /**
     * A description of the MIR phasing method applied to phase this
     * structure.
     * 
     * Note that this is not the computer program used, which is
     * described in the SOFTWARE category, but rather the method
     * itself.
     * 
     * This data item should be used to describe significant
     * methodological options used within the MIR phasing program.
     * @return StrColumn
     */
    public StrColumn getMethod() {
        return delegate.getColumn("method", DelegatingStrColumn::new);
    }

    /**
     * The total number of reflections phased in the native data set.
     * @return IntColumn
     */
    public IntColumn getReflns() {
        return delegate.getColumn("reflns", DelegatingIntColumn::new);
    }

    /**
     * The number of acentric reflections phased in the native data
     * set.
     * @return IntColumn
     */
    public IntColumn getReflnsAcentric() {
        return delegate.getColumn("reflns_acentric", DelegatingIntColumn::new);
    }

    /**
     * The number of centric reflections phased in the native data
     * set.
     * @return IntColumn
     */
    public IntColumn getReflnsCentric() {
        return delegate.getColumn("reflns_centric", DelegatingIntColumn::new);
    }

    /**
     * Criterion used to limit the reflections used in the phasing
     * calculations.
     * @return StrColumn
     */
    public StrColumn getReflnsCriterion() {
        return delegate.getColumn("reflns_criterion", DelegatingStrColumn::new);
    }

    /**
     * The number of derivatives used in this phasing experiment.
     * @return IntColumn
     */
    public IntColumn getPdbxNumberDerivatives() {
        return delegate.getColumn("pdbx_number_derivatives", DelegatingIntColumn::new);
    }

}