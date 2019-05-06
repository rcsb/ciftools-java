package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Administration-related data items
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class EmAdmin extends BaseCategory {
    public EmAdmin(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmAdmin(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmAdmin(String name) {
        super(name);
    }

    /**
     * This data item indicates the current status of the EMDB entry.
     * @return StrColumn
     */
    public StrColumn getCurrentStatus() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("current_status", StrColumn::new) :
                getBinaryColumn("current_status"));
    }

    /**
     * date of the entry deposition
     * @return StrColumn
     */
    public StrColumn getDepositionDate() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("deposition_date", StrColumn::new) :
                getBinaryColumn("deposition_date"));
    }

    /**
     * entry deposition site
     * @return StrColumn
     */
    public StrColumn getDepositionSite() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("deposition_site", StrColumn::new) :
                getBinaryColumn("deposition_site"));
    }

    /**
     * EMDB administration details
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * This data item is a pointer to _entry.id.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * date of last update to the file
     * @return StrColumn
     */
    public StrColumn getLastUpdate() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("last_update", StrColumn::new) :
                getBinaryColumn("last_update"));
    }

    /**
     * date of map release for this entry
     * @return StrColumn
     */
    public StrColumn getMapReleaseDate() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("map_release_date", StrColumn::new) :
                getBinaryColumn("map_release_date"));
    }

    /**
     * date of the embargo expiration for this map entry
     * @return StrColumn
     */
    public StrColumn getMapHoldDate() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("map_hold_date", StrColumn::new) :
                getBinaryColumn("map_hold_date"));
    }

    /**
     * date of header information release for this entry
     * @return StrColumn
     */
    public StrColumn getHeaderReleaseDate() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("header_release_date", StrColumn::new) :
                getBinaryColumn("header_release_date"));
    }

    /**
     * date that map entry was obsoleted
     * @return StrColumn
     */
    public StrColumn getObsoletedDate() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("obsoleted_date", StrColumn::new) :
                getBinaryColumn("obsoleted_date"));
    }

    /**
     * This item indicates that the current entry replaced a previously released structure.
     * @return StrColumn
     */
    public StrColumn getReplaceExistingEntryFlag() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("replace_existing_entry_flag", StrColumn::new) :
                getBinaryColumn("replace_existing_entry_flag"));
    }

    /**
     * Title for the EMDB entry.
     * @return StrColumn
     */
    public StrColumn getTitle() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("title", StrColumn::new) :
                getBinaryColumn("title"));
    }
}
