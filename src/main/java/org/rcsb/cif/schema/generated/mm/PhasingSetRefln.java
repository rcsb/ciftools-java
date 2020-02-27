package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PHASING_SET_REFLN category record the values
 * of the measured structure factors used in a phasing experiment.
 * This list may contain information from a number of different
 * data sets; _phasing_set_refln.set_id indicates the data set
 * to which a given record corresponds.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PhasingSetRefln extends DelegatingCategory {
    public PhasingSetRefln(Category delegate) {
        super(delegate);
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
     * The measured value of the structure factor for this reflection
     * in this data set in electrons.
     * @return FloatColumn
     */
    public FloatColumn getFMeas() {
        return delegate.getColumn("F_meas", DelegatingFloatColumn::new);
    }

    /**
     * The measured value of the structure factor for this reflection
     * in this data set in arbitrary units.
     * @return FloatColumn
     */
    public FloatColumn getFMeasAu() {
        return delegate.getColumn("F_meas_au", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _phasing_set_refln.F_meas in electrons.
     * @return FloatColumn
     */
    public FloatColumn getFMeasSigma() {
        return delegate.getColumn("F_meas_sigma", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _phasing_set_refln.F_meas_au in arbitrary units.
     * @return FloatColumn
     */
    public FloatColumn getFMeasSigmaAu() {
        return delegate.getColumn("F_meas_sigma_au", DelegatingFloatColumn::new);
    }

    /**
     * Miller index h of this reflection in this data set.
     * @return IntColumn
     */
    public IntColumn getIndexH() {
        return delegate.getColumn("index_h", DelegatingIntColumn::new);
    }

    /**
     * Miller index k of this reflection in this data set.
     * @return IntColumn
     */
    public IntColumn getIndexK() {
        return delegate.getColumn("index_k", DelegatingIntColumn::new);
    }

    /**
     * Miller index l of this reflection in this data set.
     * @return IntColumn
     */
    public IntColumn getIndexL() {
        return delegate.getColumn("index_l", DelegatingIntColumn::new);
    }
}
