package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_PHASING_MAD_SHELL category record details about
 * the phasing of the structure, when methods involving multiple
 * anomalous dispersion techniques are involved (note: the
 * values are overall, but broken down into shells of resolution)
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxPhasingMADShell extends BaseCategory {
    public PdbxPhasingMADShell(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxPhasingMADShell(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxPhasingMADShell(String name) {
        super(name);
    }

    /**
     * _pdbx_phasing_MAD_shell.d_res_low records the lower resolution
     * for the shell.
     * @return FloatColumn
     */
    public FloatColumn getDResLow() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("d_res_low", FloatColumn::new) :
                getBinaryColumn("d_res_low"));
    }

    /**
     * _pdbx_phasing_MAD_shell.d_res_high records the higher resolution
     * for the shell.
     * @return FloatColumn
     */
    public FloatColumn getDResHigh() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("d_res_high", FloatColumn::new) :
                getBinaryColumn("d_res_high"));
    }

    /**
     * _pdbx_phasing_MAD_shell.reflns_acentric records the number of
     * acentric reflections for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getReflnsAcentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("reflns_acentric", FloatColumn::new) :
                getBinaryColumn("reflns_acentric"));
    }

    /**
     * _pdbx_phasing_MAD_shell.reflns_centric records the number of
     * centric reflections for MAD phasing.
     * @return IntColumn
     */
    public IntColumn getReflnsCentric() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("reflns_centric", IntColumn::new) :
                getBinaryColumn("reflns_centric"));
    }

    /**
     * _pdbx_phasing_MAD_shell.reflns records the number of
     * reflections used for MAD phasing.
     * @return IntColumn
     */
    public IntColumn getReflns() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("reflns", IntColumn::new) :
                getBinaryColumn("reflns"));
    }

    /**
     * _pdbx_phasing_MAD_shell.fom_acentric  records the figure of merit
     * using acentric data for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getFomAcentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("fom_acentric", FloatColumn::new) :
                getBinaryColumn("fom_acentric"));
    }

    /**
     * _pdbx_phasing_MAD_shell.fom_centric  records the figure of merit
     * using centric data for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getFomCentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("fom_centric", FloatColumn::new) :
                getBinaryColumn("fom_centric"));
    }

    /**
     * _pdbx_phasing_MAD_shell.fom records the figure of merit
     * for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getFom() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("fom", FloatColumn::new) :
                getBinaryColumn("fom"));
    }

    /**
     * _pdbx_phasing_MAD_shell.R_cullis_centric records R_cullis
     * using centric data for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getRCullisCentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("R_cullis_centric", FloatColumn::new) :
                getBinaryColumn("R_cullis_centric"));
    }

    /**
     * _pdbx_phasing_MAD_shell.R_cullis_acentric records R_cullis
     * using acentric data for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getRCullisAcentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("R_cullis_acentric", FloatColumn::new) :
                getBinaryColumn("R_cullis_acentric"));
    }

    /**
     * _pdbx_phasing_MAD_shell.R_cullis records R_cullis
     * for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getRCullis() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("R_cullis", FloatColumn::new) :
                getBinaryColumn("R_cullis"));
    }

    /**
     * _pdbx_phasing_MAD_shell.R_kraut_centric records R_kraut
     * using centric data for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getRKrautCentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("R_kraut_centric", FloatColumn::new) :
                getBinaryColumn("R_kraut_centric"));
    }

    /**
     * _pdbx_phasing_MAD_shell.r_kraut_acentric records R_kraut
     * using acentric data for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getRKrautAcentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("R_kraut_acentric", FloatColumn::new) :
                getBinaryColumn("R_kraut_acentric"));
    }

    /**
     * _pdbx_phasing_MAD_shell.R_kraut records R_kraut
     * for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getRKraut() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("R_kraut", FloatColumn::new) :
                getBinaryColumn("R_kraut"));
    }

    /**
     * _pdbx_phasing_MAD_shell.loc_centric records lack of closure
     * using centric data for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getLocCentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("loc_centric", FloatColumn::new) :
                getBinaryColumn("loc_centric"));
    }

    /**
     * _pdbx_phasing_MAD_shell.loc_acentric records lack of closure
     * using acentric data for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getLocAcentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("loc_acentric", FloatColumn::new) :
                getBinaryColumn("loc_acentric"));
    }

    /**
     * _pdbx_phasing_MAD_shell.loc records lack of closure
     * for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getLoc() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("loc", FloatColumn::new) :
                getBinaryColumn("loc"));
    }

    /**
     * _pdbx_phasing_MAD_shell.power_centric records phasing powe
     * using centric data for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getPowerCentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("power_centric", FloatColumn::new) :
                getBinaryColumn("power_centric"));
    }

    /**
     * _pdbx_phasing_MAD_shell.power_acentric records phasing powe
     * using acentric data for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getPowerAcentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("power_acentric", FloatColumn::new) :
                getBinaryColumn("power_acentric"));
    }

    /**
     * _pdbx_phasing_MAD_shell.loc records phasing power
     * for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getPower() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("power", FloatColumn::new) :
                getBinaryColumn("power"));
    }
}
