package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PHASING_MIR_DER_SHELL category record
 * statistics, broken down into shells of resolution, for an MIR
 * phasing experiment.
 * 
 * This list may contain information from a number of different
 * derivatives; _phasing_MIR_der_shell.der_id indicates to which
 * derivative a given record corresponds. (A derivative in this
 * context does not necessarily equate with a data set; see the
 * definition of the PHASING_MIR_DER category for a
 * discussion of the meaning of derivative.)
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PhasingMIRDerShell extends BaseCategory {
    public PhasingMIRDerShell(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PhasingMIRDerShell(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PhasingMIRDerShell(String name) {
        super(name);
    }

    /**
     * The lowest value  for the interplanar spacings for the
     * reflection data for this derivative in this shell. This is called
     * the highest resolution.
     * @return FloatColumn
     */
    public FloatColumn getDResHigh() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("d_res_high", FloatColumn::new) :
                getBinaryColumn("d_res_high"));
    }

    /**
     * The highest value for the interplanar spacings for the
     * reflection data for this derivative in this shell. This is called
     * the lowest resolution.
     * @return FloatColumn
     */
    public FloatColumn getDResLow() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("d_res_low", FloatColumn::new) :
                getBinaryColumn("d_res_low"));
    }

    /**
     * This data item is a pointer to _phasing_MIR_der.id in the
     * PHASING_MIR_DER category.
     * @return StrColumn
     */
    public StrColumn getDerId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("der_id", StrColumn::new) :
                getBinaryColumn("der_id"));
    }

    /**
     * The mean value of the figure of merit m for reflections for this
     * derivative in this shell.
     * 
     * int P~alpha~ exp(i*alpha) dalpha
     * m = --------------------------------
     * int P~alpha~ dalpha
     * 
     * P~alpha~ = the probability that the phase angle alpha is correct
     * 
     * int is taken over the range alpha = 0 to 2 pi.
     * @return FloatColumn
     */
    public FloatColumn getFom() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("fom", FloatColumn::new) :
                getBinaryColumn("fom"));
    }

    /**
     * The mean heavy-atom amplitude for reflections for this
     * derivative in this shell.
     * @return FloatColumn
     */
    public FloatColumn getHaAmpl() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("ha_ampl", FloatColumn::new) :
                getBinaryColumn("ha_ampl"));
    }

    /**
     * The mean lack-of-closure error loc for reflections for this
     * derivative in this shell.
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
     * The mean of the phase values for reflections for this
     * derivative in this shell.
     * @return FloatColumn
     */
    public FloatColumn getPhase() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("phase", FloatColumn::new) :
                getBinaryColumn("phase"));
    }

    /**
     * The mean phasing power P for reflections for this derivative
     * in this shell.
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
     * Residual factor R~cullis~ for centric reflections for this
     * derivative in this shell.
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
     * Residual factor R~kraut~ for general reflections for this
     * derivative in this shell.
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
     * record R Cullis obtained from centric data for each
     * derivative, but broken into resolution shells
     * @return FloatColumn
     */
    public FloatColumn getPdbxRCullisCentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_R_cullis_centric", FloatColumn::new) :
                getBinaryColumn("pdbx_R_cullis_centric"));
    }

    /**
     * record R Cullis obtained from acentric data for each
     * derivative, but broken into resolution shells
     * @return FloatColumn
     */
    public FloatColumn getPdbxRCullisAcentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_R_cullis_acentric", FloatColumn::new) :
                getBinaryColumn("pdbx_R_cullis_acentric"));
    }

    /**
     * record R Kraut obtained from centric data for each
     * derivative, but broken into resolution shells
     * @return FloatColumn
     */
    public FloatColumn getPdbxRKrautCentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_R_kraut_centric", FloatColumn::new) :
                getBinaryColumn("pdbx_R_kraut_centric"));
    }

    /**
     * record R Kraut obtained from acentric data for each
     * derivative, but broken into resolution shells
     * @return FloatColumn
     */
    public FloatColumn getPdbxRKrautAcentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_R_kraut_acentric", FloatColumn::new) :
                getBinaryColumn("pdbx_R_kraut_acentric"));
    }

    /**
     * record lack of closure obtained from centric data for each
     * derivative, but broken into resolution shells
     * @return FloatColumn
     */
    public FloatColumn getPdbxLocCentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_loc_centric", FloatColumn::new) :
                getBinaryColumn("pdbx_loc_centric"));
    }

    /**
     * record lack of closure obtained from acentric data for each
     * derivative, but broken into resolution shells
     * @return FloatColumn
     */
    public FloatColumn getPdbxLocAcentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_loc_acentric", FloatColumn::new) :
                getBinaryColumn("pdbx_loc_acentric"));
    }

    /**
     * record phasing power obtained from centric data for each
     * derivative, but broken into resolution shells
     * @return FloatColumn
     */
    public FloatColumn getPdbxPowerCentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_power_centric", FloatColumn::new) :
                getBinaryColumn("pdbx_power_centric"));
    }

    /**
     * record phasing power obtained from acentric data for each
     * derivative, but broken into resolution shells
     * @return FloatColumn
     */
    public FloatColumn getPdbxPowerAcentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_power_acentric", FloatColumn::new) :
                getBinaryColumn("pdbx_power_acentric"));
    }

    /**
     * record figure of merit obtained from centric data for each
     * derivative, but broken into resolution shells
     * @return FloatColumn
     */
    public FloatColumn getPdbxFomCentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_fom_centric", FloatColumn::new) :
                getBinaryColumn("pdbx_fom_centric"));
    }

    /**
     * record figure of merit obtained from acentric data for each
     * derivative, but broken into resolution shells
     * @return FloatColumn
     */
    public FloatColumn getPdbxFomAcentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_fom_acentric", FloatColumn::new) :
                getBinaryColumn("pdbx_fom_acentric"));
    }

    /**
     * record  number of centric reflections used for phasing for each
     * derivative, but broken into resolution shells
     * @return FloatColumn
     */
    public FloatColumn getPdbxReflnsCentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_reflns_centric", FloatColumn::new) :
                getBinaryColumn("pdbx_reflns_centric"));
    }

    /**
     * record  number of acentric reflections used for phasing for each
     * derivative, but broken into resolution shells
     * @return IntColumn
     */
    public IntColumn getPdbxReflnsAcentric() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_reflns_acentric", IntColumn::new) :
                getBinaryColumn("pdbx_reflns_acentric"));
    }
}
