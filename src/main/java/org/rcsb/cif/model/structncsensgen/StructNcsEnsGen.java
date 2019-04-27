package org.rcsb.cif.model.structncsensgen;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class StructNcsEnsGen extends BaseCategory {
    public StructNcsEnsGen(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public StructNcsEnsGen(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public StructNcsEnsGen(String name) {
        super(name);
    }

    /**
     * The identifier for the domain that will remain unchanged by the
     * transformation operator.
     * 
     * This data item is a pointer to _struct_ncs_dom.id in the
     * STRUCT_NCS_DOM category.
     * @return DomId1
     */
    public DomId1 getDomId1() {
        return (DomId1) (isText ? textFields.computeIfAbsent("dom_id_1",
                DomId1::new) : getBinaryColumn("dom_id_1"));
    }

    /**
     * The identifier for the domain that will be transformed by
     * application of the transformation operator.
     * 
     * This data item is a pointer to _struct_ncs_dom.id in the
     * STRUCT_NCS_DOM category.
     * @return DomId2
     */
    public DomId2 getDomId2() {
        return (DomId2) (isText ? textFields.computeIfAbsent("dom_id_2",
                DomId2::new) : getBinaryColumn("dom_id_2"));
    }

    /**
     * This data item is a pointer to _struct_ncs_ens.id in the
     * STRUCT_NCS_ENS category.
     * @return EnsId
     */
    public EnsId getEnsId() {
        return (EnsId) (isText ? textFields.computeIfAbsent("ens_id",
                EnsId::new) : getBinaryColumn("ens_id"));
    }

    /**
     * This data item is a pointer to _struct_ncs_oper.id in the
     * STRUCT_NCS_OPER category.
     * @return OperId
     */
    public OperId getOperId() {
        return (OperId) (isText ? textFields.computeIfAbsent("oper_id",
                OperId::new) : getBinaryColumn("oper_id"));
    }
}
