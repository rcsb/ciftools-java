package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PUBL_MANUSCRIPT_INCL category allow
 * the authors of a manuscript submitted for publication to list
 * data names that should be added to the standard request list
 * used by the journal printing software.
 */
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
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * Flags whether the corresponding data item marked for inclusion
     * in a journal request list is a standard CIF definition or not.
     * @return StrColumn
     */
    public StrColumn getExtraDefn() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("extra_defn", StrColumn::new) :
                getBinaryColumn("extra_defn"));
    }

    /**
     * A short note indicating the reason why the author wishes the
     * corresponding data item marked for inclusion in the journal
     * request list to be published.
     * @return StrColumn
     */
    public StrColumn getExtraInfo() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("extra_info", StrColumn::new) :
                getBinaryColumn("extra_info"));
    }

    /**
     * Specifies the inclusion of specific data into a manuscript
     * which are not normally requested by the journal. The values
     * of this item are the extra data names (which MUST be enclosed
     * in single quotes) that will be added to the journal request list.
     * @return StrColumn
     */
    public StrColumn getExtraItem() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("extra_item", StrColumn::new) :
                getBinaryColumn("extra_item"));
    }
}
