package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_DEPUI_UPLOAD category record the
 * details of uploaded data files.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxDepuiUpload extends DelegatingCategory {
    public PdbxDepuiUpload(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "ordinal":
                return getOrdinal();
            case "file_content_type":
                return getFileContentType();
            case "file_type":
                return getFileType();
            case "file_name":
                return getFileName();
            case "file_size":
                return getFileSize();
            case "valid_flag":
                return getValidFlag();
            case "diagnostic_message":
                return getDiagnosticMessage();
            case "sequence_align":
                return getSequenceAlign();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Ordinal identifier for each update record.
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return delegate.getColumn("ordinal", DelegatingIntColumn::new);
    }

    /**
     * The content type of the uploaded file.
     * @return StrColumn
     */
    public StrColumn getFileContentType() {
        return delegate.getColumn("file_content_type", DelegatingStrColumn::new);
    }

    /**
     * The internal file type of the uploaded file.
     * @return StrColumn
     */
    public StrColumn getFileType() {
        return delegate.getColumn("file_type", DelegatingStrColumn::new);
    }

    /**
     * The name of the uploaded file.
     * @return StrColumn
     */
    public StrColumn getFileName() {
        return delegate.getColumn("file_name", DelegatingStrColumn::new);
    }

    /**
     * The size of the uploaded file in bytes.
     * @return IntColumn
     */
    public IntColumn getFileSize() {
        return delegate.getColumn("file_size", DelegatingIntColumn::new);
    }

    /**
     * A flag to indicate if the uploaded data is satisfies a
     * preliminary validation criteria.
     * @return StrColumn
     */
    public StrColumn getValidFlag() {
        return delegate.getColumn("valid_flag", DelegatingStrColumn::new);
    }

    /**
     * Text of any diagnostic  messages asssociated with the upload processing
     * of the input data.
     * @return StrColumn
     */
    public StrColumn getDiagnosticMessage() {
        return delegate.getColumn("diagnostic_message", DelegatingStrColumn::new);
    }

    /**
     * Some text data item related sequene alignment.
     * @return StrColumn
     */
    public StrColumn getSequenceAlign() {
        return delegate.getColumn("sequence_align", DelegatingStrColumn::new);
    }

}