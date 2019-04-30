package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PHASING_MAD category record details about
 * the phasing of the structure where methods involving
 * multiple-wavelength anomalous-dispersion techniques are involved.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEntryId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("entry_id", SingleRowStrColumn::new) :
                getBinaryColumn("entry_id"));
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getMethod() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("method", SingleRowStrColumn::new) :
                getBinaryColumn("method"));
    }

    /**
     * _phasing_MAD.pdbx_d_res_low records the lowest resolution
     * for MAD phasing.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxDResLow() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_d_res_low", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_d_res_low"));
    }

    /**
     * _phasing_MAD.pdbx_d_res_high records the highest resolution
     * for MAD phasing.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxDResHigh() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_d_res_high", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_d_res_high"));
    }

    /**
     * _phasing_MAD.pdbx_reflns_acentric records the number of
     * acentric reflections for MAD phasing.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getPdbxReflnsAcentric() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("pdbx_reflns_acentric", SingleRowIntColumn::new) :
                getBinaryColumn("pdbx_reflns_acentric"));
    }

    /**
     * _phasing_MAD.pdbx_reflns_centric records the number of
     * centric reflections for MAD phasing.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getPdbxReflnsCentric() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("pdbx_reflns_centric", SingleRowIntColumn::new) :
                getBinaryColumn("pdbx_reflns_centric"));
    }

    /**
     * _phasing_MAD.pdbx_reflns records the number of
     * reflections used for MAD phasing.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getPdbxReflns() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("pdbx_reflns", SingleRowIntColumn::new) :
                getBinaryColumn("pdbx_reflns"));
    }

    /**
     * _phasing_MAD.pdbx_fom_acentric  records the figure of merit
     * using acentric data for MAD phasing.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxFomAcentric() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_fom_acentric", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_fom_acentric"));
    }

    /**
     * _phasing_MAD.pdbx_fom_centric  records the figure of merit
     * using centric data for MAD phasing.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxFomCentric() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_fom_centric", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_fom_centric"));
    }

    /**
     * _phasing_MAD.pdbx_fom records the figure of merit
     * for MAD phasing.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxFom() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_fom", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_fom"));
    }

    /**
     * _phasing_MAD.pdbx_R_cullis_centric records R_cullis
     * using centric data for MAD phasing.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxRCullisCentric() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_R_cullis_centric", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_R_cullis_centric"));
    }

    /**
     * _phasing_MAD.pdbx_R_cullis_acentric records R_cullis
     * using acentric data for MAD phasing.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxRCullisAcentric() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_R_cullis_acentric", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_R_cullis_acentric"));
    }

    /**
     * _phasing_MAD.pdbx_R_cullis records R_cullis
     * for MAD phasing.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxRCullis() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_R_cullis", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_R_cullis"));
    }

    /**
     * _phasing_MAD.pdbx_R_kraut_centric records R_kraut
     * using centric data for MAD phasing.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxRKrautCentric() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_R_kraut_centric", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_R_kraut_centric"));
    }

    /**
     * _phasing_MAD.pdbx_R_kraut_acentric records R_kraut
     * using acentric data for MAD phasing.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxRKrautAcentric() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_R_kraut_acentric", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_R_kraut_acentric"));
    }

    /**
     * _phasing_MAD.pdbx_R_kraut records R_kraut
     * for MAD phasing.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxRKraut() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_R_kraut", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_R_kraut"));
    }

    /**
     * _phasing_MAD.pdbx_loc_centric records lack of closure
     * using centric data for MAD phasing.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxLocCentric() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_loc_centric", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_loc_centric"));
    }

    /**
     * _phasing_MAD.pdbx_loc_acentric records lack of closure
     * using acentric data for MAD phasing.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxLocAcentric() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_loc_acentric", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_loc_acentric"));
    }

    /**
     * _phasing_MAD.pdbx_loc records lack of closure
     * for MAD phasing.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxLoc() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_loc", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_loc"));
    }

    /**
     * _phasing_MAD.pdbx_power_centric records phasing power
     * using centric data for MAD phasing.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxPowerCentric() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_power_centric", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_power_centric"));
    }

    /**
     * _phasing_MAD.pdbx_power_acentric records phasing power
     * using acentric data for MAD phasing.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxPowerAcentric() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_power_acentric", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_power_acentric"));
    }

    /**
     * _phasing_MAD.pdbx_power records phasing power
     * for MAD phasing.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxPower() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_power", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_power"));
    }

    /**
     * _phasing_MAD.pdbx_loc records the number
     * of data sets used for MAD phasing.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getPdbxNumberDataSets() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("pdbx_number_data_sets", SingleRowIntColumn::new) :
                getBinaryColumn("pdbx_number_data_sets"));
    }

    /**
     * _phasing_MAD.pdbx_anom_scat_method records the method
     * used to locate anomalous scatterers for MAD phasing.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxAnomScatMethod() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_anom_scat_method", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_anom_scat_method"));
    }
}
