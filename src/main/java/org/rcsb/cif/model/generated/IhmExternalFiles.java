package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Category provides details regarding external files. The IHM_EXTERNAL_REFERENCE_INFO
 * category captures the top-level details regarding external data sources.
 * This category captures the specific details regarding externally stored files
 * related to the particular I/H model entry.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class IhmExternalFiles extends BaseCategory {
    public IhmExternalFiles(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public IhmExternalFiles(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public IhmExternalFiles(String name) {
        super(name);
    }

    /**
     * A unique identifier for each external file.
     * @return IntColumn
     */
    public IntColumn getId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("id", IntColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * A pointer to the source of the external file - either DOI or locally stored.
     * This data item is a pointer to _ihm_external_reference_info.reference_id in the
     * IHM_EXTERNAL_REFERENCE_INFO category.
     * @return IntColumn
     */
    public IntColumn getReferenceId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("reference_id", IntColumn::new) :
                getBinaryColumn("reference_id"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("file_path", StrColumn::new) :
                getBinaryColumn("file_path"));
    }

    /**
     * Format of the external file.
     * @return StrColumn
     */
    public StrColumn getFileFormat() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("file_format", StrColumn::new) :
                getBinaryColumn("file_format"));
    }

    /**
     * The type of content in the file.
     * @return StrColumn
     */
    public StrColumn getContentType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("content_type", StrColumn::new) :
                getBinaryColumn("content_type"));
    }

    /**
     * Storage size of the external file in bytes.
     * @return FloatColumn
     */
    public FloatColumn getFileSizeBytes() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("file_size_bytes", FloatColumn::new) :
                getBinaryColumn("file_size_bytes"));
    }

    /**
     * Textual description of what the external file is.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }
}
