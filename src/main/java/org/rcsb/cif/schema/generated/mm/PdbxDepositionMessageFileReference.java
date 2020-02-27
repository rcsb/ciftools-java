package org.rcsb.cif.schema.generated.mm;

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
