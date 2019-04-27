package org.rcsb.cif.model.audit;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Audit extends BaseCategory {
    public Audit(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public Audit(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public Audit(String name) {
        super(name);
    }

    /**
     * A date that the data block was created. The date format is
     * yyyy-mm-dd.
     * @return CreationDate
     */
    public CreationDate getCreationDate() {
        return (CreationDate) (isText ? textFields.computeIfAbsent("creation_date",
                CreationDate::new) : getBinaryColumn("creation_date"));
    }

    /**
     * A description of how data were entered into the data block.
     * @return CreationMethod
     */
    public CreationMethod getCreationMethod() {
        return (CreationMethod) (isText ? textFields.computeIfAbsent("creation_method",
                CreationMethod::new) : getBinaryColumn("creation_method"));
    }

    /**
     * The value of _audit.revision_id must uniquely identify a record
     * in the AUDIT list.
     * @return RevisionId
     */
    public RevisionId getRevisionId() {
        return (RevisionId) (isText ? textFields.computeIfAbsent("revision_id",
                RevisionId::new) : getBinaryColumn("revision_id"));
    }

    /**
     * A record of any changes to the data block. The update format is
     * a date (yyyy-mm-dd) followed by a description of the changes.
     * The latest update entry is added to the bottom of this record.
     * @return UpdateRecord
     */
    public UpdateRecord getUpdateRecord() {
        return (UpdateRecord) (isText ? textFields.computeIfAbsent("update_record",
                UpdateRecord::new) : getBinaryColumn("update_record"));
    }
}
