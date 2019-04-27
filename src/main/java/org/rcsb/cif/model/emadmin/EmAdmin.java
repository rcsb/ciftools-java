package org.rcsb.cif.model.emadmin;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return CurrentStatus
     */
    public CurrentStatus getCurrentStatus() {
        return (CurrentStatus) (isText ? textFields.computeIfAbsent("current_status",
                CurrentStatus::new) : getBinaryColumn("current_status"));
    }

    /**
     * date of the entry deposition
     * @return DepositionDate
     */
    public DepositionDate getDepositionDate() {
        return (DepositionDate) (isText ? textFields.computeIfAbsent("deposition_date",
                DepositionDate::new) : getBinaryColumn("deposition_date"));
    }

    /**
     * entry deposition site
     * @return DepositionSite
     */
    public DepositionSite getDepositionSite() {
        return (DepositionSite) (isText ? textFields.computeIfAbsent("deposition_site",
                DepositionSite::new) : getBinaryColumn("deposition_site"));
    }

    /**
     * EMDB administration details
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * This data item is a pointer to _entry.id.
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * date of last update to the file
     * @return LastUpdate
     */
    public LastUpdate getLastUpdate() {
        return (LastUpdate) (isText ? textFields.computeIfAbsent("last_update",
                LastUpdate::new) : getBinaryColumn("last_update"));
    }

    /**
     * date of map release for this entry
     * @return MapReleaseDate
     */
    public MapReleaseDate getMapReleaseDate() {
        return (MapReleaseDate) (isText ? textFields.computeIfAbsent("map_release_date",
                MapReleaseDate::new) : getBinaryColumn("map_release_date"));
    }

    /**
     * date of the embargo expiration for this map entry
     * @return MapHoldDate
     */
    public MapHoldDate getMapHoldDate() {
        return (MapHoldDate) (isText ? textFields.computeIfAbsent("map_hold_date",
                MapHoldDate::new) : getBinaryColumn("map_hold_date"));
    }

    /**
     * date of header information release for this entry
     * @return HeaderReleaseDate
     */
    public HeaderReleaseDate getHeaderReleaseDate() {
        return (HeaderReleaseDate) (isText ? textFields.computeIfAbsent("header_release_date",
                HeaderReleaseDate::new) : getBinaryColumn("header_release_date"));
    }

    /**
     * date that map entry was obsoleted
     * @return ObsoletedDate
     */
    public ObsoletedDate getObsoletedDate() {
        return (ObsoletedDate) (isText ? textFields.computeIfAbsent("obsoleted_date",
                ObsoletedDate::new) : getBinaryColumn("obsoleted_date"));
    }

    /**
     * This item indicates that the current entry replaced a previously released structure.
     * @return ReplaceExistingEntryFlag
     */
    public ReplaceExistingEntryFlag getReplaceExistingEntryFlag() {
        return (ReplaceExistingEntryFlag) (isText ? textFields.computeIfAbsent("replace_existing_entry_flag",
                ReplaceExistingEntryFlag::new) : getBinaryColumn("replace_existing_entry_flag"));
    }

    /**
     * Title for the EMDB entry.
     * @return Title
     */
    public Title getTitle() {
        return (Title) (isText ? textFields.computeIfAbsent("title",
                Title::new) : getBinaryColumn("title"));
    }
}
