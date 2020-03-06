package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class SymmetryEquiv extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "symmetry_equiv";

    public SymmetryEquiv(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * Index identifying each entry in the _space_group_symop.operation_xyz
     * list. It is normally the sequence number of the entry in that
     * list, and should be identified with the code 'n' in the geometry
     * symmetry codes of the form 'n_pqr'. The identity operation
     * (i.e. _space_group_symop.operation_xyz set to 'x,y,z') should be
     * set to 1.
     * @return IntColumn
     */
    public IntColumn getPosSiteId() {
        return new DelegatingIntColumn(parentBlock.getAliasedColumn("symmetry_equiv_pos_site_id", "space_group_symop_id"));
    }

    /**
     * A parsable string giving one of the symmetry operations of the
     * space group in algebraic form.  If W is a matrix representation
     * of the rotational part of the symmetry operation defined by the
     * positions and signs of x, y and z, and w is a column of
     * translations defined by fractions, an equivalent position
     * X' is generated from a given position X by the equation
     * 
     * X' = WX + w
     * 
     * (Note: X is used to represent bold_italics_x in International
     * Tables for Crystallography Vol. A, Part 5)
     * 
     * When a list of symmetry operations is given, it must contain
     * a complete set of coordinate representatives which generates
     * all the operations of the space group by the addition of
     * all primitive translations of the space group. Such
     * representatives are to be found as the coordinates of
     * the general-equivalent position in International Tables for
     * Crystallography Vol. A (2002), to which it is necessary to
     * add any centring translations shown above the
     * general-equivalent position.
     * 
     * That is to say, it is necessary to list explicitly all the
     * symmetry operations required to generate all the atoms in
     * the unit cell defined by the setting used.
     * @return StrColumn
     */
    public StrColumn getPosAsXyz() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("symmetry_equiv_pos_as_xyz", "space_group_symop_operation_xyz"));
    }

}