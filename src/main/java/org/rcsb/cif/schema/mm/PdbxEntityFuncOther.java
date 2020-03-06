package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_ENTITY_FUNC_OTHER category describe
 * characteristics of protein oligonucleotide binding in which
 * the binding mode is not classified.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxEntityFuncOther extends DelegatingCategory {
    public PdbxEntityFuncOther(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "bind_mode_id":
                return getBindModeId();
            case "type":
                return getType();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is pointer to _pdbx_entity_func_bind_mode.id in the
     * PDBX_ENTITY_FUNC_BIND_MODE category.
     * @return StrColumn
     */
    public StrColumn getBindModeId() {
        return delegate.getColumn("bind_mode_id", DelegatingStrColumn::new);
    }

    /**
     * This data item describes the type of structural function.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

}