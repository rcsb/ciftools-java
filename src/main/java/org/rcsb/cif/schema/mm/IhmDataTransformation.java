package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_DATA_TRANSFORMATION category records the
 * details of the rotation matrix and translation vector that can be
 * applied to transform the data.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmDataTransformation extends DelegatingCategory {
    public IhmDataTransformation(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "rot_matrix[1][1]":
                return getRotMatrix11();
            case "rot_matrix[2][1]":
                return getRotMatrix21();
            case "rot_matrix[3][1]":
                return getRotMatrix31();
            case "rot_matrix[1][2]":
                return getRotMatrix12();
            case "rot_matrix[2][2]":
                return getRotMatrix22();
            case "rot_matrix[3][2]":
                return getRotMatrix32();
            case "rot_matrix[1][3]":
                return getRotMatrix13();
            case "rot_matrix[2][3]":
                return getRotMatrix23();
            case "rot_matrix[3][3]":
                return getRotMatrix33();
            case "tr_vector[1]":
                return getTrVector1();
            case "tr_vector[2]":
                return getTrVector2();
            case "tr_vector[3]":
                return getTrVector3();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the transformation.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * Data item  of the rotation matrix used in the transformation.
     * @return FloatColumn
     */
    public FloatColumn getRotMatrix11() {
        return delegate.getColumn("rot_matrix[1][1]", DelegatingFloatColumn::new);
    }

    /**
     * Data item  of the rotation matrix used in the transformation.
     * @return FloatColumn
     */
    public FloatColumn getRotMatrix21() {
        return delegate.getColumn("rot_matrix[2][1]", DelegatingFloatColumn::new);
    }

    /**
     * Data item  of the rotation matrix used in the transformation.
     * @return FloatColumn
     */
    public FloatColumn getRotMatrix31() {
        return delegate.getColumn("rot_matrix[3][1]", DelegatingFloatColumn::new);
    }

    /**
     * Data item  of the rotation matrix used in the transformation.
     * @return FloatColumn
     */
    public FloatColumn getRotMatrix12() {
        return delegate.getColumn("rot_matrix[1][2]", DelegatingFloatColumn::new);
    }

    /**
     * Data item  of the rotation matrix used in the transformation.
     * @return FloatColumn
     */
    public FloatColumn getRotMatrix22() {
        return delegate.getColumn("rot_matrix[2][2]", DelegatingFloatColumn::new);
    }

    /**
     * Data item  of the rotation matrix used in the transformation.
     * @return FloatColumn
     */
    public FloatColumn getRotMatrix32() {
        return delegate.getColumn("rot_matrix[3][2]", DelegatingFloatColumn::new);
    }

    /**
     * Data item  of the rotation matrix used in the transformation.
     * @return FloatColumn
     */
    public FloatColumn getRotMatrix13() {
        return delegate.getColumn("rot_matrix[1][3]", DelegatingFloatColumn::new);
    }

    /**
     * Data item  of the rotation matrix used in the transformation.
     * @return FloatColumn
     */
    public FloatColumn getRotMatrix23() {
        return delegate.getColumn("rot_matrix[2][3]", DelegatingFloatColumn::new);
    }

    /**
     * Data item  of the rotation matrix used in the transformation.
     * @return FloatColumn
     */
    public FloatColumn getRotMatrix33() {
        return delegate.getColumn("rot_matrix[3][3]", DelegatingFloatColumn::new);
    }

    /**
     * Data item  of the translation vector used in the transformation.
     * @return FloatColumn
     */
    public FloatColumn getTrVector1() {
        return delegate.getColumn("tr_vector[1]", DelegatingFloatColumn::new);
    }

    /**
     * Data item  of the translation vector used in the transformation.
     * @return FloatColumn
     */
    public FloatColumn getTrVector2() {
        return delegate.getColumn("tr_vector[2]", DelegatingFloatColumn::new);
    }

    /**
     * Data item  of the translation vector used in the transformation.
     * @return FloatColumn
     */
    public FloatColumn getTrVector3() {
        return delegate.getColumn("tr_vector[3]", DelegatingFloatColumn::new);
    }

}