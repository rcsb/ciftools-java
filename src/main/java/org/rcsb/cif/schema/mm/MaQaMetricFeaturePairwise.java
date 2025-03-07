package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the MA_QA_METRIC_FEATURE_PAIRWISE category captures the
 * QA metrics calculated per pair of features as defined in ma_feature_list.
 * In cases where the metric is symmetric, it is enough to store just one value per pair.
 * For asymmetric metrics, the order of features is expected to be meaningful
 * (e.g. PAE where PAE_ij is defined by aligning token i (feature_id_1) and measuring
 * the error on token j (feature_id_2)).
 * It is valid to only provide values for a subset of feature pairs.
 * Data in this category is expected to be very large and can be extracted into a
 * separate file which is linked to the main file using the categories
 * ma_associated_archive_file_details or ma_entry_associated_files with file_content
 * set to "QA metrics".
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class MaQaMetricFeaturePairwise extends DelegatingCategory {
    public MaQaMetricFeaturePairwise(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "ordinal_id":
                return getOrdinalId();
            case "model_id":
                return getModelId();
            case "feature_id_1":
                return getFeatureId1();
            case "feature_id_2":
                return getFeatureId2();
            case "metric_id":
                return getMetricId();
            case "metric_value":
                return getMetricValue();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the category.
     * @return IntColumn
     */
    public IntColumn getOrdinalId() {
        return delegate.getColumn("ordinal_id", DelegatingIntColumn::new);
    }

    /**
     * The identifier for the structural model for which feature-based QA metric is provided.
     * This data item is a pointer to _ma_model_list.ordinal_id
     * in the MA_MODEL_LIST category.
     * @return IntColumn
     */
    public IntColumn getModelId() {
        return delegate.getColumn("model_id", DelegatingIntColumn::new);
    }

    /**
     * The identifier for the first feature in the pair, for which QA metric is provided.
     * This data item is a pointer to _ma_feature_list.feature_id in the MA_FEATURE_LIST
     * category.
     * @return IntColumn
     */
    public IntColumn getFeatureId1() {
        return delegate.getColumn("feature_id_1", DelegatingIntColumn::new);
    }

    /**
     * The identifier for the second feature in the pair, for which QA metric is provided.
     * This data item is a pointer to _ma_feature_list.feature_id in the MA_FEATURE_LIST
     * category.
     * @return IntColumn
     */
    public IntColumn getFeatureId2() {
        return delegate.getColumn("feature_id_2", DelegatingIntColumn::new);
    }

    /**
     * The identifier for the QA metric.
     * This data item is a pointer to _ma_qa_metric.id in the
     * MA_QA_METRIC category.
     * @return IntColumn
     */
    public IntColumn getMetricId() {
        return delegate.getColumn("metric_id", DelegatingIntColumn::new);
    }

    /**
     * The value of the QA metric.
     * @return FloatColumn
     */
    public FloatColumn getMetricValue() {
        return delegate.getColumn("metric_value", DelegatingFloatColumn::new);
    }

}