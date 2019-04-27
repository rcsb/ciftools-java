package org.rcsb.cif.model.phasingmirdershell;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return DResHigh
     */
    public DResHigh getDResHigh() {
        return (DResHigh) (isText ? textFields.computeIfAbsent("d_res_high",
                DResHigh::new) : getBinaryColumn("d_res_high"));
    }

    /**
     * The highest value for the interplanar spacings for the
     * reflection data for this derivative in this shell. This is called
     * the lowest resolution.
     * @return DResLow
     */
    public DResLow getDResLow() {
        return (DResLow) (isText ? textFields.computeIfAbsent("d_res_low",
                DResLow::new) : getBinaryColumn("d_res_low"));
    }

    /**
     * This data item is a pointer to _phasing_MIR_der.id in the
     * PHASING_MIR_DER category.
     * @return DerId
     */
    public DerId getDerId() {
        return (DerId) (isText ? textFields.computeIfAbsent("der_id",
                DerId::new) : getBinaryColumn("der_id"));
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
     * @return Fom
     */
    public Fom getFom() {
        return (Fom) (isText ? textFields.computeIfAbsent("fom",
                Fom::new) : getBinaryColumn("fom"));
    }

    /**
     * The mean heavy-atom amplitude for reflections for this
     * derivative in this shell.
     * @return HaAmpl
     */
    public HaAmpl getHaAmpl() {
        return (HaAmpl) (isText ? textFields.computeIfAbsent("ha_ampl",
                HaAmpl::new) : getBinaryColumn("ha_ampl"));
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
     * @return Loc
     */
    public Loc getLoc() {
        return (Loc) (isText ? textFields.computeIfAbsent("loc",
                Loc::new) : getBinaryColumn("loc"));
    }

    /**
     * The mean of the phase values for reflections for this
     * derivative in this shell.
     * @return Phase
     */
    public Phase getPhase() {
        return (Phase) (isText ? textFields.computeIfAbsent("phase",
                Phase::new) : getBinaryColumn("phase"));
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
     * @return Power
     */
    public Power getPower() {
        return (Power) (isText ? textFields.computeIfAbsent("power",
                Power::new) : getBinaryColumn("power"));
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
     * & North, A. C. T. (1961). Proc. R. Soc. London Ser. A,
     * 265, 15-38.
     * @return RCullis
     */
    public RCullis getRCullis() {
        return (RCullis) (isText ? textFields.computeIfAbsent("R_cullis",
                RCullis::new) : getBinaryColumn("R_cullis"));
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
     * record R Cullis obtained from centric data for each
     * derivative, but broken into resolution shells
     * @return PdbxRCullisCentric
     */
    public PdbxRCullisCentric getPdbxRCullisCentric() {
        return (PdbxRCullisCentric) (isText ? textFields.computeIfAbsent("pdbx_R_cullis_centric",
                PdbxRCullisCentric::new) : getBinaryColumn("pdbx_R_cullis_centric"));
    }

    /**
     * record R Cullis obtained from acentric data for each
     * derivative, but broken into resolution shells
     * @return PdbxRCullisAcentric
     */
    public PdbxRCullisAcentric getPdbxRCullisAcentric() {
        return (PdbxRCullisAcentric) (isText ? textFields.computeIfAbsent("pdbx_R_cullis_acentric",
                PdbxRCullisAcentric::new) : getBinaryColumn("pdbx_R_cullis_acentric"));
    }

    /**
     * record R Kraut obtained from centric data for each
     * derivative, but broken into resolution shells
     * @return PdbxRKrautCentric
     */
    public PdbxRKrautCentric getPdbxRKrautCentric() {
        return (PdbxRKrautCentric) (isText ? textFields.computeIfAbsent("pdbx_R_kraut_centric",
                PdbxRKrautCentric::new) : getBinaryColumn("pdbx_R_kraut_centric"));
    }

    /**
     * record R Kraut obtained from acentric data for each
     * derivative, but broken into resolution shells
     * @return PdbxRKrautAcentric
     */
    public PdbxRKrautAcentric getPdbxRKrautAcentric() {
        return (PdbxRKrautAcentric) (isText ? textFields.computeIfAbsent("pdbx_R_kraut_acentric",
                PdbxRKrautAcentric::new) : getBinaryColumn("pdbx_R_kraut_acentric"));
    }

    /**
     * record lack of closure obtained from centric data for each
     * derivative, but broken into resolution shells
     * @return PdbxLocCentric
     */
    public PdbxLocCentric getPdbxLocCentric() {
        return (PdbxLocCentric) (isText ? textFields.computeIfAbsent("pdbx_loc_centric",
                PdbxLocCentric::new) : getBinaryColumn("pdbx_loc_centric"));
    }

    /**
     * record lack of closure obtained from acentric data for each
     * derivative, but broken into resolution shells
     * @return PdbxLocAcentric
     */
    public PdbxLocAcentric getPdbxLocAcentric() {
        return (PdbxLocAcentric) (isText ? textFields.computeIfAbsent("pdbx_loc_acentric",
                PdbxLocAcentric::new) : getBinaryColumn("pdbx_loc_acentric"));
    }

    /**
     * record phasing power obtained from centric data for each
     * derivative, but broken into resolution shells
     * @return PdbxPowerCentric
     */
    public PdbxPowerCentric getPdbxPowerCentric() {
        return (PdbxPowerCentric) (isText ? textFields.computeIfAbsent("pdbx_power_centric",
                PdbxPowerCentric::new) : getBinaryColumn("pdbx_power_centric"));
    }

    /**
     * record phasing power obtained from acentric data for each
     * derivative, but broken into resolution shells
     * @return PdbxPowerAcentric
     */
    public PdbxPowerAcentric getPdbxPowerAcentric() {
        return (PdbxPowerAcentric) (isText ? textFields.computeIfAbsent("pdbx_power_acentric",
                PdbxPowerAcentric::new) : getBinaryColumn("pdbx_power_acentric"));
    }

    /**
     * record figure of merit obtained from centric data for each
     * derivative, but broken into resolution shells
     * @return PdbxFomCentric
     */
    public PdbxFomCentric getPdbxFomCentric() {
        return (PdbxFomCentric) (isText ? textFields.computeIfAbsent("pdbx_fom_centric",
                PdbxFomCentric::new) : getBinaryColumn("pdbx_fom_centric"));
    }

    /**
     * record figure of merit obtained from acentric data for each
     * derivative, but broken into resolution shells
     * @return PdbxFomAcentric
     */
    public PdbxFomAcentric getPdbxFomAcentric() {
        return (PdbxFomAcentric) (isText ? textFields.computeIfAbsent("pdbx_fom_acentric",
                PdbxFomAcentric::new) : getBinaryColumn("pdbx_fom_acentric"));
    }

    /**
     * record  number of centric reflections used for phasing for each
     * derivative, but broken into resolution shells
     * @return PdbxReflnsCentric
     */
    public PdbxReflnsCentric getPdbxReflnsCentric() {
        return (PdbxReflnsCentric) (isText ? textFields.computeIfAbsent("pdbx_reflns_centric",
                PdbxReflnsCentric::new) : getBinaryColumn("pdbx_reflns_centric"));
    }

    /**
     * record  number of acentric reflections used for phasing for each
     * derivative, but broken into resolution shells
     * @return PdbxReflnsAcentric
     */
    public PdbxReflnsAcentric getPdbxReflnsAcentric() {
        return (PdbxReflnsAcentric) (isText ? textFields.computeIfAbsent("pdbx_reflns_acentric",
                PdbxReflnsAcentric::new) : getBinaryColumn("pdbx_reflns_acentric"));
    }
}
