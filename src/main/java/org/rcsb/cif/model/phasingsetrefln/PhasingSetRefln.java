package org.rcsb.cif.model.phasingsetrefln;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return SetId
     */
    public SetId getSetId() {
        return (SetId) (isText ? textFields.computeIfAbsent("set_id",
                SetId::new) : getBinaryColumn("set_id"));
    }

    /**
     * The measured value of the structure factor for this reflection
     * in this data set in electrons.
     * @return FMeas
     */
    public FMeas getFMeas() {
        return (FMeas) (isText ? textFields.computeIfAbsent("F_meas",
                FMeas::new) : getBinaryColumn("F_meas"));
    }

    /**
     * The measured value of the structure factor for this reflection
     * in this data set in arbitrary units.
     * @return FMeasAu
     */
    public FMeasAu getFMeasAu() {
        return (FMeasAu) (isText ? textFields.computeIfAbsent("F_meas_au",
                FMeasAu::new) : getBinaryColumn("F_meas_au"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _phasing_set_refln.F_meas in electrons.
     * @return FMeasSigma
     */
    public FMeasSigma getFMeasSigma() {
        return (FMeasSigma) (isText ? textFields.computeIfAbsent("F_meas_sigma",
                FMeasSigma::new) : getBinaryColumn("F_meas_sigma"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _phasing_set_refln.F_meas_au in arbitrary units.
     * @return FMeasSigmaAu
     */
    public FMeasSigmaAu getFMeasSigmaAu() {
        return (FMeasSigmaAu) (isText ? textFields.computeIfAbsent("F_meas_sigma_au",
                FMeasSigmaAu::new) : getBinaryColumn("F_meas_sigma_au"));
    }

    /**
     * Miller index h of this reflection in this data set.
     * @return IndexH
     */
    public IndexH getIndexH() {
        return (IndexH) (isText ? textFields.computeIfAbsent("index_h",
                IndexH::new) : getBinaryColumn("index_h"));
    }

    /**
     * Miller index k of this reflection in this data set.
     * @return IndexK
     */
    public IndexK getIndexK() {
        return (IndexK) (isText ? textFields.computeIfAbsent("index_k",
                IndexK::new) : getBinaryColumn("index_k"));
    }

    /**
     * Miller index l of this reflection in this data set.
     * @return IndexL
     */
    public IndexL getIndexL() {
        return (IndexL) (isText ? textFields.computeIfAbsent("index_l",
                IndexL::new) : getBinaryColumn("index_l"));
    }
}
