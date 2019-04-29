package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * record the details (coordinates etc.) of anomalous scatters.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxPhasingMADSetSite extends BaseCategory {
    public PdbxPhasingMADSetSite(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxPhasingMADSetSite(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxPhasingMADSetSite(String name) {
        super(name);
    }

    /**
     * _pdbx_phasing_MAD_set_site.id records the number of site
     * obtained from MAD phasing.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * _pdbx_phasing_MAD_set_site.atom_type_symbol records the name of site
     * obtained from MAD phasing.
     * @return StrColumn
     */
    public StrColumn getAtomTypeSymbol() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_type_symbol", StrColumn::new) :
                getBinaryColumn("atom_type_symbol"));
    }

    /**
     * _pdbx_phasing_MAD_set_site.Cartn_x  records the X  Cartesian
     * coordinate of site obtained from MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getCartnX() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Cartn_x", FloatColumn::new) :
                getBinaryColumn("Cartn_x"));
    }

    /**
     * _pdbx_phasing_MAD_set_site.Cartn_y  records the Y  Cartesian
     * coordinate of site obtained from MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getCartnY() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Cartn_y", FloatColumn::new) :
                getBinaryColumn("Cartn_y"));
    }

    /**
     * _pdbx_phasing_MAD_set_site.Cartn_z  records the Z  Cartesian
     * coordinate of site obtained from MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getCartnZ() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Cartn_z", FloatColumn::new) :
                getBinaryColumn("Cartn_z"));
    }

    /**
     * _pdbx_phasing_MAD_set_site.Cartn_x_esd  records the estimated
     * standard deviation X  Cartesian
     * coordinate of site obtained from MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getCartnXEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Cartn_x_esd", FloatColumn::new) :
                getBinaryColumn("Cartn_x_esd"));
    }

    /**
     * _pdbx_phasing_MAD_set_site.Cartn_y_esd  records the estimated
     * standard deviation Y  Cartesian
     * coordinate of site obtained from MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getCartnYEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Cartn_y_esd", FloatColumn::new) :
                getBinaryColumn("Cartn_y_esd"));
    }

    /**
     * _pdbx_phasing_MAD_set_site.Cartn_z_esd  records the estimated
     * standard deviation Z  Cartesian
     * coordinate of site obtained from MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getCartnZEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Cartn_z_esd", FloatColumn::new) :
                getBinaryColumn("Cartn_z_esd"));
    }

    /**
     * _pdbx_phasing_MAD_set_site.fract_x  records the X  fractional
     * coordinate of site obtained from MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getFractX() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("fract_x", FloatColumn::new) :
                getBinaryColumn("fract_x"));
    }

    /**
     * _pdbx_phasing_MAD_set_site.fract_y  records the Y  fractional
     * coordinate of site obtained from MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getFractY() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("fract_y", FloatColumn::new) :
                getBinaryColumn("fract_y"));
    }

    /**
     * _pdbx_phasing_MAD_set_site.fract_z  records the Z  fractional
     * coordinate of site obtained from MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getFractZ() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("fract_z", FloatColumn::new) :
                getBinaryColumn("fract_z"));
    }

    /**
     * _pdbx_phasing_MAD_set_site.fract_x_esd  records the estimated
     * standard deviation X  fractional
     * coordinate of site obtained from MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getFractXEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("fract_x_esd", FloatColumn::new) :
                getBinaryColumn("fract_x_esd"));
    }

    /**
     * _pdbx_phasing_MAD_set_site.fract_y_esd  records the estimated
     * standard deviation Y  fractional
     * coordinate of site obtained from MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getFractYEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("fract_y_esd", FloatColumn::new) :
                getBinaryColumn("fract_y_esd"));
    }

    /**
     * _pdbx_phasing_MAD_set_site.fract_z_esd  records the estimated
     * standard deviation Z  fractional
     * coordinate of site obtained from MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getFractZEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("fract_z_esd", FloatColumn::new) :
                getBinaryColumn("fract_z_esd"));
    }

    /**
     * _pdbx_phasing_MAD_set_site.b_iso  records isotropic
     * temperature factor parameterthe for the site
     * obtained from MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getBIso() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("b_iso", FloatColumn::new) :
                getBinaryColumn("b_iso"));
    }

    /**
     * _pdbx_phasing_MAD_set_site.b_iso_esd  records estimated
     * standard deviation of isotropic
     * temperature factor parameterthe for the site
     * obtained from MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getBIsoEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("b_iso_esd", FloatColumn::new) :
                getBinaryColumn("b_iso_esd"));
    }

    /**
     * _pdbx_phasing_MAD_set_site.occupancy  records the fraction
     * of the atom type presented at this site.
     * @return FloatColumn
     */
    public FloatColumn getOccupancy() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("occupancy", FloatColumn::new) :
                getBinaryColumn("occupancy"));
    }

    /**
     * _pdbx_phasing_MAD_set_site.occupancy_esd  records estimated
     * standard deviation of the fraction
     * of the atom type presented at this site.
     * @return FloatColumn
     */
    public FloatColumn getOccupancyEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("occupancy_esd", FloatColumn::new) :
                getBinaryColumn("occupancy_esd"));
    }

    /**
     * record the phasing set.
     * @return StrColumn
     */
    public StrColumn getSetId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("set_id", StrColumn::new) :
                getBinaryColumn("set_id"));
    }

    /**
     * The relative real isotropic occupancy of the atom type
     * present at this heavy-atom site in a given atom site.
     * @return FloatColumn
     */
    public FloatColumn getOccupancyIso() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("occupancy_iso", FloatColumn::new) :
                getBinaryColumn("occupancy_iso"));
    }
}
