package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_GAUSSIAN_OBJ_SITE category records the details
 * of the gaussian objects modeled in the integrative structural model.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmGaussianObjSite extends DelegatingCategory {
    public IhmGaussianObjSite(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "entity_id":
                return getEntityId();
            case "seq_id_begin":
                return getSeqIdBegin();
            case "seq_id_end":
                return getSeqIdEnd();
            case "asym_id":
                return getAsymId();
            case "mean_Cartn_x":
                return getMeanCartnX();
            case "mean_Cartn_y":
                return getMeanCartnY();
            case "mean_Cartn_z":
                return getMeanCartnZ();
            case "weight":
                return getWeight();
            case "covariance_matrix[1][1]":
                return getCovarianceMatrix11();
            case "covariance_matrix[1][2]":
                return getCovarianceMatrix12();
            case "covariance_matrix[1][3]":
                return getCovarianceMatrix13();
            case "covariance_matrix[2][1]":
                return getCovarianceMatrix21();
            case "covariance_matrix[2][2]":
                return getCovarianceMatrix22();
            case "covariance_matrix[2][3]":
                return getCovarianceMatrix23();
            case "covariance_matrix[3][1]":
                return getCovarianceMatrix31();
            case "covariance_matrix[3][2]":
                return getCovarianceMatrix32();
            case "covariance_matrix[3][3]":
                return getCovarianceMatrix33();
            case "model_id":
                return getModelId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for this gaussian object in the model.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * The entity identifier corresponding to this gaussian object.
     * This data item is a pointer to _entity.id in the ENTITY category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * The leading sequence index corresponding to this gaussian object.
     * This data item is a pointer to _entity_poly_seq.num in the ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getSeqIdBegin() {
        return delegate.getColumn("seq_id_begin", DelegatingIntColumn::new);
    }

    /**
     * The trailing sequence index corresponding to this gaussian object.
     * This data item is a pointer to _entity_poly_seq.num in the ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getSeqIdEnd() {
        return delegate.getColumn("seq_id_end", DelegatingIntColumn::new);
    }

    /**
     * An asym/strand identifier corresponding to this gaussian object.
     * This data item is a pointer to _struct_asym.id in the STRUCT_ASYM category.
     * @return StrColumn
     */
    public StrColumn getAsymId() {
        return delegate.getColumn("asym_id", DelegatingStrColumn::new);
    }

    /**
     * The mean Cartesian X component corresponding to this gaussian object.
     * @return FloatColumn
     */
    public FloatColumn getMeanCartnX() {
        return delegate.getColumn("mean_Cartn_x", DelegatingFloatColumn::new);
    }

    /**
     * The mean Cartesian Y component corresponding to this gaussian object.
     * @return FloatColumn
     */
    public FloatColumn getMeanCartnY() {
        return delegate.getColumn("mean_Cartn_y", DelegatingFloatColumn::new);
    }

    /**
     * The mean Cartesian Z component corresponding to this gaussian object.
     * @return FloatColumn
     */
    public FloatColumn getMeanCartnZ() {
        return delegate.getColumn("mean_Cartn_z", DelegatingFloatColumn::new);
    }

    /**
     * The weight of the gaussian object.
     * @return FloatColumn
     */
    public FloatColumn getWeight() {
        return delegate.getColumn("weight", DelegatingFloatColumn::new);
    }

    /**
     * Data item  of the covariance matrix representing the Gaussian object.
     * @return FloatColumn
     */
    public FloatColumn getCovarianceMatrix11() {
        return delegate.getColumn("covariance_matrix[1][1]", DelegatingFloatColumn::new);
    }

    /**
     * Data item  of the covariance matrix representing the Gaussian object.
     * @return FloatColumn
     */
    public FloatColumn getCovarianceMatrix12() {
        return delegate.getColumn("covariance_matrix[1][2]", DelegatingFloatColumn::new);
    }

    /**
     * Data item  of the covariance matrix representing the Gaussian object.
     * @return FloatColumn
     */
    public FloatColumn getCovarianceMatrix13() {
        return delegate.getColumn("covariance_matrix[1][3]", DelegatingFloatColumn::new);
    }

    /**
     * Data item  of the covariance matrix representing the Gaussian object.
     * @return FloatColumn
     */
    public FloatColumn getCovarianceMatrix21() {
        return delegate.getColumn("covariance_matrix[2][1]", DelegatingFloatColumn::new);
    }

    /**
     * Data item  of the covariance matrix representing the Gaussian object.
     * @return FloatColumn
     */
    public FloatColumn getCovarianceMatrix22() {
        return delegate.getColumn("covariance_matrix[2][2]", DelegatingFloatColumn::new);
    }

    /**
     * Data item  of the covariance matrix representing the Gaussian object.
     * @return FloatColumn
     */
    public FloatColumn getCovarianceMatrix23() {
        return delegate.getColumn("covariance_matrix[2][3]", DelegatingFloatColumn::new);
    }

    /**
     * Data item  of the covariance matrix representing the Gaussian object.
     * @return FloatColumn
     */
    public FloatColumn getCovarianceMatrix31() {
        return delegate.getColumn("covariance_matrix[3][1]", DelegatingFloatColumn::new);
    }

    /**
     * Data item  of the covariance matrix representing the Gaussian object.
     * @return FloatColumn
     */
    public FloatColumn getCovarianceMatrix32() {
        return delegate.getColumn("covariance_matrix[3][2]", DelegatingFloatColumn::new);
    }

    /**
     * Data item  of the covariance matrix representing the Gaussian object.
     * @return FloatColumn
     */
    public FloatColumn getCovarianceMatrix33() {
        return delegate.getColumn("covariance_matrix[3][3]", DelegatingFloatColumn::new);
    }

    /**
     * The model id corresponding to the gaussian object.
     * This data item is a pointer to _ihm_model_list.model_id
     * in the IHM_MODEL_LIST category.
     * @return IntColumn
     */
    public IntColumn getModelId() {
        return delegate.getColumn("model_id", DelegatingIntColumn::new);
    }

}