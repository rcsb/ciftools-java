package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Category provides details regarding external files. The IHM_EXTERNAL_REFERENCE_INFO
 * category captures the top-level details regarding external data sources.
 * This category captures the specific details regarding externally stored files
 * related to the particular I/H model entry.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmExternalFiles extends DelegatingCategory {
    public IhmExternalFiles(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "reference_id":
                return getReferenceId();
            case "file_path":
                return getFilePath();
            case "file_format":
                return getFileFormat();
            case "content_type":
                return getContentType();
            case "file_size_bytes":
                return getFileSizeBytes();
            case "details":
                return getDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for each external file.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * A pointer to the source of the external file - either DOI or locally stored.
     * This data item is a pointer to _ihm_external_reference_info.reference_id in the
     * IHM_EXTERNAL_REFERENCE_INFO category.
     * @return IntColumn
     */
    public IntColumn getReferenceId() {
        return delegate.getColumn("reference_id", DelegatingIntColumn::new);
    }

    /**
     * The relative path (including filename) for each external file.
     * Absolute paths (starting with "/") are not permitted.
     * This is required for identifying individual files from within
     * a tar-zipped archive file or for identifying supplementary local
     * files organized within a directory structure.
     * This data item assumes a POSIX-like directory structure or file path.
     * @return StrColumn
     */
    public StrColumn getFilePath() {
        return delegate.getColumn("file_path", DelegatingStrColumn::new);
    }

    /**
     * Format of the external file.
     * @return StrColumn
     */
    public StrColumn getFileFormat() {
        return delegate.getColumn("file_format", DelegatingStrColumn::new);
    }

    /**
     * The type of content in the file.
     * @return StrColumn
     */
    public StrColumn getContentType() {
        return delegate.getColumn("content_type", DelegatingStrColumn::new);
    }

    /**
     * Storage size of the external file in bytes.
     * @return FloatColumn
     */
    public FloatColumn getFileSizeBytes() {
        return delegate.getColumn("file_size_bytes", DelegatingFloatColumn::new);
    }

    /**
     * Additional textual details regarding the external file.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

}