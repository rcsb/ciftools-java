package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_DEPOSITION_MESSAGE_FILE_REFERENCE category record details of
 * files references associated with messages defined in the PDBX_DEPOSITION_MESSAGE_INFO
 * data category.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxDepositionMessageFileReference extends BaseCategory {
    public PdbxDepositionMessageFileReference(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxDepositionMessageFileReference(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxDepositionMessageFileReference(String name) {
        super(name);
    }

    /**
     * Ordinal index for the each file reference.
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ordinal", IntColumn::new) :
                getBinaryColumn("ordinal"));
    }

    /**
     * The internal identifier assigned to each deposition.
     * @return StrColumn
     */
    public StrColumn getDepositionDataSetId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("deposition_data_set_id", StrColumn::new) :
                getBinaryColumn("deposition_data_set_id"));
    }

    /**
     * The internal identifier assigned to each message.
     * @return StrColumn
     */
    public StrColumn getMessageId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("message_id", StrColumn::new) :
                getBinaryColumn("message_id"));
    }

    /**
     * The content type of the referenced data file.
     * @return StrColumn
     */
    public StrColumn getContentType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("content_type", StrColumn::new) :
                getBinaryColumn("content_type"));
    }

    /**
     * The content format of the referenced data file.
     * @return StrColumn
     */
    public StrColumn getContentFormat() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("content_format", StrColumn::new) :
                getBinaryColumn("content_format"));
    }

    /**
     * The partition number of the referenced data file.
     * @return StrColumn
     */
    public StrColumn getPartitionNumber() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("partition_number", StrColumn::new) :
                getBinaryColumn("partition_number"));
    }

    /**
     * The version identifier of the referenced data file.
     * @return StrColumn
     */
    public StrColumn getVersionId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("version_id", StrColumn::new) :
                getBinaryColumn("version_id"));
    }

    /**
     * The storate type of the referenced data file.
     * @return StrColumn
     */
    public StrColumn getStorageType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("storage_type", StrColumn::new) :
                getBinaryColumn("storage_type"));
    }
}
