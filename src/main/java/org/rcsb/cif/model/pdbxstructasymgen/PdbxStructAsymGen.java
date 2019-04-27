package org.rcsb.cif.model.pdbxstructasymgen;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxStructAsymGen extends BaseCategory {
    public PdbxStructAsymGen(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxStructAsymGen(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxStructAsymGen(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _pdbx_struct_entity_inst.id in
     * the PDBX_STRUCT_ENTITY_INST category.
     * @return EntityInstId
     */
    public EntityInstId getEntityInstId() {
        return (EntityInstId) (isText ? textFields.computeIfAbsent("entity_inst_id",
                EntityInstId::new) : getBinaryColumn("entity_inst_id"));
    }

    /**
     * This data item is a pointer to _struct_asym.id in the
     * STRUCT_ASYM category.
     * @return AsymId
     */
    public AsymId getAsymId() {
        return (AsymId) (isText ? textFields.computeIfAbsent("asym_id",
                AsymId::new) : getBinaryColumn("asym_id"));
    }

    /**
     * Identifies the operation from category PDBX_STRUCT_OPER_LIST.
     * @return OperExpression
     */
    public OperExpression getOperExpression() {
        return (OperExpression) (isText ? textFields.computeIfAbsent("oper_expression",
                OperExpression::new) : getBinaryColumn("oper_expression"));
    }
}
