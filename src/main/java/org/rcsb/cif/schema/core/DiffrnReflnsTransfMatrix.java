package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The CATEGORY of data items which specify the elements of the matrix
 * used to transform the reflection indices _diffrn_refln.hkl
 * into _refln.hkl.
 * |11 12 13|
 * (h k l) diffraction  |21 22 23|  =  (h' k' l')
 * |31 32 33|
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class DiffrnReflnsTransfMatrix extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "diffrn_reflns_transf_matrix";

    public DiffrnReflnsTransfMatrix(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * Elements of the matrix used to transform the diffraction reflection
     * indices _diffrn_refln.hkl into the _refln.hkl indices.
     * |11 12 13|
     * (h k l) diffraction  |21 22 23|  =  (h' k' l')
     * |31 32 33|
     * @return FloatColumn
     */
    public FloatColumn getTij() {
        return new DelegatingFloatColumn(parentBlock.getColumn("diffrn_reflns_transf_matrix_tij"));
    }

    /**
     * The set of data items which specify the elements of the matrix
     * used to transform the reflection indices _diffrn_refln.hkl
     * into _refln.hkl.
     * @return FloatColumn
     */
    public FloatColumn get_11() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_reflns_transf_matrix[1][1]", "diffrn_reflns_transf_matrix_11"));
    }

    /**
     * The set of data items which specify the elements of the matrix
     * used to transform the reflection indices _diffrn_refln.hkl
     * into _refln.hkl.
     * @return FloatColumn
     */
    public FloatColumn get_12() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_reflns_transf_matrix[1][2]", "diffrn_reflns_transf_matrix_12"));
    }

    /**
     * The set of data items which specify the elements of the matrix
     * used to transform the reflection indices _diffrn_refln.hkl
     * into _refln.hkl.
     * @return FloatColumn
     */
    public FloatColumn get_13() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_reflns_transf_matrix[1][3]", "diffrn_reflns_transf_matrix_13"));
    }

    /**
     * The set of data items which specify the elements of the matrix
     * used to transform the reflection indices _diffrn_refln.hkl
     * into _refln.hkl.
     * @return FloatColumn
     */
    public FloatColumn get_21() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_reflns_transf_matrix[2][1]", "diffrn_reflns_transf_matrix_21"));
    }

    /**
     * The set of data items which specify the elements of the matrix
     * used to transform the reflection indices _diffrn_refln.hkl
     * into _refln.hkl.
     * @return FloatColumn
     */
    public FloatColumn get_22() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_reflns_transf_matrix[2][2]", "diffrn_reflns_transf_matrix_22"));
    }

    /**
     * The set of data items which specify the elements of the matrix
     * used to transform the reflection indices _diffrn_refln.hkl
     * into _refln.hkl.
     * @return FloatColumn
     */
    public FloatColumn get_23() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_reflns_transf_matrix[2][3]", "diffrn_reflns_transf_matrix_23"));
    }

    /**
     * The set of data items which specify the elements of the matrix
     * used to transform the reflection indices _diffrn_refln.hkl
     * into _refln.hkl.
     * @return FloatColumn
     */
    public FloatColumn get_31() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_reflns_transf_matrix[3][1]", "diffrn_reflns_transf_matrix_31"));
    }

    /**
     * The set of data items which specify the elements of the matrix
     * used to transform the reflection indices _diffrn_refln.hkl
     * into _refln.hkl.
     * @return FloatColumn
     */
    public FloatColumn get_32() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_reflns_transf_matrix[3][2]", "diffrn_reflns_transf_matrix_32"));
    }

    /**
     * The set of data items which specify the elements of the matrix
     * used to transform the reflection indices _diffrn_refln.hkl
     * into _refln.hkl.
     * @return FloatColumn
     */
    public FloatColumn get_33() {
        return new DelegatingFloatColumn(parentBlock.getAliasedColumn("diffrn_reflns_transf_matrix[3][3]", "diffrn_reflns_transf_matrix_33"));
    }

}