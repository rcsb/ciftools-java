package org.rcsb.cif.model.generated.pdbxdepositgroupindex;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return GroupId
     */
    public GroupId getGroupId() {
        return (GroupId) (isText ? textFields.computeIfAbsent("group_id",
                GroupId::new) : getBinaryColumn("group_id"));
    }

    /**
     * A unique identifier for the index entry within the deposition group.
     * @return OrdinalId
     */
    public OrdinalId getOrdinalId() {
        return (OrdinalId) (isText ? textFields.computeIfAbsent("ordinal_id",
                OrdinalId::new) : getBinaryColumn("ordinal_id"));
    }

    /**
     * An internal identifier for a deposited data set.
     * @return DepSetId
     */
    public DepSetId getDepSetId() {
        return (DepSetId) (isText ? textFields.computeIfAbsent("dep_set_id",
                DepSetId::new) : getBinaryColumn("dep_set_id"));
    }

    /**
     * A PDB accession code.
     * @return PdbIdCode
     */
    public PdbIdCode getPdbIdCode() {
        return (PdbIdCode) (isText ? textFields.computeIfAbsent("pdb_id_code",
                PdbIdCode::new) : getBinaryColumn("pdb_id_code"));
    }

    /**
     * A file name of the group of collected structures.
     * @return GroupFileName
     */
    public GroupFileName getGroupFileName() {
        return (GroupFileName) (isText ? textFields.computeIfAbsent("group_file_name",
                GroupFileName::new) : getBinaryColumn("group_file_name"));
    }

    /**
     * A file timestamp of the group of collected structures.
     * @return GroupFileTimestamp
     */
    public GroupFileTimestamp getGroupFileTimestamp() {
        return (GroupFileTimestamp) (isText ? textFields.computeIfAbsent("group_file_timestamp",
                GroupFileTimestamp::new) : getBinaryColumn("group_file_timestamp"));
    }

    /**
     * A contributor label for this data file within the collection.
     * @return AuthFileLabel
     */
    public AuthFileLabel getAuthFileLabel() {
        return (AuthFileLabel) (isText ? textFields.computeIfAbsent("auth_file_label",
                AuthFileLabel::new) : getBinaryColumn("auth_file_label"));
    }

    /**
     * The data content type for this data file within the collection.
     * @return AuthFileContentType
     */
    public AuthFileContentType getAuthFileContentType() {
        return (AuthFileContentType) (isText ? textFields.computeIfAbsent("auth_file_content_type",
                AuthFileContentType::new) : getBinaryColumn("auth_file_content_type"));
    }

    /**
     * The data format for this data file within the collection.
     * @return AuthFileFormatType
     */
    public AuthFileFormatType getAuthFileFormatType() {
        return (AuthFileFormatType) (isText ? textFields.computeIfAbsent("auth_file_format_type",
                AuthFileFormatType::new) : getBinaryColumn("auth_file_format_type"));
    }

    /**
     * The file name for this data file within the collection.
     * @return AuthFileName
     */
    public AuthFileName getAuthFileName() {
        return (AuthFileName) (isText ? textFields.computeIfAbsent("auth_file_name",
                AuthFileName::new) : getBinaryColumn("auth_file_name"));
    }

    /**
     * The file size (bytes) for this data file within the collection.
     * @return AuthFileSize
     */
    public AuthFileSize getAuthFileSize() {
        return (AuthFileSize) (isText ? textFields.computeIfAbsent("auth_file_size",
                AuthFileSize::new) : getBinaryColumn("auth_file_size"));
    }
}
