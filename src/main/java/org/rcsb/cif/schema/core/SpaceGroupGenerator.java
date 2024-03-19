package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The CATEGORY of data items used to list generators for
 * the space group
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class SpaceGroupGenerator extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "space_group_generator";

    public SpaceGroupGenerator(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * Arbitrary identifier for each entry in the _space_group_generator.xyz list.
     * @return StrColumn
     */
    public StrColumn getKey() {
        return new DelegatingStrColumn(parentBlock.getColumn("space_group_generator_key"));
    }

    /**
     * A parsable string giving one of the symmetry generators of the
     * space group in algebraic form.  If W is a matrix representation
     * of the rotational part of the generator defined by the positions
     * and signs of x, y and z, and w is a column of translations
     * defined by the fractions, an equivalent position X' is
     * generated from a given position X by
     * 
     * X' = WX + w.
     * 
     * (Note: X is used to represent the bold italic x in International
     * Tables for Crystallography Volume A, Section 5.)
     * 
     * When a list of symmetry generators is given, it is assumed
     * that the complete list of symmetry operations of the space
     * group (including the identity operation) can be generated
     * through repeated multiplication of the generators, that is,
     * (W3, w3) is an operation of the space group if (W2,w2) and
     * (W1,w1) [where (W1,w1) is applied first] are either operations
     * or generators and:
     * 
     * W3 = W2 x W1
     * w3 = W2 x w1 + w2.
     * 
     * Ref: International Tables for Crystallography (2002). Volume A,
     * Space-group symmetry, edited by Th. Hahn, 5th ed.
     * Dordrecht: Kluwer Academic Publishers.
     * @return StrColumn
     */
    public StrColumn getXyz() {
        return new DelegatingStrColumn(parentBlock.getColumn("space_group_generator_xyz"));
    }

}