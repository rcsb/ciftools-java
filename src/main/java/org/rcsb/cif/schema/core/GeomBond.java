package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
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
     * Unique identifier for the bond.
     * @return StrColumn
     */
    public StrColumn getId() {
        return new DelegatingStrColumn(parentBlock.getColumn("geom_bond_id"));
    }

    /**
     * The number of times the given bond appears in the environment
     * of the atoms labelled _geom_bond.atom_site_label_1. In cases
     * where the full list of bonds is given, one of the series of
     * equivalent bonds may be assigned the appropriate multiplicity
     * while the others are assigned a value of 0.
     * @return IntColumn
     */
    public IntColumn getMultiplicity() {
        return new DelegatingIntColumn(parentBlock.getColumn("geom_bond_multiplicity"));
    }

    /**
     * This code signals whether the angle is referred to in a
     * publication or should be placed in a table of significant angles.
     * @return StrColumn
     */
    public StrColumn getPublFlag() {
        return new DelegatingStrColumn(parentBlock.getColumn("geom_bond_publ_flag"));
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
        return new DelegatingStrColumn(parentBlock.getColumn("geom_bond_site_symmetry_1"));
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
        return new DelegatingStrColumn(parentBlock.getColumn("geom_bond_site_symmetry_2"));
    }

    /**
     * Bond valence calculated from the bond distance.
     * @return FloatColumn
     */
    public FloatColumn getValence() {
        return new DelegatingFloatColumn(parentBlock.getColumn("geom_bond_valence"));
    }

    /**
     * Standard uncertainty of _geom_bond.valence.
     * @return FloatColumn
     */
    public FloatColumn getValenceSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("geom_bond_valence_su"));
    }

    /**
     * This label is a unique identifier for a particular site in the
     * asymmetric unit of the crystal unit cell.
     * @return StrColumn
     */
    public StrColumn getAtomSiteId1() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("geom_bond_atom_site_id_1", "geom_bond_atom_site_label_1"));
    }

    /**
     * This label is a unique identifier for a particular site in the
     * asymmetric unit of the crystal unit cell.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabel1() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("geom_bond_atom_site_id_1", "geom_bond_atom_site_label_1"));
    }

    /**
     * This label is a unique identifier for a particular site in the
     * asymmetric unit of the crystal unit cell.
     * @return StrColumn
     */
    public StrColumn getAtomSiteId2() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("geom_bond_atom_site_id_2", "geom_bond_atom_site_label_2"));
    }

    /**
     * This label is a unique identifier for a particular site in the
     * asymmetric unit of the crystal unit cell.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabel2() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("geom_bond_atom_site_id_2", "geom_bond_atom_site_label_2"));
    }

    /**
     * Intramolecular bond distance between the sites identified
     * by _geom_bond.id
     * @return FloatColumn
     */
    public FloatColumn getDist() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("geom_bond_dist", "geom_bond_distance"));
    }

    /**
     * Intramolecular bond distance between the sites identified
     * by _geom_bond.id
     * @return FloatColumn
     */
    public FloatColumn getDistance() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("geom_bond_dist", "geom_bond_distance"));
    }

    /**
     * Standard uncertainty of the intramolecular bond distance
     * between the sites identified by _geom_bond.id.
     * @return FloatColumn
     */
    public FloatColumn getDistEsd() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("geom_bond_dist_esd", "geom_bond_distance_su"));
    }

    /**
     * Standard uncertainty of the intramolecular bond distance
     * between the sites identified by _geom_bond.id.
     * @return FloatColumn
     */
    public FloatColumn getDistanceSu() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("geom_bond_dist_esd", "geom_bond_distance_su"));
    }

}