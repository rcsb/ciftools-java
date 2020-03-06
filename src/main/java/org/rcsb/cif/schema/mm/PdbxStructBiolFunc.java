package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_STRUCT_BIOL_FUNC category record details about
 * the function of a particular biological assembly.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxStructBiolFunc extends DelegatingCategory {
    public PdbxStructBiolFunc(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "biol_id":
                return getBiolId();
            case "function":
                return getFunction();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A code which must uniquely identify each function assigned to
     * a biological assembly.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _struct_biol.id in the STRUCT_BIOL
     * category.
     * @return StrColumn
     */
    public StrColumn getBiolId() {
        return delegate.getColumn("biol_id", DelegatingStrColumn::new);
    }

    /**
     * The function assigned to the biological assembly.
     * @return StrColumn
     */
    public StrColumn getFunction() {
        return delegate.getColumn("function", DelegatingStrColumn::new);
    }

}