package org.rcsb.cif.model.generated.pdbxdepuiupload;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxDepuiUpload extends BaseCategory {
    public PdbxDepuiUpload(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxDepuiUpload(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxDepuiUpload(String name) {
        super(name);
    }

    /**
     * Ordinal identifier for each update record.
     * @return Ordinal
     */
    public Ordinal getOrdinal() {
        return (Ordinal) (isText ? textFields.computeIfAbsent("ordinal",
                Ordinal::new) : getBinaryColumn("ordinal"));
    }

    /**
     * The content type of the uploaded file.
     * @return FileContentType
     */
    public FileContentType getFileContentType() {
        return (FileContentType) (isText ? textFields.computeIfAbsent("file_content_type",
                FileContentType::new) : getBinaryColumn("file_content_type"));
    }

    /**
     * The internal file type of the uploaded file.
     * @return FileType
     */
    public FileType getFileType() {
        return (FileType) (isText ? textFields.computeIfAbsent("file_type",
                FileType::new) : getBinaryColumn("file_type"));
    }

    /**
     * The name of the uploaded file.
     * @return FileName
     */
    public FileName getFileName() {
        return (FileName) (isText ? textFields.computeIfAbsent("file_name",
                FileName::new) : getBinaryColumn("file_name"));
    }

    /**
     * The size of the uploaded file in bytes.
     * @return FileSize
     */
    public FileSize getFileSize() {
        return (FileSize) (isText ? textFields.computeIfAbsent("file_size",
                FileSize::new) : getBinaryColumn("file_size"));
    }

    /**
     * A flag to indicate if the uploaded data is satisfies a
     * preliminary validation criteria.
     * @return ValidFlag
     */
    public ValidFlag getValidFlag() {
        return (ValidFlag) (isText ? textFields.computeIfAbsent("valid_flag",
                ValidFlag::new) : getBinaryColumn("valid_flag"));
    }

    /**
     * Text of any diagnostic  messages asssociated with the upload processing
     * of the input data.
     * @return DiagnosticMessage
     */
    public DiagnosticMessage getDiagnosticMessage() {
        return (DiagnosticMessage) (isText ? textFields.computeIfAbsent("diagnostic_message",
                DiagnosticMessage::new) : getBinaryColumn("diagnostic_message"));
    }

    /**
     * Some text data item related sequene alignment.
     * @return SequenceAlign
     */
    public SequenceAlign getSequenceAlign() {
        return (SequenceAlign) (isText ? textFields.computeIfAbsent("sequence_align",
                SequenceAlign::new) : getBinaryColumn("sequence_align"));
    }
}
