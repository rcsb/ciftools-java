package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_VERSION category record details about the
 * version of this entry.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * A date for the current version or revision. The date format is
     * yyyy-mm-dd.
     * @return StrColumn
     */
    public StrColumn getRevisionDate() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("revision_date", StrColumn::new) :
                getBinaryColumn("revision_date"));
    }

    /**
     * Major version number for this datablock.
     * @return IntColumn
     */
    public IntColumn getMajorVersion() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("major_version", IntColumn::new) :
                getBinaryColumn("major_version"));
    }

    /**
     * Minor version identifier for this datablock:
     * 
     * The minor version is incremented for each datablock revision.
     * @return StrColumn
     */
    public StrColumn getMinorVersion() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("minor_version", StrColumn::new) :
                getBinaryColumn("minor_version"));
    }

    /**
     * A text description of any special details of the current version.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The content type that associated with the revision.
     * @return StrColumn
     */
    public StrColumn getRevisionType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("revision_type", StrColumn::new) :
                getBinaryColumn("revision_type"));
    }
}
