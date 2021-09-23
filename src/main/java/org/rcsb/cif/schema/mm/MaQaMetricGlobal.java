package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the MA_QA_METRIC_GLOBAL category captures the
 * details of the global QA metrics, calculated at the model-level.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class MaQaMetricGlobal extends DelegatingCategory {
    public MaQaMetricGlobal(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "ordinal_id":
                return getOrdinalId();
            case "model_id":
                return getModelId();
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
     * The identifier for the structural model, for which global QA metric is provided.
     * This data item is a pointer to _ma_model_list.model_id
     * in the MA_MODEL_LIST category.
     * @return IntColumn
     */
    public IntColumn getModelId() {
        return delegate.getColumn("model_id", DelegatingIntColumn::new);
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
     * The value of the global QA metric.
     * @return FloatColumn
     */
    public FloatColumn getMetricValue() {
        return delegate.getColumn("metric_value", DelegatingFloatColumn::new);
    }

}