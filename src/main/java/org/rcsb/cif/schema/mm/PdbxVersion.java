package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_VERSION category record details about the
 * version of this entry.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxVersion extends DelegatingCategory {
    public PdbxVersion(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entry_id":
                return getEntryId();
            case "revision_date":
                return getRevisionDate();
            case "major_version":
                return getMajorVersion();
            case "minor_version":
                return getMinorVersion();
            case "details":
                return getDetails();
            case "revision_type":
                return getRevisionType();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * A date for the current version or revision. The date format is
     * yyyy-mm-dd.
     * @return StrColumn
     */
    public StrColumn getRevisionDate() {
        return delegate.getColumn("revision_date", DelegatingStrColumn::new);
    }

    /**
     * Major version number for this datablock.
     * @return IntColumn
     */
    public IntColumn getMajorVersion() {
        return delegate.getColumn("major_version", DelegatingIntColumn::new);
    }

    /**
     * Minor version identifier for this datablock:
     * 
     * The minor version is incremented for each datablock revision.
     * @return StrColumn
     */
    public StrColumn getMinorVersion() {
        return delegate.getColumn("minor_version", DelegatingStrColumn::new);
    }

    /**
     * A text description of any special details of the current version.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The content type that associated with the revision.
     * @return StrColumn
     */
    public StrColumn getRevisionType() {
        return delegate.getColumn("revision_type", DelegatingStrColumn::new);
    }

}