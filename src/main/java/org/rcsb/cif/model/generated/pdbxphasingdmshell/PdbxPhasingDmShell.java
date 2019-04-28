package org.rcsb.cif.model.generated.pdbxphasingdmshell;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxPhasingDmShell extends BaseCategory {
    public PdbxPhasingDmShell(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxPhasingDmShell(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxPhasingDmShell(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_phasing_dm_shell.d_res_high  identifies high resolution
     * @return DResHigh
     */
    public DResHigh getDResHigh() {
        return (DResHigh) (isText ? textFields.computeIfAbsent("d_res_high",
                DResHigh::new) : getBinaryColumn("d_res_high"));
    }

    /**
     * The value of _pdbx_phasing_dm_shell.d_res_low  identifies low resolution
     * @return DResLow
     */
    public DResLow getDResLow() {
        return (DResLow) (isText ? textFields.computeIfAbsent("d_res_low",
                DResLow::new) : getBinaryColumn("d_res_low"));
    }

    /**
     * The value of _pdbx_phasing_dm_shell.fom_acentric  identifies the figure of merit
     * for acentric data with resolution shells
     * @return FomAcentric
     */
    public FomAcentric getFomAcentric() {
        return (FomAcentric) (isText ? textFields.computeIfAbsent("fom_acentric",
                FomAcentric::new) : getBinaryColumn("fom_acentric"));
    }

    /**
     * The value of _pdbx_phasing_dm_shell.fom_centric  identifies the figure of merit
     * for centric data with resolution shells.
     * @return FomCentric
     */
    public FomCentric getFomCentric() {
        return (FomCentric) (isText ? textFields.computeIfAbsent("fom_centric",
                FomCentric::new) : getBinaryColumn("fom_centric"));
    }

    /**
     * The value of _pdbx_phasing_dm_shell.fom identifies the figure of merit
     * for all the data with resolution shells.
     * @return Fom
     */
    public Fom getFom() {
        return (Fom) (isText ? textFields.computeIfAbsent("fom",
                Fom::new) : getBinaryColumn("fom"));
    }

    /**
     * The value of _pdbx_phasing_dm_shell.reflns_acentric  identifies the number
     * of acentric reflections with resolution shells.
     * @return ReflnsAcentric
     */
    public ReflnsAcentric getReflnsAcentric() {
        return (ReflnsAcentric) (isText ? textFields.computeIfAbsent("reflns_acentric",
                ReflnsAcentric::new) : getBinaryColumn("reflns_acentric"));
    }

    /**
     * The value of _pdbx_phasing_dm_shell.reflns_centric  identifies the number
     * of centric reflections with resolution shells.
     * @return ReflnsCentric
     */
    public ReflnsCentric getReflnsCentric() {
        return (ReflnsCentric) (isText ? textFields.computeIfAbsent("reflns_centric",
                ReflnsCentric::new) : getBinaryColumn("reflns_centric"));
    }

    /**
     * The value of _pdbx_phasing_dm_shell.reflns  identifies the number
     * of centric and acentric reflections with resolution shells.
     * @return Reflns
     */
    public Reflns getReflns() {
        return (Reflns) (isText ? textFields.computeIfAbsent("reflns",
                Reflns::new) : getBinaryColumn("reflns"));
    }

    /**
     * The value of _pdbx_phasing_dm_shell.delta_phi_initial  identifies phase difference
     * before density modification with resolution shells.
     * @return DeltaPhiInitial
     */
    public DeltaPhiInitial getDeltaPhiInitial() {
        return (DeltaPhiInitial) (isText ? textFields.computeIfAbsent("delta_phi_initial",
                DeltaPhiInitial::new) : getBinaryColumn("delta_phi_initial"));
    }

    /**
     * The value of _pdbx_phasing_dm_shell.delta_phi_final  identifies phase difference
     * after density modification with resolution shells.
     * @return DeltaPhiFinal
     */
    public DeltaPhiFinal getDeltaPhiFinal() {
        return (DeltaPhiFinal) (isText ? textFields.computeIfAbsent("delta_phi_final",
                DeltaPhiFinal::new) : getBinaryColumn("delta_phi_final"));
    }
}
