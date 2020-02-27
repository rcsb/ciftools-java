package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PHASING_SET_REFLN category record the values
 * of the measured structure factors used in a phasing experiment.
 * This list may contain information from a number of different
 * data sets; _phasing_set_refln.set_id indicates the data set
 * to which a given record corresponds.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PhasingSetRefln extends BaseCategory {
    public PhasingSetRefln(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PhasingSetRefln(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PhasingSetRefln(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _phasing_set.id in the
     * PHASING_SET category.
     * @return StrColumn
     */
    public StrColumn getSetId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("set_id", StrColumn::new) :
                getBinaryColumn("set_id"));
    }

    /**
     * The measured value of the structure factor for this reflection
     * in this data set in electrons.
     * @return FloatColumn
     */
    public FloatColumn getFMeas() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("F_meas", FloatColumn::new) :
                getBinaryColumn("F_meas"));
    }

    /**
     * The measured value of the structure factor for this reflection
     * in this data set in arbitrary units.
     * @return FloatColumn
     */
    public FloatColumn getFMeasAu() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("F_meas_au", FloatColumn::new) :
                getBinaryColumn("F_meas_au"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _phasing_set_refln.F_meas in electrons.
     * @return FloatColumn
     */
    public FloatColumn getFMeasSigma() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("F_meas_sigma", FloatColumn::new) :
                getBinaryColumn("F_meas_sigma"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _phasing_set_refln.F_meas_au in arbitrary units.
     * @return FloatColumn
     */
    public FloatColumn getFMeasSigmaAu() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("F_meas_sigma_au", FloatColumn::new) :
                getBinaryColumn("F_meas_sigma_au"));
    }

    /**
     * Miller index h of this reflection in this data set.
     * @return IntColumn
     */
    public IntColumn getIndexH() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("index_h", IntColumn::new) :
                getBinaryColumn("index_h"));
    }

    /**
     * Miller index k of this reflection in this data set.
     * @return IntColumn
     */
    public IntColumn getIndexK() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("index_k", IntColumn::new) :
                getBinaryColumn("index_k"));
    }

    /**
     * Miller index l of this reflection in this data set.
     * @return IntColumn
     */
    public IntColumn getIndexL() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("index_l", IntColumn::new) :
                getBinaryColumn("index_l"));
    }
}
