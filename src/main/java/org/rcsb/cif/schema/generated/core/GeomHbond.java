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
     * @return StrColumn
     */
    public StrColumn getAngleDHA() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_angle_DHA"));
    }

    /**
     * 
     * The standard uncertainty of the angle subtended by the sites identified
     * by _geom_hbond.id. The hydrogen at site H is at the apex of the angle.
     * @return StrColumn
     */
    public StrColumn getAngleDHASu() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_angle_DHA_su"));
    }

    /**
     * 
     * The set of data items which specify the distance between the
     * three atom sites identified by _geom_hbond.id.
     * @return StrColumn
     */
    public StrColumn getDistanceDA() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_distance_DA"));
    }

    /**
     * 
     * Standard Uncertainty of the
     * set of data items which specify the distance between the
     * three atom sites identified by _geom_hbond.id.
     * @return StrColumn
     */
    public StrColumn getDistanceDASu() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_distance_DA_su"));
    }

    /**
     * 
     * The set of data items which specify the distance between the
     * three atom sites identified by _geom_hbond.id.
     * @return StrColumn
     */
    public StrColumn getDistanceDH() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_distance_DH"));
    }

    /**
     * 
     * Standard Uncertainty of the
     * set of data items which specify the distance between the
     * three atom sites identified by _geom_hbond.id.
     * @return StrColumn
     */
    public StrColumn getDistanceDHSu() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_distance_DH_su"));
    }

    /**
     * 
     * The set of data items which specify the distance between the
     * three atom sites identified by _geom_hbond.id.
     * @return StrColumn
     */
    public StrColumn getDistanceHA() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_distance_HA"));
    }

    /**
     * 
     * Standard Uncertainty of the
     * set of data items which specify the distance between the
     * three atom sites identified by _geom_hbond.id.
     * @return StrColumn
     */
    public StrColumn getDistanceHASu() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_distance_HA_su"));
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
}
