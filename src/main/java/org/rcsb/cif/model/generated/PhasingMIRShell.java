package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PHASING_MIR_SHELL category record statistics
 * for an isomorphous replacement phasing experiment.broken
 * down into shells of resolution.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PhasingMIRShell extends BaseCategory {
    public PhasingMIRShell(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PhasingMIRShell(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PhasingMIRShell(String name) {
        super(name);
    }

    /**
     * The lowest value for the interplanar spacings for the
     * reflection data in this shell. This is called the highest
     * resolution. Note that the resolution limits of shells in
     * the items _phasing_MIR_shell.d_res_high and
     * _phasing_MIR_shell.d_res_low are independent of the resolution
     * limits of shells in the items _reflns_shell.d_res_high and
     * _reflns_shell.d_res_low.
     * @return FloatColumn
     */
    public FloatColumn getDResHigh() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("d_res_high", FloatColumn::new) :
                getBinaryColumn("d_res_high"));
    }

    /**
     * The highest value for the interplanar spacings for the
     * reflection data in this shell. This is called the lowest
     * resolution. Note that the resolution limits of shells in the
     * items _phasing_MIR_shell.d_res_high and
     * _phasing_MIR_shell.d_res_low are independent of the resolution
     * limits of shells in the items _reflns_shell.d_res_high and
     * _reflns_shell.d_res_low.
     * @return FloatColumn
     */
    public FloatColumn getDResLow() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("d_res_low", FloatColumn::new) :
                getBinaryColumn("d_res_low"));
    }

    /**
     * The mean value of the figure of merit m for reflections in this
     * shell.
     * 
     * int P~alpha~ exp(i*alpha) dalpha
     * m = --------------------------------
     * int P~alpha~ dalpha
     * 
     * P~alpha~ = the probability that the phase angle alpha is correct
     * 
     * the integral is taken over the range alpha = 0 to 2 pi.
     * @return FloatColumn
     */
    public FloatColumn getFOM() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("FOM", FloatColumn::new) :
                getBinaryColumn("FOM"));
    }

    /**
     * The mean value of the figure of merit m for acentric reflections
     * in this shell.
     * 
     * int P~alpha~ exp(i*alpha) dalpha
     * m = --------------------------------
     * int P~alpha~ dalpha
     * 
     * P~a~ = the probability that the phase angle a is correct
     * 
     * the integral is taken over the range alpha = 0 to 2 pi.
     * @return FloatColumn
     */
    public FloatColumn getFOMAcentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("FOM_acentric", FloatColumn::new) :
                getBinaryColumn("FOM_acentric"));
    }

    /**
     * The mean value of the figure of merit m for centric reflections
     * in this shell.
     * 
     * int P~alpha~ exp(i*alpha) dalpha
     * m = --------------------------------
     * int P~alpha~ dalpha
     * 
     * P~a~ = the probability that the phase angle a is correct
     * 
     * the integral is taken over the range alpha = 0 to 2 pi.
     * @return FloatColumn
     */
    public FloatColumn getFOMCentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("FOM_centric", FloatColumn::new) :
                getBinaryColumn("FOM_centric"));
    }

    /**
     * The mean lack-of-closure error loc for reflections in this shell.
     * 
     * loc = sum|Fph~obs~ - Fph~calc~|
     * 
     * Fph~obs~  = the observed structure-factor amplitude of the
     * derivative
     * Fph~calc~ = the calculated structure-factor amplitude of the
     * derivative
     * 
     * sum is taken over the specified reflections
     * @return FloatColumn
     */
    public FloatColumn getLoc() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("loc", FloatColumn::new) :
                getBinaryColumn("loc"));
    }

    /**
     * The mean of the phase values for all reflections in this shell.
     * @return FloatColumn
     */
    public FloatColumn getMeanPhase() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("mean_phase", FloatColumn::new) :
                getBinaryColumn("mean_phase"));
    }

    /**
     * The mean phasing power P for reflections in this shell.
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
    public FloatColumn getPower() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("power", FloatColumn::new) :
                getBinaryColumn("power"));
    }

    /**
     * Residual factor R~cullis~ for centric reflections in this shell.
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
    public FloatColumn getRCullis() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("R_cullis", FloatColumn::new) :
                getBinaryColumn("R_cullis"));
    }

    /**
     * Residual factor R~kraut~ for general reflections in this shell.
     * 
     * sum|Fph~obs~ - Fph~calc~|
     * R~kraut~ = -------------------------
     * sum|Fph~obs~|
     * 
     * Fph~obs~  = the observed structure-factor amplitude of the
     * derivative
     * Fph~calc~ = the calculated structure-factor amplitude of the
     * derivative
     * 
     * sum is taken over the specified reflections
     * 
     * Ref: Kraut, J., Sieker, L. C., High, D. F. &amp; Freer, S. T.
     * (1962). Proc. Natl Acad. Sci. USA, 48, 1417-1424.
     * @return FloatColumn
     */
    public FloatColumn getRKraut() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("R_kraut", FloatColumn::new) :
                getBinaryColumn("R_kraut"));
    }

    /**
     * The number of reflections in this shell.
     * @return IntColumn
     */
    public IntColumn getReflns() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("reflns", IntColumn::new) :
                getBinaryColumn("reflns"));
    }

    /**
     * The number of acentric reflections in this shell.
     * @return IntColumn
     */
    public IntColumn getReflnsAcentric() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("reflns_acentric", IntColumn::new) :
                getBinaryColumn("reflns_acentric"));
    }

    /**
     * The number of anomalous reflections in this shell.
     * @return IntColumn
     */
    public IntColumn getReflnsAnomalous() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("reflns_anomalous", IntColumn::new) :
                getBinaryColumn("reflns_anomalous"));
    }

    /**
     * The number of centric reflections in this shell.
     * @return IntColumn
     */
    public IntColumn getReflnsCentric() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("reflns_centric", IntColumn::new) :
                getBinaryColumn("reflns_centric"));
    }

    /**
     * record lack of closure from centric reflection for each shell.
     * @return FloatColumn
     */
    public FloatColumn getPdbxLocCentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_loc_centric", FloatColumn::new) :
                getBinaryColumn("pdbx_loc_centric"));
    }

    /**
     * record lack of closure from acentric reflection for each shell.
     * @return FloatColumn
     */
    public FloatColumn getPdbxLocAcentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_loc_acentric", FloatColumn::new) :
                getBinaryColumn("pdbx_loc_acentric"));
    }

    /**
     * record phasing power from centric reflection for each shell.
     * @return FloatColumn
     */
    public FloatColumn getPdbxPowerCentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_power_centric", FloatColumn::new) :
                getBinaryColumn("pdbx_power_centric"));
    }

    /**
     * record phasing power from acentric reflection for each shell.
     * @return FloatColumn
     */
    public FloatColumn getPdbxPowerAcentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_power_acentric", FloatColumn::new) :
                getBinaryColumn("pdbx_power_acentric"));
    }

    /**
     * record R_Kraut from from centric reflection for each shell.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRKrautCentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_R_kraut_centric", FloatColumn::new) :
                getBinaryColumn("pdbx_R_kraut_centric"));
    }

    /**
     * record R_kraut from from acentric reflection for each shell.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRKrautAcentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_R_kraut_acentric", FloatColumn::new) :
                getBinaryColumn("pdbx_R_kraut_acentric"));
    }

    /**
     * record R_Cullis from from centric reflection for each shell.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRCullisCentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_R_cullis_centric", FloatColumn::new) :
                getBinaryColumn("pdbx_R_cullis_centric"));
    }

    /**
     * record R_Cullis from from acentric reflection for each shell.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRCullisAcentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_R_cullis_acentric", FloatColumn::new) :
                getBinaryColumn("pdbx_R_cullis_acentric"));
    }
}
