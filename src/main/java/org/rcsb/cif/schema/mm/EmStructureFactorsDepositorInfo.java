package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Structure factor files associated with the EM entry
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmStructureFactorsDepositorInfo extends DelegatingCategory {
    public EmStructureFactorsDepositorInfo(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "experiment_id":
                return getExperimentId();
            case "upload_file_name":
                return getUploadFileName();
            case "details":
                return getDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is the unique identifier for the structure factor file.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * This data item is an optional pointer to the EM_EXPERIMENT category.
     * @return StrColumn
     */
    public StrColumn getExperimentId() {
        return delegate.getColumn("experiment_id", DelegatingStrColumn::new);
    }

    /**
     * The name of the structure factor file associated with the map entry
     * @return StrColumn
     */
    public StrColumn getUploadFileName() {
        return delegate.getColumn("upload_file_name", DelegatingStrColumn::new);
    }

    /**
     * Details about the structure factor file.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

}