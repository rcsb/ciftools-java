package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PUBL_MANUSCRIPT_INCL category allow
 * the authors of a manuscript submitted for publication to list
 * data names that should be added to the standard request list
 * used by the journal printing software.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PublManuscriptIncl extends DelegatingCategory {
    public PublManuscriptIncl(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entry_id":
                return getEntryId();
            case "extra_defn":
                return getExtraDefn();
            case "extra_info":
                return getExtraInfo();
            case "extra_item":
                return getExtraItem();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * Flags whether the corresponding data item marked for inclusion
     * in a journal request list is a standard CIF definition or not.
     * @return StrColumn
     */
    public StrColumn getExtraDefn() {
        return delegate.getColumn("extra_defn", DelegatingStrColumn::new);
    }

    /**
     * A short note indicating the reason why the author wishes the
     * corresponding data item marked for inclusion in the journal
     * request list to be published.
     * @return StrColumn
     */
    public StrColumn getExtraInfo() {
        return delegate.getColumn("extra_info", DelegatingStrColumn::new);
    }

    /**
     * Specifies the inclusion of specific data into a manuscript
     * which are not normally requested by the journal. The values
     * of this item are the extra data names (which MUST be enclosed
     * in single quotes) that will be added to the journal request list.
     * @return StrColumn
     */
    public StrColumn getExtraItem() {
        return delegate.getColumn("extra_item", DelegatingStrColumn::new);
    }

}