package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PHASING_ISOMORPHOUS category record details
 * about the phasing of the structure where a model isomorphous
 * to the structure being phased was used to generate the initial
 * phases.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PhasingIsomorphous extends DelegatingCategory {
    public PhasingIsomorphous(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "details":
                return getDetails();
            case "entry_id":
                return getEntryId();
            case "method":
                return getMethod();
            case "parent":
                return getParent();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A description of special aspects of the isomorphous phasing.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * A description of the isomorphous-phasing method used to
     * phase this structure.
     * 
     * Note that this is not the computer program used, which is
     * described in the SOFTWARE category, but rather the method
     * itself.
     * 
     * This data item should be used to describe significant
     * methodological options used within the isomorphous phasing
     * program.
     * @return StrColumn
     */
    public StrColumn getMethod() {
        return delegate.getColumn("method", DelegatingStrColumn::new);
    }

    /**
     * Reference to the structure used to generate starting phases
     * if the structure referenced in this data block was phased
     * by virtue of being isomorphous to a known structure (e.g.
     * a mutant that crystallizes in the same space group as the
     * wild-type protein.)
     * @return StrColumn
     */
    public StrColumn getParent() {
        return delegate.getColumn("parent", DelegatingStrColumn::new);
    }

}