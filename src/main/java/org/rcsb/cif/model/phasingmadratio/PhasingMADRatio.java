package org.rcsb.cif.model.phasingmadratio;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return DResHigh
     */
    public DResHigh getDResHigh() {
        return (DResHigh) (isText ? textFields.computeIfAbsent("d_res_high",
                DResHigh::new) : getBinaryColumn("d_res_high"));
    }

    /**
     * The highest value for the interplanar spacings for the
     * reflection data used for the comparison of Bijvoet differences.
     * This is called the lowest resolution.
     * @return DResLow
     */
    public DResLow getDResLow() {
        return (DResLow) (isText ? textFields.computeIfAbsent("d_res_low",
                DResLow::new) : getBinaryColumn("d_res_low"));
    }

    /**
     * This data item is a pointer to _phasing_MAD_expt.id in the
     * PHASING_MAD_EXPT category.
     * @return ExptId
     */
    public ExptId getExptId() {
        return (ExptId) (isText ? textFields.computeIfAbsent("expt_id",
                ExptId::new) : getBinaryColumn("expt_id"));
    }

    /**
     * This data item is a pointer to _phasing_MAD_clust.id in
     * the PHASING_MAD_CLUST category.
     * @return ClustId
     */
    public ClustId getClustId() {
        return (ClustId) (isText ? textFields.computeIfAbsent("clust_id",
                ClustId::new) : getBinaryColumn("clust_id"));
    }

    /**
     * The root-mean-square Bijvoet difference at one wavelength for
     * all reflections.
     * @return RatioOneWl
     */
    public RatioOneWl getRatioOneWl() {
        return (RatioOneWl) (isText ? textFields.computeIfAbsent("ratio_one_wl",
                RatioOneWl::new) : getBinaryColumn("ratio_one_wl"));
    }

    /**
     * The root-mean-square Bijvoet difference at one wavelength for
     * centric reflections. This would be equal to zero for perfect
     * data and thus serves as an estimate of the noise in the
     * anomalous signals.
     * @return RatioOneWlCentric
     */
    public RatioOneWlCentric getRatioOneWlCentric() {
        return (RatioOneWlCentric) (isText ? textFields.computeIfAbsent("ratio_one_wl_centric",
                RatioOneWlCentric::new) : getBinaryColumn("ratio_one_wl_centric"));
    }

    /**
     * The root-mean-square dispersive Bijvoet difference between
     * two wavelengths for all reflections.
     * @return RatioTwoWl
     */
    public RatioTwoWl getRatioTwoWl() {
        return (RatioTwoWl) (isText ? textFields.computeIfAbsent("ratio_two_wl",
                RatioTwoWl::new) : getBinaryColumn("ratio_two_wl"));
    }

    /**
     * This data item is a pointer to _phasing_MAD_set.wavelength in
     * the PHASING_MAD_SET category.
     * @return Wavelength1
     */
    public Wavelength1 getWavelength1() {
        return (Wavelength1) (isText ? textFields.computeIfAbsent("wavelength_1",
                Wavelength1::new) : getBinaryColumn("wavelength_1"));
    }

    /**
     * This data item is a pointer to _phasing_MAD_set.wavelength in
     * the PHASING_MAD_SET category.
     * @return Wavelength2
     */
    public Wavelength2 getWavelength2() {
        return (Wavelength2) (isText ? textFields.computeIfAbsent("wavelength_2",
                Wavelength2::new) : getBinaryColumn("wavelength_2"));
    }
}
