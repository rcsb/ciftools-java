package org.rcsb.cif.schema.generated.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
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
     * 
     * The unique identifier for the vertex atom of the angle.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabel2() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_atom_site_label_2"));
    }

    /**
     * 
     * The pair of distances between sites 1 - 2 and 2 - 3.
     * @return StrColumn
     */
    public StrColumn getDistances() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_distances"));
    }

    /**
     * 
     * Atom site labels and symmetry operators as pairs for each of the
     * three atom sites which identify the angle. The second label-symop
     * pair in the list identifies the site at the apex of the angle.
     * @return StrColumn
     */
    public StrColumn getId() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_id"));
    }

    /**
     * 
     * Code signals if the angle is referred to in a publication or
     * should be placed in a table of significant angles.
     * @return StrColumn
     */
    public StrColumn getPublFlag() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_publ_flag"));
    }

    /**
     * 
     * Angle defined by the atoms located at atom_site_x/site_symmetry_x for
     * x = 1,2,3. The vertex atom is at site x = 2.
     * @return StrColumn
     */
    public StrColumn getValue() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_value"));
    }

    /**
     * 
     * Standard Uncertainty of the
     * angle defined by the sites identified by _geom_angle.id
     * @return StrColumn
     */
    public StrColumn getValueSu() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_value_su"));
    }
}
