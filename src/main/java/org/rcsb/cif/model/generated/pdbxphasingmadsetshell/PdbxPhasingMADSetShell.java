package org.rcsb.cif.model.generated.pdbxphasingmadsetshell;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxPhasingMADSetShell extends BaseCategory {
    public PdbxPhasingMADSetShell(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxPhasingMADSetShell(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxPhasingMADSetShell(String name) {
        super(name);
    }

    /**
     * _pdbx_phasing_MAD_set_shell.id records phase set name
     * for MAD phasing.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * _pdbx_phasing_MAD_set_shell.d_res_low records the lowerest
     * resolution for phasing set.
     * @return DResLow
     */
    public DResLow getDResLow() {
        return (DResLow) (isText ? textFields.computeIfAbsent("d_res_low",
                DResLow::new) : getBinaryColumn("d_res_low"));
    }

    /**
     * _pdbx_phasing_MAD_set_shell.d_res_high records the highest resolution
     * for the phasing set.
     * @return DResHigh
     */
    public DResHigh getDResHigh() {
        return (DResHigh) (isText ? textFields.computeIfAbsent("d_res_high",
                DResHigh::new) : getBinaryColumn("d_res_high"));
    }

    /**
     * _pdbx_phasing_MAD_set_shell.reflns_acentric records the number of
     * acentric reflections for MAD phasing.
     * @return ReflnsAcentric
     */
    public ReflnsAcentric getReflnsAcentric() {
        return (ReflnsAcentric) (isText ? textFields.computeIfAbsent("reflns_acentric",
                ReflnsAcentric::new) : getBinaryColumn("reflns_acentric"));
    }

    /**
     * _pdbx_phasing_MAD_set_shell.reflns_centric records the number of
     * centric reflections for MAD phasing.
     * @return ReflnsCentric
     */
    public ReflnsCentric getReflnsCentric() {
        return (ReflnsCentric) (isText ? textFields.computeIfAbsent("reflns_centric",
                ReflnsCentric::new) : getBinaryColumn("reflns_centric"));
    }

    /**
     * _pdbx_phasing_MAD_set_shell.reflns records the number of
     * reflections used for MAD phasing.
     * @return Reflns
     */
    public Reflns getReflns() {
        return (Reflns) (isText ? textFields.computeIfAbsent("reflns",
                Reflns::new) : getBinaryColumn("reflns"));
    }

    /**
     * _pdbx_phasing_MAD_set_shell.fom_acentric  records the figure of merit
     * using acentric data for MAD phasing.
     * @return FomAcentric
     */
    public FomAcentric getFomAcentric() {
        return (FomAcentric) (isText ? textFields.computeIfAbsent("fom_acentric",
                FomAcentric::new) : getBinaryColumn("fom_acentric"));
    }

    /**
     * _pdbx_phasing_MAD_set_shell.fom_centric  records the figure of merit
     * using centric data for MAD phasing.
     * @return FomCentric
     */
    public FomCentric getFomCentric() {
        return (FomCentric) (isText ? textFields.computeIfAbsent("fom_centric",
                FomCentric::new) : getBinaryColumn("fom_centric"));
    }

    /**
     * _pdbx_phasing_MAD_set_shell.fom records the figure of merit
     * for MAD phasing.
     * @return Fom
     */
    public Fom getFom() {
        return (Fom) (isText ? textFields.computeIfAbsent("fom",
                Fom::new) : getBinaryColumn("fom"));
    }

    /**
     * _pdbx_phasing_MAD_set_shell.R_cullis_centric records R_cullis
     * using centric data for MAD phasing.
     * @return RCullisCentric
     */
    public RCullisCentric getRCullisCentric() {
        return (RCullisCentric) (isText ? textFields.computeIfAbsent("R_cullis_centric",
                RCullisCentric::new) : getBinaryColumn("R_cullis_centric"));
    }

    /**
     * _pdbx_phasing_MAD_set_shell.R_cullis_acentric records R_cullis
     * using acentric data for MAD phasing.
     * @return RCullisAcentric
     */
    public RCullisAcentric getRCullisAcentric() {
        return (RCullisAcentric) (isText ? textFields.computeIfAbsent("R_cullis_acentric",
                RCullisAcentric::new) : getBinaryColumn("R_cullis_acentric"));
    }

    /**
     * _pdbx_phasing_MAD_set_shell.R_cullis records R_cullis
     * for MAD phasing.
     * @return RCullis
     */
    public RCullis getRCullis() {
        return (RCullis) (isText ? textFields.computeIfAbsent("R_cullis",
                RCullis::new) : getBinaryColumn("R_cullis"));
    }

    /**
     * _pdbx_phasing_MAD_set_shell.R_kraut_centric records R_kraut
     * using centric data for MAD phasing.
     * @return RKrautCentric
     */
    public RKrautCentric getRKrautCentric() {
        return (RKrautCentric) (isText ? textFields.computeIfAbsent("R_kraut_centric",
                RKrautCentric::new) : getBinaryColumn("R_kraut_centric"));
    }

    /**
     * _pdbx_phasing_MAD_set_shell.R_kraut_acentric records R_kraut
     * using acentric data for MAD phasing.
     * @return RKrautAcentric
     */
    public RKrautAcentric getRKrautAcentric() {
        return (RKrautAcentric) (isText ? textFields.computeIfAbsent("R_kraut_acentric",
                RKrautAcentric::new) : getBinaryColumn("R_kraut_acentric"));
    }

    /**
     * _pdbx_phasing_MAD_set_shell.R_kraut records R_kraut
     * for MAD phasing.
     * @return RKraut
     */
    public RKraut getRKraut() {
        return (RKraut) (isText ? textFields.computeIfAbsent("R_kraut",
                RKraut::new) : getBinaryColumn("R_kraut"));
    }

    /**
     * _pdbx_phasing_MAD_set_shell.loc_centric records lack of closure
     * using centric data for MAD phasing.
     * @return LocCentric
     */
    public LocCentric getLocCentric() {
        return (LocCentric) (isText ? textFields.computeIfAbsent("loc_centric",
                LocCentric::new) : getBinaryColumn("loc_centric"));
    }

    /**
     * _pdbx_phasing_MAD_set_shell.loc_acentric records lack of closure
     * using acentric data for MAD phasing.
     * @return LocAcentric
     */
    public LocAcentric getLocAcentric() {
        return (LocAcentric) (isText ? textFields.computeIfAbsent("loc_acentric",
                LocAcentric::new) : getBinaryColumn("loc_acentric"));
    }

    /**
     * _pdbx_phasing_MAD_set_shell.loc records lack of closure
     * for MAD phasing.
     * @return Loc
     */
    public Loc getLoc() {
        return (Loc) (isText ? textFields.computeIfAbsent("loc",
                Loc::new) : getBinaryColumn("loc"));
    }

    /**
     * _pdbx_phasing_MAD_set_shell.power_centric records phasing power
     * using centric data for MAD phasing.
     * @return PowerCentric
     */
    public PowerCentric getPowerCentric() {
        return (PowerCentric) (isText ? textFields.computeIfAbsent("power_centric",
                PowerCentric::new) : getBinaryColumn("power_centric"));
    }

    /**
     * _pdbx_phasing_MAD_set_shell.power_acentric records phasing power
     * using acentric data for MAD phasing.
     * @return PowerAcentric
     */
    public PowerAcentric getPowerAcentric() {
        return (PowerAcentric) (isText ? textFields.computeIfAbsent("power_acentric",
                PowerAcentric::new) : getBinaryColumn("power_acentric"));
    }

    /**
     * _pdbx_phasing_MAD_set_shell.power records phasing power
     * for MAD phasing.
     * @return Power
     */
    public Power getPower() {
        return (Power) (isText ? textFields.computeIfAbsent("power",
                Power::new) : getBinaryColumn("power"));
    }
}
