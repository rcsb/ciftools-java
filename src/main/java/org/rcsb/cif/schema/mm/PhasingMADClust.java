package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PHASING_MAD_CLUST category record details
 * about a cluster of experiments that contributed to the
 * generation of a set of phases.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PhasingMADClust extends DelegatingCategory {
    public PhasingMADClust(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "expt_id":
                return getExptId();
            case "id":
                return getId();
            case "number_set":
                return getNumberSet();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _phasing_MAD_expt.id in the
     * PHASING_MAD_EXPT category.
     * @return StrColumn
     */
    public StrColumn getExptId() {
        return delegate.getColumn("expt_id", DelegatingStrColumn::new);
    }

    /**
     * The value of _phasing_MAD_clust.id must, together with
     * _phasing_MAD_clust.expt_id, uniquely identify a record in the
     * PHASING_MAD_CLUST list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * The number of data sets in this cluster of data sets.
     * @return IntColumn
     */
    public IntColumn getNumberSet() {
        return delegate.getColumn("number_set", DelegatingIntColumn::new);
    }

}