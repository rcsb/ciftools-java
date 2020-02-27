package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Record details about each phasing set: (Note: the phasing
 * set is different from data set. for example: if there are
 * three data sets, the inflection point (IP), the peak (PK)
 * and the high remote (HR), the combination of the phasing
 * set will be IP_iso, PK_iso (the isomorphous repleacement
 * with HR as 'native'), IP_ano, PK_ano and HR_ano (the
 * anomalous difference with itself). Therefore, there are
 * five set used for phasing.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxPhasingMADSet extends BaseCategory {
    public PdbxPhasingMADSet(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxPhasingMADSet(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxPhasingMADSet(String name) {
        super(name);
    }

    /**
     * _pdbx_phasing_MAD_set.id records phase set name
     * for MAD phasing.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * _pdbx_phasing_MAD_set.d_res_low records the lowerest
     * resolution for phasing set.
     * @return FloatColumn
     */
    public FloatColumn getDResLow() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("d_res_low", FloatColumn::new) :
                getBinaryColumn("d_res_low"));
    }

    /**
     * _pdbx_phasing_MAD_set.d_res_high records the highest resolution
     * for the phasing set.
     * @return FloatColumn
     */
    public FloatColumn getDResHigh() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("d_res_high", FloatColumn::new) :
                getBinaryColumn("d_res_high"));
    }

    /**
     * _pdbx_phasing_MAD_set.number_of_sites records the number of site
     * refined for the phasing set.
     * @return IntColumn
     */
    public IntColumn getNumberOfSites() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("number_of_sites", IntColumn::new) :
                getBinaryColumn("number_of_sites"));
    }

    /**
     * _pdbx_phasing_MAD_set.reflns_acentric records the number of
     * acentric reflections for MAD phasing.
     * @return IntColumn
     */
    public IntColumn getReflnsAcentric() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("reflns_acentric", IntColumn::new) :
                getBinaryColumn("reflns_acentric"));
    }

    /**
     * _pdbx_phasing_MAD_set.reflns_centric records the number of
     * centric reflections for MAD phasing.
     * @return IntColumn
     */
    public IntColumn getReflnsCentric() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("reflns_centric", IntColumn::new) :
                getBinaryColumn("reflns_centric"));
    }

    /**
     * _pdbx_phasing_MAD_set.reflns records the number of
     * reflections used for MAD phasing.
     * @return IntColumn
     */
    public IntColumn getReflns() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("reflns", IntColumn::new) :
                getBinaryColumn("reflns"));
    }

    /**
     * _pdbx_phasing_MAD_set.fom_acentric  records the figure of merit
     * using acentric data for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getFomAcentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("fom_acentric", FloatColumn::new) :
                getBinaryColumn("fom_acentric"));
    }

    /**
     * _pdbx_phasing_MAD_set.fom_centric  records the figure of merit
     * using centric data for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getFomCentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("fom_centric", FloatColumn::new) :
                getBinaryColumn("fom_centric"));
    }

    /**
     * _pdbx_phasing_MAD_set.fom records the figure of merit
     * for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getFom() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("fom", FloatColumn::new) :
                getBinaryColumn("fom"));
    }

    /**
     * _pdbx_phasing_MAD_set.R_cullis_centric records R_cullis
     * using centric data for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getRCullisCentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("R_cullis_centric", FloatColumn::new) :
                getBinaryColumn("R_cullis_centric"));
    }

    /**
     * _pdbx_phasing_MAD_set.R_cullis_acentric records R_cullis
     * using acentric data for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getRCullisAcentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("R_cullis_acentric", FloatColumn::new) :
                getBinaryColumn("R_cullis_acentric"));
    }

    /**
     * _pdbx_phasing_MAD_set.R_cullis records R_cullis
     * for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getRCullis() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("R_cullis", FloatColumn::new) :
                getBinaryColumn("R_cullis"));
    }

    /**
     * _pdbx_phasing_MAD_set.R_kraut_centric records r_kraut
     * using centric data for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getRKrautCentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("R_kraut_centric", FloatColumn::new) :
                getBinaryColumn("R_kraut_centric"));
    }

    /**
     * _pdbx_phasing_MAD_set.r_kraut_acentric records r_kraut
     * using acentric data for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getRKrautAcentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("R_kraut_acentric", FloatColumn::new) :
                getBinaryColumn("R_kraut_acentric"));
    }

    /**
     * _pdbx_phasing_MAD_set.R_kraut records R_kraut
     * for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getRKraut() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("R_kraut", FloatColumn::new) :
                getBinaryColumn("R_kraut"));
    }

    /**
     * _pdbx_phasing_MAD_set.loc_centric records lack of closure
     * using centric data for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getLocCentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("loc_centric", FloatColumn::new) :
                getBinaryColumn("loc_centric"));
    }

    /**
     * _pdbx_phasing_MAD_set.loc_acentric records lack of closure
     * using acentric data for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getLocAcentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("loc_acentric", FloatColumn::new) :
                getBinaryColumn("loc_acentric"));
    }

    /**
     * _pdbx_phasing_MAD_set.loc records lack of closure
     * for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getLoc() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("loc", FloatColumn::new) :
                getBinaryColumn("loc"));
    }

    /**
     * _pdbx_phasing_MAD_set.power_centric records phasing powe
     * using centric data for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getPowerCentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("power_centric", FloatColumn::new) :
                getBinaryColumn("power_centric"));
    }

    /**
     * _pdbx_phasing_MAD_set.power_acentric records phasing powe
     * using acentric data for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getPowerAcentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("power_acentric", FloatColumn::new) :
                getBinaryColumn("power_acentric"));
    }

    /**
     * _pdbx_phasing_MAD_set.power records phasing power
     * for MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getPower() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("power", FloatColumn::new) :
                getBinaryColumn("power"));
    }
}
