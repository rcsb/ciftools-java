package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The CATEGORY of data items used to specify the hydrogen bond
 * distances in the structural model as derived from atomic sites.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class GeomHbond extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "geom_hbond";

    public GeomHbond(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * Angle subtended by the sites identified by _geom_hbond.id.
     * The hydrogen at site H is at the apex of the angle.
     * @return FloatColumn
     */
    public FloatColumn getAngleDha() {
        return new DelegatingFloatColumn(parentBlock.getColumn("geom_hbond_angle_dha"));
    }

    /**
     * An identifier for the hydrogen bond that is unique within the loop.
     * @return StrColumn
     */
    public StrColumn getId() {
        return new DelegatingStrColumn(parentBlock.getColumn("geom_hbond_id"));
    }

    /**
     * This code signals whether the hydrogen-bond information
     * is referred to in a publication or should be placed in a
     * table of significant hydrogen-bond geometry.
     * @return StrColumn
     */
    public StrColumn getPublFlag() {
        return new DelegatingStrColumn(parentBlock.getColumn("geom_hbond_publ_flag"));
    }

    /**
     * Data item specifying the symmetry operation codes applied to the atom
     * sites involved in a specific geometric configuration.
     * 
     * The symmetry code of each atom site as the symmetry-equivalent position
     * number 'n' and the cell translation number 'pqr'. These numbers are
     * combined to form the code 'n pqr' or n_pqr.
     * 
     * The character string n_pqr is composed as follows:
     * 
     * n refers to the symmetry operation that is applied to the
     * coordinates stored in _atom_site.fract_xyz. It must match
     * a number given in _space_group_symop.id (or one of its
     * aliases, such as _symmetry_equiv_pos_site_id).
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
    public StrColumn getSiteSymmetryA() {
        return new DelegatingStrColumn(parentBlock.getColumn("geom_hbond_site_symmetry_a"));
    }

    /**
     * Data item specifying the symmetry operation codes applied to the atom
     * sites involved in a specific geometric configuration.
     * 
     * The symmetry code of each atom site as the symmetry-equivalent position
     * number 'n' and the cell translation number 'pqr'. These numbers are
     * combined to form the code 'n pqr' or n_pqr.
     * 
     * The character string n_pqr is composed as follows:
     * 
     * n refers to the symmetry operation that is applied to the
     * coordinates stored in _atom_site.fract_xyz. It must match
     * a number given in _space_group_symop.id (or one of its
     * aliases, such as _symmetry_equiv_pos_site_id).
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
    public StrColumn getSiteSymmetryD() {
        return new DelegatingStrColumn(parentBlock.getColumn("geom_hbond_site_symmetry_d"));
    }

    /**
     * Data item specifying the symmetry operation codes applied to the atom
     * sites involved in a specific geometric configuration.
     * 
     * The symmetry code of each atom site as the symmetry-equivalent position
     * number 'n' and the cell translation number 'pqr'. These numbers are
     * combined to form the code 'n pqr' or n_pqr.
     * 
     * The character string n_pqr is composed as follows:
     * 
     * n refers to the symmetry operation that is applied to the
     * coordinates stored in _atom_site.fract_xyz. It must match
     * a number given in _space_group_symop.id (or one of its
     * aliases, such as _symmetry_equiv_pos_site_id).
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
    public StrColumn getSiteSymmetryH() {
        return new DelegatingStrColumn(parentBlock.getColumn("geom_hbond_site_symmetry_h"));
    }

    /**
     * Standard uncertainty of the angle subtended by the sites identified
     * by _geom_hbond.id. The hydrogen at site H is at the apex of the angle.
     * @return FloatColumn
     */
    public FloatColumn getAngleDHAEsd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("geom_hbond_angle_DHA_esd", "geom_hbond_angle_dha_su"));
    }

    /**
     * Standard uncertainty of the angle subtended by the sites identified
     * by _geom_hbond.id. The hydrogen at site H is at the apex of the angle.
     * @return FloatColumn
     */
    public FloatColumn getAngleDhaSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("geom_hbond_angle_DHA_esd", "geom_hbond_angle_dha_su"));
    }

    /**
     * This label is a unique identifier for a particular site in the
     * asymmetric unit of the crystal unit cell.
     * @return StrColumn
     */
    public StrColumn getAtomSiteIdA() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("geom_hbond_atom_site_id_A", "geom_hbond_atom_site_label_a"));
    }

    /**
     * This label is a unique identifier for a particular site in the
     * asymmetric unit of the crystal unit cell.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelA() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("geom_hbond_atom_site_id_A", "geom_hbond_atom_site_label_a"));
    }

    /**
     * This label is a unique identifier for a particular site in the
     * asymmetric unit of the crystal unit cell.
     * @return StrColumn
     */
    public StrColumn getAtomSiteIdD() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("geom_hbond_atom_site_id_D", "geom_hbond_atom_site_label_d"));
    }

    /**
     * This label is a unique identifier for a particular site in the
     * asymmetric unit of the crystal unit cell.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelD() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("geom_hbond_atom_site_id_D", "geom_hbond_atom_site_label_d"));
    }

    /**
     * This label is a unique identifier for a particular site in the
     * asymmetric unit of the crystal unit cell.
     * @return StrColumn
     */
    public StrColumn getAtomSiteIdH() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("geom_hbond_atom_site_id_H", "geom_hbond_atom_site_label_h"));
    }

    /**
     * This label is a unique identifier for a particular site in the
     * asymmetric unit of the crystal unit cell.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelH() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("geom_hbond_atom_site_id_H", "geom_hbond_atom_site_label_h"));
    }

    /**
     * The set of data items which specify the distance between the
     * three atom sites identified by _geom_hbond.id.
     * @return FloatColumn
     */
    public FloatColumn getDistDA() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("geom_hbond_dist_DA", "geom_hbond_distance_da"));
    }

    /**
     * The set of data items which specify the distance between the
     * three atom sites identified by _geom_hbond.id.
     * @return FloatColumn
     */
    public FloatColumn getDistanceDa() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("geom_hbond_dist_DA", "geom_hbond_distance_da"));
    }

    /**
     * Standard uncertainty of the set of data items which specify
     * the distance between the three atom sites identified by _geom_hbond.id.
     * @return FloatColumn
     */
    public FloatColumn getDistDAEsd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("geom_hbond_dist_DA_esd", "geom_hbond_distance_da_su"));
    }

    /**
     * Standard uncertainty of the set of data items which specify
     * the distance between the three atom sites identified by _geom_hbond.id.
     * @return FloatColumn
     */
    public FloatColumn getDistanceDaSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("geom_hbond_dist_DA_esd", "geom_hbond_distance_da_su"));
    }

    /**
     * The set of data items which specify the distance between the
     * three atom sites identified by _geom_hbond.id.
     * @return FloatColumn
     */
    public FloatColumn getDistDH() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("geom_hbond_dist_DH", "geom_hbond_distance_dh"));
    }

    /**
     * The set of data items which specify the distance between the
     * three atom sites identified by _geom_hbond.id.
     * @return FloatColumn
     */
    public FloatColumn getDistanceDh() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("geom_hbond_dist_DH", "geom_hbond_distance_dh"));
    }

    /**
     * Standard uncertainty of the set of data items which specify
     * the distance between the three atom sites identified by _geom_hbond.id.
     * @return FloatColumn
     */
    public FloatColumn getDistDHEsd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("geom_hbond_dist_DH_esd", "geom_hbond_distance_dh_su"));
    }

    /**
     * Standard uncertainty of the set of data items which specify
     * the distance between the three atom sites identified by _geom_hbond.id.
     * @return FloatColumn
     */
    public FloatColumn getDistanceDhSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("geom_hbond_dist_DH_esd", "geom_hbond_distance_dh_su"));
    }

    /**
     * The set of data items which specify the distance between the
     * three atom sites identified by _geom_hbond.id.
     * @return FloatColumn
     */
    public FloatColumn getDistHA() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("geom_hbond_dist_HA", "geom_hbond_distance_ha"));
    }

    /**
     * The set of data items which specify the distance between the
     * three atom sites identified by _geom_hbond.id.
     * @return FloatColumn
     */
    public FloatColumn getDistanceHa() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("geom_hbond_dist_HA", "geom_hbond_distance_ha"));
    }

    /**
     * Standard uncertainty of the set of data items which specify
     * the distance between the three atom sites identified by _geom_hbond.id.
     * @return FloatColumn
     */
    public FloatColumn getDistHAEsd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("geom_hbond_dist_HA_esd", "geom_hbond_distance_ha_su"));
    }

    /**
     * Standard uncertainty of the set of data items which specify
     * the distance between the three atom sites identified by _geom_hbond.id.
     * @return FloatColumn
     */
    public FloatColumn getDistanceHaSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("geom_hbond_dist_HA_esd", "geom_hbond_distance_ha_su"));
    }

}