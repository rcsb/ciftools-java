package org.rcsb.cif.model.generated.phasingmirdersite;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return AtomTypeSymbol
     */
    public AtomTypeSymbol getAtomTypeSymbol() {
        return (AtomTypeSymbol) (isText ? textFields.computeIfAbsent("atom_type_symbol",
                AtomTypeSymbol::new) : getBinaryColumn("atom_type_symbol"));
    }

    /**
     * Isotropic displacement parameter for this heavy-atom site in this
     * derivative.
     * @return BIso
     */
    public BIso getBIso() {
        return (BIso) (isText ? textFields.computeIfAbsent("B_iso",
                BIso::new) : getBinaryColumn("B_iso"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _phasing_MIR_der_site.B_iso.
     * @return BIsoEsd
     */
    public BIsoEsd getBIsoEsd() {
        return (BIsoEsd) (isText ? textFields.computeIfAbsent("B_iso_esd",
                BIsoEsd::new) : getBinaryColumn("B_iso_esd"));
    }

    /**
     * The x coordinate of this heavy-atom position in this derivative
     * specified as orthogonal angstroms. The orthogonal Cartesian axes
     * are related to the cell axes as specified by the description
     * given in _atom_sites.Cartn_transform_axes.
     * @return CartnX
     */
    public CartnX getCartnX() {
        return (CartnX) (isText ? textFields.computeIfAbsent("Cartn_x",
                CartnX::new) : getBinaryColumn("Cartn_x"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _phasing_MIR_der_site.Cartn_x.
     * @return CartnXEsd
     */
    public CartnXEsd getCartnXEsd() {
        return (CartnXEsd) (isText ? textFields.computeIfAbsent("Cartn_x_esd",
                CartnXEsd::new) : getBinaryColumn("Cartn_x_esd"));
    }

    /**
     * The y coordinate of this heavy-atom position in this derivative
     * specified as orthogonal angstroms. The orthogonal Cartesian axes
     * are related to the cell axes as specified by the description
     * given in _atom_sites.Cartn_transform_axes.
     * @return CartnY
     */
    public CartnY getCartnY() {
        return (CartnY) (isText ? textFields.computeIfAbsent("Cartn_y",
                CartnY::new) : getBinaryColumn("Cartn_y"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _phasing_MIR_der_site.Cartn_y.
     * @return CartnYEsd
     */
    public CartnYEsd getCartnYEsd() {
        return (CartnYEsd) (isText ? textFields.computeIfAbsent("Cartn_y_esd",
                CartnYEsd::new) : getBinaryColumn("Cartn_y_esd"));
    }

    /**
     * The z coordinate of this heavy-atom position in this derivative
     * specified as orthogonal angstroms. The orthogonal Cartesian axes
     * are related to the cell axes as specified by the description
     * given in _atom_sites.Cartn_transform_axes.
     * @return CartnZ
     */
    public CartnZ getCartnZ() {
        return (CartnZ) (isText ? textFields.computeIfAbsent("Cartn_z",
                CartnZ::new) : getBinaryColumn("Cartn_z"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _phasing_MIR_der_site.Cartn_z.
     * @return CartnZEsd
     */
    public CartnZEsd getCartnZEsd() {
        return (CartnZEsd) (isText ? textFields.computeIfAbsent("Cartn_z_esd",
                CartnZEsd::new) : getBinaryColumn("Cartn_z_esd"));
    }

    /**
     * This data item is a pointer to _phasing_MIR_der.id in the
     * PHASING_MIR_DER category.
     * @return DerId
     */
    public DerId getDerId() {
        return (DerId) (isText ? textFields.computeIfAbsent("der_id",
                DerId::new) : getBinaryColumn("der_id"));
    }

    /**
     * A description of special aspects of the derivative site.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * The x coordinate of this heavy-atom position in this derivative
     * specified as a fraction of _cell.length_a.
     * @return FractX
     */
    public FractX getFractX() {
        return (FractX) (isText ? textFields.computeIfAbsent("fract_x",
                FractX::new) : getBinaryColumn("fract_x"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _phasing_MIR_der_site.fract_x.
     * @return FractXEsd
     */
    public FractXEsd getFractXEsd() {
        return (FractXEsd) (isText ? textFields.computeIfAbsent("fract_x_esd",
                FractXEsd::new) : getBinaryColumn("fract_x_esd"));
    }

    /**
     * The y coordinate of this heavy-atom position in this derivative
     * specified as a fraction of _cell.length_b.
     * @return FractY
     */
    public FractY getFractY() {
        return (FractY) (isText ? textFields.computeIfAbsent("fract_y",
                FractY::new) : getBinaryColumn("fract_y"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _phasing_MIR_der_site.fract_y.
     * @return FractYEsd
     */
    public FractYEsd getFractYEsd() {
        return (FractYEsd) (isText ? textFields.computeIfAbsent("fract_y_esd",
                FractYEsd::new) : getBinaryColumn("fract_y_esd"));
    }

    /**
     * The z coordinate of this heavy-atom position in this derivative
     * specified as a fraction of _cell.length_c.
     * @return FractZ
     */
    public FractZ getFractZ() {
        return (FractZ) (isText ? textFields.computeIfAbsent("fract_z",
                FractZ::new) : getBinaryColumn("fract_z"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _phasing_MIR_der_site.fract_z.
     * @return FractZEsd
     */
    public FractZEsd getFractZEsd() {
        return (FractZEsd) (isText ? textFields.computeIfAbsent("fract_z_esd",
                FractZEsd::new) : getBinaryColumn("fract_z_esd"));
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
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * The fraction of the atom type present at this heavy-atom site
     * in a given derivative. The sum of the occupancies of all the
     * atom types at this site may not significantly exceed 1.0 unless
     * it is a dummy site.
     * @return Occupancy
     */
    public Occupancy getOccupancy() {
        return (Occupancy) (isText ? textFields.computeIfAbsent("occupancy",
                Occupancy::new) : getBinaryColumn("occupancy"));
    }

    /**
     * The relative anomalous occupancy of the atom type
     * present at this heavy-atom site in a given derivative.
     * This atom occupancy will probably be on an arbitrary scale.
     * @return OccupancyAnom
     */
    public OccupancyAnom getOccupancyAnom() {
        return (OccupancyAnom) (isText ? textFields.computeIfAbsent("occupancy_anom",
                OccupancyAnom::new) : getBinaryColumn("occupancy_anom"));
    }

    /**
     * The standard uncertainty (estimated standard deviation) of
     * _phasing_MIR_der_site.occupancy_anom.
     * @return OccupancyAnomSu
     */
    public OccupancyAnomSu getOccupancyAnomSu() {
        return (OccupancyAnomSu) (isText ? textFields.computeIfAbsent("occupancy_anom_su",
                OccupancyAnomSu::new) : getBinaryColumn("occupancy_anom_su"));
    }

    /**
     * The relative real isotropic occupancy of the atom type
     * present at this heavy-atom site in a given derivative.
     * This atom occupancy will probably be on an arbitrary scale.
     * @return OccupancyIso
     */
    public OccupancyIso getOccupancyIso() {
        return (OccupancyIso) (isText ? textFields.computeIfAbsent("occupancy_iso",
                OccupancyIso::new) : getBinaryColumn("occupancy_iso"));
    }

    /**
     * The standard uncertainty (estimated standard deviation) of
     * _phasing_MIR_der_site.occupancy_iso.
     * @return OccupancyIsoSu
     */
    public OccupancyIsoSu getOccupancyIsoSu() {
        return (OccupancyIsoSu) (isText ? textFields.computeIfAbsent("occupancy_iso_su",
                OccupancyIsoSu::new) : getBinaryColumn("occupancy_iso_su"));
    }
}
