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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getCurrentStatus() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("current_status", SingleRowStrColumn::new) :
                getBinaryColumn("current_status"));
    }

    /**
     * date of the entry deposition
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDepositionDate() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("deposition_date", SingleRowStrColumn::new) :
                getBinaryColumn("deposition_date"));
    }

    /**
     * entry deposition site
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDepositionSite() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("deposition_site", SingleRowStrColumn::new) :
                getBinaryColumn("deposition_site"));
    }

    /**
     * EMDB administration details
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * This data item is a pointer to _entry.id.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEntryId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("entry_id", SingleRowStrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * date of last update to the file
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getLastUpdate() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("last_update", SingleRowStrColumn::new) :
                getBinaryColumn("last_update"));
    }

    /**
     * date of map release for this entry
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getMapReleaseDate() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("map_release_date", SingleRowStrColumn::new) :
                getBinaryColumn("map_release_date"));
    }

    /**
     * date of the embargo expiration for this map entry
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getMapHoldDate() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("map_hold_date", SingleRowStrColumn::new) :
                getBinaryColumn("map_hold_date"));
    }

    /**
     * date of header information release for this entry
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getHeaderReleaseDate() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("header_release_date", SingleRowStrColumn::new) :
                getBinaryColumn("header_release_date"));
    }

    /**
     * date that map entry was obsoleted
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getObsoletedDate() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("obsoleted_date", SingleRowStrColumn::new) :
                getBinaryColumn("obsoleted_date"));
    }

    /**
     * This item indicates that the current entry replaced a previously released structure.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getReplaceExistingEntryFlag() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("replace_existing_entry_flag", SingleRowStrColumn::new) :
                getBinaryColumn("replace_existing_entry_flag"));
    }

    /**
     * Title for the EMDB entry.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getTitle() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("title", SingleRowStrColumn::new) :
                getBinaryColumn("title"));
    }
}
