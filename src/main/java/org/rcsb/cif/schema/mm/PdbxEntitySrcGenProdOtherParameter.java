package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * This category contains parameters and values required to capture
 * information about a particular process step
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxEntitySrcGenProdOtherParameter extends DelegatingCategory {
    public PdbxEntitySrcGenProdOtherParameter(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entry_id":
                return getEntryId();
            case "entity_id":
                return getEntityId();
            case "step_id":
                return getStepId();
            case "parameter":
                return getParameter();
            case "value":
                return getValue();
            case "details":
                return getDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_entity_src_gen_prod_other_parameter.entry_id is a pointer
     * to _pdbx_entity_src_gen_prod_other.entry.id
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * The value of _pdbx_entity_src_gen_prod_other_parameter.entity_id is a pointer
     * to _pdbx_entity_src_gen_prod_other.entity_id
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * This item is a pointer to _pdbx_entity_src_gen_prod_other.step_id
     * @return IntColumn
     */
    public IntColumn getStepId() {
        return delegate.getColumn("step_id", DelegatingIntColumn::new);
    }

    /**
     * The name of the parameter associated with the process step
     * @return StrColumn
     */
    public StrColumn getParameter() {
        return delegate.getColumn("parameter", DelegatingStrColumn::new);
    }

    /**
     * The value of the parameter
     * @return StrColumn
     */
    public StrColumn getValue() {
        return delegate.getColumn("value", DelegatingStrColumn::new);
    }

    /**
     * Additional details about the parameter
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

}