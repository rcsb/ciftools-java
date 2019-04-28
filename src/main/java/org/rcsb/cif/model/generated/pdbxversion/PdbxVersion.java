package org.rcsb.cif.model.generated.pdbxversion;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxVersion extends BaseCategory {
    public PdbxVersion(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxVersion(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxVersion(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * A date for the current version or revision. The date format is
     * yyyy-mm-dd.
     * @return RevisionDate
     */
    public RevisionDate getRevisionDate() {
        return (RevisionDate) (isText ? textFields.computeIfAbsent("revision_date",
                RevisionDate::new) : getBinaryColumn("revision_date"));
    }

    /**
     * Major version number for this datablock.
     * @return MajorVersion
     */
    public MajorVersion getMajorVersion() {
        return (MajorVersion) (isText ? textFields.computeIfAbsent("major_version",
                MajorVersion::new) : getBinaryColumn("major_version"));
    }

    /**
     * Minor version identifier for this datablock:
     * 
     * The minor version is incremented for each datablock revision.
     * @return MinorVersion
     */
    public MinorVersion getMinorVersion() {
        return (MinorVersion) (isText ? textFields.computeIfAbsent("minor_version",
                MinorVersion::new) : getBinaryColumn("minor_version"));
    }

    /**
     * A text description of any special details of the current version.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * The content type that associated with the revision.
     * @return RevisionType
     */
    public RevisionType getRevisionType() {
        return (RevisionType) (isText ? textFields.computeIfAbsent("revision_type",
                RevisionType::new) : getBinaryColumn("revision_type"));
    }
}
