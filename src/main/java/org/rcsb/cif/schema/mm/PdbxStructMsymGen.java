package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_STRUCT_MSYM_GEN category record details about
 * the generation of the minimal asymmetric unit. For instance, this
 * category can be used to provide this information for helical and point
 * symmetry systems.   The PDBX_STRUCT_MSYM_GEN data items provide the
 * specifications of the components that constitute the asymmetric unit
 * in terms of cartesian transformations of deposited coordinates.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxStructMsymGen extends DelegatingCategory {
    public PdbxStructMsymGen(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entity_inst_id":
                return getEntityInstId();
            case "msym_id":
                return getMsymId();
            case "oper_expression":
                return getOperExpression();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _pdbx_struct_entity_inst.id in
     * the PDBX_STRUCT_ENTITY_INST category.
     * @return StrColumn
     */
    public StrColumn getEntityInstId() {
        return delegate.getColumn("entity_inst_id", DelegatingStrColumn::new);
    }

    /**
     * Uniquely identifies the this structure instance in
     * point symmetry unit.
     * @return StrColumn
     */
    public StrColumn getMsymId() {
        return delegate.getColumn("msym_id", DelegatingStrColumn::new);
    }

    /**
     * Identifies the operation from category PDBX_STRUCT_OPER_LIST.
     * @return StrColumn
     */
    public StrColumn getOperExpression() {
        return delegate.getColumn("oper_expression", DelegatingStrColumn::new);
    }

}