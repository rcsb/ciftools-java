package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The CATEGORY of data items which specify the matrix specifying the
 * orientation of the crystal axes to the diffractometer goniometer.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class DiffrnOrientMatrix extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "diffrn_orient_matrix";

    public DiffrnOrientMatrix(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * Description of orientation matrix and how it should be applied to define
     * the orientation of the crystal with respect to the diffractometer axes.
     * @return StrColumn
     */
    public StrColumn getType() {
        return new DelegatingStrColumn(parentBlock.getColumn("diffrn_orient_matrix_type"));
    }

    /**
     * The 3x3 matrix specifying the orientation of the crystal with
     * respect to the diffractometer axes.
     * @return FloatColumn
     */
    public FloatColumn getUbij() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_orient_matrix_ubij"));
    }

    /**
     * The set of data items which specify the elements of the matrix of
     * the orientation of the crystal axes to the diffractometer goniometer.
     * @return FloatColumn
     */
    public FloatColumn getUB11() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_orient_matrix_UB[1][1]", "diffrn_orient_matrix_ub_11"));
    }

    /**
     * The set of data items which specify the elements of the matrix of
     * the orientation of the crystal axes to the diffractometer goniometer.
     * @return FloatColumn
     */
    public FloatColumn getUb11() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_orient_matrix_UB[1][1]", "diffrn_orient_matrix_ub_11"));
    }

    /**
     * The set of data items which specify the elements of the matrix of
     * the orientation of the crystal axes to the diffractometer goniometer.
     * @return FloatColumn
     */
    public FloatColumn getUB12() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_orient_matrix_UB[1][2]", "diffrn_orient_matrix_ub_12"));
    }

    /**
     * The set of data items which specify the elements of the matrix of
     * the orientation of the crystal axes to the diffractometer goniometer.
     * @return FloatColumn
     */
    public FloatColumn getUb12() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_orient_matrix_UB[1][2]", "diffrn_orient_matrix_ub_12"));
    }

    /**
     * The set of data items which specify the elements of the matrix of
     * the orientation of the crystal axes to the diffractometer goniometer.
     * @return FloatColumn
     */
    public FloatColumn getUB13() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_orient_matrix_UB[1][3]", "diffrn_orient_matrix_ub_13"));
    }

    /**
     * The set of data items which specify the elements of the matrix of
     * the orientation of the crystal axes to the diffractometer goniometer.
     * @return FloatColumn
     */
    public FloatColumn getUb13() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_orient_matrix_UB[1][3]", "diffrn_orient_matrix_ub_13"));
    }

    /**
     * The set of data items which specify the elements of the matrix of
     * the orientation of the crystal axes to the diffractometer goniometer.
     * @return FloatColumn
     */
    public FloatColumn getUB21() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_orient_matrix_UB[2][1]", "diffrn_orient_matrix_ub_21"));
    }

    /**
     * The set of data items which specify the elements of the matrix of
     * the orientation of the crystal axes to the diffractometer goniometer.
     * @return FloatColumn
     */
    public FloatColumn getUb21() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_orient_matrix_UB[2][1]", "diffrn_orient_matrix_ub_21"));
    }

    /**
     * The set of data items which specify the elements of the matrix of
     * the orientation of the crystal axes to the diffractometer goniometer.
     * @return FloatColumn
     */
    public FloatColumn getUB22() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_orient_matrix_UB[2][2]", "diffrn_orient_matrix_ub_22"));
    }

    /**
     * The set of data items which specify the elements of the matrix of
     * the orientation of the crystal axes to the diffractometer goniometer.
     * @return FloatColumn
     */
    public FloatColumn getUb22() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_orient_matrix_UB[2][2]", "diffrn_orient_matrix_ub_22"));
    }

    /**
     * The set of data items which specify the elements of the matrix of
     * the orientation of the crystal axes to the diffractometer goniometer.
     * @return FloatColumn
     */
    public FloatColumn getUB23() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_orient_matrix_UB[2][3]", "diffrn_orient_matrix_ub_23"));
    }

    /**
     * The set of data items which specify the elements of the matrix of
     * the orientation of the crystal axes to the diffractometer goniometer.
     * @return FloatColumn
     */
    public FloatColumn getUb23() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_orient_matrix_UB[2][3]", "diffrn_orient_matrix_ub_23"));
    }

    /**
     * The set of data items which specify the elements of the matrix of
     * the orientation of the crystal axes to the diffractometer goniometer.
     * @return FloatColumn
     */
    public FloatColumn getUB31() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_orient_matrix_UB[3][1]", "diffrn_orient_matrix_ub_31"));
    }

    /**
     * The set of data items which specify the elements of the matrix of
     * the orientation of the crystal axes to the diffractometer goniometer.
     * @return FloatColumn
     */
    public FloatColumn getUb31() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_orient_matrix_UB[3][1]", "diffrn_orient_matrix_ub_31"));
    }

    /**
     * The set of data items which specify the elements of the matrix of
     * the orientation of the crystal axes to the diffractometer goniometer.
     * @return FloatColumn
     */
    public FloatColumn getUB32() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_orient_matrix_UB[3][2]", "diffrn_orient_matrix_ub_32"));
    }

    /**
     * The set of data items which specify the elements of the matrix of
     * the orientation of the crystal axes to the diffractometer goniometer.
     * @return FloatColumn
     */
    public FloatColumn getUb32() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_orient_matrix_UB[3][2]", "diffrn_orient_matrix_ub_32"));
    }

    /**
     * The set of data items which specify the elements of the matrix of
     * the orientation of the crystal axes to the diffractometer goniometer.
     * @return FloatColumn
     */
    public FloatColumn getUB33() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_orient_matrix_UB[3][3]", "diffrn_orient_matrix_ub_33"));
    }

    /**
     * The set of data items which specify the elements of the matrix of
     * the orientation of the crystal axes to the diffractometer goniometer.
     * @return FloatColumn
     */
    public FloatColumn getUb33() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_orient_matrix_UB[3][3]", "diffrn_orient_matrix_ub_33"));
    }

}