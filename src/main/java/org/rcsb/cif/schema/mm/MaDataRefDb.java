package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the MA_DATA_REF_DB category capture the details regarding
 * reference databases used in the modeling. These include the
 * sequence databases used for template search, alignments, etc.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class MaDataRefDb extends DelegatingCategory {
    public MaDataRefDb(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "data_id":
                return getDataId();
            case "name":
                return getName();
            case "location_url":
                return getLocationUrl();
            case "version":
                return getVersion();
            case "release_date":
                return getReleaseDate();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Identifier for the reference database.
     * This data item is a pointer to _ma_data.id
     * in the MA_DATA category.
     * @return IntColumn
     */
    public IntColumn getDataId() {
        return delegate.getColumn("data_id", DelegatingIntColumn::new);
    }

    /**
     * Name of the reference database.
     * @return StrColumn
     */
    public StrColumn getName() {
        return delegate.getColumn("name", DelegatingStrColumn::new);
    }

    /**
     * URL for the reference database.
     * @return StrColumn
     */
    public StrColumn getLocationUrl() {
        return delegate.getColumn("location_url", DelegatingStrColumn::new);
    }

    /**
     * Version of the reference database.
     * @return StrColumn
     */
    public StrColumn getVersion() {
        return delegate.getColumn("version", DelegatingStrColumn::new);
    }

    /**
     * Release date of the version specified in _ma_data_ref_db.version.
     * @return StrColumn
     */
    public StrColumn getReleaseDate() {
        return delegate.getColumn("release_date", DelegatingStrColumn::new);
    }

}