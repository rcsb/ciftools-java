package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Listing of all structure factor files associated with the EM entry
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmStructureFactors extends DelegatingCategory {
    public EmStructureFactors(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "details":
                return getDetails();
            case "experiment_id":
                return getExperimentId();
            case "file":
                return getFile();
            case "id":
                return getId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Details about the structure factor file.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to the EM EXPERIMENT category.
     * @return StrColumn
     */
    public StrColumn getExperimentId() {
        return delegate.getColumn("experiment_id", DelegatingStrColumn::new);
    }

    /**
     * The name of the structure factor file associated with the map entry
     * @return StrColumn
     */
    public StrColumn getFile() {
        return delegate.getColumn("file", DelegatingStrColumn::new);
    }

    /**
     * PRIMARY KEY
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

}