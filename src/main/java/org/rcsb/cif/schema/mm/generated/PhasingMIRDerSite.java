package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

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
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PhasingMIRDerSite extends BaseCategory {
    public PhasingMIRDerSite(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PhasingMIRDerSite(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PhasingMIRDerSite(String name) {
        super(name);
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_type_symbol", StrColumn::new) :
                getBinaryColumn("atom_type_symbol"));
    }

    /**
     * Isotropic displacement parameter for this heavy-atom site in this
     * derivative.
     * @return FloatColumn
     */
    public FloatColumn getBIso() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("B_iso", FloatColumn::new) :
                getBinaryColumn("B_iso"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _phasing_MIR_der_site.B_iso.
     * @return FloatColumn
     */
    public FloatColumn getBIsoEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("B_iso_esd", FloatColumn::new) :
                getBinaryColumn("B_iso_esd"));
    }

    /**
     * The x coordinate of this heavy-atom position in this derivative
     * specified as orthogonal angstroms. The orthogonal Cartesian axes
     * are related to the cell axes as specified by the description
     * given in _atom_sites.Cartn_transform_axes.
     * @return FloatColumn
     */
    public FloatColumn getCartnX() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Cartn_x", FloatColumn::new) :
                getBinaryColumn("Cartn_x"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _phasing_MIR_der_site.Cartn_x.
     * @return FloatColumn
     */
    public FloatColumn getCartnXEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Cartn_x_esd", FloatColumn::new) :
                getBinaryColumn("Cartn_x_esd"));
    }

    /**
     * The y coordinate of this heavy-atom position in this derivative
     * specified as orthogonal angstroms. The orthogonal Cartesian axes
     * are related to the cell axes as specified by the description
     * given in _atom_sites.Cartn_transform_axes.
     * @return FloatColumn
     */
    public FloatColumn getCartnY() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Cartn_y", FloatColumn::new) :
                getBinaryColumn("Cartn_y"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _phasing_MIR_der_site.Cartn_y.
     * @return FloatColumn
     */
    public FloatColumn getCartnYEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Cartn_y_esd", FloatColumn::new) :
                getBinaryColumn("Cartn_y_esd"));
    }

    /**
     * The z coordinate of this heavy-atom position in this derivative
     * specified as orthogonal angstroms. The orthogonal Cartesian axes
     * are related to the cell axes as specified by the description
     * given in _atom_sites.Cartn_transform_axes.
     * @return FloatColumn
     */
    public FloatColumn getCartnZ() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Cartn_z", FloatColumn::new) :
                getBinaryColumn("Cartn_z"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _phasing_MIR_der_site.Cartn_z.
     * @return FloatColumn
     */
    public FloatColumn getCartnZEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Cartn_z_esd", FloatColumn::new) :
                getBinaryColumn("Cartn_z_esd"));
    }

    /**
     * This data item is a pointer to _phasing_MIR_der.id in the
     * PHASING_MIR_DER category.
     * @return StrColumn
     */
    public StrColumn getDerId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("der_id", StrColumn::new) :
                getBinaryColumn("der_id"));
    }

    /**
     * A description of special aspects of the derivative site.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The x coordinate of this heavy-atom position in this derivative
     * specified as a fraction of _cell.length_a.
     * @return FloatColumn
     */
    public FloatColumn getFractX() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("fract_x", FloatColumn::new) :
                getBinaryColumn("fract_x"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _phasing_MIR_der_site.fract_x.
     * @return FloatColumn
     */
    public FloatColumn getFractXEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("fract_x_esd", FloatColumn::new) :
                getBinaryColumn("fract_x_esd"));
    }

    /**
     * The y coordinate of this heavy-atom position in this derivative
     * specified as a fraction of _cell.length_b.
     * @return FloatColumn
     */
    public FloatColumn getFractY() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("fract_y", FloatColumn::new) :
                getBinaryColumn("fract_y"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _phasing_MIR_der_site.fract_y.
     * @return FloatColumn
     */
    public FloatColumn getFractYEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("fract_y_esd", FloatColumn::new) :
                getBinaryColumn("fract_y_esd"));
    }

    /**
     * The z coordinate of this heavy-atom position in this derivative
     * specified as a fraction of _cell.length_c.
     * @return FloatColumn
     */
    public FloatColumn getFractZ() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("fract_z", FloatColumn::new) :
                getBinaryColumn("fract_z"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _phasing_MIR_der_site.fract_z.
     * @return FloatColumn
     */
    public FloatColumn getFractZEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("fract_z_esd", FloatColumn::new) :
                getBinaryColumn("fract_z_esd"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The fraction of the atom type present at this heavy-atom site
     * in a given derivative. The sum of the occupancies of all the
     * atom types at this site may not significantly exceed 1.0 unless
     * it is a dummy site.
     * @return FloatColumn
     */
    public FloatColumn getOccupancy() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("occupancy", FloatColumn::new) :
                getBinaryColumn("occupancy"));
    }

    /**
     * The relative anomalous occupancy of the atom type
     * present at this heavy-atom site in a given derivative.
     * This atom occupancy will probably be on an arbitrary scale.
     * @return FloatColumn
     */
    public FloatColumn getOccupancyAnom() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("occupancy_anom", FloatColumn::new) :
                getBinaryColumn("occupancy_anom"));
    }

    /**
     * The standard uncertainty (estimated standard deviation) of
     * _phasing_MIR_der_site.occupancy_anom.
     * @return FloatColumn
     */
    public FloatColumn getOccupancyAnomSu() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("occupancy_anom_su", FloatColumn::new) :
                getBinaryColumn("occupancy_anom_su"));
    }

    /**
     * The relative real isotropic occupancy of the atom type
     * present at this heavy-atom site in a given derivative.
     * This atom occupancy will probably be on an arbitrary scale.
     * @return FloatColumn
     */
    public FloatColumn getOccupancyIso() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("occupancy_iso", FloatColumn::new) :
                getBinaryColumn("occupancy_iso"));
    }

    /**
     * The standard uncertainty (estimated standard deviation) of
     * _phasing_MIR_der_site.occupancy_iso.
     * @return FloatColumn
     */
    public FloatColumn getOccupancyIsoSu() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("occupancy_iso_su", FloatColumn::new) :
                getBinaryColumn("occupancy_iso_su"));
    }
}
