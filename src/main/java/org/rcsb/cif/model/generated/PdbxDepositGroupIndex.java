package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the pdbx_deposit_group_index category provides details
 * about the individual data files in the collection of deposited entries.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxDepositGroupIndex extends BaseCategory {
    public PdbxDepositGroupIndex(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxDepositGroupIndex(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxDepositGroupIndex(String name) {
        super(name);
    }

    /**
     * A unique identifier for a group of entries deposited as a collection.
     * @return StrColumn
     */
    public StrColumn getGroupId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("group_id", StrColumn::new) :
                getBinaryColumn("group_id"));
    }

    /**
     * A unique identifier for the index entry within the deposition group.
     * @return IntColumn
     */
    public IntColumn getOrdinalId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ordinal_id", IntColumn::new) :
                getBinaryColumn("ordinal_id"));
    }

    /**
     * An internal identifier for a deposited data set.
     * @return StrColumn
     */
    public StrColumn getDepSetId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("dep_set_id", StrColumn::new) :
                getBinaryColumn("dep_set_id"));
    }

    /**
     * A PDB accession code.
     * @return StrColumn
     */
    public StrColumn getPdbIdCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdb_id_code", StrColumn::new) :
                getBinaryColumn("pdb_id_code"));
    }

    /**
     * A file name of the group of collected structures.
     * @return StrColumn
     */
    public StrColumn getGroupFileName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("group_file_name", StrColumn::new) :
                getBinaryColumn("group_file_name"));
    }

    /**
     * A file timestamp of the group of collected structures.
     * @return StrColumn
     */
    public StrColumn getGroupFileTimestamp() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("group_file_timestamp", StrColumn::new) :
                getBinaryColumn("group_file_timestamp"));
    }

    /**
     * A contributor label for this data file within the collection.
     * @return StrColumn
     */
    public StrColumn getAuthFileLabel() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_file_label", StrColumn::new) :
                getBinaryColumn("auth_file_label"));
    }

    /**
     * The data content type for this data file within the collection.
     * @return StrColumn
     */
    public StrColumn getAuthFileContentType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_file_content_type", StrColumn::new) :
                getBinaryColumn("auth_file_content_type"));
    }

    /**
     * The data format for this data file within the collection.
     * @return StrColumn
     */
    public StrColumn getAuthFileFormatType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_file_format_type", StrColumn::new) :
                getBinaryColumn("auth_file_format_type"));
    }

    /**
     * The file name for this data file within the collection.
     * @return StrColumn
     */
    public StrColumn getAuthFileName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_file_name", StrColumn::new) :
                getBinaryColumn("auth_file_name"));
    }

    /**
     * The file size (bytes) for this data file within the collection.
     * @return IntColumn
     */
    public IntColumn getAuthFileSize() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("auth_file_size", IntColumn::new) :
                getBinaryColumn("auth_file_size"));
    }
}
