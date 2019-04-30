package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the STRUCT_NCS_ENS_GEN category list domains
 * related by a noncrystallographic symmetry operation and
 * identify the operator.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDomId1() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("dom_id_1", SingleRowStrColumn::new) :
                getBinaryColumn("dom_id_1"));
    }

    /**
     * The identifier for the domain that will be transformed by
     * application of the transformation operator.
     * 
     * This data item is a pointer to _struct_ncs_dom.id in the
     * STRUCT_NCS_DOM category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDomId2() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("dom_id_2", SingleRowStrColumn::new) :
                getBinaryColumn("dom_id_2"));
    }

    /**
     * This data item is a pointer to _struct_ncs_ens.id in the
     * STRUCT_NCS_ENS category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEnsId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("ens_id", SingleRowStrColumn::new) :
                getBinaryColumn("ens_id"));
    }

    /**
     * This data item is a pointer to _struct_ncs_oper.id in the
     * STRUCT_NCS_OPER category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getOperId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("oper_id", SingleRowStrColumn::new) :
                getBinaryColumn("oper_id"));
    }
}
