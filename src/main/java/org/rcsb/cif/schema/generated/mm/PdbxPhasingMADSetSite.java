package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * record the details (coordinates etc.) of anomalous scatters.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxPhasingMADSetSite extends DelegatingCategory {
    public PdbxPhasingMADSetSite(Category delegate) {
        super(delegate);
    }

    /**
     * _pdbx_phasing_MAD_set_site.id records the number of site
     * obtained from MAD phasing.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * _pdbx_phasing_MAD_set_site.atom_type_symbol records the name of site
     * obtained from MAD phasing.
     * @return StrColumn
     */
    public StrColumn getAtomTypeSymbol() {
        return delegate.getColumn("atom_type_symbol", DelegatingStrColumn::new);
    }

    /**
     * _pdbx_phasing_MAD_set_site.Cartn_x  records the X  Cartesian
     * coordinate of site obtained from MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getCartnX() {
        return delegate.getColumn("Cartn_x", DelegatingFloatColumn::new);
    }

    /**
     * _pdbx_phasing_MAD_set_site.Cartn_y  records the Y  Cartesian
     * coordinate of site obtained from MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getCartnY() {
        return delegate.getColumn("Cartn_y", DelegatingFloatColumn::new);
    }

    /**
     * _pdbx_phasing_MAD_set_site.Cartn_z  records the Z  Cartesian
     * coordinate of site obtained from MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getCartnZ() {
        return delegate.getColumn("Cartn_z", DelegatingFloatColumn::new);
    }

    /**
     * _pdbx_phasing_MAD_set_site.Cartn_x_esd  records the estimated
     * standard deviation X  Cartesian
     * coordinate of site obtained from MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getCartnXEsd() {
        return delegate.getColumn("Cartn_x_esd", DelegatingFloatColumn::new);
    }

    /**
     * _pdbx_phasing_MAD_set_site.Cartn_y_esd  records the estimated
     * standard deviation Y  Cartesian
     * coordinate of site obtained from MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getCartnYEsd() {
        return delegate.getColumn("Cartn_y_esd", DelegatingFloatColumn::new);
    }

    /**
     * _pdbx_phasing_MAD_set_site.Cartn_z_esd  records the estimated
     * standard deviation Z  Cartesian
     * coordinate of site obtained from MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getCartnZEsd() {
        return delegate.getColumn("Cartn_z_esd", DelegatingFloatColumn::new);
    }

    /**
     * _pdbx_phasing_MAD_set_site.fract_x  records the X  fractional
     * coordinate of site obtained from MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getFractX() {
        return delegate.getColumn("fract_x", DelegatingFloatColumn::new);
    }

    /**
     * _pdbx_phasing_MAD_set_site.fract_y  records the Y  fractional
     * coordinate of site obtained from MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getFractY() {
        return delegate.getColumn("fract_y", DelegatingFloatColumn::new);
    }

    /**
     * _pdbx_phasing_MAD_set_site.fract_z  records the Z  fractional
     * coordinate of site obtained from MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getFractZ() {
        return delegate.getColumn("fract_z", DelegatingFloatColumn::new);
    }

    /**
     * _pdbx_phasing_MAD_set_site.fract_x_esd  records the estimated
     * standard deviation X  fractional
     * coordinate of site obtained from MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getFractXEsd() {
        return delegate.getColumn("fract_x_esd", DelegatingFloatColumn::new);
    }

    /**
     * _pdbx_phasing_MAD_set_site.fract_y_esd  records the estimated
     * standard deviation Y  fractional
     * coordinate of site obtained from MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getFractYEsd() {
        return delegate.getColumn("fract_y_esd", DelegatingFloatColumn::new);
    }

    /**
     * _pdbx_phasing_MAD_set_site.fract_z_esd  records the estimated
     * standard deviation Z  fractional
     * coordinate of site obtained from MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getFractZEsd() {
        return delegate.getColumn("fract_z_esd", DelegatingFloatColumn::new);
    }

    /**
     * _pdbx_phasing_MAD_set_site.b_iso  records isotropic
     * temperature factor parameterthe for the site
     * obtained from MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getBIso() {
        return delegate.getColumn("b_iso", DelegatingFloatColumn::new);
    }

    /**
     * _pdbx_phasing_MAD_set_site.b_iso_esd  records estimated
     * standard deviation of isotropic
     * temperature factor parameterthe for the site
     * obtained from MAD phasing.
     * @return FloatColumn
     */
    public FloatColumn getBIsoEsd() {
        return delegate.getColumn("b_iso_esd", DelegatingFloatColumn::new);
    }

    /**
     * _pdbx_phasing_MAD_set_site.occupancy  records the fraction
     * of the atom type presented at this site.
     * @return FloatColumn
     */
    public FloatColumn getOccupancy() {
        return delegate.getColumn("occupancy", DelegatingFloatColumn::new);
    }

    /**
     * _pdbx_phasing_MAD_set_site.occupancy_esd  records estimated
     * standard deviation of the fraction
     * of the atom type presented at this site.
     * @return FloatColumn
     */
    public FloatColumn getOccupancyEsd() {
        return delegate.getColumn("occupancy_esd", DelegatingFloatColumn::new);
    }

    /**
     * record the phasing set.
     * @return StrColumn
     */
    public StrColumn getSetId() {
        return delegate.getColumn("set_id", DelegatingStrColumn::new);
    }

    /**
     * The relative real isotropic occupancy of the atom type
     * present at this heavy-atom site in a given atom site.
     * @return FloatColumn
     */
    public FloatColumn getOccupancyIso() {
        return delegate.getColumn("occupancy_iso", DelegatingFloatColumn::new);
    }
}
