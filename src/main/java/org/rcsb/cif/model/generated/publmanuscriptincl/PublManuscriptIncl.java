package org.rcsb.cif.model.generated.publmanuscriptincl;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PublManuscriptIncl extends BaseCategory {
    public PublManuscriptIncl(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PublManuscriptIncl(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PublManuscriptIncl(String name) {
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
     * Flags whether the corresponding data item marked for inclusion
     * in a journal request list is a standard CIF definition or not.
     * @return ExtraDefn
     */
    public ExtraDefn getExtraDefn() {
        return (ExtraDefn) (isText ? textFields.computeIfAbsent("extra_defn",
                ExtraDefn::new) : getBinaryColumn("extra_defn"));
    }

    /**
     * A short note indicating the reason why the author wishes the
     * corresponding data item marked for inclusion in the journal
     * request list to be published.
     * @return ExtraInfo
     */
    public ExtraInfo getExtraInfo() {
        return (ExtraInfo) (isText ? textFields.computeIfAbsent("extra_info",
                ExtraInfo::new) : getBinaryColumn("extra_info"));
    }

    /**
     * Specifies the inclusion of specific data into a manuscript
     * which are not normally requested by the journal. The values
     * of this item are the extra data names (which MUST be enclosed
     * in single quotes) that will be added to the journal request list.
     * @return ExtraItem
     */
    public ExtraItem getExtraItem() {
        return (ExtraItem) (isText ? textFields.computeIfAbsent("extra_item",
                ExtraItem::new) : getBinaryColumn("extra_item"));
    }
}
