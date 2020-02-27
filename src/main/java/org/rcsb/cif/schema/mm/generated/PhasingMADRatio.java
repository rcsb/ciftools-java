package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PHASING_MAD_RATIO category record
 * the ratios of phasing statistics between pairs of data sets
 * in a MAD phasing experiment, in given shells of resolution.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PhasingMADRatio extends BaseCategory {
    public PhasingMADRatio(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PhasingMADRatio(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PhasingMADRatio(String name) {
        super(name);
    }

    /**
     * The lowest value for the interplanar spacings for the
     * reflection data used for the comparison of Bijvoet differences.
     * This is called the highest resolution.
     * @return FloatColumn
     */
    public FloatColumn getDResHigh() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("d_res_high", FloatColumn::new) :
                getBinaryColumn("d_res_high"));
    }

    /**
     * The highest value for the interplanar spacings for the
     * reflection data used for the comparison of Bijvoet differences.
     * This is called the lowest resolution.
     * @return FloatColumn
     */
    public FloatColumn getDResLow() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("d_res_low", FloatColumn::new) :
                getBinaryColumn("d_res_low"));
    }

    /**
     * This data item is a pointer to _phasing_MAD_expt.id in the
     * PHASING_MAD_EXPT category.
     * @return StrColumn
     */
    public StrColumn getExptId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("expt_id", StrColumn::new) :
                getBinaryColumn("expt_id"));
    }

    /**
     * This data item is a pointer to _phasing_MAD_clust.id in
     * the PHASING_MAD_CLUST category.
     * @return StrColumn
     */
    public StrColumn getClustId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("clust_id", StrColumn::new) :
                getBinaryColumn("clust_id"));
    }

    /**
     * The root-mean-square Bijvoet difference at one wavelength for
     * all reflections.
     * @return FloatColumn
     */
    public FloatColumn getRatioOneWl() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("ratio_one_wl", FloatColumn::new) :
                getBinaryColumn("ratio_one_wl"));
    }

    /**
     * The root-mean-square Bijvoet difference at one wavelength for
     * centric reflections. This would be equal to zero for perfect
     * data and thus serves as an estimate of the noise in the
     * anomalous signals.
     * @return FloatColumn
     */
    public FloatColumn getRatioOneWlCentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("ratio_one_wl_centric", FloatColumn::new) :
                getBinaryColumn("ratio_one_wl_centric"));
    }

    /**
     * The root-mean-square dispersive Bijvoet difference between
     * two wavelengths for all reflections.
     * @return FloatColumn
     */
    public FloatColumn getRatioTwoWl() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("ratio_two_wl", FloatColumn::new) :
                getBinaryColumn("ratio_two_wl"));
    }

    /**
     * This data item is a pointer to _phasing_MAD_set.wavelength in
     * the PHASING_MAD_SET category.
     * @return FloatColumn
     */
    public FloatColumn getWavelength1() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("wavelength_1", FloatColumn::new) :
                getBinaryColumn("wavelength_1"));
    }

    /**
     * This data item is a pointer to _phasing_MAD_set.wavelength in
     * the PHASING_MAD_SET category.
     * @return FloatColumn
     */
    public FloatColumn getWavelength2() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("wavelength_2", FloatColumn::new) :
                getBinaryColumn("wavelength_2"));
    }
}
