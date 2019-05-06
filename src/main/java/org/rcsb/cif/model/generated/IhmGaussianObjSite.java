package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the IHM_GAUSSIAN_OBJ_SITE category records the details
 * of the gaussian objects modeled in the integrative structural model.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class IhmGaussianObjSite extends BaseCategory {
    public IhmGaussianObjSite(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public IhmGaussianObjSite(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public IhmGaussianObjSite(String name) {
        super(name);
    }

    /**
     * A unique identifier for this gaussian object in the model.
     * @return IntColumn
     */
    public IntColumn getOrdinalId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ordinal_id", IntColumn::new) :
                getBinaryColumn("ordinal_id"));
    }

    /**
     * The entity identifier corresponding to this gaussian object.
     * This data item is a pointer to _entity.id in the ENTITY category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id", StrColumn::new) :
                getBinaryColumn("entity_id"));
    }

    /**
     * The leading sequence index corresponding to this gaussian object.
     * This data item is a pointer to _entity_poly_seq.num in the ENTITY_POLY category.
     * @return IntColumn
     */
    public IntColumn getSeqIdBegin() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("seq_id_begin", IntColumn::new) :
                getBinaryColumn("seq_id_begin"));
    }

    /**
     * The trailing sequence index corresponding to this gaussian object.
     * This data item is a pointer to _entity_poly_seq.num in the ENTITY_POLY category.
     * @return IntColumn
     */
    public IntColumn getSeqIdEnd() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("seq_id_end", IntColumn::new) :
                getBinaryColumn("seq_id_end"));
    }

    /**
     * An asym/strand identifier corresponding to this gaussian object.
     * This data item is a pointer to _struct_asym.id in the STRUCT_ASYM category.
     * @return StrColumn
     */
    public StrColumn getAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("asym_id", StrColumn::new) :
                getBinaryColumn("asym_id"));
    }

    /**
     * The mean Cartesian X component corresponding to this gaussian object.
     * @return FloatColumn
     */
    public FloatColumn getMeanCartnX() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("mean_Cartn_x", FloatColumn::new) :
                getBinaryColumn("mean_Cartn_x"));
    }

    /**
     * The mean Cartesian Y component corresponding to this gaussian object.
     * @return FloatColumn
     */
    public FloatColumn getMeanCartnY() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("mean_Cartn_y", FloatColumn::new) :
                getBinaryColumn("mean_Cartn_y"));
    }

    /**
     * The mean Cartesian Z component corresponding to this gaussian object.
     * @return FloatColumn
     */
    public FloatColumn getMeanCartnZ() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("mean_Cartn_z", FloatColumn::new) :
                getBinaryColumn("mean_Cartn_z"));
    }

    /**
     * The weight of the gaussian object.
     * @return FloatColumn
     */
    public FloatColumn getWeight() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("weight", FloatColumn::new) :
                getBinaryColumn("weight"));
    }

    /**
     * Data item  of the covariance matrix representing the Gaussian object.
     * @return FloatColumn
     */
    public FloatColumn getCovarianceMatrix11() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("covariance_matrix[1][1]", FloatColumn::new) :
                getBinaryColumn("covariance_matrix[1][1]"));
    }

    /**
     * Data item  of the covariance matrix representing the Gaussian object.
     * @return FloatColumn
     */
    public FloatColumn getCovarianceMatrix12() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("covariance_matrix[1][2]", FloatColumn::new) :
                getBinaryColumn("covariance_matrix[1][2]"));
    }

    /**
     * Data item  of the covariance matrix representing the Gaussian object.
     * @return FloatColumn
     */
    public FloatColumn getCovarianceMatrix13() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("covariance_matrix[1][3]", FloatColumn::new) :
                getBinaryColumn("covariance_matrix[1][3]"));
    }

    /**
     * Data item  of the covariance matrix representing the Gaussian object.
     * @return FloatColumn
     */
    public FloatColumn getCovarianceMatrix21() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("covariance_matrix[2][1]", FloatColumn::new) :
                getBinaryColumn("covariance_matrix[2][1]"));
    }

    /**
     * Data item  of the covariance matrix representing the Gaussian object.
     * @return FloatColumn
     */
    public FloatColumn getCovarianceMatrix22() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("covariance_matrix[2][2]", FloatColumn::new) :
                getBinaryColumn("covariance_matrix[2][2]"));
    }

    /**
     * Data item  of the covariance matrix representing the Gaussian object.
     * @return FloatColumn
     */
    public FloatColumn getCovarianceMatrix23() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("covariance_matrix[2][3]", FloatColumn::new) :
                getBinaryColumn("covariance_matrix[2][3]"));
    }

    /**
     * Data item  of the covariance matrix representing the Gaussian object.
     * @return FloatColumn
     */
    public FloatColumn getCovarianceMatrix31() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("covariance_matrix[3][1]", FloatColumn::new) :
                getBinaryColumn("covariance_matrix[3][1]"));
    }

    /**
     * Data item  of the covariance matrix representing the Gaussian object.
     * @return FloatColumn
     */
    public FloatColumn getCovarianceMatrix32() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("covariance_matrix[3][2]", FloatColumn::new) :
                getBinaryColumn("covariance_matrix[3][2]"));
    }

    /**
     * Data item  of the covariance matrix representing the Gaussian object.
     * @return FloatColumn
     */
    public FloatColumn getCovarianceMatrix33() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("covariance_matrix[3][3]", FloatColumn::new) :
                getBinaryColumn("covariance_matrix[3][3]"));
    }

    /**
     * The model id corresponding to the gaussian object.
     * This data item is a pointer to _ihm_model_list.model_id
     * in the IHM_MODEL_LIST category.
     * @return IntColumn
     */
    public IntColumn getModelId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("model_id", IntColumn::new) :
                getBinaryColumn("model_id"));
    }
}
