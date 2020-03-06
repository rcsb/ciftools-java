package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the pdbx_deposit_group_index category provides details
 * about the individual data files in the collection of deposited entries.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxDepositGroupIndex extends DelegatingCategory {
    public PdbxDepositGroupIndex(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "group_id":
                return getGroupId();
            case "ordinal_id":
                return getOrdinalId();
            case "dep_set_id":
                return getDepSetId();
            case "pdb_id_code":
                return getPdbIdCode();
            case "group_file_name":
                return getGroupFileName();
            case "group_file_timestamp":
                return getGroupFileTimestamp();
            case "auth_file_label":
                return getAuthFileLabel();
            case "auth_file_content_type":
                return getAuthFileContentType();
            case "auth_file_format_type":
                return getAuthFileFormatType();
            case "auth_file_name":
                return getAuthFileName();
            case "auth_file_size":
                return getAuthFileSize();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for a group of entries deposited as a collection.
     * @return StrColumn
     */
    public StrColumn getGroupId() {
        return delegate.getColumn("group_id", DelegatingStrColumn::new);
    }

    /**
     * A unique identifier for the index entry within the deposition group.
     * @return IntColumn
     */
    public IntColumn getOrdinalId() {
        return delegate.getColumn("ordinal_id", DelegatingIntColumn::new);
    }

    /**
     * An internal identifier for a deposited data set.
     * @return StrColumn
     */
    public StrColumn getDepSetId() {
        return delegate.getColumn("dep_set_id", DelegatingStrColumn::new);
    }

    /**
     * A PDB accession code.
     * @return StrColumn
     */
    public StrColumn getPdbIdCode() {
        return delegate.getColumn("pdb_id_code", DelegatingStrColumn::new);
    }

    /**
     * A file name of the group of collected structures.
     * @return StrColumn
     */
    public StrColumn getGroupFileName() {
        return delegate.getColumn("group_file_name", DelegatingStrColumn::new);
    }

    /**
     * A file timestamp of the group of collected structures.
     * @return StrColumn
     */
    public StrColumn getGroupFileTimestamp() {
        return delegate.getColumn("group_file_timestamp", DelegatingStrColumn::new);
    }

    /**
     * A contributor label for this data file within the collection.
     * @return StrColumn
     */
    public StrColumn getAuthFileLabel() {
        return delegate.getColumn("auth_file_label", DelegatingStrColumn::new);
    }

    /**
     * The data content type for this data file within the collection.
     * @return StrColumn
     */
    public StrColumn getAuthFileContentType() {
        return delegate.getColumn("auth_file_content_type", DelegatingStrColumn::new);
    }

    /**
     * The data format for this data file within the collection.
     * @return StrColumn
     */
    public StrColumn getAuthFileFormatType() {
        return delegate.getColumn("auth_file_format_type", DelegatingStrColumn::new);
    }

    /**
     * The file name for this data file within the collection.
     * @return StrColumn
     */
    public StrColumn getAuthFileName() {
        return delegate.getColumn("auth_file_name", DelegatingStrColumn::new);
    }

    /**
     * The file size (bytes) for this data file within the collection.
     * @return IntColumn
     */
    public IntColumn getAuthFileSize() {
        return delegate.getColumn("auth_file_size", DelegatingIntColumn::new);
    }

}