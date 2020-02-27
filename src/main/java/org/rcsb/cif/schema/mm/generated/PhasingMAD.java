package org.rcsb.cif.schema.mm.generated;

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
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
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
     * @return StrColumn
     */
    public StrColumn getMethod() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("method", StrColumn::new) :
                getBinaryColumn("method"));
    }

    /**
     * _phasing_MAD.pdbx_d_res_low records the lowest resolution
     * for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getPdbxDResLow() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_d_res_low", FloatColumn::new) :
                getBinaryColumn("pdbx_d_res_low"));
    }

    /**
     * _phasing_MAD.pdbx_d_res_high records the highest resolution
     * for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getPdbxDResHigh() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_d_res_high", FloatColumn::new) :
                getBinaryColumn("pdbx_d_res_high"));
    }

    /**
     * _phasing_MAD.pdbx_reflns_acentric records the number of
     * acentric reflections for MAD phasing.
     * @return IntColumn
     */
    public IntColumn getPdbxReflnsAcentric() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_reflns_acentric", IntColumn::new) :
                getBinaryColumn("pdbx_reflns_acentric"));
    }

    /**
     * _phasing_MAD.pdbx_reflns_centric records the number of
     * centric reflections for MAD phasing.
     * @return IntColumn
     */
    public IntColumn getPdbxReflnsCentric() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_reflns_centric", IntColumn::new) :
                getBinaryColumn("pdbx_reflns_centric"));
    }

    /**
     * _phasing_MAD.pdbx_reflns records the number of
     * reflections used for MAD phasing.
     * @return IntColumn
     */
    public IntColumn getPdbxReflns() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_reflns", IntColumn::new) :
                getBinaryColumn("pdbx_reflns"));
    }

    /**
     * _phasing_MAD.pdbx_fom_acentric  records the figure of merit
     * using acentric data for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getPdbxFomAcentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_fom_acentric", FloatColumn::new) :
                getBinaryColumn("pdbx_fom_acentric"));
    }

    /**
     * _phasing_MAD.pdbx_fom_centric  records the figure of merit
     * using centric data for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getPdbxFomCentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_fom_centric", FloatColumn::new) :
                getBinaryColumn("pdbx_fom_centric"));
    }

    /**
     * _phasing_MAD.pdbx_fom records the figure of merit
     * for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getPdbxFom() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_fom", FloatColumn::new) :
                getBinaryColumn("pdbx_fom"));
    }

    /**
     * _phasing_MAD.pdbx_R_cullis_centric records R_cullis
     * using centric data for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRCullisCentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_R_cullis_centric", FloatColumn::new) :
                getBinaryColumn("pdbx_R_cullis_centric"));
    }

    /**
     * _phasing_MAD.pdbx_R_cullis_acentric records R_cullis
     * using acentric data for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRCullisAcentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_R_cullis_acentric", FloatColumn::new) :
                getBinaryColumn("pdbx_R_cullis_acentric"));
    }

    /**
     * _phasing_MAD.pdbx_R_cullis records R_cullis
     * for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRCullis() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_R_cullis", FloatColumn::new) :
                getBinaryColumn("pdbx_R_cullis"));
    }

    /**
     * _phasing_MAD.pdbx_R_kraut_centric records R_kraut
     * using centric data for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRKrautCentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_R_kraut_centric", FloatColumn::new) :
                getBinaryColumn("pdbx_R_kraut_centric"));
    }

    /**
     * _phasing_MAD.pdbx_R_kraut_acentric records R_kraut
     * using acentric data for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRKrautAcentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_R_kraut_acentric", FloatColumn::new) :
                getBinaryColumn("pdbx_R_kraut_acentric"));
    }

    /**
     * _phasing_MAD.pdbx_R_kraut records R_kraut
     * for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRKraut() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_R_kraut", FloatColumn::new) :
                getBinaryColumn("pdbx_R_kraut"));
    }

    /**
     * _phasing_MAD.pdbx_loc_centric records lack of closure
     * using centric data for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getPdbxLocCentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_loc_centric", FloatColumn::new) :
                getBinaryColumn("pdbx_loc_centric"));
    }

    /**
     * _phasing_MAD.pdbx_loc_acentric records lack of closure
     * using acentric data for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getPdbxLocAcentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_loc_acentric", FloatColumn::new) :
                getBinaryColumn("pdbx_loc_acentric"));
    }

    /**
     * _phasing_MAD.pdbx_loc records lack of closure
     * for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getPdbxLoc() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_loc", FloatColumn::new) :
                getBinaryColumn("pdbx_loc"));
    }

    /**
     * _phasing_MAD.pdbx_power_centric records phasing power
     * using centric data for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getPdbxPowerCentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_power_centric", FloatColumn::new) :
                getBinaryColumn("pdbx_power_centric"));
    }

    /**
     * _phasing_MAD.pdbx_power_acentric records phasing power
     * using acentric data for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getPdbxPowerAcentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_power_acentric", FloatColumn::new) :
                getBinaryColumn("pdbx_power_acentric"));
    }

    /**
     * _phasing_MAD.pdbx_power records phasing power
     * for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getPdbxPower() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_power", FloatColumn::new) :
                getBinaryColumn("pdbx_power"));
    }

    /**
     * _phasing_MAD.pdbx_loc records the number
     * of data sets used for MAD phasing.
     * @return IntColumn
     */
    public IntColumn getPdbxNumberDataSets() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_number_data_sets", IntColumn::new) :
                getBinaryColumn("pdbx_number_data_sets"));
    }

    /**
     * _phasing_MAD.pdbx_anom_scat_method records the method
     * used to locate anomalous scatterers for MAD phasing.
     * @return StrColumn
     */
    public StrColumn getPdbxAnomScatMethod() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_anom_scat_method", StrColumn::new) :
                getBinaryColumn("pdbx_anom_scat_method"));
    }
}
