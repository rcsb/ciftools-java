package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the IHM_STARTING_COMPARATIVE_MODELS category records
 * additional details about comparative models used as starting inputs in
 * the integrative model building process.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class IhmStartingComparativeModels extends BaseCategory {
    public IhmStartingComparativeModels(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public IhmStartingComparativeModels(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public IhmStartingComparativeModels(String name) {
        super(name);
    }

    /**
     * A unique identifier for the starting comparative model.
     * @return IntColumn
     */
    public IntColumn getOrdinalId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ordinal_id", IntColumn::new) :
                getBinaryColumn("ordinal_id"));
    }

    /**
     * The identifier for the starting structural model.
     * This data item is a pointer to _ihm_starting_model_details.starting_model_id
     * in the IHM_STARTING_MODEL_DETAILS category.
     * @return StrColumn
     */
    public StrColumn getStartingModelId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("starting_model_id", StrColumn::new) :
                getBinaryColumn("starting_model_id"));
    }

    /**
     * The chainId/auth_asym_id corresponding to the starting model.
     * @return StrColumn
     */
    public StrColumn getStartingModelAuthAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("starting_model_auth_asym_id", StrColumn::new) :
                getBinaryColumn("starting_model_auth_asym_id"));
    }

    /**
     * The starting residue index of the starting model.
     * @return IntColumn
     */
    public IntColumn getStartingModelSeqIdBegin() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("starting_model_seq_id_begin", IntColumn::new) :
                getBinaryColumn("starting_model_seq_id_begin"));
    }

    /**
     * The ending residue index of the starting model.
     * @return IntColumn
     */
    public IntColumn getStartingModelSeqIdEnd() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("starting_model_seq_id_end", IntColumn::new) :
                getBinaryColumn("starting_model_seq_id_end"));
    }

    /**
     * The chainId/auth_asym_id corresponding to the template.
     * @return StrColumn
     */
    public StrColumn getTemplateAuthAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("template_auth_asym_id", StrColumn::new) :
                getBinaryColumn("template_auth_asym_id"));
    }

    /**
     * The starting residue index of the template.
     * @return IntColumn
     */
    public IntColumn getTemplateSeqIdBegin() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("template_seq_id_begin", IntColumn::new) :
                getBinaryColumn("template_seq_id_begin"));
    }

    /**
     * The ending residue index of the template.
     * @return IntColumn
     */
    public IntColumn getTemplateSeqIdEnd() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("template_seq_id_end", IntColumn::new) :
                getBinaryColumn("template_seq_id_end"));
    }

    /**
     * The percentage sequence identity between the template sequence and the comparative model sequence.
     * @return FloatColumn
     */
    public FloatColumn getTemplateSequenceIdentity() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("template_sequence_identity", FloatColumn::new) :
                getBinaryColumn("template_sequence_identity"));
    }

    /**
     * The denominator used while calculating the sequence identity provided in
     * _ihm_starting_comparative_models.template_sequence_identity.
     * @return StrColumn
     */
    public StrColumn getTemplateSequenceIdentityDenominator() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("template_sequence_identity_denominator", StrColumn::new) :
                getBinaryColumn("template_sequence_identity_denominator"));
    }

    /**
     * 
     * The dataset list id corresponding to the template used to obtain the comparative model.
     * This data item is a pointer to _ihm_dataset_list.id in the IHM_DATASET_LIST category.
     * @return IntColumn
     */
    public IntColumn getTemplateDatasetListId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("template_dataset_list_id", IntColumn::new) :
                getBinaryColumn("template_dataset_list_id"));
    }

    /**
     * The file id corresponding to the sequence alignment of the template sequence and the comparative model sequence.
     * This data item is a pointer to _ihm_external_files.id in the IHM_EXTERNAL_FILES category.
     * @return IntColumn
     */
    public IntColumn getAlignmentFileId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("alignment_file_id", IntColumn::new) :
                getBinaryColumn("alignment_file_id"));
    }
}
