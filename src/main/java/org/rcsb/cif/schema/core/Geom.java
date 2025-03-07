package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Geom extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "geom";

    public Geom(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * Increment added to the bond radii for the atomic species to
     * specify the maximum permitted "bonded" distance between two
     * atom sites.
     * @return FloatColumn
     */
    public FloatColumn getBondDistanceIncr() {
        return new DelegatingFloatColumn(parentBlock.getColumn("geom_bond_distance_incr"));
    }

    /**
     * Minimum permitted "bonded" distance between two atom sites.
     * @return FloatColumn
     */
    public FloatColumn getBondDistanceMin() {
        return new DelegatingFloatColumn(parentBlock.getColumn("geom_bond_distance_min"));
    }

    /**
     * Increment added to the bond radii for the atomic species to
     * specify the maximum permitted "contact" distance between two
     * "non-bonded" atom sites.
     * @return FloatColumn
     */
    public FloatColumn getContactDistanceIncr() {
        return new DelegatingFloatColumn(parentBlock.getColumn("geom_contact_distance_incr"));
    }

    /**
     * Minimum permitted "contact" distance between two "non-bonded" atom sites.
     * @return FloatColumn
     */
    public FloatColumn getContactDistanceMin() {
        return new DelegatingFloatColumn(parentBlock.getColumn("geom_contact_distance_min"));
    }

    /**
     * Description of geometry information not covered by the existing data
     * names in the geometry categories, such as least-squares planes.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("geom_details", "geom_special_details"));
    }

    /**
     * Description of geometry information not covered by the existing data
     * names in the geometry categories, such as least-squares planes.
     * @return StrColumn
     */
    public StrColumn getSpecialDetails() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("geom_details", "geom_special_details"));
    }

}