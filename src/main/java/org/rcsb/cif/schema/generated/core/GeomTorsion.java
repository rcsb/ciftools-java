package org.rcsb.cif.schema.generated.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
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
     * 
     * Angle defined by the sites identified by _geom_torsion.id.
     * The torsion-angle definition should be that of Klyne and Prelog.
     * The vector direction *_label_2 to *_label_3 is the viewing
     * direction, and the torsion angle is the angle of twist required
     * to superimpose the projection of the vector between site 2 and
     * site 1 onto the projection of the vector between site 3 and
     * site 4. Clockwise torsions are positive, anticlockwise torsions
     * are negative.
     * Ref: Klyne, W. &amp; Prelog, V. (1960). Experientia, 16, 521-523.
     * @return StrColumn
     */
    public StrColumn getAngle() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_angle"));
    }

    /**
     * 
     * Standard Uncertainty of the torsion angle.
     * @return StrColumn
     */
    public StrColumn getAngleSu() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_angle_su"));
    }

    /**
     * 
     * Distances between sites 1 - 2, 2 - 3 and 3 - 4.
     * @return StrColumn
     */
    public StrColumn getDistances() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_distances"));
    }

    /**
     * 
     * Atom site labels and symmetry operators as pairs for each of the
     * four atom sites which define the torsion angle.
     * @return StrColumn
     */
    public StrColumn getId() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_id"));
    }

    /**
     * 
     * Code signals if the torsion angle is required for publication.
     * @return StrColumn
     */
    public StrColumn getPublFlag() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_publ_flag"));
    }
}
