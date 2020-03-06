package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PHASING_MAD_SET category record
 * details about the individual data sets used in a MAD phasing
 * experiment.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PhasingMADSet extends DelegatingCategory {
    public PhasingMADSet(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "clust_id":
                return getClustId();
            case "d_res_high":
                return getDResHigh();
            case "d_res_low":
                return getDResLow();
            case "expt_id":
                return getExptId();
            case "f_double_prime":
                return getFDoublePrime();
            case "f_prime":
                return getFPrime();
            case "set_id":
                return getSetId();
            case "wavelength":
                return getWavelength();
            case "wavelength_details":
                return getWavelengthDetails();
            case "pdbx_atom_type":
                return getPdbxAtomType();
            case "pdbx_f_prime_refined":
                return getPdbxFPrimeRefined();
            case "pdbx_f_double_prime_refined":
                return getPdbxFDoublePrimeRefined();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _phasing_MAD_clust.id in
     * the PHASING_MAD_CLUST category.
     * @return StrColumn
     */
    public StrColumn getClustId() {
        return delegate.getColumn("clust_id", DelegatingStrColumn::new);
    }

    /**
     * The lowest value for the interplanar spacings for the
     * reflection data used for this set of data. This is called
     * the highest resolution.
     * @return FloatColumn
     */
    public FloatColumn getDResHigh() {
        return delegate.getColumn("d_res_high", DelegatingFloatColumn::new);
    }

    /**
     * The highest value for the interplanar spacings for the
     * reflection data used for this set of data. This is called
     * the lowest resolution.
     * @return FloatColumn
     */
    public FloatColumn getDResLow() {
        return delegate.getColumn("d_res_low", DelegatingFloatColumn::new);
    }

    /**
     * This data item is a pointer to _phasing_MAD_expt.id in the
     * PHASING_MAD_EXPT category.
     * @return StrColumn
     */
    public StrColumn getExptId() {
        return delegate.getColumn("expt_id", DelegatingStrColumn::new);
    }

    /**
     * The f'' component of the anomalous scattering factor for this
     * wavelength.
     * @return FloatColumn
     */
    public FloatColumn getFDoublePrime() {
        return delegate.getColumn("f_double_prime", DelegatingFloatColumn::new);
    }

    /**
     * The f' component of the anomalous scattering factor for this
     * wavelength.
     * @return FloatColumn
     */
    public FloatColumn getFPrime() {
        return delegate.getColumn("f_prime", DelegatingFloatColumn::new);
    }

    /**
     * This data item is a pointer to _phasing_set.id in the
     * PHASING_SET category.
     * @return StrColumn
     */
    public StrColumn getSetId() {
        return delegate.getColumn("set_id", DelegatingStrColumn::new);
    }

    /**
     * The wavelength at which this data set was measured.
     * @return FloatColumn
     */
    public FloatColumn getWavelength() {
        return delegate.getColumn("wavelength", DelegatingFloatColumn::new);
    }

    /**
     * A descriptor for this wavelength in this cluster of data sets.
     * @return StrColumn
     */
    public StrColumn getWavelengthDetails() {
        return delegate.getColumn("wavelength_details", DelegatingStrColumn::new);
    }

    /**
     * record the type of heavy atoms which produce anomolous singal.
     * @return StrColumn
     */
    public StrColumn getPdbxAtomType() {
        return delegate.getColumn("pdbx_atom_type", DelegatingStrColumn::new);
    }

    /**
     * record the refined f_prime (not from experiment).
     * @return FloatColumn
     */
    public FloatColumn getPdbxFPrimeRefined() {
        return delegate.getColumn("pdbx_f_prime_refined", DelegatingFloatColumn::new);
    }

    /**
     * record the refined f_double_prime (not from experiment).
     * @return FloatColumn
     */
    public FloatColumn getPdbxFDoublePrimeRefined() {
        return delegate.getColumn("pdbx_f_double_prime_refined", DelegatingFloatColumn::new);
    }

}