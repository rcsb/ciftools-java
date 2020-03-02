package org.rcsb.cif.schema.generated.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 * The CATEGORY of data items used to describe the matrix elements
 * used to transform Cartesion coordinates into fractional coordinates
 * of all atom sites in a crystal structure.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class AtomSitesFractTransform extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "atom_sites_fract_transform";

    public AtomSitesFractTransform(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * 
     * Description of the relative alignment of the crystal cell axes to the
     * Cartesian orthogonal axes as applied in the transformation matrix
     * _atom_sites_fract_transform.matrix.
     * @return StrColumn
     */
    public StrColumn getAxes() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_axes"));
    }

    /**
     * 
     * Matrix used to transform fractional coordinates in the ATOM_SITE
     * category to Cartesian  coordinates. The axial alignments of this
     * transformation are described in _atom_sites_fract_transform.axes.
     * The 3 x 1 translation is defined in _atom_sites_fract_transform.vector.
     * 
     * x'                   |11 12 13|     x                  | 1 |
     * ( y' )fractional = mat |21 22 23| * ( y ) Cartesian + vec| 2 |
     * z'                   |31 32 33|     z                  | 3 |
     * 
     * The default transformation matrix uses Rollet's axial
     * assignments with cell vectors a,b,c aligned with orthogonal
     * axes X,Y,Z so that c||Z and b in plane YZ.
     * @return StrColumn
     */
    public StrColumn getMatrix() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_matrix"));
    }

    /**
     * 
     * The 3x1 translation is used with _atom_sites_fract_transform.matrix
     * used to transform Cartesian coordinates to fractional  coordinates.
     * The axial alignments of this transformation are described in
     * _atom_sites_fract_transform.axes.
     * @return StrColumn
     */
    public StrColumn getVector() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_vector"));
    }
}
