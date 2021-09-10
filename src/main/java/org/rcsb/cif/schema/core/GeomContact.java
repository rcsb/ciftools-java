package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The CATEGORY of data items used to specify the interatomic
 * contact distances in the structural model.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class GeomContact extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "geom_contact";

    public GeomContact(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * An identifier for the contact that is unique within the loop.
     * @return StrColumn
     */
    public StrColumn getId() {
        return new DelegatingStrColumn(parentBlock.getColumn("geom_contact_id"));
    }

    /**
     * This code signals whether the contact distance is referred to
     * in a publication or should be placed in a list of significant
     * contact distances.
     * @return StrColumn
     */
    public StrColumn getPublFlag() {
        return new DelegatingStrColumn(parentBlock.getColumn("geom_contact_publ_flag"));
    }

    /**
     * The set of data items which specify the symmetry operation codes
     * which must be applied to the atom sites involved in the geometry angle.
     * 
     * The symmetry code of each atom site as the symmetry-equivalent position
     * number 'n' and the cell translation number 'pqr'. These numbers are
     * combined to form the code 'n pqr' or n_pqr.
     * 
     * The character string n_pqr is composed as follows:
     * 
     * n refers to the symmetry operation that is applied to the
     * coordinates stored in _atom_site.fract_xyz. It must match a
     * number given in _symmetry_equiv.pos_site_id.
     * 
     * p, q and r refer to the translations that are subsequently
     * applied to the symmetry transformed coordinates to generate
     * the atom used in calculating the angle. These translations
     * (x,y,z) are related to (p,q,r) by the relations
     * p = 5 + x
     * q = 5 + y
     * r = 5 + z
     * @return StrColumn
     */
    public StrColumn getSiteSymmetry1() {
        return new DelegatingStrColumn(parentBlock.getColumn("geom_contact_site_symmetry_1"));
    }

    /**
     * The set of data items which specify the symmetry operation codes
     * which must be applied to the atom sites involved in the geometry angle.
     * 
     * The symmetry code of each atom site as the symmetry-equivalent position
     * number 'n' and the cell translation number 'pqr'. These numbers are
     * combined to form the code 'n pqr' or n_pqr.
     * 
     * The character string n_pqr is composed as follows:
     * 
     * n refers to the symmetry operation that is applied to the
     * coordinates stored in _atom_site.fract_xyz. It must match a
     * number given in _symmetry_equiv.pos_site_id.
     * 
     * p, q and r refer to the translations that are subsequently
     * applied to the symmetry transformed coordinates to generate
     * the atom used in calculating the angle. These translations
     * (x,y,z) are related to (p,q,r) by the relations
     * p = 5 + x
     * q = 5 + y
     * r = 5 + z
     * @return StrColumn
     */
    public StrColumn getSiteSymmetry2() {
        return new DelegatingStrColumn(parentBlock.getColumn("geom_contact_site_symmetry_2"));
    }

    /**
     * This label is a unique identifier for a particular site in the
     * asymmetric unit of the crystal unit cell.
     * @return StrColumn
     */
    public StrColumn getAtomSiteId1() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("geom_contact_atom_site_id_1", "geom_contact_atom_site_label_1"));
    }

    /**
     * This label is a unique identifier for a particular site in the
     * asymmetric unit of the crystal unit cell.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabel1() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("geom_contact_atom_site_id_1", "geom_contact_atom_site_label_1"));
    }

    /**
     * This label is a unique identifier for a particular site in the
     * asymmetric unit of the crystal unit cell.
     * @return StrColumn
     */
    public StrColumn getAtomSiteId2() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("geom_contact_atom_site_id_2", "geom_contact_atom_site_label_2"));
    }

    /**
     * This label is a unique identifier for a particular site in the
     * asymmetric unit of the crystal unit cell.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabel2() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("geom_contact_atom_site_id_2", "geom_contact_atom_site_label_2"));
    }

    /**
     * Intermolecular distance between the atomic sites identified
     * by _geom_contact.id
     * @return FloatColumn
     */
    public FloatColumn getDist() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("geom_contact_dist", "geom_contact_distance"));
    }

    /**
     * Intermolecular distance between the atomic sites identified
     * by _geom_contact.id
     * @return FloatColumn
     */
    public FloatColumn getDistance() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("geom_contact_dist", "geom_contact_distance"));
    }

    /**
     * Standard Uncertainty of the intermolecular distance between
     * the atomic sites identified by _geom_contact.id
     * @return FloatColumn
     */
    public FloatColumn getDistEsd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("geom_contact_dist_esd", "geom_contact_distance_su"));
    }

    /**
     * Standard Uncertainty of the intermolecular distance between
     * the atomic sites identified by _geom_contact.id
     * @return FloatColumn
     */
    public FloatColumn getDistanceSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("geom_contact_dist_esd", "geom_contact_distance_su"));
    }

}