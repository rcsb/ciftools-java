package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the JOURNAL_INDEX category are used to list terms
 * used to generate the journal indexes.
 * 
 * The creator of a data block will not normally specify these data
 * items.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class JournalIndex extends DelegatingCategory {
    public JournalIndex(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "subterm":
                return getSubterm();
            case "term":
                return getTerm();
            case "type":
                return getType();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Journal index data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getSubterm() {
        return delegate.getColumn("subterm", DelegatingStrColumn::new);
    }

    /**
     * Journal index data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getTerm() {
        return delegate.getColumn("term", DelegatingStrColumn::new);
    }

    /**
     * Journal index data items are defined by the journal staff.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

}