package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_DEPUI_UPLOAD category record the
 * details of uploaded data files.
 */
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
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ordinal", IntColumn::new) :
                getBinaryColumn("ordinal"));
    }

    /**
     * The content type of the uploaded file.
     * @return StrColumn
     */
    public StrColumn getFileContentType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("file_content_type", StrColumn::new) :
                getBinaryColumn("file_content_type"));
    }

    /**
     * The internal file type of the uploaded file.
     * @return StrColumn
     */
    public StrColumn getFileType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("file_type", StrColumn::new) :
                getBinaryColumn("file_type"));
    }

    /**
     * The name of the uploaded file.
     * @return StrColumn
     */
    public StrColumn getFileName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("file_name", StrColumn::new) :
                getBinaryColumn("file_name"));
    }

    /**
     * The size of the uploaded file in bytes.
     * @return IntColumn
     */
    public IntColumn getFileSize() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("file_size", IntColumn::new) :
                getBinaryColumn("file_size"));
    }

    /**
     * A flag to indicate if the uploaded data is satisfies a
     * preliminary validation criteria.
     * @return StrColumn
     */
    public StrColumn getValidFlag() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("valid_flag", StrColumn::new) :
                getBinaryColumn("valid_flag"));
    }

    /**
     * Text of any diagnostic  messages asssociated with the upload processing
     * of the input data.
     * @return StrColumn
     */
    public StrColumn getDiagnosticMessage() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("diagnostic_message", StrColumn::new) :
                getBinaryColumn("diagnostic_message"));
    }

    /**
     * Some text data item related sequene alignment.
     * @return StrColumn
     */
    public StrColumn getSequenceAlign() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("sequence_align", StrColumn::new) :
                getBinaryColumn("sequence_align"));
    }
}
