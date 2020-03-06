package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PHASING_MIR_DER_SITE category record details
 * about the heavy-atom sites in an MIR phasing experiment.
 * 
 * This list may contain information from a number of different
 * derivatives; _phasing_MIR_der_site.der_id indicates to which
 * derivative a given record corresponds. (A derivative in this
 * context does not necessarily equate with a data set; see the
 * definition of the PHASING_MIR_DER category for a
 * discussion of the meaning of derivative.)
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PhasingMIRDerSite extends DelegatingCategory {
    public PhasingMIRDerSite(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "atom_type_symbol":
                return getAtomTypeSymbol();
            case "B_iso":
                return getBIso();
            case "B_iso_esd":
                return getBIsoEsd();
            case "Cartn_x":
                return getCartnX();
            case "Cartn_x_esd":
                return getCartnXEsd();
            case "Cartn_y":
                return getCartnY();
            case "Cartn_y_esd":
                return getCartnYEsd();
            case "Cartn_z":
                return getCartnZ();
            case "Cartn_z_esd":
                return getCartnZEsd();
            case "der_id":
                return getDerId();
            case "details":
                return getDetails();
            case "fract_x":
                return getFractX();
            case "fract_x_esd":
                return getFractXEsd();
            case "fract_y":
                return getFractY();
            case "fract_y_esd":
                return getFractYEsd();
            case "fract_z":
                return getFractZ();
            case "fract_z_esd":
                return getFractZEsd();
            case "id":
                return getId();
            case "occupancy":
                return getOccupancy();
            case "occupancy_anom":
                return getOccupancyAnom();
            case "occupancy_anom_su":
                return getOccupancyAnomSu();
            case "occupancy_iso":
                return getOccupancyIso();
            case "occupancy_iso_su":
                return getOccupancyIsoSu();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _atom_type.symbol in the
     * ATOM_TYPE category.
     * 
     * The scattering factors referenced via this data item should be
     * those used in the refinement of the heavy-atom data; in some
     * cases this is the scattering factor for the single heavy
     * atom, in other cases these are the scattering factors for an
     * atomic cluster.
     * @return StrColumn
     */
    public StrColumn getAtomTypeSymbol() {
        return delegate.getColumn("atom_type_symbol", DelegatingStrColumn::new);
    }

    /**
     * Isotropic displacement parameter for this heavy-atom site in this
     * derivative.
     * @return FloatColumn
     */
    public FloatColumn getBIso() {
        return delegate.getColumn("B_iso", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _phasing_MIR_der_site.B_iso.
     * @return FloatColumn
     */
    public FloatColumn getBIsoEsd() {
        return delegate.getColumn("B_iso_esd", DelegatingFloatColumn::new);
    }

    /**
     * The x coordinate of this heavy-atom position in this derivative
     * specified as orthogonal angstroms. The orthogonal Cartesian axes
     * are related to the cell axes as specified by the description
     * given in _atom_sites.Cartn_transform_axes.
     * @return FloatColumn
     */
    public FloatColumn getCartnX() {
        return delegate.getColumn("Cartn_x", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _phasing_MIR_der_site.Cartn_x.
     * @return FloatColumn
     */
    public FloatColumn getCartnXEsd() {
        return delegate.getColumn("Cartn_x_esd", DelegatingFloatColumn::new);
    }

    /**
     * The y coordinate of this heavy-atom position in this derivative
     * specified as orthogonal angstroms. The orthogonal Cartesian axes
     * are related to the cell axes as specified by the description
     * given in _atom_sites.Cartn_transform_axes.
     * @return FloatColumn
     */
    public FloatColumn getCartnY() {
        return delegate.getColumn("Cartn_y", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _phasing_MIR_der_site.Cartn_y.
     * @return FloatColumn
     */
    public FloatColumn getCartnYEsd() {
        return delegate.getColumn("Cartn_y_esd", DelegatingFloatColumn::new);
    }

    /**
     * The z coordinate of this heavy-atom position in this derivative
     * specified as orthogonal angstroms. The orthogonal Cartesian axes
     * are related to the cell axes as specified by the description
     * given in _atom_sites.Cartn_transform_axes.
     * @return FloatColumn
     */
    public FloatColumn getCartnZ() {
        return delegate.getColumn("Cartn_z", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _phasing_MIR_der_site.Cartn_z.
     * @return FloatColumn
     */
    public FloatColumn getCartnZEsd() {
        return delegate.getColumn("Cartn_z_esd", DelegatingFloatColumn::new);
    }

    /**
     * This data item is a pointer to _phasing_MIR_der.id in the
     * PHASING_MIR_DER category.
     * @return StrColumn
     */
    public StrColumn getDerId() {
        return delegate.getColumn("der_id", DelegatingStrColumn::new);
    }

    /**
     * A description of special aspects of the derivative site.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The x coordinate of this heavy-atom position in this derivative
     * specified as a fraction of _cell.length_a.
     * @return FloatColumn
     */
    public FloatColumn getFractX() {
        return delegate.getColumn("fract_x", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _phasing_MIR_der_site.fract_x.
     * @return FloatColumn
     */
    public FloatColumn getFractXEsd() {
        return delegate.getColumn("fract_x_esd", DelegatingFloatColumn::new);
    }

    /**
     * The y coordinate of this heavy-atom position in this derivative
     * specified as a fraction of _cell.length_b.
     * @return FloatColumn
     */
    public FloatColumn getFractY() {
        return delegate.getColumn("fract_y", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _phasing_MIR_der_site.fract_y.
     * @return FloatColumn
     */
    public FloatColumn getFractYEsd() {
        return delegate.getColumn("fract_y_esd", DelegatingFloatColumn::new);
    }

    /**
     * The z coordinate of this heavy-atom position in this derivative
     * specified as a fraction of _cell.length_c.
     * @return FloatColumn
     */
    public FloatColumn getFractZ() {
        return delegate.getColumn("fract_z", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _phasing_MIR_der_site.fract_z.
     * @return FloatColumn
     */
    public FloatColumn getFractZEsd() {
        return delegate.getColumn("fract_z_esd", DelegatingFloatColumn::new);
    }

    /**
     * The value of _phasing_MIR_der_site.id must uniquely identify each
     * site in each derivative in the PHASING_MIR_DER_SITE list.
     * 
     * The atom identifiers need not be unique over all sites in all
     * derivatives; they need only be unique for each site in each
     * derivative.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * The fraction of the atom type present at this heavy-atom site
     * in a given derivative. The sum of the occupancies of all the
     * atom types at this site may not significantly exceed 1.0 unless
     * it is a dummy site.
     * @return FloatColumn
     */
    public FloatColumn getOccupancy() {
        return delegate.getColumn("occupancy", DelegatingFloatColumn::new);
    }

    /**
     * The relative anomalous occupancy of the atom type
     * present at this heavy-atom site in a given derivative.
     * This atom occupancy will probably be on an arbitrary scale.
     * @return FloatColumn
     */
    public FloatColumn getOccupancyAnom() {
        return delegate.getColumn("occupancy_anom", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation) of
     * _phasing_MIR_der_site.occupancy_anom.
     * @return FloatColumn
     */
    public FloatColumn getOccupancyAnomSu() {
        return delegate.getColumn("occupancy_anom_su", DelegatingFloatColumn::new);
    }

    /**
     * The relative real isotropic occupancy of the atom type
     * present at this heavy-atom site in a given derivative.
     * This atom occupancy will probably be on an arbitrary scale.
     * @return FloatColumn
     */
    public FloatColumn getOccupancyIso() {
        return delegate.getColumn("occupancy_iso", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation) of
     * _phasing_MIR_der_site.occupancy_iso.
     * @return FloatColumn
     */
    public FloatColumn getOccupancyIsoSu() {
        return delegate.getColumn("occupancy_iso_su", DelegatingFloatColumn::new);
    }

}