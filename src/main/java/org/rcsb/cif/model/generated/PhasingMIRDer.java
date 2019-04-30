package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PHASING_MIR_DER category record details
 * about individual derivatives used in the phasing of the
 * structure when methods involving isomorphous replacement are
 * involved.
 * 
 * A derivative in this context does not necessarily equate with
 * a data set; for instance, the same data set could be used to
 * one resolution limit as an isomorphous scatterer and to a
 * different resolution (and with a different sigma cutoff) as an
 * anomalous scatterer. These would be treated as two distinct
 * derivatives, although both derivatives would point to the same
 * data sets via _phasing_MIR_der.der_set_id and
 * _phasing_MIR_der.native_set_id.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PhasingMIRDer extends BaseCategory {
    public PhasingMIRDer(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PhasingMIRDer(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PhasingMIRDer(String name) {
        super(name);
    }

    /**
     * The lowest value for the interplanar spacings for the
     * reflection data used for this derivative. This is called the
     * highest resolution.
     * @return FloatColumn
     */
    public FloatColumn getDResHigh() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("d_res_high", FloatColumn::new) :
                getBinaryColumn("d_res_high"));
    }

    /**
     * The highest value for  the interplanar spacings for the
     * reflection data used for this derivative. This is called the
     * lowest resolution.
     * @return FloatColumn
     */
    public FloatColumn getDResLow() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("d_res_low", FloatColumn::new) :
                getBinaryColumn("d_res_low"));
    }

    /**
     * The data set that was treated as the derivative in this
     * experiment.
     * 
     * This data item is a pointer to _phasing_set.id in the
     * PHASING_SET category.
     * @return StrColumn
     */
    public StrColumn getDerSetId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("der_set_id", StrColumn::new) :
                getBinaryColumn("der_set_id"));
    }

    /**
     * A description of special aspects of this derivative, its data,
     * its solution or its use in phasing.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The value of _phasing_MIR_der.id must uniquely identify
     * a record in the PHASING_MIR_DER list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The data set that was treated as the native in this
     * experiment.
     * 
     * This data item is a pointer to _phasing_set.id in the
     * PHASING_SET category.
     * @return StrColumn
     */
    public StrColumn getNativeSetId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("native_set_id", StrColumn::new) :
                getBinaryColumn("native_set_id"));
    }

    /**
     * The number of heavy-atom sites in this derivative.
     * @return IntColumn
     */
    public IntColumn getNumberOfSites() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("number_of_sites", IntColumn::new) :
                getBinaryColumn("number_of_sites"));
    }

    /**
     * The mean phasing power P for acentric reflections for this
     * derivative.
     * 
     * sum|Fh~calc~^2^|
     * P = (----------------------------)^1/2^
     * sum|Fph~obs~ - Fph~calc~|^2^
     * 
     * Fph~obs~  = the observed structure-factor amplitude of this
     * derivative
     * Fph~calc~ = the calculated structure-factor amplitude of this
     * derivative
     * Fh~calc~  = the calculated structure-factor amplitude from the
     * heavy-atom model
     * 
     * sum is taken over the specified reflections
     * @return FloatColumn
     */
    public FloatColumn getPowerAcentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("power_acentric", FloatColumn::new) :
                getBinaryColumn("power_acentric"));
    }

    /**
     * The mean phasing power P for centric reflections for this
     * derivative.
     * 
     * sum|Fh~calc~^2^|
     * P = (----------------------------)^1/2^
     * sum|Fph~obs~ - Fph~calc~|^2^
     * 
     * Fph~obs~  = the observed structure-factor amplitude of the
     * derivative
     * Fph~calc~ = the calculated structure-factor amplitude of the
     * derivative
     * Fh~calc~  = the calculated structure-factor amplitude from the
     * heavy-atom model
     * 
     * sum is taken over the specified reflections
     * @return FloatColumn
     */
    public FloatColumn getPowerCentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("power_centric", FloatColumn::new) :
                getBinaryColumn("power_centric"));
    }

    /**
     * Residual factor R~cullis,acen~ for acentric reflections for this
     * derivative.
     * 
     * The Cullis R factor was originally defined only for centric
     * reflections.  It is, however, also a useful statistical
     * measure for acentric reflections, which is how it is used in
     * this data item.
     * 
     * sum| |Fph~obs~ +/- Fp~obs~| - Fh~calc~ |
     * R~cullis,acen~ = ----------------------------------------
     * sum|Fph~obs~ - Fp~obs~|
     * 
     * Fp~obs~  = the observed structure-factor amplitude of the native
     * Fph~obs~ = the observed structure-factor amplitude of the
     * derivative
     * Fh~calc~ = the calculated structure-factor amplitude from the
     * heavy-atom model
     * 
     * sum is taken over the specified reflections
     * 
     * Ref: Cullis, A. F., Muirhead, H., Perutz, M. F., Rossmann, M. G.
     * &amp; North, A. C. T. (1961). Proc. R. Soc. London Ser. A,
     * 265, 15-38.
     * @return FloatColumn
     */
    public FloatColumn getRCullisAcentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("R_cullis_acentric", FloatColumn::new) :
                getBinaryColumn("R_cullis_acentric"));
    }

    /**
     * Residual factor R~cullis,ano~ for anomalous reflections for this
     * derivative.
     * 
     * The Cullis R factor was originally defined only for centric
     * reflections.  It is, however, also a useful statistical
     * measure for anomalous  reflections, which is how it is used in
     * this data item.
     * 
     * This is tabulated for acentric terms.  A value less than 1.0
     * means there is some contribution to the phasing from the
     * anomalous data.
     * 
     * sum |Fph+~obs~Fph-~obs~ - Fh+~calc~ - Fh-~calc~|
     * R~cullis,ano~ = ------------------------------------------------
     * sum|Fph+~obs~ - Fph-~obs~|
     * 
     * Fph+~obs~  = the observed positive Friedel structure-factor
     * amplitude for the derivative
     * Fph-~obs~  = the observed negative Friedel structure-factor
     * amplitude for the derivative
     * 
     * Fh+~calc~  = the calculated positive Friedel structure-factor
     * amplitude from the heavy-atom model
     * Fh-~calc~  = the calculated negative Friedel structure-factor
     * amplitude from the heavy-atom model
     * 
     * sum is taken over the specified reflections
     * 
     * Ref: Cullis, A. F., Muirhead, H., Perutz, M. F., Rossmann, M. G.
     * &amp; North, A. C. T. (1961). Proc. R. Soc.  London Ser. A,
     * 265, 15-38.
     * @return FloatColumn
     */
    public FloatColumn getRCullisAnomalous() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("R_cullis_anomalous", FloatColumn::new) :
                getBinaryColumn("R_cullis_anomalous"));
    }

    /**
     * Residual factor R~cullis~ for centric reflections for this
     * derivative.
     * 
     * sum| |Fph~obs~ +/- Fp~obs~| - Fh~calc~ |
     * R~cullis~ = ----------------------------------------
     * sum|Fph~obs~ - Fp~obs~|
     * 
     * Fp~obs~  = the observed structure-factor amplitude of the native
     * Fph~obs~ = the observed structure-factor amplitude of the
     * derivative
     * Fh~calc~ = the calculated structure-factor amplitude from the
     * heavy-atom model
     * 
     * sum is taken over the specified reflections
     * 
     * Ref: Cullis, A. F., Muirhead, H., Perutz, M. F., Rossmann, M. G.
     * &amp; North, A. C. T. (1961). Proc. R. Soc. London Ser. A,
     * 265, 15-38.
     * @return FloatColumn
     */
    public FloatColumn getRCullisCentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("R_cullis_centric", FloatColumn::new) :
                getBinaryColumn("R_cullis_centric"));
    }

    /**
     * The number of acentric reflections used in phasing for this
     * derivative.
     * @return IntColumn
     */
    public IntColumn getReflnsAcentric() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("reflns_acentric", IntColumn::new) :
                getBinaryColumn("reflns_acentric"));
    }

    /**
     * The number of anomalous reflections used in phasing for this
     * derivative.
     * @return IntColumn
     */
    public IntColumn getReflnsAnomalous() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("reflns_anomalous", IntColumn::new) :
                getBinaryColumn("reflns_anomalous"));
    }

    /**
     * The number of centric reflections used in phasing for this
     * derivative.
     * @return IntColumn
     */
    public IntColumn getReflnsCentric() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("reflns_centric", IntColumn::new) :
                getBinaryColumn("reflns_centric"));
    }

    /**
     * Criteria used to limit the reflections used in the phasing
     * calculations.
     * @return StrColumn
     */
    public StrColumn getReflnsCriteria() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("reflns_criteria", StrColumn::new) :
                getBinaryColumn("reflns_criteria"));
    }

    /**
     * record R_kraut obtained from centric data for each derivative.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRKrautCentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_R_kraut_centric", FloatColumn::new) :
                getBinaryColumn("pdbx_R_kraut_centric"));
    }

    /**
     * record R_kraut obtained from acentric data for each derivative.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRKrautAcentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_R_kraut_acentric", FloatColumn::new) :
                getBinaryColumn("pdbx_R_kraut_acentric"));
    }

    /**
     * record R_kraut obtained from all data data for each derivative.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRKraut() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_R_kraut", FloatColumn::new) :
                getBinaryColumn("pdbx_R_kraut"));
    }

    /**
     * record lack of closure obtained from centric data for
     * each derivative.
     * @return FloatColumn
     */
    public FloatColumn getPdbxLocCentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_loc_centric", FloatColumn::new) :
                getBinaryColumn("pdbx_loc_centric"));
    }

    /**
     * record lack of closure obtained from acentric data for
     * each derivative.
     * @return FloatColumn
     */
    public FloatColumn getPdbxLocAcentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_loc_acentric", FloatColumn::new) :
                getBinaryColumn("pdbx_loc_acentric"));
    }

    /**
     * record lack of closure obtained from all data for
     * each derivative.
     * @return FloatColumn
     */
    public FloatColumn getPdbxLoc() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_loc", FloatColumn::new) :
                getBinaryColumn("pdbx_loc"));
    }

    /**
     * record figure of merit obtained from centric data for
     * each derivative.
     * @return FloatColumn
     */
    public FloatColumn getPdbxFomCentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_fom_centric", FloatColumn::new) :
                getBinaryColumn("pdbx_fom_centric"));
    }

    /**
     * record figure of merit obtained from acentric data for
     * each derivative.
     * @return FloatColumn
     */
    public FloatColumn getPdbxFomAcentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_fom_acentric", FloatColumn::new) :
                getBinaryColumn("pdbx_fom_acentric"));
    }

    /**
     * record figure of merit obtained from all data for
     * each derivative.
     * @return FloatColumn
     */
    public FloatColumn getPdbxFom() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_fom", FloatColumn::new) :
                getBinaryColumn("pdbx_fom"));
    }

    /**
     * record phasing power for each derivative.
     * @return FloatColumn
     */
    public FloatColumn getPdbxPower() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_power", FloatColumn::new) :
                getBinaryColumn("pdbx_power"));
    }

    /**
     * record R_cullis for each derivative.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRCullis() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_R_cullis", FloatColumn::new) :
                getBinaryColumn("pdbx_R_cullis"));
    }

    /**
     * record number of reflections used for each derivative.
     * @return IntColumn
     */
    public IntColumn getPdbxReflns() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_reflns", IntColumn::new) :
                getBinaryColumn("pdbx_reflns"));
    }
}
