package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_CHEM_COMP_UPLOAD_DEPOSITOR_INFO category record
 * details of the uploaded files related to depositor provided chemical assignments.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxChemCompUploadDepositorInfo extends DelegatingCategory {
    public PdbxChemCompUploadDepositorInfo(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "ordinal":
                return getOrdinal();
            case "comp_id":
                return getCompId();
            case "upload_file_type":
                return getUploadFileType();
            case "upload_file_name":
                return getUploadFileName();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Ordinal index for this category.
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return delegate.getColumn("ordinal", DelegatingIntColumn::new);
    }

    /**
     * The chemical component identifier used by the depositor to represent this component.
     * @return StrColumn
     */
    public StrColumn getCompId() {
        return delegate.getColumn("comp_id", DelegatingStrColumn::new);
    }

    /**
     * The type of the uploaded file containing information about this component.
     * @return StrColumn
     */
    public StrColumn getUploadFileType() {
        return delegate.getColumn("upload_file_type", DelegatingStrColumn::new);
    }

    /**
     * The name of the uploaded file containing information about this component.
     * @return StrColumn
     */
    public StrColumn getUploadFileName() {
        return delegate.getColumn("upload_file_name", DelegatingStrColumn::new);
    }

}