package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_STARTING_COMPARATIVE_MODELS category records
 * additional details about comparative models used as starting inputs in
 * the integrative model building process.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmStartingComparativeModels extends DelegatingCategory {
    public IhmStartingComparativeModels(Category delegate) {
        super(delegate);
    }

    /**
     * A unique identifier for the starting comparative model.
     * @return IntColumn
     */
    public IntColumn getOrdinalId() {
        return delegate.getColumn("ordinal_id", DelegatingIntColumn::new);
    }

    /**
     * The identifier for the starting structural model.
     * This data item is a pointer to _ihm_starting_model_details.starting_model_id
     * in the IHM_STARTING_MODEL_DETAILS category.
     * @return StrColumn
     */
    public StrColumn getStartingModelId() {
        return delegate.getColumn("starting_model_id", DelegatingStrColumn::new);
    }

    /**
     * The chainId/auth_asym_id corresponding to the starting model.
     * @return StrColumn
     */
    public StrColumn getStartingModelAuthAsymId() {
        return delegate.getColumn("starting_model_auth_asym_id", DelegatingStrColumn::new);
    }

    /**
     * The starting residue index of the starting model.
     * @return IntColumn
     */
    public IntColumn getStartingModelSeqIdBegin() {
        return delegate.getColumn("starting_model_seq_id_begin", DelegatingIntColumn::new);
    }

    /**
     * The ending residue index of the starting model.
     * @return IntColumn
     */
    public IntColumn getStartingModelSeqIdEnd() {
        return delegate.getColumn("starting_model_seq_id_end", DelegatingIntColumn::new);
    }

    /**
     * The chainId/auth_asym_id corresponding to the template.
     * @return StrColumn
     */
    public StrColumn getTemplateAuthAsymId() {
        return delegate.getColumn("template_auth_asym_id", DelegatingStrColumn::new);
    }

    /**
     * The starting residue index of the template.
     * @return IntColumn
     */
    public IntColumn getTemplateSeqIdBegin() {
        return delegate.getColumn("template_seq_id_begin", DelegatingIntColumn::new);
    }

    /**
     * The ending residue index of the template.
     * @return IntColumn
     */
    public IntColumn getTemplateSeqIdEnd() {
        return delegate.getColumn("template_seq_id_end", DelegatingIntColumn::new);
    }

    /**
     * The percentage sequence identity between the template sequence and the comparative model sequence.
     * @return FloatColumn
     */
    public FloatColumn getTemplateSequenceIdentity() {
        return delegate.getColumn("template_sequence_identity", DelegatingFloatColumn::new);
    }

    /**
     * The denominator used while calculating the sequence identity provided in
     * _ihm_starting_comparative_models.template_sequence_identity.
     * @return StrColumn
     */
    public StrColumn getTemplateSequenceIdentityDenominator() {
        return delegate.getColumn("template_sequence_identity_denominator", DelegatingStrColumn::new);
    }

    /**
     * 
     * The dataset list id corresponding to the template used to obtain the comparative model.
     * This data item is a pointer to _ihm_dataset_list.id in the IHM_DATASET_LIST category.
     * @return IntColumn
     */
    public IntColumn getTemplateDatasetListId() {
        return delegate.getColumn("template_dataset_list_id", DelegatingIntColumn::new);
    }

    /**
     * The file id corresponding to the sequence alignment of the template sequence and the comparative model sequence.
     * This data item is a pointer to _ihm_external_files.id in the IHM_EXTERNAL_FILES category.
     * @return IntColumn
     */
    public IntColumn getAlignmentFileId() {
        return delegate.getColumn("alignment_file_id", DelegatingIntColumn::new);
    }
}
