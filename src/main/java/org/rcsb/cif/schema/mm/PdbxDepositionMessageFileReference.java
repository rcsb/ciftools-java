package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_DEPOSITION_MESSAGE_FILE_REFERENCE category record details of
 * files references associated with messages defined in the PDBX_DEPOSITION_MESSAGE_INFO
 * data category.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxDepositionMessageFileReference extends DelegatingCategory {
    public PdbxDepositionMessageFileReference(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "ordinal":
                return getOrdinal();
            case "deposition_data_set_id":
                return getDepositionDataSetId();
            case "message_id":
                return getMessageId();
            case "content_type":
                return getContentType();
            case "content_format":
                return getContentFormat();
            case "partition_number":
                return getPartitionNumber();
            case "version_id":
                return getVersionId();
            case "storage_type":
                return getStorageType();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Ordinal index for the each file reference.
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return delegate.getColumn("ordinal", DelegatingIntColumn::new);
    }

    /**
     * The internal identifier assigned to each deposition.
     * @return StrColumn
     */
    public StrColumn getDepositionDataSetId() {
        return delegate.getColumn("deposition_data_set_id", DelegatingStrColumn::new);
    }

    /**
     * The internal identifier assigned to each message.
     * @return StrColumn
     */
    public StrColumn getMessageId() {
        return delegate.getColumn("message_id", DelegatingStrColumn::new);
    }

    /**
     * The content type of the referenced data file.
     * @return StrColumn
     */
    public StrColumn getContentType() {
        return delegate.getColumn("content_type", DelegatingStrColumn::new);
    }

    /**
     * The content format of the referenced data file.
     * @return StrColumn
     */
    public StrColumn getContentFormat() {
        return delegate.getColumn("content_format", DelegatingStrColumn::new);
    }

    /**
     * The partition number of the referenced data file.
     * @return StrColumn
     */
    public StrColumn getPartitionNumber() {
        return delegate.getColumn("partition_number", DelegatingStrColumn::new);
    }

    /**
     * The version identifier of the referenced data file.
     * @return StrColumn
     */
    public StrColumn getVersionId() {
        return delegate.getColumn("version_id", DelegatingStrColumn::new);
    }

    /**
     * The storate type of the referenced data file.
     * @return StrColumn
     */
    public StrColumn getStorageType() {
        return delegate.getColumn("storage_type", DelegatingStrColumn::new);
    }

}