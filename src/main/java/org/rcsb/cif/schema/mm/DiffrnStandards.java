package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the DIFFRN_STANDARDS category record details
 * about the set of standard reflections used to monitor intensity
 * stability during the measurement of diffraction intensities.
 * 
 * Note that these records describe properties common to the set of
 * standard reflections, not the standard reflections themselves.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class DiffrnStandards extends DelegatingCategory {
    public DiffrnStandards(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "diffrn_id":
                return getDiffrnId();
            case "decay_%":
                return getDecay();
            case "interval_count":
                return getIntervalCount();
            case "interval_time":
                return getIntervalTime();
            case "number":
                return getNumber();
            case "scale_sigma":
                return getScaleSigma();
            case "scale_u":
                return getScaleU();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _diffrn.id in the DIFFRN
     * category.
     * @return StrColumn
     */
    public StrColumn getDiffrnId() {
        return delegate.getColumn("diffrn_id", DelegatingStrColumn::new);
    }

    /**
     * The percentage decrease in the mean of the intensities
     * for the set of standard reflections from the start of the
     * measurement process to the end. This value usually
     * affords a measure of the overall decay in crystal quality
     * during the diffraction measurement process. Negative values
     * are used in exceptional instances where the final intensities
     * are greater than the initial ones.
     * @return FloatColumn
     */
    public FloatColumn getDecay() {
        return delegate.getColumn("decay_%", DelegatingFloatColumn::new);
    }

    /**
     * The number of reflection intensities between the measurement of
     * standard reflection intensities.
     * @return IntColumn
     */
    public IntColumn getIntervalCount() {
        return delegate.getColumn("interval_count", DelegatingIntColumn::new);
    }

    /**
     * The time in minutes between the measurement of standard
     * reflection intensities.
     * @return FloatColumn
     */
    public FloatColumn getIntervalTime() {
        return delegate.getColumn("interval_time", DelegatingFloatColumn::new);
    }

    /**
     * The number of unique standard reflections used during the
     * measurement of  the diffraction intensities.
     * @return IntColumn
     */
    public IntColumn getNumber() {
        return delegate.getColumn("number", DelegatingIntColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation) of
     * the individual mean standard scales applied to the intensity
     * data.
     * @return FloatColumn
     */
    public FloatColumn getScaleSigma() {
        return delegate.getColumn("scale_sigma", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty of the individual mean
     * standard scales applied to the intensity data.
     * @return FloatColumn
     */
    public FloatColumn getScaleU() {
        return delegate.getColumn("scale_u", DelegatingFloatColumn::new);
    }

}