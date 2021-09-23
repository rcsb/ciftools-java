package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the STRUCT_NCS_ENS_GEN category list domains
 * related by a noncrystallographic symmetry operation and
 * identify the operator.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class StructNcsEnsGen extends DelegatingCategory {
    public StructNcsEnsGen(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "dom_id_1":
                return getDomId1();
            case "dom_id_2":
                return getDomId2();
            case "ens_id":
                return getEnsId();
            case "oper_id":
                return getOperId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The identifier for the domain that will remain unchanged by the
     * transformation operator.
     * 
     * This data item is a pointer to _struct_ncs_dom.id in the
     * STRUCT_NCS_DOM category.
     * @return StrColumn
     */
    public StrColumn getDomId1() {
        return delegate.getColumn("dom_id_1", DelegatingStrColumn::new);
    }

    /**
     * The identifier for the domain that will be transformed by
     * application of the transformation operator.
     * 
     * This data item is a pointer to _struct_ncs_dom.id in the
     * STRUCT_NCS_DOM category.
     * @return StrColumn
     */
    public StrColumn getDomId2() {
        return delegate.getColumn("dom_id_2", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _struct_ncs_ens.id in the
     * STRUCT_NCS_ENS category.
     * @return StrColumn
     */
    public StrColumn getEnsId() {
        return delegate.getColumn("ens_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _struct_ncs_oper.id in the
     * STRUCT_NCS_OPER category.
     * @return IntColumn
     */
    public IntColumn getOperId() {
        return delegate.getColumn("oper_id", DelegatingIntColumn::new);
    }

}