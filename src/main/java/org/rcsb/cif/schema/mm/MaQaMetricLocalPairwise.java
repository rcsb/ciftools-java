package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the MA_QA_METRIC_LOCAL_PAIRWISE category captures the
 * details of the local QA metrics, calculated at the pairwise residue level.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class MaQaMetricLocalPairwise extends DelegatingCategory {
    public MaQaMetricLocalPairwise(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "ordinal_id":
                return getOrdinalId();
            case "model_id":
                return getModelId();
            case "label_asym_id_1":
                return getLabelAsymId1();
            case "label_seq_id_1":
                return getLabelSeqId1();
            case "label_comp_id_1":
                return getLabelCompId1();
            case "label_asym_id_2":
                return getLabelAsymId2();
            case "label_seq_id_2":
                return getLabelSeqId2();
            case "label_comp_id_2":
                return getLabelCompId2();
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
     * The identifier for the structural model, for which local QA metric is provided.
     * This data item is a pointer to _ma_model_list.model_id
     * in the MA_MODEL_LIST category.
     * @return IntColumn
     */
    public IntColumn getModelId() {
        return delegate.getColumn("model_id", DelegatingIntColumn::new);
    }

    /**
     * The identifier for the asym id of the first residue in the
     * pair, for which local QA metric is provided.
     * This data item is a pointer to _atom_site.label_asym_id
     * in the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAsymId1() {
        return delegate.getColumn("label_asym_id_1", DelegatingStrColumn::new);
    }

    /**
     * The identifier for the sequence index of the first residue
     * in the pair, for which local QA metric is provided.
     * This data item is a pointer to _atom_site.label_seq_id
     * in the ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getLabelSeqId1() {
        return delegate.getColumn("label_seq_id_1", DelegatingIntColumn::new);
    }

    /**
     * The component identifier for the first residue in the
     * pair, for which local QA metric is provided.
     * This data item is a pointer to _atom_site.label_comp_id
     * in the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelCompId1() {
        return delegate.getColumn("label_comp_id_1", DelegatingStrColumn::new);
    }

    /**
     * The identifier for the asym id of the second residue in the
     * pair, for which local QA metric is provided.
     * This data item is a pointer to _atom_site.label_asym_id
     * in the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAsymId2() {
        return delegate.getColumn("label_asym_id_2", DelegatingStrColumn::new);
    }

    /**
     * The identifier for the sequence index of the second residue
     * in the pair, for which local QA metric is provided.
     * This data item is a pointer to _atom_site.label_seq_id
     * in the ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getLabelSeqId2() {
        return delegate.getColumn("label_seq_id_2", DelegatingIntColumn::new);
    }

    /**
     * The component identifier for the second residue in the
     * pair, for which local QA metric is provided.
     * This data item is a pointer to _atom_site.label_comp_id
     * in the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelCompId2() {
        return delegate.getColumn("label_comp_id_2", DelegatingStrColumn::new);
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
     * The value of the local QA metric.
     * @return FloatColumn
     */
    public FloatColumn getMetricValue() {
        return delegate.getColumn("metric_value", DelegatingFloatColumn::new);
    }

}