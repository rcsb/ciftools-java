package org.rcsb.cif.schema.generated.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
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
     * 
     * Angle subtended by the sites identified by _geom_hbond.id.
     * The hydrogen at site H is at the apex of the angle.
     * @return FloatColumn
     */
    public FloatColumn getAngleDHA() {
        return new DelegatingFloatColumn(parentBlock.getColumn(NAME + "_angle_DHA"));
    }

    /**
     * 
     * The standard uncertainty of the angle subtended by the sites identified
     * by _geom_hbond.id. The hydrogen at site H is at the apex of the angle.
     * @return FloatColumn
     */
    public FloatColumn getAngleDHASu() {
        return new DelegatingFloatColumn(parentBlock.getColumn(NAME + "_angle_DHA_su"));
    }

    /**
     * 
     * This label is a unique identifier for a particular site in the
     * asymmetric unit of the crystal unit cell.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelA() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_atom_site_label_A"));
    }

    /**
     * 
     * This label is a unique identifier for a particular site in the
     * asymmetric unit of the crystal unit cell.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelD() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_atom_site_label_D"));
    }

    /**
     * 
     * This label is a unique identifier for a particular site in the
     * asymmetric unit of the crystal unit cell.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelH() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_atom_site_label_H"));
    }

    /**
     * 
     * The set of data items which specify the distance between the
     * three atom sites identified by _geom_hbond.id.
     * @return FloatColumn
     */
    public FloatColumn getDistanceDA() {
        return new DelegatingFloatColumn(parentBlock.getColumn(NAME + "_distance_DA"));
    }

    /**
     * 
     * Standard Uncertainty of the
     * set of data items which specify the distance between the
     * three atom sites identified by _geom_hbond.id.
     * @return FloatColumn
     */
    public FloatColumn getDistanceDASu() {
        return new DelegatingFloatColumn(parentBlock.getColumn(NAME + "_distance_DA_su"));
    }

    /**
     * 
     * The set of data items which specify the distance between the
     * three atom sites identified by _geom_hbond.id.
     * @return FloatColumn
     */
    public FloatColumn getDistanceDH() {
        return new DelegatingFloatColumn(parentBlock.getColumn(NAME + "_distance_DH"));
    }

    /**
     * 
     * Standard Uncertainty of the
     * set of data items which specify the distance between the
     * three atom sites identified by _geom_hbond.id.
     * @return FloatColumn
     */
    public FloatColumn getDistanceDHSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn(NAME + "_distance_DH_su"));
    }

    /**
     * 
     * The set of data items which specify the distance between the
     * three atom sites identified by _geom_hbond.id.
     * @return FloatColumn
     */
    public FloatColumn getDistanceHA() {
        return new DelegatingFloatColumn(parentBlock.getColumn(NAME + "_distance_HA"));
    }

    /**
     * 
     * Standard Uncertainty of the
     * set of data items which specify the distance between the
     * three atom sites identified by _geom_hbond.id.
     * @return FloatColumn
     */
    public FloatColumn getDistanceHASu() {
        return new DelegatingFloatColumn(parentBlock.getColumn(NAME + "_distance_HA_su"));
    }

    /**
     * 
     * Atom site labels and symmetry operators as pairs for each of the
     * three atom sites which define the hydrogen angle and distances.
     * Site H is at the apex of the angle.
     * @return StrColumn
     */
    public StrColumn getId() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_id"));
    }

    /**
     * 
     * This code signals whether the hydrogen-bond information
     * is referred to in a publication or should be placed in a
     * table of significant hydrogen-bond geometry.
     * @return StrColumn
     */
    public StrColumn getPublFlag() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_publ_flag"));
    }

    /**
     * 
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
    public StrColumn getSiteSymmetryA() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_site_symmetry_A"));
    }

    /**
     * 
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
    public StrColumn getSiteSymmetryD() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_site_symmetry_D"));
    }

    /**
     * 
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
    public StrColumn getSiteSymmetryH() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_site_symmetry_H"));
    }
}
