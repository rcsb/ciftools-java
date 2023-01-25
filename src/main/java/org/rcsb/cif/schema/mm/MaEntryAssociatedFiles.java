package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the MA_ENTRY_ASSOCIATED_FILES category record the
 * details of additional files associated with the entry. These may
 * be multiple sequence alignment files, restraint data files, files
 * containing quality assessment scores, or validation reports. The
 * files may be listed separately or as an archive file (zip/gzip).
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class MaEntryAssociatedFiles extends DelegatingCategory {
    public MaEntryAssociatedFiles(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "entry_id":
                return getEntryId();
            case "file_type":
                return getFileType();
            case "file_url":
                return getFileUrl();
            case "file_format":
                return getFileFormat();
            case "details":
                return getDetails();
            case "file_content":
                return getFileContent();
            case "data_id":
                return getDataId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * An identifier for the associated file.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * An identifier for the entry.
     * This data item is a pointer to _entry.id
     * in the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * Type of file.
     * @return StrColumn
     */
    public StrColumn getFileType() {
        return delegate.getColumn("file_type", DelegatingStrColumn::new);
    }

    /**
     * URL for the file.
     * @return StrColumn
     */
    public StrColumn getFileUrl() {
        return delegate.getColumn("file_url", DelegatingStrColumn::new);
    }

    /**
     * The format of the file.
     * @return StrColumn
     */
    public StrColumn getFileFormat() {
        return delegate.getColumn("file_format", DelegatingStrColumn::new);
    }

    /**
     * Additional details about the file.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * Content of the file.
     * @return StrColumn
     */
    public StrColumn getFileContent() {
        return delegate.getColumn("file_content", DelegatingStrColumn::new);
    }

    /**
     * The data_id identifier corresponding to the entry associated file, if available.
     * This data item is a pointer to _ma_data.id in the MA_DATA category.
     * @return IntColumn
     */
    public IntColumn getDataId() {
        return delegate.getColumn("data_id", DelegatingIntColumn::new);
    }

}