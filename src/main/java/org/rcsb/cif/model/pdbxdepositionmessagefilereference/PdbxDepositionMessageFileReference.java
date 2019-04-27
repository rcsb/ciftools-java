package org.rcsb.cif.model.pdbxdepositionmessagefilereference;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return Ordinal
     */
    public Ordinal getOrdinal() {
        return (Ordinal) (isText ? textFields.computeIfAbsent("ordinal",
                Ordinal::new) : getBinaryColumn("ordinal"));
    }

    /**
     * The internal identifier assigned to each deposition.
     * @return DepositionDataSetId
     */
    public DepositionDataSetId getDepositionDataSetId() {
        return (DepositionDataSetId) (isText ? textFields.computeIfAbsent("deposition_data_set_id",
                DepositionDataSetId::new) : getBinaryColumn("deposition_data_set_id"));
    }

    /**
     * The internal identifier assigned to each message.
     * @return MessageId
     */
    public MessageId getMessageId() {
        return (MessageId) (isText ? textFields.computeIfAbsent("message_id",
                MessageId::new) : getBinaryColumn("message_id"));
    }

    /**
     * The content type of the referenced data file.
     * @return ContentType
     */
    public ContentType getContentType() {
        return (ContentType) (isText ? textFields.computeIfAbsent("content_type",
                ContentType::new) : getBinaryColumn("content_type"));
    }

    /**
     * The content format of the referenced data file.
     * @return ContentFormat
     */
    public ContentFormat getContentFormat() {
        return (ContentFormat) (isText ? textFields.computeIfAbsent("content_format",
                ContentFormat::new) : getBinaryColumn("content_format"));
    }

    /**
     * The partition number of the referenced data file.
     * @return PartitionNumber
     */
    public PartitionNumber getPartitionNumber() {
        return (PartitionNumber) (isText ? textFields.computeIfAbsent("partition_number",
                PartitionNumber::new) : getBinaryColumn("partition_number"));
    }

    /**
     * The version identifier of the referenced data file.
     * @return VersionId
     */
    public VersionId getVersionId() {
        return (VersionId) (isText ? textFields.computeIfAbsent("version_id",
                VersionId::new) : getBinaryColumn("version_id"));
    }

    /**
     * The storate type of the referenced data file.
     * @return StorageType
     */
    public StorageType getStorageType() {
        return (StorageType) (isText ? textFields.computeIfAbsent("storage_type",
                StorageType::new) : getBinaryColumn("storage_type"));
    }
}
