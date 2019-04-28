package org.rcsb.cif.model.generated.pdbxphasingmadsetsite;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * _pdbx_phasing_MAD_set_site.atom_type_symbol records the name of site
     * obtained from MAD phasing.
     * @return AtomTypeSymbol
     */
    public AtomTypeSymbol getAtomTypeSymbol() {
        return (AtomTypeSymbol) (isText ? textFields.computeIfAbsent("atom_type_symbol",
                AtomTypeSymbol::new) : getBinaryColumn("atom_type_symbol"));
    }

    /**
     * _pdbx_phasing_MAD_set_site.Cartn_x  records the X  Cartesian
     * coordinate of site obtained from MAD phasing.
     * @return CartnX
     */
    public CartnX getCartnX() {
        return (CartnX) (isText ? textFields.computeIfAbsent("Cartn_x",
                CartnX::new) : getBinaryColumn("Cartn_x"));
    }

    /**
     * _pdbx_phasing_MAD_set_site.Cartn_y  records the Y  Cartesian
     * coordinate of site obtained from MAD phasing.
     * @return CartnY
     */
    public CartnY getCartnY() {
        return (CartnY) (isText ? textFields.computeIfAbsent("Cartn_y",
                CartnY::new) : getBinaryColumn("Cartn_y"));
    }

    /**
     * _pdbx_phasing_MAD_set_site.Cartn_z  records the Z  Cartesian
     * coordinate of site obtained from MAD phasing.
     * @return CartnZ
     */
    public CartnZ getCartnZ() {
        return (CartnZ) (isText ? textFields.computeIfAbsent("Cartn_z",
                CartnZ::new) : getBinaryColumn("Cartn_z"));
    }

    /**
     * _pdbx_phasing_MAD_set_site.Cartn_x_esd  records the estimated
     * standard deviation X  Cartesian
     * coordinate of site obtained from MAD phasing.
     * @return CartnXEsd
     */
    public CartnXEsd getCartnXEsd() {
        return (CartnXEsd) (isText ? textFields.computeIfAbsent("Cartn_x_esd",
                CartnXEsd::new) : getBinaryColumn("Cartn_x_esd"));
    }

    /**
     * _pdbx_phasing_MAD_set_site.Cartn_y_esd  records the estimated
     * standard deviation Y  Cartesian
     * coordinate of site obtained from MAD phasing.
     * @return CartnYEsd
     */
    public CartnYEsd getCartnYEsd() {
        return (CartnYEsd) (isText ? textFields.computeIfAbsent("Cartn_y_esd",
                CartnYEsd::new) : getBinaryColumn("Cartn_y_esd"));
    }

    /**
     * _pdbx_phasing_MAD_set_site.Cartn_z_esd  records the estimated
     * standard deviation Z  Cartesian
     * coordinate of site obtained from MAD phasing.
     * @return CartnZEsd
     */
    public CartnZEsd getCartnZEsd() {
        return (CartnZEsd) (isText ? textFields.computeIfAbsent("Cartn_z_esd",
                CartnZEsd::new) : getBinaryColumn("Cartn_z_esd"));
    }

    /**
     * _pdbx_phasing_MAD_set_site.fract_x  records the X  fractional
     * coordinate of site obtained from MAD phasing.
     * @return FractX
     */
    public FractX getFractX() {
        return (FractX) (isText ? textFields.computeIfAbsent("fract_x",
                FractX::new) : getBinaryColumn("fract_x"));
    }

    /**
     * _pdbx_phasing_MAD_set_site.fract_y  records the Y  fractional
     * coordinate of site obtained from MAD phasing.
     * @return FractY
     */
    public FractY getFractY() {
        return (FractY) (isText ? textFields.computeIfAbsent("fract_y",
                FractY::new) : getBinaryColumn("fract_y"));
    }

    /**
     * _pdbx_phasing_MAD_set_site.fract_z  records the Z  fractional
     * coordinate of site obtained from MAD phasing.
     * @return FractZ
     */
    public FractZ getFractZ() {
        return (FractZ) (isText ? textFields.computeIfAbsent("fract_z",
                FractZ::new) : getBinaryColumn("fract_z"));
    }

    /**
     * _pdbx_phasing_MAD_set_site.fract_x_esd  records the estimated
     * standard deviation X  fractional
     * coordinate of site obtained from MAD phasing.
     * @return FractXEsd
     */
    public FractXEsd getFractXEsd() {
        return (FractXEsd) (isText ? textFields.computeIfAbsent("fract_x_esd",
                FractXEsd::new) : getBinaryColumn("fract_x_esd"));
    }

    /**
     * _pdbx_phasing_MAD_set_site.fract_y_esd  records the estimated
     * standard deviation Y  fractional
     * coordinate of site obtained from MAD phasing.
     * @return FractYEsd
     */
    public FractYEsd getFractYEsd() {
        return (FractYEsd) (isText ? textFields.computeIfAbsent("fract_y_esd",
                FractYEsd::new) : getBinaryColumn("fract_y_esd"));
    }

    /**
     * _pdbx_phasing_MAD_set_site.fract_z_esd  records the estimated
     * standard deviation Z  fractional
     * coordinate of site obtained from MAD phasing.
     * @return FractZEsd
     */
    public FractZEsd getFractZEsd() {
        return (FractZEsd) (isText ? textFields.computeIfAbsent("fract_z_esd",
                FractZEsd::new) : getBinaryColumn("fract_z_esd"));
    }

    /**
     * _pdbx_phasing_MAD_set_site.b_iso  records isotropic
     * temperature factor parameterthe for the site
     * obtained from MAD phasing.
     * @return BIso
     */
    public BIso getBIso() {
        return (BIso) (isText ? textFields.computeIfAbsent("b_iso",
                BIso::new) : getBinaryColumn("b_iso"));
    }

    /**
     * _pdbx_phasing_MAD_set_site.b_iso_esd  records estimated
     * standard deviation of isotropic
     * temperature factor parameterthe for the site
     * obtained from MAD phasing.
     * @return BIsoEsd
     */
    public BIsoEsd getBIsoEsd() {
        return (BIsoEsd) (isText ? textFields.computeIfAbsent("b_iso_esd",
                BIsoEsd::new) : getBinaryColumn("b_iso_esd"));
    }

    /**
     * _pdbx_phasing_MAD_set_site.occupancy  records the fraction
     * of the atom type presented at this site.
     * @return Occupancy
     */
    public Occupancy getOccupancy() {
        return (Occupancy) (isText ? textFields.computeIfAbsent("occupancy",
                Occupancy::new) : getBinaryColumn("occupancy"));
    }

    /**
     * _pdbx_phasing_MAD_set_site.occupancy_esd  records estimated
     * standard deviation of the fraction
     * of the atom type presented at this site.
     * @return OccupancyEsd
     */
    public OccupancyEsd getOccupancyEsd() {
        return (OccupancyEsd) (isText ? textFields.computeIfAbsent("occupancy_esd",
                OccupancyEsd::new) : getBinaryColumn("occupancy_esd"));
    }

    /**
     * record the phasing set.
     * @return SetId
     */
    public SetId getSetId() {
        return (SetId) (isText ? textFields.computeIfAbsent("set_id",
                SetId::new) : getBinaryColumn("set_id"));
    }

    /**
     * The relative real isotropic occupancy of the atom type
     * present at this heavy-atom site in a given atom site.
     * @return OccupancyIso
     */
    public OccupancyIso getOccupancyIso() {
        return (OccupancyIso) (isText ? textFields.computeIfAbsent("occupancy_iso",
                OccupancyIso::new) : getBinaryColumn("occupancy_iso"));
    }
}
