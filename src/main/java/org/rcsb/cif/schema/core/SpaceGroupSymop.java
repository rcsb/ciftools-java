package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The CATEGORY of data items used to describe symmetry equivalent sites
 * in the crystal unit cell.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class SpaceGroupSymop extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "space_group_symop";

    public SpaceGroupSymop(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * An optional text description of a particular symmetry operation
     * of the space group.
     * @return StrColumn
     */
    public StrColumn getOperationDescription() {
        return new DelegatingStrColumn(parentBlock.getColumn("space_group_symop_operation_description"));
    }

    /**
     * A matrix containing the symmetry rotation operations of a space group
     * 
     * |  r11  r12  r13  |
     * R  =  |  r21  r22  r23  |
     * |  r31  r32  r33  |
     * @return FloatColumn
     */
    public FloatColumn getR() {
        return new DelegatingFloatColumn(parentBlock.getColumn("space_group_symop_r"));
    }

    /**
     * The TRANSPOSE of the symmetry rotation matrix representing the point
     * group operations of the space group
     * 
     * |  r11  r21  r31  |
     * RT  =  |  r12  r22  r32  |
     * |  r13  r23  r33  |
     * @return FloatColumn
     */
    public FloatColumn getRt() {
        return new DelegatingFloatColumn(parentBlock.getColumn("space_group_symop_rt"));
    }

    /**
     * A matrix containing the symmetry operations of a space group
     * in 4x4 Seitz format.
     * 
     * |  r11  r12  r13  t1  |
     * | R  T |     |  r21  r22  r23  t2  |
     * | 0  1 |     |  r31  r32  r33  t3  |
     * |   0    0    0    1  |
     * @return FloatColumn
     */
    public FloatColumn getSeitzMatrix() {
        return new DelegatingFloatColumn(parentBlock.getColumn("space_group_symop_seitz_matrix"));
    }

    /**
     * A vector containing the symmetry translation operations of a space group.
     * @return FloatColumn
     */
    public FloatColumn getT() {
        return new DelegatingFloatColumn(parentBlock.getColumn("space_group_symop_t"));
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
    public IntColumn getId() {
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
    public StrColumn getOperationXyz() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("symmetry_equiv_pos_as_xyz", "space_group_symop_operation_xyz"));
    }

}