package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * An average structure is often calculated in addition to the ensemble, or one
 * of the ensemble is selected as a representative structure. This section
 * describes selection of the representative structure.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxNmrRepresentative extends DelegatingCategory {
    public PdbxNmrRepresentative(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entry_id":
                return getEntryId();
            case "conformer_id":
                return getConformerId();
            case "selection_criteria":
                return getSelectionCriteria();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * msd will assign the ID.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * If a member of the ensemble has been selected as a representative
     * structure, identify it by its model number.
     * @return StrColumn
     */
    public StrColumn getConformerId() {
        return delegate.getColumn("conformer_id", DelegatingStrColumn::new);
    }

    /**
     * By highlighting the appropriate choice(s), describe the criteria used to
     * select this structure as a representative structure, or if an average
     * structure has been calculated describe how this was done.
     * @return StrColumn
     */
    public StrColumn getSelectionCriteria() {
        return delegate.getColumn("selection_criteria", DelegatingStrColumn::new);
    }

}