package org.rcsb.cif.model.pdbxnmrupload;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return DataFileId
     */
    public DataFileId getDataFileId() {
        return (DataFileId) (isText ? textFields.computeIfAbsent("data_file_id",
                DataFileId::new) : getBinaryColumn("data_file_id"));
    }

    /**
     * 
     * The directory path and file name for the data file that is to be uploaded.
     * @return DataFileName
     */
    public DataFileName getDataFileName() {
        return (DataFileName) (isText ? textFields.computeIfAbsent("data_file_name",
                DataFileName::new) : getBinaryColumn("data_file_name"));
    }

    /**
     * 
     * This item defines the kind of data in the file uploaded for deposition.
     * @return DataFileCategory
     */
    public DataFileCategory getDataFileCategory() {
        return (DataFileCategory) (isText ? textFields.computeIfAbsent("data_file_category",
                DataFileCategory::new) : getBinaryColumn("data_file_category"));
    }

    /**
     * 
     * The syntax or format of the file that is uploaded.
     * @return DataFileSyntax
     */
    public DataFileSyntax getDataFileSyntax() {
        return (DataFileSyntax) (isText ? textFields.computeIfAbsent("data_file_syntax",
                DataFileSyntax::new) : getBinaryColumn("data_file_syntax"));
    }

    /**
     * 
     * Pointer to '_entry.id'
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }
}
