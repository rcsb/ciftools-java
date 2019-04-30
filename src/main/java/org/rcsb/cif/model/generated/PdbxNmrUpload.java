package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * 
 * Items in the pdbx_nmr_upload category provide information about the data files uploaded by a depositor using the deposition system.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxNmrUpload extends BaseCategory {
    public PdbxNmrUpload(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxNmrUpload(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxNmrUpload(String name) {
        super(name);
    }

    /**
     * 
     * Unique code assigned to the file being uploaded by the depositor and that
     * contains data that will be incorporated into this entry.
     * @return IntColumn
     */
    public IntColumn getDataFileId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("data_file_id", IntColumn::new) :
                getBinaryColumn("data_file_id"));
    }

    /**
     * 
     * The directory path and file name for the data file that is to be uploaded.
     * @return StrColumn
     */
    public StrColumn getDataFileName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("data_file_name", StrColumn::new) :
                getBinaryColumn("data_file_name"));
    }

    /**
     * 
     * This item defines the kind of data in the file uploaded for deposition.
     * @return StrColumn
     */
    public StrColumn getDataFileCategory() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("data_file_category", StrColumn::new) :
                getBinaryColumn("data_file_category"));
    }

    /**
     * 
     * The syntax or format of the file that is uploaded.
     * @return StrColumn
     */
    public StrColumn getDataFileSyntax() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("data_file_syntax", StrColumn::new) :
                getBinaryColumn("data_file_syntax"));
    }

    /**
     * 
     * Pointer to '_entry.id'
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }
}
