package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the DIFFRN_STANDARDS category record details
 * about the set of standard reflections used to monitor intensity
 * stability during the measurement of diffraction intensities.
 * 
 * Note that these records describe properties common to the set of
 * standard reflections, not the standard reflections themselves.
 */
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDiffrnId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("diffrn_id", SingleRowStrColumn::new) :
                getBinaryColumn("diffrn_id"));
    }

    /**
     * The percentage decrease in the mean of the intensities
     * for the set of standard reflections from the start of the
     * measurement process to the end. This value usually
     * affords a measure of the overall decay in crystal quality
     * during the diffraction measurement process. Negative values
     * are used in exceptional instances where the final intensities
     * are greater than the initial ones.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getDecay() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("decay_%", SingleRowFloatColumn::new) :
                getBinaryColumn("decay_%"));
    }

    /**
     * The number of reflection intensities between the measurement of
     * standard reflection intensities.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getIntervalCount() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("interval_count", SingleRowIntColumn::new) :
                getBinaryColumn("interval_count"));
    }

    /**
     * The time in minutes between the measurement of standard
     * reflection intensities.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getIntervalTime() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("interval_time", SingleRowFloatColumn::new) :
                getBinaryColumn("interval_time"));
    }

    /**
     * The number of unique standard reflections used during the
     * measurement of  the diffraction intensities.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getNumber() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("number", SingleRowIntColumn::new) :
                getBinaryColumn("number"));
    }

    /**
     * The standard uncertainty (estimated standard deviation) of
     * the individual mean standard scales applied to the intensity
     * data.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getScaleSigma() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("scale_sigma", SingleRowFloatColumn::new) :
                getBinaryColumn("scale_sigma"));
    }

    /**
     * The standard uncertainty of the individual mean
     * standard scales applied to the intensity data.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getScaleU() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("scale_u", SingleRowFloatColumn::new) :
                getBinaryColumn("scale_u"));
    }
}
