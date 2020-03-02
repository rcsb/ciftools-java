package org.rcsb.cif.schema.generated.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
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
     * 
     * Intermolecular distance between the atomic sites identified
     * by _geom_contact.id
     * @return StrColumn
     */
    public StrColumn getDistance() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_distance"));
    }

    /**
     * 
     * Standard Uncertainty of the intermolecular distance between
     * the atomic sites identified by _geom_contact.id
     * @return StrColumn
     */
    public StrColumn getDistanceSu() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_distance_su"));
    }

    /**
     * 
     * Atom site labels and symmetry operators as pairs for each of the
     * two atom sites which define the geom_contact bond.
     * @return StrColumn
     */
    public StrColumn getId() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_id"));
    }

    /**
     * 
     * This code signals whether the contact distance is referred to
     * in a publication or should be placed in a list of significant
     * contact distances.
     * @return StrColumn
     */
    public StrColumn getPublFlag() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_publ_flag"));
    }
}
