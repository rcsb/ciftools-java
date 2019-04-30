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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEntryId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("entry_id", SingleRowStrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * A date for the current version or revision. The date format is
     * yyyy-mm-dd.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getRevisionDate() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("revision_date", SingleRowStrColumn::new) :
                getBinaryColumn("revision_date"));
    }

    /**
     * Major version number for this datablock.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getMajorVersion() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("major_version", SingleRowIntColumn::new) :
                getBinaryColumn("major_version"));
    }

    /**
     * Minor version identifier for this datablock:
     * 
     * The minor version is incremented for each datablock revision.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getMinorVersion() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("minor_version", SingleRowStrColumn::new) :
                getBinaryColumn("minor_version"));
    }

    /**
     * A text description of any special details of the current version.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The content type that associated with the revision.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getRevisionType() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("revision_type", SingleRowStrColumn::new) :
                getBinaryColumn("revision_type"));
    }
}
