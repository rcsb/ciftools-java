package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The CATEGORY of data items used to specify the geometry angles in the
 * structural model as derived from the atomic sites.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class GeomAngle extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "geom_angle";

    public GeomAngle(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * The pair of distances between sites 1 - 2 and 2 - 3.
     * @return FloatColumn
     */
    public FloatColumn getDistances() {
        return new DelegatingFloatColumn(parentBlock.getColumn("geom_angle_distances"));
    }

    /**
     * Standard uncertainty of _geom_angle.distances.
     * @return FloatColumn
     */
    public FloatColumn getDistancesSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("geom_angle_distances_su"));
    }

    /**
     * An arbitrary, unique identifier for the angle formed by the three atoms.
     * @return StrColumn
     */
    public StrColumn getId() {
        return new DelegatingStrColumn(parentBlock.getColumn("geom_angle_id"));
    }

    /**
     * Code signals if the angle is referred to in a publication or
     * should be placed in a table of significant angles.
     * @return StrColumn
     */
    public StrColumn getPublFlag() {
        return new DelegatingStrColumn(parentBlock.getColumn("geom_angle_publ_flag"));
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
    public StrColumn getSiteSymmetry1() {
        return new DelegatingStrColumn(parentBlock.getColumn("geom_angle_site_symmetry_1"));
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
    public StrColumn getSiteSymmetry2() {
        return new DelegatingStrColumn(parentBlock.getColumn("geom_angle_site_symmetry_2"));
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
    public StrColumn getSiteSymmetry3() {
        return new DelegatingStrColumn(parentBlock.getColumn("geom_angle_site_symmetry_3"));
    }

    /**
     * Angle defined by the atoms located at atom_site_x/site_symmetry_x for
     * x = 1,2,3. The vertex atom is at site x = 2.
     * @return FloatColumn
     */
    public FloatColumn getValue() {
        return new DelegatingFloatColumn(parentBlock.getColumn("geom_angle_value"));
    }

    /**
     * This label is a unique identifier for a particular site in the
     * asymmetric unit of the crystal unit cell.
     * @return StrColumn
     */
    public StrColumn getAtomSiteId1() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("geom_angle_atom_site_id_1", "geom_angle_atom_site_label_1"));
    }

    /**
     * This label is a unique identifier for a particular site in the
     * asymmetric unit of the crystal unit cell.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabel1() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("geom_angle_atom_site_id_1", "geom_angle_atom_site_label_1"));
    }

    /**
     * The unique identifier for the vertex atom of the angle.
     * @return StrColumn
     */
    public StrColumn getAtomSiteId2() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("geom_angle_atom_site_id_2", "geom_angle_atom_site_label_2"));
    }

    /**
     * The unique identifier for the vertex atom of the angle.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabel2() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("geom_angle_atom_site_id_2", "geom_angle_atom_site_label_2"));
    }

    /**
     * This label is a unique identifier for a particular site in the
     * asymmetric unit of the crystal unit cell.
     * @return StrColumn
     */
    public StrColumn getAtomSiteId3() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("geom_angle_atom_site_id_3", "geom_angle_atom_site_label_3"));
    }

    /**
     * This label is a unique identifier for a particular site in the
     * asymmetric unit of the crystal unit cell.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabel3() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("geom_angle_atom_site_id_3", "geom_angle_atom_site_label_3"));
    }

    /**
     * Standard uncertainty of the angle defined by
     * the sites identified by _geom_angle.id.
     * @return FloatColumn
     */
    public FloatColumn getValueEsd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("geom_angle_value_esd", "geom_angle_value_su"));
    }

    /**
     * Standard uncertainty of the angle defined by
     * the sites identified by _geom_angle.id.
     * @return FloatColumn
     */
    public FloatColumn getValueSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("geom_angle_value_esd", "geom_angle_value_su"));
    }

}