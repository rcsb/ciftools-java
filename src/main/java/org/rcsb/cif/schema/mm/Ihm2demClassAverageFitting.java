package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_2DEM_CLASS_AVERAGE_FITTING category records the
 * details of the fitting of the model to the 2DEM class averages
 * used in the IHM modeling. The following conventions are recommended
 * while generating the rotation matrix and translation vector for
 * transformation.
 * 
 * - The model is rotated and translated to fit to the 2DEM image.
 * - The 2DEM image should be in the XY plane.
 * - The lower left image corner (image pixel index 0,0) should be at x,y,z = (0,0,0).
 * - The 2D image is scaled by the _ihm_2dem_class_average_restraint.pixel_size_width
 * and _ihm_2dem_class_average_restraint.pixel_size_height from the
 * IHM_2DEM_CLASS_AVERAGE_RESTRAINT table.
 * - The transformation is applied after the scaling and hence the translation vector
 * should account for the scaling.
 * - There are no specifications for Z translations i.e., how far the image should be
 * from the model while projecting. It may be set to zero.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Ihm2demClassAverageFitting extends DelegatingCategory {
    public Ihm2demClassAverageFitting(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "restraint_id":
                return getRestraintId();
            case "model_id":
                return getModelId();
            case "cross_correlation_coefficient":
                return getCrossCorrelationCoefficient();
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
     * A unique identifier for the 2dem class average fitting data.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * Identifier to the 2dem class average restraint.
     * This data item is a pointer to the _ihm_2dem_class_average_restraint.id in the
     * IHM_2DEM_CLASS_AVERAGE_RESTRAINT category.
     * @return IntColumn
     */
    public IntColumn getRestraintId() {
        return delegate.getColumn("restraint_id", DelegatingIntColumn::new);
    }

    /**
     * The model number corresponding to the 2DEM fitting result presented.
     * This data item is a pointer to _ihm_model_list.model_id in the
     * IHM_MODEL_LIST category.
     * @return IntColumn
     */
    public IntColumn getModelId() {
        return delegate.getColumn("model_id", DelegatingIntColumn::new);
    }

    /**
     * The cross correlation coefficient corresponding to the model to image fitting.
     * @return FloatColumn
     */
    public FloatColumn getCrossCorrelationCoefficient() {
        return delegate.getColumn("cross_correlation_coefficient", DelegatingFloatColumn::new);
    }

    /**
     * Data item  of the rotation matrix used in the fitting of the model to the image.
     * @return FloatColumn
     */
    public FloatColumn getRotMatrix11() {
        return delegate.getColumn("rot_matrix[1][1]", DelegatingFloatColumn::new);
    }

    /**
     * Data item  of the rotation matrix used in the fitting of the model to the image.
     * @return FloatColumn
     */
    public FloatColumn getRotMatrix21() {
        return delegate.getColumn("rot_matrix[2][1]", DelegatingFloatColumn::new);
    }

    /**
     * Data item  of the rotation matrix used in the fitting of the model to the image.
     * @return FloatColumn
     */
    public FloatColumn getRotMatrix31() {
        return delegate.getColumn("rot_matrix[3][1]", DelegatingFloatColumn::new);
    }

    /**
     * Data item  of the rotation matrix used in the fitting of the model to the image.
     * @return FloatColumn
     */
    public FloatColumn getRotMatrix12() {
        return delegate.getColumn("rot_matrix[1][2]", DelegatingFloatColumn::new);
    }

    /**
     * Data item  of the rotation matrix used in the fitting of the model to the image.
     * @return FloatColumn
     */
    public FloatColumn getRotMatrix22() {
        return delegate.getColumn("rot_matrix[2][2]", DelegatingFloatColumn::new);
    }

    /**
     * Data item  of the rotation matrix used in the fitting of the model to the image.
     * @return FloatColumn
     */
    public FloatColumn getRotMatrix32() {
        return delegate.getColumn("rot_matrix[3][2]", DelegatingFloatColumn::new);
    }

    /**
     * Data item  of the rotation matrix used in the fitting of the model to the image.
     * @return FloatColumn
     */
    public FloatColumn getRotMatrix13() {
        return delegate.getColumn("rot_matrix[1][3]", DelegatingFloatColumn::new);
    }

    /**
     * Data item  of the rotation matrix used in the fitting of the model to the image.
     * @return FloatColumn
     */
    public FloatColumn getRotMatrix23() {
        return delegate.getColumn("rot_matrix[2][3]", DelegatingFloatColumn::new);
    }

    /**
     * Data item  of the rotation matrix used in the fitting of the model to the image.
     * @return FloatColumn
     */
    public FloatColumn getRotMatrix33() {
        return delegate.getColumn("rot_matrix[3][3]", DelegatingFloatColumn::new);
    }

    /**
     * Data item  of the tranlation vector used in the fitting of the model to the image.
     * @return FloatColumn
     */
    public FloatColumn getTrVector1() {
        return delegate.getColumn("tr_vector[1]", DelegatingFloatColumn::new);
    }

    /**
     * Data item  of the tranlation vector used in the fitting of the model to the image.
     * @return FloatColumn
     */
    public FloatColumn getTrVector2() {
        return delegate.getColumn("tr_vector[2]", DelegatingFloatColumn::new);
    }

    /**
     * Data item  of the tranlation vector used in the fitting of the model to the image.
     * @return FloatColumn
     */
    public FloatColumn getTrVector3() {
        return delegate.getColumn("tr_vector[3]", DelegatingFloatColumn::new);
    }

}