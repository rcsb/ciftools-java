package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

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
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class Ihm2demClassAverageFitting extends BaseCategory {
    public Ihm2demClassAverageFitting(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public Ihm2demClassAverageFitting(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public Ihm2demClassAverageFitting(String name) {
        super(name);
    }

    /**
     * A unique identifier for the 2dem class average fitting data.
     * @return IntColumn
     */
    public IntColumn getOrdinalId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ordinal_id", IntColumn::new) :
                getBinaryColumn("ordinal_id"));
    }

    /**
     * Identifier to the 2dem class average restraint.
     * This data item is a pointer to the _ihm_2dem_class_average_restraint.id in the
     * IHM_2DEM_CLASS_AVERAGE_RESTRAINT category.
     * @return IntColumn
     */
    public IntColumn getRestraintId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("restraint_id", IntColumn::new) :
                getBinaryColumn("restraint_id"));
    }

    /**
     * The model number corresponding to the 2DEM fitting result presented.
     * This data item is a pointer to _ihm_model_list.model_id in the
     * IHM_MODEL_LIST category.
     * @return IntColumn
     */
    public IntColumn getModelId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("model_id", IntColumn::new) :
                getBinaryColumn("model_id"));
    }

    /**
     * The cross correlation coefficient corresponding to the model to image fitting.
     * @return FloatColumn
     */
    public FloatColumn getCrossCorrelationCoefficient() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("cross_correlation_coefficient", FloatColumn::new) :
                getBinaryColumn("cross_correlation_coefficient"));
    }

    /**
     * Data item  of the rotation matrix used in the fitting of the model to the image.
     * @return FloatColumn
     */
    public FloatColumn getRotMatrix11() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("rot_matrix[1][1]", FloatColumn::new) :
                getBinaryColumn("rot_matrix[1][1]"));
    }

    /**
     * Data item  of the rotation matrix used in the fitting of the model to the image.
     * @return FloatColumn
     */
    public FloatColumn getRotMatrix21() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("rot_matrix[2][1]", FloatColumn::new) :
                getBinaryColumn("rot_matrix[2][1]"));
    }

    /**
     * Data item  of the rotation matrix used in the fitting of the model to the image.
     * @return FloatColumn
     */
    public FloatColumn getRotMatrix31() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("rot_matrix[3][1]", FloatColumn::new) :
                getBinaryColumn("rot_matrix[3][1]"));
    }

    /**
     * Data item  of the rotation matrix used in the fitting of the model to the image.
     * @return FloatColumn
     */
    public FloatColumn getRotMatrix12() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("rot_matrix[1][2]", FloatColumn::new) :
                getBinaryColumn("rot_matrix[1][2]"));
    }

    /**
     * Data item  of the rotation matrix used in the fitting of the model to the image.
     * @return FloatColumn
     */
    public FloatColumn getRotMatrix22() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("rot_matrix[2][2]", FloatColumn::new) :
                getBinaryColumn("rot_matrix[2][2]"));
    }

    /**
     * Data item  of the rotation matrix used in the fitting of the model to the image.
     * @return FloatColumn
     */
    public FloatColumn getRotMatrix32() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("rot_matrix[3][2]", FloatColumn::new) :
                getBinaryColumn("rot_matrix[3][2]"));
    }

    /**
     * Data item  of the rotation matrix used in the fitting of the model to the image.
     * @return FloatColumn
     */
    public FloatColumn getRotMatrix13() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("rot_matrix[1][3]", FloatColumn::new) :
                getBinaryColumn("rot_matrix[1][3]"));
    }

    /**
     * Data item  of the rotation matrix used in the fitting of the model to the image.
     * @return FloatColumn
     */
    public FloatColumn getRotMatrix23() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("rot_matrix[2][3]", FloatColumn::new) :
                getBinaryColumn("rot_matrix[2][3]"));
    }

    /**
     * Data item  of the rotation matrix used in the fitting of the model to the image.
     * @return FloatColumn
     */
    public FloatColumn getRotMatrix33() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("rot_matrix[3][3]", FloatColumn::new) :
                getBinaryColumn("rot_matrix[3][3]"));
    }

    /**
     * Data item  of the tranlation vector used in the fitting of the model to the image.
     * @return FloatColumn
     */
    public FloatColumn getTrVector1() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("tr_vector[1]", FloatColumn::new) :
                getBinaryColumn("tr_vector[1]"));
    }

    /**
     * Data item  of the tranlation vector used in the fitting of the model to the image.
     * @return FloatColumn
     */
    public FloatColumn getTrVector2() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("tr_vector[2]", FloatColumn::new) :
                getBinaryColumn("tr_vector[2]"));
    }

    /**
     * Data item  of the tranlation vector used in the fitting of the model to the image.
     * @return FloatColumn
     */
    public FloatColumn getTrVector3() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("tr_vector[3]", FloatColumn::new) :
                getBinaryColumn("tr_vector[3]"));
    }
}
