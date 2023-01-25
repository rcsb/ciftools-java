package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the MA_ASSOCIATED_ARCHIVE_FILE_DETAILS category record the
 * details of files within an associated archive file (zip/gzip). These may
 * be multiple sequence alignment files, restraint data files, files
 * containing quality assessment scores, or validation reports.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class MaAssociatedArchiveFileDetails extends DelegatingCategory {
    public MaAssociatedArchiveFileDetails(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "archive_file_id":
                return getArchiveFileId();
            case "file_path":
                return getFilePath();
            case "file_format":
                return getFileFormat();
            case "file_content":
                return getFileContent();
            case "description":
                return getDescription();
            case "data_id":
                return getDataId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the category.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * An identifier for the archive file.
     * This data item is a pointer to _ma_entry_associated_files.id
     * in the MA_ENTRY_ASSOCIATED_FILES category.
     * @return IntColumn
     */
    public IntColumn getArchiveFileId() {
        return delegate.getColumn("archive_file_id", DelegatingIntColumn::new);
    }

    /**
     * Path to the file.
     * @return StrColumn
     */
    public StrColumn getFilePath() {
        return delegate.getColumn("file_path", DelegatingStrColumn::new);
    }

    /**
     * The format of the file.
     * @return StrColumn
     */
    public StrColumn getFileFormat() {
        return delegate.getColumn("file_format", DelegatingStrColumn::new);
    }

    /**
     * Content of the file.
     * @return StrColumn
     */
    public StrColumn getFileContent() {
        return delegate.getColumn("file_content", DelegatingStrColumn::new);
    }

    /**
     * Textual description about the file.
     * @return StrColumn
     */
    public StrColumn getDescription() {
        return delegate.getColumn("description", DelegatingStrColumn::new);
    }

    /**
     * The data_id identifier corresponding to the associated archive file, if availble.
     * This data item is a pointer to _ma_data.id in the MA_DATA category.
     * @return IntColumn
     */
    public IntColumn getDataId() {
        return delegate.getColumn("data_id", DelegatingIntColumn::new);
    }

}