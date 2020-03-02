package org.rcsb.cif.schema.generated.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
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
     * 
     * The set of data items which specify the elements of the matrix
     * used to transform the reflection indices _diffrn_refln.hkl
     * into _refln.hkl.
     * @return StrColumn
     */
    public StrColumn get_11() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_11"));
    }

    /**
     * 
     * The set of data items which specify the elements of the matrix
     * used to transform the reflection indices _diffrn_refln.hkl
     * into _refln.hkl.
     * @return StrColumn
     */
    public StrColumn get_12() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_12"));
    }

    /**
     * 
     * The set of data items which specify the elements of the matrix
     * used to transform the reflection indices _diffrn_refln.hkl
     * into _refln.hkl.
     * @return StrColumn
     */
    public StrColumn get_13() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_13"));
    }

    /**
     * 
     * The set of data items which specify the elements of the matrix
     * used to transform the reflection indices _diffrn_refln.hkl
     * into _refln.hkl.
     * @return StrColumn
     */
    public StrColumn get_21() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_21"));
    }

    /**
     * 
     * The set of data items which specify the elements of the matrix
     * used to transform the reflection indices _diffrn_refln.hkl
     * into _refln.hkl.
     * @return StrColumn
     */
    public StrColumn get_22() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_22"));
    }

    /**
     * 
     * The set of data items which specify the elements of the matrix
     * used to transform the reflection indices _diffrn_refln.hkl
     * into _refln.hkl.
     * @return StrColumn
     */
    public StrColumn get_23() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_23"));
    }

    /**
     * 
     * The set of data items which specify the elements of the matrix
     * used to transform the reflection indices _diffrn_refln.hkl
     * into _refln.hkl.
     * @return StrColumn
     */
    public StrColumn get_31() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_31"));
    }

    /**
     * 
     * The set of data items which specify the elements of the matrix
     * used to transform the reflection indices _diffrn_refln.hkl
     * into _refln.hkl.
     * @return StrColumn
     */
    public StrColumn get_32() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_32"));
    }

    /**
     * 
     * The set of data items which specify the elements of the matrix
     * used to transform the reflection indices _diffrn_refln.hkl
     * into _refln.hkl.
     * @return StrColumn
     */
    public StrColumn get_33() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_33"));
    }

    /**
     * 
     * Elements of the matrix used to transform the diffraction reflection
     * indices _diffrn_refln.hkl into the _refln.hkl indices.
     * |11 12 13|
     * (h k l) diffraction  |21 22 23|  =  (h' k' l')
     * |31 32 33|
     * @return StrColumn
     */
    public StrColumn getTIJ() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_TIJ"));
    }
}
