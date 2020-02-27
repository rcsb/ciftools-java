package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_STRUCT_ASYM_GEN category record details about
 * the generation of the crystallographic asymmetric unit. The
 * PDBX_STRUCT_ASYM_GEN data items provide the specifications of the
 * components that constitute the asymmetric unit in terms of cartesian
 * transformations of deposited coordinates.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxStructAsymGen extends DelegatingCategory {
    public PdbxStructAsymGen(Category delegate) {
        super(delegate);
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
     * This data item is a pointer to _struct_asym.id in the
     * STRUCT_ASYM category.
     * @return StrColumn
     */
    public StrColumn getAsymId() {
        return delegate.getColumn("asym_id", DelegatingStrColumn::new);
    }

    /**
     * Identifies the operation from category PDBX_STRUCT_OPER_LIST.
     * @return StrColumn
     */
    public StrColumn getOperExpression() {
        return delegate.getColumn("oper_expression", DelegatingStrColumn::new);
    }
}
