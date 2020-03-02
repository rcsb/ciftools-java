package org.rcsb.cif.schema.generated.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 * The CATEGORY of data items used to specify the geometry bonds in the
 * structural model as derived from the atomic sites.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class GeomBond extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "geom_bond";

    public GeomBond(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * 
     * This label is a unique identifier for a particular site in the
     * asymmetric unit of the crystal unit cell.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabel1() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_atom_site_label_1"));
    }

    /**
     * 
     * This label is a unique identifier for a particular site in the
     * asymmetric unit of the crystal unit cell.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabel2() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_atom_site_label_2"));
    }

    /**
     * 
     * Intramolecular bond distance between the sites identified
     * by _geom_bond.id
     * @return StrColumn
     */
    public StrColumn getDistance() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_distance"));
    }

    /**
     * 
     * Standard Uncertainty of the intramolecular bond distance
     * between the sites identified by _geom_bond.id
     * @return StrColumn
     */
    public StrColumn getDistanceSu() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_distance_su"));
    }

    /**
     * 
     * Identity of bond distance in terms of the atom site labels and
     * symmetry operators as pairs for each of the two "bonded" atom sites.
     * @return StrColumn
     */
    public StrColumn getId() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_id"));
    }

    /**
     * 
     * The number of times the given bond appears in the environment
     * of the atoms labelled _geom_bond.atom_site_label_1. In cases
     * where the full list of bonds is given, one of the series of
     * equivalent bonds may be assigned the appropriate multiplicity
     * while the others are assigned a value of 0.
     * @return StrColumn
     */
    public StrColumn getMultiplicity() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_multiplicity"));
    }

    /**
     * 
     * This code signals whether the angle is referred to in a
     * publication or should be placed in a table of significant angles.
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
    public StrColumn getSiteSymmetry1() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_site_symmetry_1"));
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
    public StrColumn getSiteSymmetry2() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_site_symmetry_2"));
    }

    /**
     * 
     * Bond valence calculated from the bond distance.
     * @return StrColumn
     */
    public StrColumn getValence() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_valence"));
    }
}
