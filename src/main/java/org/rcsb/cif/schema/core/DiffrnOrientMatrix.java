package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
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
     * 
     * Description of orientation matrix and how it should be applied to define
     * the orientation of the crystal with respect to the diffractometer axes.
     * @return StrColumn
     */
    public StrColumn getType() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_type"));
    }

    /**
     * 
     * The set of data items which specify the elements of the matrix of
     * the orientation of the crystal axes to the diffractometer goniometer.
     * @return FloatColumn
     */
    public FloatColumn getUB11() {
        return new DelegatingFloatColumn(parentBlock.getColumn(NAME + "_UB_11"));
    }

    /**
     * 
     * The set of data items which specify the elements of the matrix of
     * the orientation of the crystal axes to the diffractometer goniometer.
     * @return FloatColumn
     */
    public FloatColumn getUB12() {
        return new DelegatingFloatColumn(parentBlock.getColumn(NAME + "_UB_12"));
    }

    /**
     * 
     * The set of data items which specify the elements of the matrix of
     * the orientation of the crystal axes to the diffractometer goniometer.
     * @return FloatColumn
     */
    public FloatColumn getUB13() {
        return new DelegatingFloatColumn(parentBlock.getColumn(NAME + "_UB_13"));
    }

    /**
     * 
     * The set of data items which specify the elements of the matrix of
     * the orientation of the crystal axes to the diffractometer goniometer.
     * @return FloatColumn
     */
    public FloatColumn getUB21() {
        return new DelegatingFloatColumn(parentBlock.getColumn(NAME + "_UB_21"));
    }

    /**
     * 
     * The set of data items which specify the elements of the matrix of
     * the orientation of the crystal axes to the diffractometer goniometer.
     * @return FloatColumn
     */
    public FloatColumn getUB22() {
        return new DelegatingFloatColumn(parentBlock.getColumn(NAME + "_UB_22"));
    }

    /**
     * 
     * The set of data items which specify the elements of the matrix of
     * the orientation of the crystal axes to the diffractometer goniometer.
     * @return FloatColumn
     */
    public FloatColumn getUB23() {
        return new DelegatingFloatColumn(parentBlock.getColumn(NAME + "_UB_23"));
    }

    /**
     * 
     * The set of data items which specify the elements of the matrix of
     * the orientation of the crystal axes to the diffractometer goniometer.
     * @return FloatColumn
     */
    public FloatColumn getUB31() {
        return new DelegatingFloatColumn(parentBlock.getColumn(NAME + "_UB_31"));
    }

    /**
     * 
     * The set of data items which specify the elements of the matrix of
     * the orientation of the crystal axes to the diffractometer goniometer.
     * @return FloatColumn
     */
    public FloatColumn getUB32() {
        return new DelegatingFloatColumn(parentBlock.getColumn(NAME + "_UB_32"));
    }

    /**
     * 
     * The set of data items which specify the elements of the matrix of
     * the orientation of the crystal axes to the diffractometer goniometer.
     * @return FloatColumn
     */
    public FloatColumn getUB33() {
        return new DelegatingFloatColumn(parentBlock.getColumn(NAME + "_UB_33"));
    }

    /**
     * 
     * The 3x3 matrix specifying the orientation of the crystal with
     * respect to the diffractometer axes.
     * @return FloatColumn
     */
    public FloatColumn getUBIJ() {
        return new DelegatingFloatColumn(parentBlock.getColumn(NAME + "_UBIJ"));
    }
}
