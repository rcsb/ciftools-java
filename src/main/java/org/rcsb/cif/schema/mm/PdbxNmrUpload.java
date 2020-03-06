package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Items in the pdbx_nmr_upload category provide information about the data files uploaded by a depositor using the deposition system.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxNmrUpload extends DelegatingCategory {
    public PdbxNmrUpload(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "data_file_id":
                return getDataFileId();
            case "data_file_name":
                return getDataFileName();
            case "data_file_category":
                return getDataFileCategory();
            case "data_file_syntax":
                return getDataFileSyntax();
            case "entry_id":
                return getEntryId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Unique code assigned to the file being uploaded by the depositor and that
     * contains data that will be incorporated into this entry.
     * @return IntColumn
     */
    public IntColumn getDataFileId() {
        return delegate.getColumn("data_file_id", DelegatingIntColumn::new);
    }

    /**
     * The directory path and file name for the data file that is to be uploaded.
     * @return StrColumn
     */
    public StrColumn getDataFileName() {
        return delegate.getColumn("data_file_name", DelegatingStrColumn::new);
    }

    /**
     * This item defines the kind of data in the file uploaded for deposition.
     * @return StrColumn
     */
    public StrColumn getDataFileCategory() {
        return delegate.getColumn("data_file_category", DelegatingStrColumn::new);
    }

    /**
     * The syntax or format of the file that is uploaded.
     * @return StrColumn
     */
    public StrColumn getDataFileSyntax() {
        return delegate.getColumn("data_file_syntax", DelegatingStrColumn::new);
    }

    /**
     * Pointer to '_entry.id'
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

}