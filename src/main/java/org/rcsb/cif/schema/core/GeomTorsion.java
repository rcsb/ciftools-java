package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The CATEGORY of data items used to specify the torsion angles in the
 * structural model as derived from the atomic sites.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class GeomTorsion extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "geom_torsion";

    public GeomTorsion(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * Distances between sites 1 - 2, 2 - 3 and 3 - 4.
     * @return FloatColumn
     */
    public FloatColumn getDistances() {
        return new DelegatingFloatColumn(parentBlock.getColumn("geom_torsion_distances"));
    }

    /**
     * Standard uncertainty of _geom_torsion.distances.
     * @return FloatColumn
     */
    public FloatColumn getDistancesSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("geom_torsion_distances_su"));
    }

    /**
     * An identifier for the torsion angle that is unique within its loop.
     * @return StrColumn
     */
    public StrColumn getId() {
        return new DelegatingStrColumn(parentBlock.getColumn("geom_torsion_id"));
    }

    /**
     * Code signals if the torsion angle is required for publication.
     * @return StrColumn
     */
    public StrColumn getPublFlag() {
        return new DelegatingStrColumn(parentBlock.getColumn("geom_torsion_publ_flag"));
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
        return new DelegatingStrColumn(parentBlock.getColumn("geom_torsion_site_symmetry_1"));
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
        return new DelegatingStrColumn(parentBlock.getColumn("geom_torsion_site_symmetry_2"));
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
        return new DelegatingStrColumn(parentBlock.getColumn("geom_torsion_site_symmetry_3"));
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
    public StrColumn getSiteSymmetry4() {
        return new DelegatingStrColumn(parentBlock.getColumn("geom_torsion_site_symmetry_4"));
    }

    /**
     * Angle defined by the sites identified by _geom_torsion.id.
     * The torsion-angle definition should be that of Klyne and Prelog.
     * The vector direction *_label_2 to *_label_3 is the viewing
     * direction, and the torsion angle is the angle of twist required
     * to superimpose the projection of the vector between site 2 and
     * site 1 onto the projection of the vector between site 3 and
     * site 4. Clockwise torsions are positive, anticlockwise torsions
     * are negative.
     * Ref: Klyne, W. &amp; Prelog, V. (1960). Experientia, 16, 521-523.
     * @return FloatColumn
     */
    public FloatColumn getValue() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("geom_torsion_value", "geom_torsion_angle"));
    }

    /**
     * Angle defined by the sites identified by _geom_torsion.id.
     * The torsion-angle definition should be that of Klyne and Prelog.
     * The vector direction *_label_2 to *_label_3 is the viewing
     * direction, and the torsion angle is the angle of twist required
     * to superimpose the projection of the vector between site 2 and
     * site 1 onto the projection of the vector between site 3 and
     * site 4. Clockwise torsions are positive, anticlockwise torsions
     * are negative.
     * Ref: Klyne, W. &amp; Prelog, V. (1960). Experientia, 16, 521-523.
     * @return FloatColumn
     */
    public FloatColumn getAngle() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("geom_torsion_value", "geom_torsion_angle"));
    }

    /**
     * Standard uncertainty of the torsion angle.
     * @return FloatColumn
     */
    public FloatColumn getValueEsd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("geom_torsion_value_esd", "geom_torsion_angle_su"));
    }

    /**
     * Standard uncertainty of the torsion angle.
     * @return FloatColumn
     */
    public FloatColumn getAngleSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("geom_torsion_value_esd", "geom_torsion_angle_su"));
    }

    /**
     * This label is a unique identifier for a particular site in the
     * asymmetric unit of the crystal unit cell.
     * @return StrColumn
     */
    public StrColumn getAtomSiteId1() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("geom_torsion_atom_site_id_1", "geom_torsion_atom_site_label_1"));
    }

    /**
     * This label is a unique identifier for a particular site in the
     * asymmetric unit of the crystal unit cell.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabel1() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("geom_torsion_atom_site_id_1", "geom_torsion_atom_site_label_1"));
    }

    /**
     * This label is a unique identifier for a particular site in the
     * asymmetric unit of the crystal unit cell.
     * @return StrColumn
     */
    public StrColumn getAtomSiteId2() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("geom_torsion_atom_site_id_2", "geom_torsion_atom_site_label_2"));
    }

    /**
     * This label is a unique identifier for a particular site in the
     * asymmetric unit of the crystal unit cell.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabel2() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("geom_torsion_atom_site_id_2", "geom_torsion_atom_site_label_2"));
    }

    /**
     * This label is a unique identifier for a particular site in the
     * asymmetric unit of the crystal unit cell.
     * @return StrColumn
     */
    public StrColumn getAtomSiteId3() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("geom_torsion_atom_site_id_3", "geom_torsion_atom_site_label_3"));
    }

    /**
     * This label is a unique identifier for a particular site in the
     * asymmetric unit of the crystal unit cell.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabel3() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("geom_torsion_atom_site_id_3", "geom_torsion_atom_site_label_3"));
    }

    /**
     * This label is a unique identifier for a particular site in the
     * asymmetric unit of the crystal unit cell.
     * @return StrColumn
     */
    public StrColumn getAtomSiteId4() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("geom_torsion_atom_site_id_4", "geom_torsion_atom_site_label_4"));
    }

    /**
     * This label is a unique identifier for a particular site in the
     * asymmetric unit of the crystal unit cell.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabel4() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("geom_torsion_atom_site_id_4", "geom_torsion_atom_site_label_4"));
    }

}