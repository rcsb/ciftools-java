package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the AUDIT category record details about the
 * creation and subsequent updating of the data block.
 * 
 * Note that these items apply only to the creation and updating of
 * the data block, and should not be confused with the data items
 * in the JOURNAL category that record different stages in the
 * publication of the material in the data block.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Audit extends DelegatingCategory {
    public Audit(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "creation_date":
                return getCreationDate();
            case "creation_method":
                return getCreationMethod();
            case "revision_id":
                return getRevisionId();
            case "update_record":
                return getUpdateRecord();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A date that the data block was created. The date format is
     * yyyy-mm-dd.
     * @return StrColumn
     */
    public StrColumn getCreationDate() {
        return delegate.getColumn("creation_date", DelegatingStrColumn::new);
    }

    /**
     * A description of how data were entered into the data block.
     * @return StrColumn
     */
    public StrColumn getCreationMethod() {
        return delegate.getColumn("creation_method", DelegatingStrColumn::new);
    }

    /**
     * The value of _audit.revision_id must uniquely identify a record
     * in the AUDIT list.
     * @return StrColumn
     */
    public StrColumn getRevisionId() {
        return delegate.getColumn("revision_id", DelegatingStrColumn::new);
    }

    /**
     * A record of any changes to the data block. The update format is
     * a date (yyyy-mm-dd) followed by a description of the changes.
     * The latest update entry is added to the bottom of this record.
     * @return StrColumn
     */
    public StrColumn getUpdateRecord() {
        return delegate.getColumn("update_record", DelegatingStrColumn::new);
    }

}