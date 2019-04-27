package org.rcsb.cif.model.diffrnstandards;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class DiffrnStandards extends BaseCategory {
    public DiffrnStandards(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public DiffrnStandards(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public DiffrnStandards(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _diffrn.id in the DIFFRN
     * category.
     * @return DiffrnId
     */
    public DiffrnId getDiffrnId() {
        return (DiffrnId) (isText ? textFields.computeIfAbsent("diffrn_id",
                DiffrnId::new) : getBinaryColumn("diffrn_id"));
    }

    /**
     * The percentage decrease in the mean of the intensities
     * for the set of standard reflections from the start of the
     * measurement process to the end. This value usually
     * affords a measure of the overall decay in crystal quality
     * during the diffraction measurement process. Negative values
     * are used in exceptional instances where the final intensities
     * are greater than the initial ones.
     * @return Decay
     */
    public Decay getDecay() {
        return (Decay) (isText ? textFields.computeIfAbsent("decay_%",
                Decay::new) : getBinaryColumn("decay_%"));
    }

    /**
     * The number of reflection intensities between the measurement of
     * standard reflection intensities.
     * @return IntervalCount
     */
    public IntervalCount getIntervalCount() {
        return (IntervalCount) (isText ? textFields.computeIfAbsent("interval_count",
                IntervalCount::new) : getBinaryColumn("interval_count"));
    }

    /**
     * The time in minutes between the measurement of standard
     * reflection intensities.
     * @return IntervalTime
     */
    public IntervalTime getIntervalTime() {
        return (IntervalTime) (isText ? textFields.computeIfAbsent("interval_time",
                IntervalTime::new) : getBinaryColumn("interval_time"));
    }

    /**
     * The number of unique standard reflections used during the
     * measurement of  the diffraction intensities.
     * @return Number
     */
    public Number getNumber() {
        return (Number) (isText ? textFields.computeIfAbsent("number",
                Number::new) : getBinaryColumn("number"));
    }

    /**
     * The standard uncertainty (estimated standard deviation) of
     * the individual mean standard scales applied to the intensity
     * data.
     * @return ScaleSigma
     */
    public ScaleSigma getScaleSigma() {
        return (ScaleSigma) (isText ? textFields.computeIfAbsent("scale_sigma",
                ScaleSigma::new) : getBinaryColumn("scale_sigma"));
    }

    /**
     * The standard uncertainty of the individual mean
     * standard scales applied to the intensity data.
     * @return ScaleU
     */
    public ScaleU getScaleU() {
        return (ScaleU) (isText ? textFields.computeIfAbsent("scale_u",
                ScaleU::new) : getBinaryColumn("scale_u"));
    }
}
