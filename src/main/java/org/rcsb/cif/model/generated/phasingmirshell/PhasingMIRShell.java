package org.rcsb.cif.model.generated.phasingmirshell;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return DResHigh
     */
    public DResHigh getDResHigh() {
        return (DResHigh) (isText ? textFields.computeIfAbsent("d_res_high",
                DResHigh::new) : getBinaryColumn("d_res_high"));
    }

    /**
     * The highest value for the interplanar spacings for the
     * reflection data in this shell. This is called the lowest
     * resolution. Note that the resolution limits of shells in the
     * items _phasing_MIR_shell.d_res_high and
     * _phasing_MIR_shell.d_res_low are independent of the resolution
     * limits of shells in the items _reflns_shell.d_res_high and
     * _reflns_shell.d_res_low.
     * @return DResLow
     */
    public DResLow getDResLow() {
        return (DResLow) (isText ? textFields.computeIfAbsent("d_res_low",
                DResLow::new) : getBinaryColumn("d_res_low"));
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
     * @return FOM
     */
    public FOM getFOM() {
        return (FOM) (isText ? textFields.computeIfAbsent("FOM",
                FOM::new) : getBinaryColumn("FOM"));
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
     * @return FOMAcentric
     */
    public FOMAcentric getFOMAcentric() {
        return (FOMAcentric) (isText ? textFields.computeIfAbsent("FOM_acentric",
                FOMAcentric::new) : getBinaryColumn("FOM_acentric"));
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
     * @return FOMCentric
     */
    public FOMCentric getFOMCentric() {
        return (FOMCentric) (isText ? textFields.computeIfAbsent("FOM_centric",
                FOMCentric::new) : getBinaryColumn("FOM_centric"));
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
     * @return Loc
     */
    public Loc getLoc() {
        return (Loc) (isText ? textFields.computeIfAbsent("loc",
                Loc::new) : getBinaryColumn("loc"));
    }

    /**
     * The mean of the phase values for all reflections in this shell.
     * @return MeanPhase
     */
    public MeanPhase getMeanPhase() {
        return (MeanPhase) (isText ? textFields.computeIfAbsent("mean_phase",
                MeanPhase::new) : getBinaryColumn("mean_phase"));
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
     * @return Power
     */
    public Power getPower() {
        return (Power) (isText ? textFields.computeIfAbsent("power",
                Power::new) : getBinaryColumn("power"));
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
     * & North, A. C. T. (1961). Proc. R. Soc. London Ser. A,
     * 265, 15-38.
     * @return RCullis
     */
    public RCullis getRCullis() {
        return (RCullis) (isText ? textFields.computeIfAbsent("R_cullis",
                RCullis::new) : getBinaryColumn("R_cullis"));
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
     * Ref: Kraut, J., Sieker, L. C., High, D. F. & Freer, S. T.
     * (1962). Proc. Natl Acad. Sci. USA, 48, 1417-1424.
     * @return RKraut
     */
    public RKraut getRKraut() {
        return (RKraut) (isText ? textFields.computeIfAbsent("R_kraut",
                RKraut::new) : getBinaryColumn("R_kraut"));
    }

    /**
     * The number of reflections in this shell.
     * @return Reflns
     */
    public Reflns getReflns() {
        return (Reflns) (isText ? textFields.computeIfAbsent("reflns",
                Reflns::new) : getBinaryColumn("reflns"));
    }

    /**
     * The number of acentric reflections in this shell.
     * @return ReflnsAcentric
     */
    public ReflnsAcentric getReflnsAcentric() {
        return (ReflnsAcentric) (isText ? textFields.computeIfAbsent("reflns_acentric",
                ReflnsAcentric::new) : getBinaryColumn("reflns_acentric"));
    }

    /**
     * The number of anomalous reflections in this shell.
     * @return ReflnsAnomalous
     */
    public ReflnsAnomalous getReflnsAnomalous() {
        return (ReflnsAnomalous) (isText ? textFields.computeIfAbsent("reflns_anomalous",
                ReflnsAnomalous::new) : getBinaryColumn("reflns_anomalous"));
    }

    /**
     * The number of centric reflections in this shell.
     * @return ReflnsCentric
     */
    public ReflnsCentric getReflnsCentric() {
        return (ReflnsCentric) (isText ? textFields.computeIfAbsent("reflns_centric",
                ReflnsCentric::new) : getBinaryColumn("reflns_centric"));
    }

    /**
     * record lack of closure from centric reflection for each shell.
     * @return PdbxLocCentric
     */
    public PdbxLocCentric getPdbxLocCentric() {
        return (PdbxLocCentric) (isText ? textFields.computeIfAbsent("pdbx_loc_centric",
                PdbxLocCentric::new) : getBinaryColumn("pdbx_loc_centric"));
    }

    /**
     * record lack of closure from acentric reflection for each shell.
     * @return PdbxLocAcentric
     */
    public PdbxLocAcentric getPdbxLocAcentric() {
        return (PdbxLocAcentric) (isText ? textFields.computeIfAbsent("pdbx_loc_acentric",
                PdbxLocAcentric::new) : getBinaryColumn("pdbx_loc_acentric"));
    }

    /**
     * record phasing power from centric reflection for each shell.
     * @return PdbxPowerCentric
     */
    public PdbxPowerCentric getPdbxPowerCentric() {
        return (PdbxPowerCentric) (isText ? textFields.computeIfAbsent("pdbx_power_centric",
                PdbxPowerCentric::new) : getBinaryColumn("pdbx_power_centric"));
    }

    /**
     * record phasing power from acentric reflection for each shell.
     * @return PdbxPowerAcentric
     */
    public PdbxPowerAcentric getPdbxPowerAcentric() {
        return (PdbxPowerAcentric) (isText ? textFields.computeIfAbsent("pdbx_power_acentric",
                PdbxPowerAcentric::new) : getBinaryColumn("pdbx_power_acentric"));
    }

    /**
     * record R_Kraut from from centric reflection for each shell.
     * @return PdbxRKrautCentric
     */
    public PdbxRKrautCentric getPdbxRKrautCentric() {
        return (PdbxRKrautCentric) (isText ? textFields.computeIfAbsent("pdbx_R_kraut_centric",
                PdbxRKrautCentric::new) : getBinaryColumn("pdbx_R_kraut_centric"));
    }

    /**
     * record R_kraut from from acentric reflection for each shell.
     * @return PdbxRKrautAcentric
     */
    public PdbxRKrautAcentric getPdbxRKrautAcentric() {
        return (PdbxRKrautAcentric) (isText ? textFields.computeIfAbsent("pdbx_R_kraut_acentric",
                PdbxRKrautAcentric::new) : getBinaryColumn("pdbx_R_kraut_acentric"));
    }

    /**
     * record R_Cullis from from centric reflection for each shell.
     * @return PdbxRCullisCentric
     */
    public PdbxRCullisCentric getPdbxRCullisCentric() {
        return (PdbxRCullisCentric) (isText ? textFields.computeIfAbsent("pdbx_R_cullis_centric",
                PdbxRCullisCentric::new) : getBinaryColumn("pdbx_R_cullis_centric"));
    }

    /**
     * record R_Cullis from from acentric reflection for each shell.
     * @return PdbxRCullisAcentric
     */
    public PdbxRCullisAcentric getPdbxRCullisAcentric() {
        return (PdbxRCullisAcentric) (isText ? textFields.computeIfAbsent("pdbx_R_cullis_acentric",
                PdbxRCullisAcentric::new) : getBinaryColumn("pdbx_R_cullis_acentric"));
    }
}
