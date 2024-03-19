package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Administration-related data items
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmAdmin extends DelegatingCategory {
    public EmAdmin(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "current_status":
                return getCurrentStatus();
            case "deposition_date":
                return getDepositionDate();
            case "deposition_site":
                return getDepositionSite();
            case "details":
                return getDetails();
            case "entry_id":
                return getEntryId();
            case "last_update":
                return getLastUpdate();
            case "map_release_date":
                return getMapReleaseDate();
            case "map_hold_date":
                return getMapHoldDate();
            case "header_release_date":
                return getHeaderReleaseDate();
            case "obsoleted_date":
                return getObsoletedDate();
            case "replace_existing_entry_flag":
                return getReplaceExistingEntryFlag();
            case "title":
                return getTitle();
            case "process_site":
                return getProcessSite();
            case "composite_map":
                return getCompositeMap();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item indicates the current status of the EMDB entry.
     * @return StrColumn
     */
    public StrColumn getCurrentStatus() {
        return delegate.getColumn("current_status", DelegatingStrColumn::new);
    }

    /**
     * date of the entry deposition
     * @return StrColumn
     */
    public StrColumn getDepositionDate() {
        return delegate.getColumn("deposition_date", DelegatingStrColumn::new);
    }

    /**
     * entry deposition site
     * @return StrColumn
     */
    public StrColumn getDepositionSite() {
        return delegate.getColumn("deposition_site", DelegatingStrColumn::new);
    }

    /**
     * EMDB administration details
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _entry.id.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * date of last update to the file
     * @return StrColumn
     */
    public StrColumn getLastUpdate() {
        return delegate.getColumn("last_update", DelegatingStrColumn::new);
    }

    /**
     * date of map release for this entry
     * @return StrColumn
     */
    public StrColumn getMapReleaseDate() {
        return delegate.getColumn("map_release_date", DelegatingStrColumn::new);
    }

    /**
     * Date when the map is due to be released after a specific hold period.
     * @return StrColumn
     */
    public StrColumn getMapHoldDate() {
        return delegate.getColumn("map_hold_date", DelegatingStrColumn::new);
    }

    /**
     * date of header information release for this entry
     * @return StrColumn
     */
    public StrColumn getHeaderReleaseDate() {
        return delegate.getColumn("header_release_date", DelegatingStrColumn::new);
    }

    /**
     * date that map entry was obsoleted
     * @return StrColumn
     */
    public StrColumn getObsoletedDate() {
        return delegate.getColumn("obsoleted_date", DelegatingStrColumn::new);
    }

    /**
     * Please indicate whether the current entry is intended to supersede a
     * previously released entry.  Please contact wwPDB annotation staff using the
     * "Communication" page if you have any questions regarding how to answer this
     * question.
     * @return StrColumn
     */
    public StrColumn getReplaceExistingEntryFlag() {
        return delegate.getColumn("replace_existing_entry_flag", DelegatingStrColumn::new);
    }

    /**
     * Title for the EMDB entry.
     * @return StrColumn
     */
    public StrColumn getTitle() {
        return delegate.getColumn("title", DelegatingStrColumn::new);
    }

    /**
     * The site where the file was deposited.
     * @return StrColumn
     */
    public StrColumn getProcessSite() {
        return delegate.getColumn("process_site", DelegatingStrColumn::new);
    }

    /**
     * Indicates whether the authors have declared that this is a composite map deposition
     * @return StrColumn
     */
    public StrColumn getCompositeMap() {
        return delegate.getColumn("composite_map", DelegatingStrColumn::new);
    }

}