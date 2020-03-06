package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the STRUCT_NCS_ENS category record information
 * about ensembles of domains related by noncrystallographic
 * symmetry. The point group of the ensemble when taken as a
 * whole may be specified, as well as any special aspects of the
 * ensemble that require description.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class StructNcsEns extends DelegatingCategory {
    public StructNcsEns(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "details":
                return getDetails();
            case "id":
                return getId();
            case "point_group":
                return getPointGroup();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A description of special aspects of the ensemble.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The value of _struct_ncs_ens.id must uniquely identify a
     * record in the STRUCT_NCS_ENS list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * The point group of the ensemble of structural elements related by
     * one or more noncrystallographic symmetry operations. The
     * relationships need not be precise; this data item is intended
     * to give a rough description of the noncrystallographic symmetry
     * relationships.
     * @return StrColumn
     */
    public StrColumn getPointGroup() {
        return delegate.getColumn("point_group", DelegatingStrColumn::new);
    }

}