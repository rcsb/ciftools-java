package org.rcsb.cif.model.phasingmad;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PhasingMAD extends BaseCategory {
    public PhasingMAD(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PhasingMAD(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PhasingMAD(String name) {
        super(name);
    }

    /**
     * A description of special aspects of the MAD phasing.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * A description of the MAD phasing method used to phase
     * this structure.
     * 
     * Note that this is not the computer program used, which is
     * described in the SOFTWARE category, but rather the method
     * itself.
     * 
     * This data item should be used to describe significant
     * methodological options used within the MAD phasing program.
     * @return Method
     */
    public Method getMethod() {
        return (Method) (isText ? textFields.computeIfAbsent("method",
                Method::new) : getBinaryColumn("method"));
    }

    /**
     * _phasing_MAD.pdbx_d_res_low records the lowest resolution
     * for MAD phasing.
     * @return PdbxDResLow
     */
    public PdbxDResLow getPdbxDResLow() {
        return (PdbxDResLow) (isText ? textFields.computeIfAbsent("pdbx_d_res_low",
                PdbxDResLow::new) : getBinaryColumn("pdbx_d_res_low"));
    }

    /**
     * _phasing_MAD.pdbx_d_res_high records the highest resolution
     * for MAD phasing.
     * @return PdbxDResHigh
     */
    public PdbxDResHigh getPdbxDResHigh() {
        return (PdbxDResHigh) (isText ? textFields.computeIfAbsent("pdbx_d_res_high",
                PdbxDResHigh::new) : getBinaryColumn("pdbx_d_res_high"));
    }

    /**
     * _phasing_MAD.pdbx_reflns_acentric records the number of
     * acentric reflections for MAD phasing.
     * @return PdbxReflnsAcentric
     */
    public PdbxReflnsAcentric getPdbxReflnsAcentric() {
        return (PdbxReflnsAcentric) (isText ? textFields.computeIfAbsent("pdbx_reflns_acentric",
                PdbxReflnsAcentric::new) : getBinaryColumn("pdbx_reflns_acentric"));
    }

    /**
     * _phasing_MAD.pdbx_reflns_centric records the number of
     * centric reflections for MAD phasing.
     * @return PdbxReflnsCentric
     */
    public PdbxReflnsCentric getPdbxReflnsCentric() {
        return (PdbxReflnsCentric) (isText ? textFields.computeIfAbsent("pdbx_reflns_centric",
                PdbxReflnsCentric::new) : getBinaryColumn("pdbx_reflns_centric"));
    }

    /**
     * _phasing_MAD.pdbx_reflns records the number of
     * reflections used for MAD phasing.
     * @return PdbxReflns
     */
    public PdbxReflns getPdbxReflns() {
        return (PdbxReflns) (isText ? textFields.computeIfAbsent("pdbx_reflns",
                PdbxReflns::new) : getBinaryColumn("pdbx_reflns"));
    }

    /**
     * _phasing_MAD.pdbx_fom_acentric  records the figure of merit
     * using acentric data for MAD phasing.
     * @return PdbxFomAcentric
     */
    public PdbxFomAcentric getPdbxFomAcentric() {
        return (PdbxFomAcentric) (isText ? textFields.computeIfAbsent("pdbx_fom_acentric",
                PdbxFomAcentric::new) : getBinaryColumn("pdbx_fom_acentric"));
    }

    /**
     * _phasing_MAD.pdbx_fom_centric  records the figure of merit
     * using centric data for MAD phasing.
     * @return PdbxFomCentric
     */
    public PdbxFomCentric getPdbxFomCentric() {
        return (PdbxFomCentric) (isText ? textFields.computeIfAbsent("pdbx_fom_centric",
                PdbxFomCentric::new) : getBinaryColumn("pdbx_fom_centric"));
    }

    /**
     * _phasing_MAD.pdbx_fom records the figure of merit
     * for MAD phasing.
     * @return PdbxFom
     */
    public PdbxFom getPdbxFom() {
        return (PdbxFom) (isText ? textFields.computeIfAbsent("pdbx_fom",
                PdbxFom::new) : getBinaryColumn("pdbx_fom"));
    }

    /**
     * _phasing_MAD.pdbx_R_cullis_centric records R_cullis
     * using centric data for MAD phasing.
     * @return PdbxRCullisCentric
     */
    public PdbxRCullisCentric getPdbxRCullisCentric() {
        return (PdbxRCullisCentric) (isText ? textFields.computeIfAbsent("pdbx_R_cullis_centric",
                PdbxRCullisCentric::new) : getBinaryColumn("pdbx_R_cullis_centric"));
    }

    /**
     * _phasing_MAD.pdbx_R_cullis_acentric records R_cullis
     * using acentric data for MAD phasing.
     * @return PdbxRCullisAcentric
     */
    public PdbxRCullisAcentric getPdbxRCullisAcentric() {
        return (PdbxRCullisAcentric) (isText ? textFields.computeIfAbsent("pdbx_R_cullis_acentric",
                PdbxRCullisAcentric::new) : getBinaryColumn("pdbx_R_cullis_acentric"));
    }

    /**
     * _phasing_MAD.pdbx_R_cullis records R_cullis
     * for MAD phasing.
     * @return PdbxRCullis
     */
    public PdbxRCullis getPdbxRCullis() {
        return (PdbxRCullis) (isText ? textFields.computeIfAbsent("pdbx_R_cullis",
                PdbxRCullis::new) : getBinaryColumn("pdbx_R_cullis"));
    }

    /**
     * _phasing_MAD.pdbx_R_kraut_centric records R_kraut
     * using centric data for MAD phasing.
     * @return PdbxRKrautCentric
     */
    public PdbxRKrautCentric getPdbxRKrautCentric() {
        return (PdbxRKrautCentric) (isText ? textFields.computeIfAbsent("pdbx_R_kraut_centric",
                PdbxRKrautCentric::new) : getBinaryColumn("pdbx_R_kraut_centric"));
    }

    /**
     * _phasing_MAD.pdbx_R_kraut_acentric records R_kraut
     * using acentric data for MAD phasing.
     * @return PdbxRKrautAcentric
     */
    public PdbxRKrautAcentric getPdbxRKrautAcentric() {
        return (PdbxRKrautAcentric) (isText ? textFields.computeIfAbsent("pdbx_R_kraut_acentric",
                PdbxRKrautAcentric::new) : getBinaryColumn("pdbx_R_kraut_acentric"));
    }

    /**
     * _phasing_MAD.pdbx_R_kraut records R_kraut
     * for MAD phasing.
     * @return PdbxRKraut
     */
    public PdbxRKraut getPdbxRKraut() {
        return (PdbxRKraut) (isText ? textFields.computeIfAbsent("pdbx_R_kraut",
                PdbxRKraut::new) : getBinaryColumn("pdbx_R_kraut"));
    }

    /**
     * _phasing_MAD.pdbx_loc_centric records lack of closure
     * using centric data for MAD phasing.
     * @return PdbxLocCentric
     */
    public PdbxLocCentric getPdbxLocCentric() {
        return (PdbxLocCentric) (isText ? textFields.computeIfAbsent("pdbx_loc_centric",
                PdbxLocCentric::new) : getBinaryColumn("pdbx_loc_centric"));
    }

    /**
     * _phasing_MAD.pdbx_loc_acentric records lack of closure
     * using acentric data for MAD phasing.
     * @return PdbxLocAcentric
     */
    public PdbxLocAcentric getPdbxLocAcentric() {
        return (PdbxLocAcentric) (isText ? textFields.computeIfAbsent("pdbx_loc_acentric",
                PdbxLocAcentric::new) : getBinaryColumn("pdbx_loc_acentric"));
    }

    /**
     * _phasing_MAD.pdbx_loc records lack of closure
     * for MAD phasing.
     * @return PdbxLoc
     */
    public PdbxLoc getPdbxLoc() {
        return (PdbxLoc) (isText ? textFields.computeIfAbsent("pdbx_loc",
                PdbxLoc::new) : getBinaryColumn("pdbx_loc"));
    }

    /**
     * _phasing_MAD.pdbx_power_centric records phasing power
     * using centric data for MAD phasing.
     * @return PdbxPowerCentric
     */
    public PdbxPowerCentric getPdbxPowerCentric() {
        return (PdbxPowerCentric) (isText ? textFields.computeIfAbsent("pdbx_power_centric",
                PdbxPowerCentric::new) : getBinaryColumn("pdbx_power_centric"));
    }

    /**
     * _phasing_MAD.pdbx_power_acentric records phasing power
     * using acentric data for MAD phasing.
     * @return PdbxPowerAcentric
     */
    public PdbxPowerAcentric getPdbxPowerAcentric() {
        return (PdbxPowerAcentric) (isText ? textFields.computeIfAbsent("pdbx_power_acentric",
                PdbxPowerAcentric::new) : getBinaryColumn("pdbx_power_acentric"));
    }

    /**
     * _phasing_MAD.pdbx_power records phasing power
     * for MAD phasing.
     * @return PdbxPower
     */
    public PdbxPower getPdbxPower() {
        return (PdbxPower) (isText ? textFields.computeIfAbsent("pdbx_power",
                PdbxPower::new) : getBinaryColumn("pdbx_power"));
    }

    /**
     * _phasing_MAD.pdbx_loc records the number
     * of data sets used for MAD phasing.
     * @return PdbxNumberDataSets
     */
    public PdbxNumberDataSets getPdbxNumberDataSets() {
        return (PdbxNumberDataSets) (isText ? textFields.computeIfAbsent("pdbx_number_data_sets",
                PdbxNumberDataSets::new) : getBinaryColumn("pdbx_number_data_sets"));
    }

    /**
     * _phasing_MAD.pdbx_anom_scat_method records the method
     * used to locate anomalous scatterers for MAD phasing.
     * @return PdbxAnomScatMethod
     */
    public PdbxAnomScatMethod getPdbxAnomScatMethod() {
        return (PdbxAnomScatMethod) (isText ? textFields.computeIfAbsent("pdbx_anom_scat_method",
                PdbxAnomScatMethod::new) : getBinaryColumn("pdbx_anom_scat_method"));
    }
}
